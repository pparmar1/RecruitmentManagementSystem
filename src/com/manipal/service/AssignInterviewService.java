package com.manipal.service;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.*;

public interface AssignInterviewService {
	

	

	
		
		public void insertMethods(AssignInterview ai) throws ClassNotFoundException, SQLException;

		public List<AssignInterview> retrieveMethods() throws ClassNotFoundException, SQLException;
	}


