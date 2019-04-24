package com.manipal.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.manipal.DAO.jdbc.DataBaseConnection;
import com.manipal.service.UniqueUserNameCandidate;


public class UniqueUserNameCandiImpl implements UniqueUserNameCandidate {

	@Override
	public int UniqueUserCandi(String userNameJsp, String passwordJsp)
			throws ClassNotFoundException {
		
		 try {
			 System.out.println("Inside service");
			 
			 System.out.println("2");
	            String queryString = "select username , password  FROM CandidateDetails1";
	            Connection con = DataBaseConnection.getDBConnection();
	    		Statement st =  con.createStatement();

	            ResultSet results = st.executeQuery(queryString);
	            
	            while (results.next()) {
	            	System.out.println("inside loop");
	            	System.out.println("3");
	            	
	            String userName = results.getString("username");
	            String passWord =  results.getString("password");
	            
	            System.out.println(userNameJsp);
	            System.out.println(passwordJsp);
	            
	            System.out.println(userName);
	            System.out.println(passWord);
	            
	            System.out.println("3333....1");
	            
	            if ((userNameJsp.equals(userName)) && (passwordJsp.equals(passWord)))
	            {System.out.println("got it. going back to servlet");
	            	return 1;     
	            	
	            }
	            }
	            
	            
	        } catch (SQLException sql) {

	            System.out.println(sql);
	        }
		return 0;
	}

}
