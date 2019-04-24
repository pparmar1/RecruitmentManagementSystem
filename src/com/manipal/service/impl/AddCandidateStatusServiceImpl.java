package com.manipal.service.impl;

import java.sql.SQLException;

import com.manipal.DAO.AddCandidateStatusDAO;
import com.manipal.DAO.jdbc.AddCandidateStatusDAOImpl;
import com.manipal.model.CandidateStatus;
import com.manipal.service.AddCandidateStatusService;

public class AddCandidateStatusServiceImpl implements AddCandidateStatusService{

	@Override
	public void insertCandidateStatus(CandidateStatus cs) throws ClassNotFoundException, SQLException {
		System.out.println("inside Servicee");
		AddCandidateStatusDAO c = new AddCandidateStatusDAOImpl();
		c.insertCanStatus(cs);
		
		
	}

}
