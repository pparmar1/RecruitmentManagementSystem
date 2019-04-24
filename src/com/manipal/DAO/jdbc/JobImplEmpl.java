package com.manipal.DAO.jdbc;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.JobDAOEmpl;
import com.manipal.model.AddJob;


public class JobImplEmpl implements JobDAOEmpl{

	@Override
	public void addJob(AddJob a) throws ClassNotFoundException, SQLException {
		Connection con = DataBaseConnection.getDBConnection();
		//System.out.println(a.getDate());
		PreparedStatement pst = con.prepareStatement("insert into job values(?,?,?,?,?,?,?,to_date(?,'YYYY-MM-DD'),?,?)");
		String sql = "select JOBIDSEQ.NEXTVAL from dual";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		rs.next();
		String JOB_ID = 'J'+rs.getString(1);
		System.out.println("inside DAOImpl");
		pst.setString(1, JOB_ID);
		pst.setString(2, a.getE_ID());
		pst.setString(3, a.getJobDesc());
		pst.setString(4, a.getJobTitle());
		pst.setString(5, a.getSkillset());
		pst.setString(6, a.getExperience());
		pst.setString(7, a.getDomain());
		pst.setString(8, a.getDate());
		pst.setString(9, a.getLocation());
		pst.setString(10,"active");
		
		
		int i = pst.executeUpdate();
		 if(i!=0){
		        System.out.println("Record has been inserted");
		      }
		      else{
		        System.out.println("failed to insert the data");
		      }
	}

	@Override
	public List<AddJob> displayJobList() throws ClassNotFoundException, SQLException {
		List<AddJob> list = new ArrayList();
		String sql = "select * from job where status='active'";
		Connection con1 = DataBaseConnection.getDBConnection();
		Statement st = con1.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			String JOB_ID = rs.getString(1);
			String E_ID = rs.getString(2);
			String jobDesc = rs.getString(3);
			String jobTitle = rs.getString(4);
			String skillSet = rs.getString(5);
			String experience = rs.getString(6);
			String domain = rs.getString(7);
			Date expiryDate = rs.getDate(8);
			String location = rs.getString(9);
			String status = rs.getString(10);
			
			
			
			DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = date.format(expiryDate);
			
			AddJob a = new AddJob(JOB_ID,E_ID,jobTitle,jobDesc,dateString,domain,experience, location, skillSet,status);
			list.add(a);
			
			System.out.println("List is added");
		}

		return list;
	
	}

	@Override
	public List<AddJob> searchJob(String skillSet) throws SQLException, ClassNotFoundException {
		List<AddJob> list = new ArrayList();
	
		Statement st=null;
		String str="Select * from job where skillset="+"'"+skillSet+"'";
		try(Connection con=DataBaseConnection.getDBConnection())
		{	
			st=con.createStatement();
			System.out.println("DAOImpl");
			ResultSet rs=st.executeQuery(str);
			while(rs.next())
			{
				System.out.println("loop");
				String E_ID = rs.getString(2);
				String jobDesc = rs.getString(3);
				String jobTitle = rs.getString(4);
				String skillSet1 = rs.getString(5);
				String experience = rs.getString(6);
				String domain = rs.getString(7);
				Date expiryDate = rs.getDate(8);
				String location = rs.getString(9);
				
				
				
				DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
				String dateString = date.format(expiryDate);
				
				AddJob a = new AddJob(E_ID,jobTitle,jobDesc,dateString,domain,experience, location, skillSet1);
				list.add(a);
				System.out.println("List is added");
		
				
			}
			
		return list;
	}
}

	@Override
	public String deleteJob(String jobId) throws SQLException, ClassNotFoundException {
		Connection con1 = DataBaseConnection.getDBConnection();
		System.out.println("inside DAO impl");
		Statement st=con1.createStatement();
		System.out.println("createStatement");
		int result = st.executeUpdate("update job set status='inactive' where job_id="+"'"+jobId+"'");
		System.out.println("result"+result);
		con1.close();
		if(result==1)
			return "updated successfully";
		else
			return "update unsuccessful";
	
	}

	
}