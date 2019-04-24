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

import com.manipal.service.JobService;
import com.manipal.service.impl.JobServiceImpl;


@WebServlet("/DeleteJobServlet")
public class DeleteJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
		JobService delservice = new JobServiceImpl();
		
		out.println(" in delete servlet");
		String jobId = request.getParameter("x");
		
			delservice.deleteJob(jobId);
			request.setAttribute("output", "Deleted Successfully");
			System.out.println("after deleting");
			RequestDispatcher rd=request.getRequestDispatcher("pm_view_jobs.jsp");
			rd.include(request,response);		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
