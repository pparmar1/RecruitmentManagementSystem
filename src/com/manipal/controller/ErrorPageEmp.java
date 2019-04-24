package com.manipal.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ErrorPageEmp")
public class ErrorPageEmp extends HttpServlet {

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String msg=(String)request.getAttribute("err");
		
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.print("<html><body ><font color='red'><center><h4>");
		writer.print(msg);
		writer.print("</h4></center></font></body></html>");
		RequestDispatcher rd=request.getRequestDispatcher("login_employee.jsp");
		rd.include(request, response);
		
		
	}

}
