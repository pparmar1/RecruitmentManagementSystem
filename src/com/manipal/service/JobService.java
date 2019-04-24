package com.manipal.service;

import java.sql.SQLException;
import java.util.List;

import com.manipal.model.AddJob;

public interface JobService {
	public void addjobs(AddJob a) throws ClassNotFoundException, SQLException ;
	
	List<AddJob> getAllJobs() throws ClassNotFoundException, SQLException;
	public List<AddJob> getJob(String skillSet) throws ClassNotFoundException, SQLException;
	
	public String deleteJob(String jobId) throws ClassNotFoundException, SQLException;
}

