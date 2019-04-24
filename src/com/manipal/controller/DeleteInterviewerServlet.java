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

import com.manipal.DAO.InterviewerDAO;
import com.manipal.DAO.jdbc.ImplementInterviewer;




@WebServlet("/DeleteInterviewerServlet")
public class DeleteInterviewerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
	     InterviewerDAO intd = new ImplementInterviewer();
		
		//out.println(" in delete servlet");
		String Interviewer_id = request.getParameter("x");
		System.out.println("took x");
			intd.deleteInterviewer(Interviewer_id);
			request.setAttribute("output", "Deleted Successfully");
			System.out.println("after deleting");
			RequestDispatcher rd=request.getRequestDispatcher("Interviewer_retrieve.jsp");
			rd.include(request,response);		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

	