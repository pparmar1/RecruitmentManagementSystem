package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.CandidateStatus;
import com.manipal.service.AddCandidateStatusService;
import com.manipal.service.impl.AddCandidateStatusServiceImpl;

@WebServlet("/AddCandidateStatus")
public class AddCandidateStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		System.out.println("inside servlet");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String C_ID = request.getParameter("C_ID");
		String R_ID = request.getParameter("R_ID");
		String I_ID = request.getParameter("I_ID");
		String status = request.getParameter("status");
		String remarks = request.getParameter("remarks");
		
		out.println("inside servlet");
		CandidateStatus cs = new CandidateStatus(C_ID,R_ID, I_ID, status, remarks);
		AddCandidateStatusService css = new AddCandidateStatusServiceImpl();
		
			css.insertCandidateStatus(cs);
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
	}

}
