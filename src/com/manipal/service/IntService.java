package com.manipal.service;
import java.sql.SQLException;
import java.util.List;


import com.manipal.model.Interviewer;



public interface IntService {
	public void insertMethods(Interviewer in) throws ClassNotFoundException, SQLException;

	public List<Interviewer> retrieveMethods() throws ClassNotFoundException, SQLException;
	
	List<Interviewer> getAllInterviewers() throws ClassNotFoundException, SQLException;
	
	public String deleteInterviewer(String Interviewer_id) throws ClassNotFoundException, SQLException;
	
	public List  retrieveInterviewerData(String username) throws ClassNotFoundException, SQLException;
}
