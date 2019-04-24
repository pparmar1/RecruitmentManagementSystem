package com.manipal.service.impl;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.manipal.DAO.jdbc.*;
import com.manipal.service.*;

public class LoginServiceImpl implements LoginService {


	@Override
	public int loginValidate(String userNameJsp, String passwordJsp) throws ClassNotFoundException, IOException {
		 try {
			 System.out.println("Inside service");
	            String queryString = "select username , password  FROM EmployeeDetails";
	            Connection con = DataBaseConnection.getDBConnection();
	    		Statement st =  con.createStatement();

	            ResultSet results = st.executeQuery(queryString);
	            
	            while (results.next()) {
	            	System.out.println("inside loop");
	            String userName = results.getString("username");
	            String passWord =  results.getString("password");

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