package com.manipal.DAO;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.CandidateDetails;
import com.manipal.model.details;





public interface detailsDAO {
	public int insertData(details d) throws ClassNotFoundException, SQLException, IOException;
	
	public List<details> retrieveData() throws ClassNotFoundException, SQLException, IOException;

	public List<details> retrieveParticularEmployeeData(String username) throws SQLException;
	
	
	public details retrieveEmployeeByID(String employeeID) throws ClassNotFoundException, SQLException, IOException;
	public String updateEmployeeData(String employeeId, String name) throws IOException;

}
