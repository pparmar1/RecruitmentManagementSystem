package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.referral;
import com.manipal.model.schedule;

public interface scheduleDAO {


	public int insertData(schedule s) throws ClassNotFoundException, SQLException, IOException; 
	
	public List<schedule> retrieveData() throws ClassNotFoundException, SQLException, IOException;

	
}
