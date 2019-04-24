package com.manipal.DAO;

import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Interviewer;



public interface InterviewerDAO {
	
public int insertData(Interviewer in) throws ClassNotFoundException, SQLException; 
	
	public List<Interviewer> retrieveData() throws ClassNotFoundException, SQLException;
	
	public String deleteInterviewer(String Interviewer_id) throws SQLException, ClassNotFoundException;

	public List  retrieveInterviewerData(String username) throws SQLException, ClassNotFoundException;
}
