package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.referral;


public interface referralDAO {
	
	public int insertData(referral r) throws ClassNotFoundException, SQLException, IOException; 
	
	public List<referral> retrieveData() throws ClassNotFoundException, SQLException, IOException;

}
