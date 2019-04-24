package com.manipal.DAO;

import java.sql.SQLException;
import java.util.List;

import com.manipal.model.AddJob;
import com.manipal.model.CandidateStatus;

public interface AddCandidateStatusDAO {

	public void insertCanStatus(CandidateStatus cs)
			throws ClassNotFoundException, SQLException;
	public List<CandidateStatus> displayCandidateStatusList() throws ClassNotFoundException, SQLException;
}
