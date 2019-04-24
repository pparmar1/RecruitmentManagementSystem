package com.manipal.DAO.jdbc;

import java.io.IOException;
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
import com.manipal.model.CandidateDetails;
import com.manipal.model.details;

public class implementDetails implements detailsDAO {

	@Override
	public int insertData(details d) throws ClassNotFoundException,
			SQLException, IOException {

		Connection con = DataBaseConnection.getDBConnection();
		PreparedStatement pst = con.prepareStatement("insert into EmployeeDetails values(?,?,?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?,?,?,?,?,?,?,?,?)");

		String sql1 = "select EMPSEQ.NEXTVAL from dual";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql1);
		rs.next();
		String employeeID = 'E'+ rs.getString(1);
		pst.setString(1, employeeID);
		pst.setString(2, d.getUsername());
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
			SQLException, IOException {
		
		String sqlRetrieve = "select * from employeeDetails";
		Connection con = null;
		try {
			con = DataBaseConnection.getDBConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	

	@Override
	public List<details> retrieveParticularEmployeeData(String username) throws SQLException {
		String sqlRetrieve = "select * from employeedetails where username=" +"'"+username+"'";
		Connection con = null;
		try {
			con = DataBaseConnection.getDBConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlRetrieve);
		List<details> list = new ArrayList<details>();
		while(rs.next())
		{
			String EID= rs.getString(1);
			String user_name = rs.getString(2);
			//String password = rs.getString(3);
			String name = rs.getString(4);
			String gender = rs.getString(5);
			
			Date DOB = rs.getDate(6);
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = dateFormat.format(DOB);
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
			details emplist = new details(EID,user_name,name,gender,dateString,contact,address,email,city,state,qualifications,score,proof_Type,proof,experience,designation);
			list.add(emplist);
			System.out.println("List is added");
		}

		return list;
		}

	@Override
	public details retrieveEmployeeByID(String employeeID)
			throws ClassNotFoundException, SQLException, IOException {
		
		Connection con = null;
		Statement stmt = null;
		con = DataBaseConnection.getDBConnection();
		stmt = con.createStatement();
		details cd = null;
		ResultSet rs = stmt.executeQuery("select * from employeedetails where name="+"'"+employeeID+"'");
		if(rs.next())
		{
			cd = new details(rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6), rs.getLong(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13), rs.getString(14), rs.getString(15), rs.getInt(16),rs.getString(17));
		}
		return cd;
	}

	@Override
	public String updateEmployeeData(String employeeId, String name) throws IOException {
		Connection con = null;
		Statement st = null;
		details cd = null;
		int result = 0;
		try
		{
			con = DataBaseConnection.getDBConnection();
			st = con.createStatement();
			result = st.executeUpdate("update employeedetails set name = "+"'"+name+"'"+"where name="+"'"+employeeId+"'");
			System.out.println(result);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		if(result!=1)
			return("not updated");
		else
		return ("updated successfully");
		
		
	}
			

}

