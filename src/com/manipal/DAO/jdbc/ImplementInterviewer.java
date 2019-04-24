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

import com.manipal.DAO.InterviewerDAO;
import com.manipal.model.Interviewer;



public class ImplementInterviewer implements InterviewerDAO{
	
	
	public int insertData(Interviewer in) throws ClassNotFoundException, SQLException {
		System.out.println("this is insert method");
		Connection con=DataBaseConnection.getDBConnection();
		PreparedStatement ps=  con.prepareStatement("insert into interviewer values(?,?,?,?)");

		String sql="select INTDSEQ.NEXTVAL from dual";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		rs.next();
		String Interviewer_id='I'+rs.getString(1);
		
		ps.setString(1, Interviewer_id);
		ps.setString(2, in.getEmployee_id());
		ps.setString(3, in.getJob_id());
		ps.setString(4, "active");

		
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
	public List<Interviewer> retrieveData() throws ClassNotFoundException, SQLException   {
		String sql = "select * from INTERVIEWER where Interviewer_Status='active'";
		Connection con = DataBaseConnection.getDBConnection();
		Statement st =  con.createStatement();
		
	//PreparedStatement stmt=con.prepareStatement("select * from schedule_interview");  

		ResultSet rs = st.executeQuery(sql);
		
		List<Interviewer> list = new ArrayList<Interviewer>();
		
		while(rs.next()){
			String Interviewer_id = rs.getString(1);
			String Employee_Id= rs.getString(2);
			String Job_Id = rs.getString(3);
			
		
			
			/*
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String datestring = dateFormat.format(DATE);
			 
			String TIME = rs.getString(4);*/
			Interviewer user = new Interviewer(Interviewer_id,Employee_Id,Job_Id);
			list.add(user);
			
		}
		System.out.println("list is created");
		
		return list;
		
	}


	
@Override
public String deleteInterviewer(String Interviewer_id) throws SQLException, ClassNotFoundException {
	Connection con1 = DataBaseConnection.getDBConnection();
	System.out.println("inside DAO impl");
	Statement st=con1.createStatement();
	System.out.println("createStatement");
	int result = st.executeUpdate("update interviewer set Interviewer_Status='inactive' where I_id="+"'"+Interviewer_id+"'");
	System.out.println("result"+result);
	con1.close();
	if(result==1)
		return "updated successfully";
	else
		return "update unsuccessful";

}

@Override
	public List  retrieveInterviewerData(String username) throws SQLException, ClassNotFoundException {
	
System.out.println("in DAO");

			Connection con = DataBaseConnection.getDBConnection();
			Statement st =  con.createStatement();
		String sql = "select E_ID from employeedetails where username ="+"'"+username+"'" ;
		System.out.println(sql);
		String sql1="select I_ID from interviewer where E_ID ="+"'"+sql+"'" ;
		System.out.println(sql1);
		String sql2=
				"SELECT Assign_Interview.Schedule_ID, assign_interview.I_ID, schedule_interview.interview_DATE ,schedule_interview.TIME,job.job_title FROM assign_interview INNER JOIN schedule_interview ON Assign_Interview.Schedule_ID=schedule_interview.Schedule_ID inner join job on schedule_interview.JOB_ID=job.JOB_ID where I_ID='I101' ";
System.out.println(sql2);
		ResultSet rs = st.executeQuery(sql2);
		
		List  list = new ArrayList();
		
		while(rs.next()){
			String schedule_id = rs.getString(1);
			
			String Interviewer_Id= rs.getString(2);
			Date Interview_Date = rs.getDate(3);
			
			DateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
			String dateString=dateformat.format(Interview_Date);
			
			String Time = rs.getString(4);
			String job_title = rs.getString(5);
			
			Interviewer join = new Interviewer(schedule_id,Interviewer_Id,dateString,Time,job_title);
			list.add(join);
			
		}
		System.out.println("list is created");
		
			return list;

	}
}

	
