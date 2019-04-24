package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.manipal.DAO.scheduleDAO;
import com.manipal.model.schedule;
import com.manipal.service.ScheduleService;
import com.manipal.service.impl.ScheduleServiceImpl;

@WebServlet("/insert_schedule")


public class insert_schedule extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
			
		String schedule_id=request.getParameter("SCHEDULE_ID");
		String job_id=request.getParameter("JOB_ID");
		
		String job_id1 = job_id.substring(0,4);
		
		String date=request.getParameter("DATE");
		String time=request.getParameter("TIME");
		
		
		
		
		System.out.println("i am in servlet");
		
		
		
		schedule sc = new schedule(job_id1,date,time);
		
		ScheduleService ss= new ScheduleServiceImpl();
		try {
			ss.insertMethods(sc);
			RequestDispatcher r = request.getRequestDispatcher("PmMainPage.jsp");
			r.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
