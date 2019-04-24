package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.DAO.RegisteredCandidateDAO;
import com.manipal.DAO.jdbc.RegisteredCandidateDAOImpl;
import com.manipal.model.CandidateDetails;

@WebServlet("/ViewRegisteredCandidate")
public class ViewRegisteredCandidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
  


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		HttpSession session = request.getSession();
		String JOB_ID = request.getParameter("JOB_ID");
		String JOB_ID1 = JOB_ID.substring(0,4);
		System.out.println(JOB_ID1);
		session.setAttribute("JOB_ID", JOB_ID1);
		RequestDispatcher rd = request.getRequestDispatcher("pm_can.jsp");
		rd.forward(request, response);
		/*RegisteredCandidateDAO r = new RegisteredCandidateDAOImpl();
		try {
			List<CandidateDetails> list = r.displayCan(JOB_ID1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
