package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.DAO.detailsDAO;
import com.manipal.DAO.jdbc.implementDetails;
import com.manipal.DAO.jdbc.DataBaseConnection;
import com.manipal.model.details;
import com.manipal.service.employeeService;
import com.manipal.service.impl.EmployeeServiceImpl;



/**
 * Servlet implementation class insertData1
 */
@WebServlet("/insertData1")
public class insertData1 extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	        try{
	      int id = 100;
	      String username = request.getParameter("user_name");
	      String password = request.getParameter("password");
	      String name = request.getParameter("fname");
	      String gender = request.getParameter("gender");
	      String dob = request.getParameter("dob");
	      long contact = Long.parseLong(request.getParameter("contact"));
	      String email = request.getParameter("email");
	      String address = request.getParameter("address");
	      String city = request.getParameter("location");
	      String state = request.getParameter("state");
	      String proof_Type = request.getParameter("prooftype");
	      String proof = request.getParameter("pnumber");
	      String qualifications = request.getParameter("gradscore");
	      int score = Integer.parseInt(request.getParameter("score"));
	      int experience = Integer.parseInt(request.getParameter("experience"));
	      String designation = request.getParameter("designation");
	      
	      
	      
	      Connection con = DataBaseConnection.getDBConnection();
	      employeeService es = new EmployeeServiceImpl();
	      //detailsDAO d = new implementDetails();
	      details add = new details(id,username,password,name,gender,dob,contact,address,email,city,state,qualifications,score,proof_Type,proof,experience,designation);
	      es.insertEmployee(add);
	      RequestDispatcher r = request.getRequestDispatcher("login_employee.jsp");
	      r.forward(request, response);
	      //d.insertData(add);
	     	      
	}catch(Exception e)
	        {
				out.println(e);
	        }
	        
}
}
