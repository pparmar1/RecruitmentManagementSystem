package com.manipal.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.assignDAO;


import com.manipal.DAO.jdbc.AssignIntImpl;
import com.manipal.model.AssignInterview;

import com.manipal.service.AssignInterviewService;

public class AssignIntImplService implements AssignInterviewService {

	@Override
	public void insertMethods(AssignInterview ai) throws ClassNotFoundException, SQLException {
		assignDAO ais= new AssignIntImpl();
		ais.insertData(ai);
		
		
	}

	
	public List<AssignInterview> retrieveMethods() throws ClassNotFoundException, SQLException {
		assignDAO ais= new AssignIntImpl();
		System.out.println("im in service method");
		List<AssignInterview> list = new ArrayList<AssignInterview>();
		
		list=ais.retrieveData();
		
		
		return list;
	}
}
