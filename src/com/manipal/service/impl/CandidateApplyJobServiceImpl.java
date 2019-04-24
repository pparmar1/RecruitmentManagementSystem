package com.manipal.service.impl;

import com.manipal.DAO.*;
import com.manipal.DAO.jdbc.CandidateApplyJobDAOImpl;
import com.manipal.service.CandidateApplyJobService;

public class CandidateApplyJobServiceImpl implements CandidateApplyJobService{

	@Override
	public void canApplyJob(String JOB_ID,String C_ID) {
		CandidateApplyJobDAO c = new CandidateApplyJobDAOImpl();
		c.addCanJob(JOB_ID,C_ID);
		
	}

	
	

}
