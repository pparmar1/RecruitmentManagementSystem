package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SameUserNameErrorCandi
 */
@WebServlet("/SameUserNameErrorCandi")
public class SameUserNameErrorCandi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    		
    		String msg=(String)request.getAttribute("err");
    		
    		System.out.println("4");
    		
    		response.setContentType("text/html");
    		PrintWriter writer = response.getWriter();
    		
    		writer.print("<html><body ><font color='red'><center><h4>");
    		writer.print(msg);
    		
    		System.out.println("5");
    		writer.print("</h4></center></font></body></html>");
    		RequestDispatcher rd=request.getRequestDispatcher("candidate_registration.jsp");
    		rd.include(request, response);
	}

}
