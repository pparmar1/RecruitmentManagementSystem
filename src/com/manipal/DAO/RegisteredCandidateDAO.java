package com.manipal.DAO;

import java.sql.SQLException;
import java.util.List;

import com.manipal.model.CandidateDetails;

public interface RegisteredCandidateDAO {
	public List<CandidateDetails> displayCan(String JOB_ID1) throws SQLException;
}
