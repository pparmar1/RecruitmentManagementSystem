package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.CandidateDetails;

public interface CandidateDetailsDAO {
public int insertCandidateData(CandidateDetails c) throws ClassNotFoundException, SQLException, IOException;
	
	public List<CandidateDetails> retrieveCandidateData() throws ClassNotFoundException, SQLException, IOException;

	public String deleteCandidate(String CID);


	

	public String updateCandidateData(Long contact, String email,
			String address, String qual);

	public List<CandidateDetails> retrieveParticularCandidateData(String username) throws ClassNotFoundException, SQLException, IOException;

	public String updateCandidateData(String candidateId, String name) throws IOException;
	public List<CandidateDetails> getCandidateByID(String candidateId) throws ClassNotFoundException, SQLException;

	public CandidateDetails retrieveCandidateByID(String candidateId) throws ClassNotFoundException, SQLException, IOException;
}
