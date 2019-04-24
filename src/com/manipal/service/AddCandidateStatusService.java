package com.manipal.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.manipal.DAO.jdbc.DataBaseConnection;
import com.manipal.model.CandidateStatus;

public interface AddCandidateStatusService {
public void insertCandidateStatus(CandidateStatus cs) throws ClassNotFoundException, SQLException;



}
