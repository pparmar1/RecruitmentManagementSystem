package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.CandidateDetailsDAO;
import com.manipal.DAO.jdbc.ImplementCandidateDetails;
//import com.manipal.DAO.ImplementCandidateDetails;
import com.manipal.model.CandidateDetails;
import com.manipal.service.CandidateService;

public class CandidateServiceImplementation implements CandidateService {

	
	@Override
	public void insertCandidate(CandidateDetails c)
			throws ClassNotFoundException, SQLException, IOException {
		CandidateDetailsDAO cservice = null;
		try {
			cservice = new ImplementCandidateDetails();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		cservice.insertCandidateData(c);
	}

	@Override
	public List<CandidateDetails> retrieveCandidateData() throws ClassNotFoundException,
			SQLException, IOException {
		CandidateDetailsDAO cservice = new ImplementCandidateDetails();
		List<CandidateDetails> list;
		try {
			list = new ArrayList<CandidateDetails>();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list = cservice.retrieveCandidateData();
		return list;
	
	}
	
	
	public List<CandidateDetails> retrieveParticularCandidateData(String username) throws ClassNotFoundException,
	SQLException, IOException{
		CandidateDetailsDAO cservice = new ImplementCandidateDetails();

		return cservice.retrieveParticularCandidateData(username);
		
	}

	@Override
	public String removeCandidate(String CID) {
		CandidateDetailsDAO cservice = new ImplementCandidateDetails();
		return cservice.deleteCandidate(CID);
	}



	

	@Override
	public List<CandidateDetails> retrieveCandidateDataByID(String candidateId)
			throws ClassNotFoundException, SQLException {
		CandidateDetailsDAO cdao = new ImplementCandidateDetails();
		
		return cdao.getCandidateByID(candidateId);
	}

	@Override
	public CandidateDetails retriveCandidateUserData(String candidateId) throws ClassNotFoundException, SQLException, IOException {
		CandidateDetailsDAO cdao = new ImplementCandidateDetails();
		return  cdao.retrieveCandidateByID(candidateId);
		
	}
	
	
	@Override
	public String updateCandidateData(String candidateId, String name) throws IOException {
		
		CandidateDetailsDAO cdao = new ImplementCandidateDetails();
		return cdao.updateCandidateData(candidateId, name);
		
	}

	

	
	

}
