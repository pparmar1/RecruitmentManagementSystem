package com.manipal.DAO.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	public static Connection getDBConnection()throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AtosProject","AtosProject");
		if(con!=null){
			System.out.println("Connected");
		}
		else{
			System.out.println("Error");
		}
		return con;
	}

}
