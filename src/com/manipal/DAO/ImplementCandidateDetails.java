package com.manipal.DAO;

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

import com.manipal.DAO.jdbc.ConnectionHelper;
import com.manipal.DAO.jdbc.DataBaseConnection;
import com.manipal.model.CandidateDetails;
import com.manipal.model.details;

public class ImplementCandidateDetails implements CandidateDetailsDAO{

	@Override
	public int insertCandidateData(CandidateDetails c)
			throws ClassNotFoundException, SQLException {
		Connection con = DataBaseConnection.getDBConnection();
		PreparedStatement pst = con.prepareStatement("insert into CandidateDetails values(?,?,?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?,?,?,?,?,?,?,?,?)");
		String sql1 = "select CIDSEQ.NEXTVAL from dual";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql1);
		rs.next();
		String CandidateID = 'C'+ rs.getString(1);
		pst.setString(1, CandidateID);
		pst.setString(2, c.getUsername());
		pst.setString(3,c.getPassword());
		pst.setString(4, c.getName());
		pst.setString(5, c.getGender());
		pst.setString(6, c.getDob());
		pst.setLong(7, c.getContact_no());
		pst.setString(8, c.getEmail());
		pst.setString(9, c.getAddress());
		pst.setString(10, c.getCity());
		pst.setString(11,c.getState());
		pst.setString(12, c.getQualification());
		pst.setInt(13, c.getScore());
		pst.setString(14, c.getProof_type());
		pst.setString(15, c.getProof());
		pst.setInt(16, c.getExperience());
		pst.setString(17,c.getDesignation());
		

		int i = pst.executeUpdate();
		if (i != 0) {
			System.out.println("Record has been inserted");
		} else {
			System.out.println("failed to insert the data");
		}
		return 0;

		
	}

	@Override
	public List<CandidateDetails> retrieveCandidateData() throws ClassNotFoundException,
			SQLException {
		String sqlRetrieve = "select * from CandidateDetails";
		Connection con = DataBaseConnection.getDBConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlRetrieve);
		List<CandidateDetails> candidatelist = new ArrayList<CandidateDetails>();
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
			CandidateDetails candidateList = new CandidateDetails(username,name,gender,dateString,contact,address,email,city,state,qualifications,score,proof_Type,proof,experience,designation);
			candidatelist.add(candidateList);
			System.out.println("List is added");
		}
	
		return candidatelist;
	}


	
	@Override
	public List<CandidateDetails> getCandidateByID(String candidateId) throws ClassNotFoundException, SQLException {
		
		List<CandidateDetails> list = new ArrayList();
		
		String sqlRetrieveById = "select * from CandidateDetails where username="+"'"+candidateId+"'";
		Connection con = DataBaseConnection.getDBConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlRetrieveById);
//		List<CandidateDetails> candidatelist = new ArrayList<CandidateDetails>();
		while(rs.next())
		{
		
		
		
		
		
//		Statement st = null;
//		//CandidateDetails c = new CandidateDetails();
//		CandidateDetails cd = null;
//		//List<CandidateDetails> candidateList = new ArrayList<CandidateDetails>();
//		try
//		{
//			Connection con = ConnectionHelper.getMySqlConnection();
//			st = con.createStatement();
//			ResultSet rs = st.executeQuery("select * from candidatedetails where username="+candidateId);
//			//ResultSet rs = st.executeQuery("select * from candidatedetails where c_id='C105'");
//			while(rs.next())
//			{
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
				CandidateDetails candList = new CandidateDetails(username,name,gender,dateString,contact,address,email,city,state,qualifications,score,proof_Type,proof,experience,designation);
				list.add(candList);
				System.out.println("List is added");
				//candidateList.add(candidateList);

				//cd = new CandidateDetails(rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6), rs.getLong(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13), rs.getString(14), rs.getString(15), rs.getInt(16),rs.getString(17));
			}
		
		return list;
	}

	@Override
	public String updateCandidateData(String candidateId, String name) {
		Connection con = null;
		Statement st = null;
		CandidateDetails cd = null;
		int result = 0;
		try
		{
			con = ConnectionHelper.getMySqlConnection();
			st = con.createStatement();
			result = st.executeUpdate("update candidatedetails set name = "+"'"+name+"'"+"where username="+"'"+candidateId+"'");
			System.out.println(result);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		if(result!=1)
			return("not updated");
		else
		return ("updated successfully");
	}

	@Override
	public CandidateDetails retrieveCandidateByID(String candidateId) throws ClassNotFoundException, SQLException, IOException {
		Connection con = null;
		Statement stmt = null;
		con = ConnectionHelper.getMySqlConnection();
		stmt = con.createStatement();
		CandidateDetails cd = null;
		ResultSet rs = stmt.executeQuery("select * from candidatedetails where username="+"'"+candidateId+"'");
		if(rs.next())
		{
			cd = new CandidateDetails(rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6), rs.getLong(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13), rs.getString(14), rs.getString(15), rs.getInt(16),rs.getString(17));
		}
		return cd;
	}

}
