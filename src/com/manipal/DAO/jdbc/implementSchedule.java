package com.manipal.DAO.jdbc;


import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.manipal.DAO.scheduleDAO;
import com.manipal.model.schedule;

public class implementSchedule implements scheduleDAO{
	
	public int insertData(schedule s) throws ClassNotFoundException, SQLException, IOException {
		System.out.println("this is insert method");
		Connection con=DataBaseConnection.getDBConnection();
		PreparedStatement ps=  con.prepareStatement("insert into schedule_interview values(?,?,to_date(?,'YYYY-MM-DD'),?)");

		String sql="select SCHIDSEQ.NEXTVAL from dual";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		rs.next();
		String scheduleId='S'+rs.getString(1);
		
		
		ps.setString(1, scheduleId);
		ps.setString(2, s.getJOB_ID());
		ps.setString(3, s.getDATE1());
		ps.setString(4, s.getTIME1());
		
		
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
	public List<schedule> retrieveData() throws ClassNotFoundException, SQLException, IOException   {
		String sql = "select * from schedule_interview";
		Connection con = DataBaseConnection.getDBConnection();
		Statement st =  con.createStatement();
		
	//PreparedStatement stmt=con.prepareStatement("select * from schedule_interview");  

		ResultSet rs = st.executeQuery(sql);
		
		List<schedule> list = new ArrayList<schedule>();
		
		while(rs.next()){
			String SCHEDULE_ID = rs.getString(1);
			String JOB_ID = rs.getString(2);
			Date DATE = rs.getDate(3);
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String datestring = dateFormat.format(DATE);
			 
			String TIME = rs.getString(4);
			schedule user = new schedule(SCHEDULE_ID,JOB_ID,datestring,TIME);
			list.add(user);
			
		}
		System.out.println("list is created");
		
		return list;
		
	}


	}

