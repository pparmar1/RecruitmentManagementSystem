package com.manipal.DAO;

import java.sql.SQLException;
import java.util.List;








import com.manipal.model.AddJob;


public interface JobDAOEmpl  {
	

	public void addJob(AddJob a) throws ClassNotFoundException, SQLException;
	
	public List<AddJob> displayJobList() throws ClassNotFoundException, SQLException;
	
	public List<AddJob> searchJob(String skillSet) throws SQLException, ClassNotFoundException;
	public String deleteJob(String jobId) throws SQLException, ClassNotFoundException;

	
}
