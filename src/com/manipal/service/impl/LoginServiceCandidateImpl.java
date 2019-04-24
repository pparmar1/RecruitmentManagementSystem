package com.manipal.service.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.manipal.DAO.jdbc.DataBaseConnection;
import com.manipal.service.LoginServiceCandidate;

public class LoginServiceCandidateImpl implements LoginServiceCandidate {
	
	

	@Override
	public int loginValidateCandidate(String userNameJsp, String passwordJsp) throws ClassNotFoundException, IOException {
		 try {
			 	
	            String queryString = "select username , password  FROM CANDIDATEDETAILS";
	            Connection con = DataBaseConnection.getDBConnection();
	    		Statement st =  con.createStatement();

	            ResultSet results = st.executeQuery(queryString);
	            
	            while (results.next()) {
	            String userName = results.getString("username");
	            String passWord =  results.getString("password");

	            if ((userNameJsp.equals(userName)) && (passwordJsp.equals(passWord)))
	            {
	            	return 1;     
	            }
	            }
	            
	            
	        } catch (SQLException sql) {

	            System.out.println(sql);
	        }
		return 0;
		
	}
}
