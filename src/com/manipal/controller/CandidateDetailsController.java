package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.DAO.jdbc.*;
import com.manipal.model.CandidateDetails;
import com.manipal.service.CandidateService;
import com.manipal.service.impl.CandidateServiceImplementation;

@WebServlet("/CandidateDetailsController")
public class CandidateDetailsController extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String name = request.getParameter("fname");
			String gender = request.getParameter("gender");
			String dob = request.getParameter("dob");
			long contact = Long.parseLong(request.getParameter("contact"));
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String qualifications = request.getParameter("gradscore");
			int score = Integer.parseInt(request.getParameter("score"));
			String proof_Type = request.getParameter("proof_type");
			String proof = request.getParameter("pnumber");
			int experience = Integer.parseInt(request
					.getParameter("experience"));
			String JOB_ID = "not applied";
			String status = "active";

			Connection con = DataBaseConnection.getDBConnection();
			CandidateService cs = new CandidateServiceImplementation();
			CandidateDetails cd = new CandidateDetails(username,password,
					 name, gender,dob,contact,
					email, address, city, state,
					qualifications, score, proof_Type, proof,
					experience,JOB_ID,status);
			cs.insertCandidate(cd);
			RequestDispatcher r = request.getRequestDispatcher("login_candidate.jsp");
			r.forward(request, response);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
