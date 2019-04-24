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

import com.manipal.DAO.CandidateDetailsDAO;
import com.manipal.DAO.jdbc.*;
import com.manipal.model.CandidateDetails;

public class ImplementCandidateDetails implements CandidateDetailsDAO {

	@Override
	public int insertCandidateData(CandidateDetails c)
			throws ClassNotFoundException, SQLException, IOException {
		Connection con = DataBaseConnection.getDBConnection();
		System.out.println("inside dao impl");
		PreparedStatement pst = con
				.prepareStatement("insert into CandidateDetails values(?,?,?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?,?,?,?,?,?,?,?,?,?)");
		System.out.println("after query is executed");
		String sql1 = "select CIDSEQ.NEXTVAL from dual";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql1);
		rs.next();
		String CandidateID = 'C' + rs.getString(1);
		pst.setString(1, CandidateID);
		pst.setString(2, c.getUsername());
		pst.setString(3, c.getPassword());
		pst.setString(4, c.getName());
		pst.setString(5, c.getGender());
		pst.setString(6, c.getDob());
		pst.setLong(7, c.getContact_no());
		pst.setString(8, c.getEmail());
		pst.setString(9, c.getAddress());
		pst.setString(10, c.getCity());
		pst.setString(11, c.getState());
		pst.setString(12, c.getQualification());
		pst.setInt(13, c.getScore());
		pst.setString(14, c.getProof_type());
		pst.setString(15, c.getProof());
		pst.setInt(16, c.getExperience());
		pst.setString(17, "not applied");
		pst.setString(18, "active");

		int i = pst.executeUpdate();
		if (i != 0) {
			System.out.println("Record has been inserted");
		} else {
			System.out.println("failed to insert the data");
		}
		return 0;

	}

	@Override
	public List<CandidateDetails> retrieveCandidateData()
			throws ClassNotFoundException, SQLException, IOException {
		String sqlRetrieve = "select * from CandidateDetails where status='active'";
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
			String username = rs.getString(2);
			// String password = rs.getString(3);
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
			String JOB_ID = rs.getString(17);
			String status = rs.getString(18);
			CandidateDetails candidateList = new CandidateDetails(CID,
					username, name, gender, dateString, contact, address,
					email, city, state, qualifications, score, proof_Type,
					proof, experience, JOB_ID, status);
			candidatelist.add(candidateList);
			System.out.println("List is added");
		}

		return candidatelist;
	}

	public List<CandidateDetails> retrieveParticularCandidateData(
			String username) throws ClassNotFoundException, SQLException,
			IOException {
		String sqlRetrieve = "select * from CandidateDetails where username="
				+ "'" + username + "'";
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
			String user_name = rs.getString(2);
			String password = rs.getString(3);
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
			String JOB_ID = rs.getString(17);
			String status = rs.getString(18);
			CandidateDetails candidateList = new CandidateDetails( CID,  user_name,  password,
					name, gender,  dateString,  contact,
					email, address,  city,state,
					qualifications, score, proof_Type, proof,
					 experience, JOB_ID, status);
			System.out.println("C_ID in implcan" + CID);
			System.out.println("C_ID in pojo" + candidateList.getCID());
			candidatelist.add(candidateList);
			System.out.println("List is added");
		}

		return candidatelist;
	}

	@Override
	public String deleteCandidate(String CID) {
		Connection con = null;
		Statement st = null;
		int result = 0;
		try {
			con = DataBaseConnection.getDBConnection();
			st = con.createStatement();
			result = st
					.executeUpdate("Update candidatedetails set status='inactive' where C_ID="
							+ "'" + CID + "'");
			System.out.println("result" + result);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		if (result == 1)
			return "deleted successfully";
		else
			return "deleted unsuccessful";

	}

	@Override
	public String updateCandidateData(Long contact, String email,
			String address, String qual) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		CandidateDetails cd = null;
		int result = 0;

		/*
		 * try { con = ConnectionHelper.getMySqlConnection();
		 * st=con.createStatement(); result =
		 * st.executeUpdate("update candidatedetails set contactno="
		 * +contact+"where jobId="+jobId); System.out.println(result);
		 * 
		 * } catch(SQLException e) { e.printStackTrace(); }
		 * catch(ClassNotFoundException e) { e.printStackTrace(); } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */if (result != 1)
			return ("not updated");
		else
			return ("Updated successfully");

	}

	@Override
	public String updateCandidateData(String candidateId, String name)
			throws IOException {
		Connection con = null;
		Statement st = null;
		CandidateDetails cd = null;
		int result = 0;
		try {
			con = DataBaseConnection.getDBConnection();
			st = con.createStatement();
			result = st.executeUpdate("update candidatedetails set name = "
					+ "'" + name + "'" + "where username=" + "'" + candidateId
					+ "'");
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		if (result != 1)
			return ("not updated");
		else
			return ("updated successfully");
	}

	@Override
	public List<CandidateDetails> getCandidateByID(String candidateId)
			throws ClassNotFoundException, SQLException {

		List<CandidateDetails> list = new ArrayList();

		String sqlRetrieveById = "select * from CandidateDetails where username="
				+ "'" + candidateId + "'";
		Connection con = DataBaseConnection.getDBConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlRetrieveById);
		// List<CandidateDetails> candidatelist = new
		// ArrayList<CandidateDetails>();
		while (rs.next()) {

			// Statement st = null;
			// //CandidateDetails c = new CandidateDetails();
			// CandidateDetails cd = null;
			// //List<CandidateDetails> candidateList = new
			// ArrayList<CandidateDetails>();
			// try
			// {
			// Connection con = ConnectionHelper.getMySqlConnection();
			// st = con.createStatement();
			// ResultSet rs =
			// st.executeQuery("select * from candidatedetails where username="+candidateId);
			// //ResultSet rs =
			// st.executeQuery("select * from candidatedetails where c_id='C105'");
			// while(rs.next())
			// {
			String username = rs.getString(2);
			String password = rs.getString(3);
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
			String JOB_ID = rs.getString(17);
			String status = rs.getString(18);
			CandidateDetails candList = new CandidateDetails(username,
					password, name, gender, dateString, contact, address,
					email, city, state, qualifications, score, proof_Type,
					proof, experience, JOB_ID, status);
			list.add(candList);
			System.out.println("List is added");
			// candidateList.add(candidateList);

			// cd = new CandidateDetails(rs.getString(2), rs.getString(4),
			// rs.getString(5), rs.getString(6), rs.getLong(7), rs.getString(8),
			// rs.getString(9), rs.getString(10), rs.getString(11),
			// rs.getString(12), rs.getInt(13), rs.getString(14),
			// rs.getString(15), rs.getInt(16),rs.getString(17));
		}

		return list;
	}

	@Override
	public CandidateDetails retrieveCandidateByID(String candidateId)
			throws ClassNotFoundException, SQLException, IOException {
		Connection con = null;
		Statement stmt = null;
		con = DataBaseConnection.getDBConnection();
		stmt = con.createStatement();
		CandidateDetails cd = null;
		ResultSet rs = stmt
				.executeQuery("select * from candidatedetails where username="
						+ "'" + candidateId + "'");
		if (rs.next()) {
			cd = new CandidateDetails(rs.getString(2), rs.getString(3),
					rs.getString(4), rs.getString(5), rs.getString(6),
					rs.getLong(7), rs.getString(8), rs.getString(9),
					rs.getString(10), rs.getString(11), rs.getString(12),
					rs.getInt(13), rs.getString(14), rs.getString(15),
					rs.getInt(16), rs.getString(17), rs.getString(18));
		}
		return cd;
	}

}
