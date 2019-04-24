package com.manipal.DAO.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.manipal.DAO.CandidateApplyJobDAO;

public class CandidateApplyJobDAOImpl implements CandidateApplyJobDAO {

	@Override
	public String addCanJob(String JOB_ID,String C_ID) {
		Connection con = null;
		Statement st = null;
		int result = 0;
		try {
			con = DataBaseConnection.getDBConnection();
			st=con.createStatement();
			result = st.executeUpdate("Update candidatedetails set job_id="+"'"+JOB_ID+"'"+"where C_ID=" +"'"+C_ID+"'");
			System.out.println("result"+result);
			con.close();
		} catch (Exception e) {
			 System.out.println(e);
		}
		if(result==1)
			return "deleted successfully";
		else
			return "deleted unsuccessful";

	}

		
	}


