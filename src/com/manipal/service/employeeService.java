package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.CandidateDetails;
import com.manipal.model.details;

public interface employeeService {
	public void insertEmployee(details d) throws ClassNotFoundException, SQLException, IOException;
	public List<details> retrieveEmployeeData() throws ClassNotFoundException, SQLException, IOException;
	public List<details> retrieveParticularEmployeeData (String username) throws ClassNotFoundException, SQLException, IOException;

	public details retriveEmployeeUserData(String employeeID) throws ClassNotFoundException, SQLException, IOException;

	public String updateEmployeeData(String employeeId, String name) throws IOException;
	
}
