package com.manipal.DAO;

import java.sql.SQLException;
import java.util.List;

import com.manipal.model.AssignInterview;


public interface assignDAO {
	
public int insertData(AssignInterview ai) throws ClassNotFoundException, SQLException; 
	
	public List<AssignInterview> retrieveData() throws ClassNotFoundException, SQLException;


}
