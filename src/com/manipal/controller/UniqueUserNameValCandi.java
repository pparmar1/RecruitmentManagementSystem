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

import com.manipal.service.UniqueUserNameCandidate;
import com.manipal.service.impl.UniqueUserNameCandiImpl;


@WebServlet("/UniqueUserNameValCandi")
public class UniqueUserNameValCandi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
   		System.out.println("inside servlet");
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		try {
	
			String UserName = request.getParameter("username");
			String Password = request.getParameter("password");
			String confirm_password = request.getParameter("confirm_password");
			
			HttpSession session = request.getSession();
			
			
			UniqueUserNameCandidate uun = new UniqueUserNameCandiImpl();
			
			System.out.println("1");
			
				if (uun.UniqueUserCandi(UserName, Password) == 1 ) {
					
					String errorMessage="User Name Already Exists";
					request.setAttribute("err",errorMessage);
					
					System.out.println("4");
					
					
					RequestDispatcher rd1 = request.getRequestDispatcher("SameUserNameErrorCandi");
					rd1.include(request, response);

					
				}
				else if(Password.equals(confirm_password))
				{
				RequestDispatcher rd1 = request.getRequestDispatcher("CandidateDetailsController");
				rd1.include(request, response);
				}
				else if(!Password.equals(confirm_password))
				{
					String errorMessage="Enter valid password";
					request.setAttribute("err",errorMessage);
					
					System.out.println("4");
					
					
					RequestDispatcher rd1 = request.getRequestDispatcher("confirmPasswordError");
					rd1.include(request, response);
					
				}
				else
				{
					RequestDispatcher rd1 = request.getRequestDispatcher("login_candidate.jsp");
					rd1.include(request, response);
				}
			
				{			
					/*RequestDispatcher rd1 = request.getRequestDispatcher("CandidateDetailsController");
					rd1.include(request, response);

*/					//pw.println("<a href= insertData1> Back </a>");
				}
					
		} catch (Exception e) {
			RequestDispatcher req = request.getRequestDispatcher("login_candidate.jsp");
			req.forward(request, response);
		}

		RequestDispatcher rd1 = request.getRequestDispatcher("login_candidate.jsp");
		rd1.include(request, response);

		
	}

   		
}