package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.referralDAO;
import com.manipal.model.referral;

public class implementReferral implements referralDAO {

	@Override
	public int insertData(referral r) throws ClassNotFoundException, SQLException, IOException {
		
		Connection con=DataBaseConnection.getDBConnection();
		PreparedStatement ps=  con.prepareStatement("insert into referral values(?,?,?,?,?,?,?)");

		String sql="select REFIDSEQ.NEXTVAL from dual";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		rs.next();
		String referral_id='R'+rs.getString(1);
		
		ps.setString(1,referral_id);
		ps.setString(2,r.getE_ID());
		ps.setString(3,r.getJOB_ID());
		ps.setString(4,r.getName());
		ps.setLong(5,r.getContact());
		ps.setString(6,r.getEmail());
		ps.setString(7,r.getStatus());
		
		
		 int i = ps.executeUpdate();
	      if(i!=0){
	        System.out.println("Record has been inserted");
	      }
	      else{
	        System.out.println("failed to insert the data");
	      }
	return 0;
	}

	
	@Override
	public List<referral> retrieveData() throws ClassNotFoundException, SQLException, IOException {
		String sql = "select * from referral";
		Connection con = null;
		try {
			con =DataBaseConnection.getDBConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement st =  con.createStatement();
		
	//PreparedStatement stmt=con.prepareStatement("select * from schedule_interview");  

		ResultSet rs = st.executeQuery(sql);
		
		List<referral> list = new ArrayList<referral>();
		
		while(rs.next()){
			String R_ID = rs.getString(1);
			String E_ID = rs.getString(2);
			String JOB_ID = rs.getString(3);
			String name = rs.getString(4);
			Long contact = rs.getLong(5);
			String email = rs.getString(6);
			String status = rs.getString(7);
			
			referral user = new referral(R_ID,E_ID,JOB_ID,name,contact,email,status);
			list.add(user);
			
		}
		System.out.println("list is created");
		
		return list;
		
	}


	}

