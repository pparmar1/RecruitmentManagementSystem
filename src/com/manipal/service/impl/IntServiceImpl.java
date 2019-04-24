package com.manipal.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.InterviewerDAO;



import com.manipal.DAO.jdbc.ImplementInterviewer;


import com.manipal.model.Interviewer;
import com.manipal.service.IntService;

public class IntServiceImpl implements IntService{

	@Override
	public void insertMethods(Interviewer in) throws ClassNotFoundException, SQLException {
		InterviewerDAO intd= new ImplementInterviewer();
		intd.insertData(in);
		
	}

	public List<Interviewer> retrieveMethods() throws ClassNotFoundException, SQLException {
		InterviewerDAO intd= new ImplementInterviewer();
		System.out.println("im in service method");
		List<Interviewer> list = new ArrayList<Interviewer>();
		
		list=intd.retrieveData();
		
		
		return list;
	}
	
	@Override
	public List<Interviewer> getAllInterviewers() throws ClassNotFoundException, SQLException {
		InterviewerDAO intd = new ImplementInterviewer();
		return intd.retrieveData();
	}
	@Override
	public String deleteInterviewer(String Interviewer_id) throws ClassNotFoundException, SQLException {
		InterviewerDAO intd = new ImplementInterviewer();
		return intd.deleteInterviewer(Interviewer_id);
	}

	@Override
	public List retrieveInterviewerData(String username)
			throws ClassNotFoundException, SQLException {
		InterviewerDAO intd = new ImplementInterviewer();
		return intd.retrieveInterviewerData(username);
	
	}}
	