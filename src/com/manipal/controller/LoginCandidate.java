package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.manipal.service.LoginServiceCandidate;
import com.manipal.service.impl.LoginServiceCandidateImpl;


@WebServlet("/LoginCandidate")
public class LoginCandidate extends HttpServlet {
	
		private static final long serialVersionUID = 1L;

		/**
		 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();
			
			try {
				response.setContentType("text/html");
				String UserName = request.getParameter("username");
				String Password = request.getParameter("password");
				session.setAttribute("username", UserName);
				session.setAttribute("password", Password);
				LoginServiceCandidate ls = new LoginServiceCandidateImpl();
				
					if (ls.loginValidateCandidate(UserName, Password) == 1 ) {
						//session.setAttribute("username", UserName);
						RequestDispatcher req = request.getRequestDispatcher("candidate_main.jsp");
						req.forward(request, response);
					}
					else
					{	
						/*
						session.setAttribute("username", "");
								pw.println("Can't allow to insert");
								pw.println("<a href= login_candidate.jsp> Back </a>");
						*/	
						
						String errorMessage="Invalid Password";
						request.setAttribute("err",errorMessage);
						
						RequestDispatcher rd1 = request.getRequestDispatcher("ErrorPageCan");
						rd1.forward(request, response);

					}
			} catch (Exception e) {
				RequestDispatcher req = request.getRequestDispatcher("login_candidate.jsp");
				req.forward(request, response);
			}

		}
}
