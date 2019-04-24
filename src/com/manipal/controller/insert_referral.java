package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.referral;
import com.manipal.service.ReferralService;
import com.manipal.service.impl.ReferralServiceImpl;


@WebServlet("/referralServlet")
public class insert_referral extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) {
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String ref_id=request.getParameter("R_ID");
		String emp_id=request.getParameter("E_ID");
		String emp_id1 = emp_id.substring(0,4);
		System.out.println(emp_id1);
		String job_id=request.getParameter("JOB_ID");
		String job_id1 = job_id.substring(0,4);
		
		String name=request.getParameter("name");
		Long contact=Long.parseLong(request.getParameter("contact"));
		String email=request.getParameter("email");

		String status="accepted";
		
		System.out.println("i am in servlet");
		
		
		referral add = new referral(emp_id1,job_id1,name,contact,email,status);
		
		ReferralService ref= new ReferralServiceImpl();
		try {
			ref.insertMethods(add);
			out.println("Added Successfully!");
			RequestDispatcher r=request.getRequestDispatcher("employee_main.jsp");
			r.include(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
