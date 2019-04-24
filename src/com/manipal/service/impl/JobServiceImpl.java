package com.manipal.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.manipal.DAO.JobDAOEmpl;
import com.manipal.DAO.jdbc.JobImplEmpl;
import com.manipal.model.AddJob;
import com.manipal.service.JobService;

public class JobServiceImpl implements JobService {
public void addjobs(AddJob a) throws ClassNotFoundException, SQLException{
	JobDAOEmpl d = new JobImplEmpl();
	d.addJob(a);
}

@Override
public List<AddJob> getAllJobs() throws ClassNotFoundException, SQLException {
	JobDAOEmpl d = new JobImplEmpl();
	return d.displayJobList();

}

@Override
public List<AddJob> getJob(String skillSet) throws ClassNotFoundException, SQLException {
	JobDAOEmpl a = new JobImplEmpl();
	return a.searchJob(skillSet);
	
}

@Override
public String deleteJob(String jobId) throws ClassNotFoundException, SQLException {
	JobDAOEmpl d = new JobImplEmpl();
	return d.deleteJob(jobId);
}
}
