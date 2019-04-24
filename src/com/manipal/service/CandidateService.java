package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.CandidateDetails;

public interface CandidateService {
	public void insertCandidate(CandidateDetails c) throws ClassNotFoundException, SQLException, IOException;
	public List<CandidateDetails> retrieveCandidateData() throws ClassNotFoundException, SQLException, IOException;
	
	public List<CandidateDetails> retrieveParticularCandidateData(String username) throws ClassNotFoundException,
								SQLException, IOException;
	public String removeCandidate(String CID);
	
	
	
	public List<CandidateDetails> retrieveCandidateDataByID(String candidateId) throws ClassNotFoundException, SQLException;
	public CandidateDetails retriveCandidateUserData(String candidateId) throws ClassNotFoundException, SQLException, IOException;
	public String updateCandidateData(String candidateId, String name) throws IOException;
}
