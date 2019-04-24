package com.manipal.controller;

import java.io.*;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.DAO.JobDAOEmpl;
import com.manipal.DAO.jdbc.JobImplEmpl;
import com.manipal.DAO.jdbc.DataBaseConnection;
import com.manipal.model.AddJob;
import com.manipal.service.JobService;
import com.manipal.service.impl.JobServiceImpl;

@WebServlet("/AddJobServlet")
public class AddJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out= response.getWriter();
try{
	System.out.println("Inside Servlet");
	String E_ID = request.getParameter("E_ID");
	String jobTitle = request.getParameter("job_title");
	String jobDescription = request.getParameter("job_description");
	String expiryDate = request.getParameter("expiry_date");
	String domain = request.getParameter("domain");
	String experience = request.getParameter("experience");
	String skillSet = request.getParameter("skill_set");
	String location = request.getParameter("location");
	
	
	AddJob a = new AddJob(E_ID,jobTitle,jobDescription,expiryDate,domain,experience, location, skillSet);
	
	
	JobService ser = new JobServiceImpl();
	ser.addjobs(a);
	System.out.println("back to servlet");
	RequestDispatcher r = request.getRequestDispatcher("pm_view_jobs.jsp");
	r.forward(request, response);
	/*AddJobDAO ad = new AddJobImpl();
	ad.addJob(a);*/
}
catch(Exception e){
	System.out.println(e);
}
	}

}
