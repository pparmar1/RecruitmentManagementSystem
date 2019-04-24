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
import javax.servlet.http.HttpSession;

import com.manipal.service.CandidateApplyJobService;
import com.manipal.service.JobService;
import com.manipal.service.impl.CandidateApplyJobServiceImpl;
import com.manipal.service.impl.JobServiceImpl;


@WebServlet("/CandidateRegisterJobServlet")
public class CandidateRegisterJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String jobId = request.getParameter("x");
		System.out.println("JOB_ID"+jobId);
		String C_ID = (String)session.getAttribute("C_ID");
		System.out.println("C_ID"+C_ID);
		CandidateApplyJobService c = new CandidateApplyJobServiceImpl();
		c.canApplyJob(jobId,C_ID);
		System.out.println("Updated");
		RequestDispatcher r = request.getRequestDispatcher("candidate_main.jsp");
		r.forward(request, response);
}
	}
