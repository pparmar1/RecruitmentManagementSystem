package com.manipal.DAO.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.manipal.DAO.RegisteredCandidateDAO;
import com.manipal.model.CandidateDetails;

public class RegisteredCandidateDAOImpl implements RegisteredCandidateDAO {

	@Override
	public List<CandidateDetails> displayCan(String JOB_ID1) throws SQLException {
		String sqlRetrieve = "select * from CandidateDetails where job_id="+"'"+JOB_ID1+"'";
		Connection con = null;
		try {
			con = DataBaseConnection.getDBConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlRetrieve);
		List<CandidateDetails> candidatelist = new ArrayList<CandidateDetails>();
		while (rs.next()) {
			String CID = rs.getString(1);
			
			String name = rs.getString(4);
			
			
			long contact = rs.getLong(7);
			String email = rs.getString(8);
			
			CandidateDetails candidateList = new CandidateDetails(CID,
					 name, contact,
					email);
			candidatelist.add(candidateList);
			System.out.println("List is added");
		}

		return candidatelist;

	}

}
