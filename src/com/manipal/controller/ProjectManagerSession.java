package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProjectManagerSession")
public class ProjectManagerSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("PmMainPage.jsp").include(request, response);  
          
        HttpSession session=request.getSession(false);  
        if(session!=null){  
        String name=(String)session.getAttribute("name");  
          
        out.print("Hello, "+name+" Welcome to Profile");  
        }  

}}
