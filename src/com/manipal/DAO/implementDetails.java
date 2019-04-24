package com.manipal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.manipal.DAO.detailsDAO;
import com.manipal.DAO.jdbc.DataBaseConnection;
import com.manipal.model.details;

public class implementDetails implements detailsDAO {

	@Override
	public int insertData(details d) throws ClassNotFoundException,
			SQLException {

		Connection con = DataBaseConnection.getDBConnection();
		PreparedStatement pst = con.prepareStatement("insert into EmployeeDetails values(?,?,?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?,?,?,?,?,?,?,?,?)");

		String sql1 = "select EMPIDSEQ.NEXTVAL from dual";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql1);
		rs.next();
		String employeeID = 'E'+ rs.getString(1);
		pst.setString(1, employeeID);
		pst.setString(2, d.username);
		pst.setString(3,d.password);
		pst.setString(4, d.getName());
		pst.setString(5, d.getGender());
		pst.setString(6, d.getDob());
		pst.setLong(7, d.getContact());
		pst.setString(8, d.getEmail());
		pst.setString(9, d.getAddress());
		pst.setString(10, d.getCity());
		pst.setString(11,d.getState());
		pst.setString(12, d.getQualification());
		pst.setInt(13, d.getScore());
		pst.setString(14, d.getProof_type());
		pst.setString(15, d.getProof());
		pst.setInt(16, d.getExperience());
		pst.setString(17,d.getDesignation());
		

		int i = pst.executeUpdate();
		if (i != 0) {
			System.out.println("Record has been inserted");
		} else {
			System.out.println("failed to insert the data");
		}
		return 0;
	}

	@Override
	public List<details> retrieveData() throws ClassNotFoundException,
			SQLException {
		
		String sqlRetrieve = "select * from employeeDetails";
		Connection con = DataBaseConnection.getDBConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlRetrieve);
		List<details> list = new ArrayList<details>();
		
		
		while(rs.next())
		{
			String username = rs.getString(2);
			//String password = rs.getString(3);
			String name = rs.getString(4);
			String gender = rs.getString(5);
			Date DATE = rs.getDate(6);
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = dateFormat.format(DATE);
			long contact = rs.getLong(7);
			String email = rs.getString(8);
			String address = rs.getString(9);
			String city = rs.getString(10);
			String state = rs.getString(11);
			String qualifications = rs.getString(12);
			int score = rs.getInt(13);
			String proof_Type = rs.getString(14);
			String proof = rs.getString(15);
			int experience = rs.getInt(16);
			String designation = rs.getString(17);
			details empList = new details(username,name,gender,dateString,contact,address,email,city,state,qualifications,score,proof_Type,proof,experience,designation);
			list.add(empList);
			System.out.println("List is added");
		}
		
		return list;
	}

}
