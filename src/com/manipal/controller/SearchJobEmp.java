package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.AddJob;
import com.manipal.service.JobService;
import com.manipal.service.impl.JobServiceImpl;

@WebServlet("/SearchJob")
public class SearchJobEmp extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter(); 
			try {
				
		String skillSet = request.getParameter("skill_set");
		out.println(skillSet);
		JobService search = new JobServiceImpl();
		List<AddJob> list= search.getJob(skillSet);
		
			
			request.setAttribute("list", list);
		
			RequestDispatcher r = request.getRequestDispatcher("emp_jobs.jsp");
			r.forward(request, response);
		
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
