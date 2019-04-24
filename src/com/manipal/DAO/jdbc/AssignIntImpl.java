package com.manipal.DAO.jdbc;

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

import com.manipal.DAO.assignDAO;
import com.manipal.model.AssignInterview;
import com.manipal.model.schedule;


public class AssignIntImpl implements assignDAO {
	
	public int insertData(AssignInterview ai) throws ClassNotFoundException, SQLException {
		System.out.println("this is insert method");
		Connection con=DataBaseConnection.getDBConnection();
		PreparedStatement ps=  con.prepareStatement("insert into assign_interview values(?,?,?)");

		ps.setString(1, ai.getSchedule_id());
		ps.setString(2, ai.getInterviewer_id());
		ps.setString(3, ai.getCandidate_id());
		
		
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
	public List<AssignInterview> retrieveData() throws ClassNotFoundException, SQLException   {
		String sql = "select * from assign_interview";
		Connection con = DataBaseConnection.getDBConnection();
		Statement st =  con.createStatement();
		
	//PreparedStatement stmt=con.prepareStatement("select * from schedule_interview");  

		ResultSet rs = st.executeQuery(sql);
		
		List<AssignInterview> list = new ArrayList<AssignInterview>();
		
		while(rs.next()){
			String Schedule_Id = rs.getString(1);
			String Interviewer_Id = rs.getString(2);
			String Candidate_Id = rs.getString(3);
			
			String Referral_id=rs.getString(4);
			AssignInterview user = new AssignInterview(Schedule_Id,Interviewer_Id,Candidate_Id);
			list.add(user);
			
		}
		System.out.println("list is created");
		
		return list;
		
	}


	}

	