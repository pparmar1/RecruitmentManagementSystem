package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.service.CandidateService;
import com.manipal.service.impl.CandidateServiceImplementation;

/**
 * Servlet implementation class EditCandidateController
 */
@WebServlet("/EditCandidateController")
public class EditCandidateController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In editcandidate Controller");
		PrintWriter out = response.getWriter();
		CandidateService cs = new CandidateServiceImplementation();
		response.setContentType("text/html");
		String candidateId = request.getParameter("username");
		String name = request.getParameter("name");
		System.out.println(name+candidateId);
		System.out.println("redirecting to update candidate service method");
		cs.updateCandidateData(candidateId, name);
		request.setAttribute("op", "Updated Successfully");
		RequestDispatcher rd=request.getRequestDispatcher("candidate_main.jsp");
		rd.include(request,response);	
	

	}

}
