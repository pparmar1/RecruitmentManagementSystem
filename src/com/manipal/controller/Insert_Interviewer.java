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

import com.manipal.DAO.jdbc.ImplementInterviewer;
import com.manipal.model.Interviewer;
import com.manipal.service.IntService;
import com.manipal.service.LoginService;
import com.manipal.service.impl.IntServiceImpl;
import com.manipal.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class Insert_Interviewer
 */
@WebServlet("/Insert_Interviewer")
public class Insert_Interviewer extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
			
		String Interviewer_id=request.getParameter("I_ID");
		String Employee_id=request.getParameter("E_ID");
		System.out.println(Employee_id);
		
		String Employee_id1=Employee_id.substring(0,4);
		
		String Job_id=request.getParameter("JOB_ID");
		
		String Job_id1=Job_id.substring(0,4);
		System.out.println(Job_id1);
		String Interviewer_Status=request.getParameter("I_STATUS");
		/*String Interviewer_name=request.getParameter("I_NAME");*/
		
		
		
		
		System.out.println("i am in servlet");
		
		
		
		Interviewer in = new Interviewer( Interviewer_id,Employee_id1,Job_id1,Interviewer_Status);
		
	//	LoginService log= new LoginServiceImpl();
		IntService is=new IntServiceImpl();
		try {
			is.insertMethods(in);
			RequestDispatcher rd = request.getRequestDispatcher("Interviewer_retrieve.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
