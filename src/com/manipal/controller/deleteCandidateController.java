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



@WebServlet("/deleteCandidateController")
public class deleteCandidateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public deleteCandidateController() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		CandidateService candidateService = new CandidateServiceImplementation();
		response.setContentType("text/html");
		String CID=request.getParameter("x");
		out.println(candidateService.removeCandidate(CID));
		System.out.println("candidate removed");
		request.setAttribute("op", "Deleted Successfully");
		RequestDispatcher rd=request.getRequestDispatcher("pm_can.jsp");
		rd.include(request,response);		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
