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

import com.manipal.model.AssignInterview;
import com.manipal.service.AssignInterviewService;
import com.manipal.service.impl.AssignIntImplService;

@WebServlet("/InsertAssignInterview")
public class InsertAssignInterview extends HttpServlet{
	
	

	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		}
		
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
				
			String schedule_id=request.getParameter("schedule_id");
			String interviewer_id=request.getParameter("I_ID");
			String candidate_id=request.getParameter("C_ID");
			System.out.println("in servlet"+schedule_id);
			
			
			
			
			System.out.println("i am in servlet");
			
			
			
		//	schedule sc = new schedule(schedule_id,job_id,date,time);
			AssignInterview ai=new AssignInterview(schedule_id,interviewer_id,candidate_id);
	//		LoginService log= new LoginServiceImpl();
			AssignInterviewService ais=new AssignIntImplService();
			RequestDispatcher r = request.getRequestDispatcher("PmMainPage.jsp");
			r.forward(request, response);
			try {
				ais.insertMethods(ai);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}



