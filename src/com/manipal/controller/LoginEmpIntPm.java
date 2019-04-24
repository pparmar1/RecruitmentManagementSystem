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

import com.manipal.service.LoginService;
import com.manipal.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class LoginEmpIntPm
 */
@WebServlet("/EmpLogin")
public class LoginEmpIntPm extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside servlet");
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		try {
	
			String UserName = request.getParameter("username");
			String Password = request.getParameter("password");
			String Designation = request.getParameter("designation");   
			session.setAttribute("username", UserName);
			LoginService ls = new LoginServiceImpl();
			
				if (ls.loginValidate(UserName, Password) == 1 && Designation.equals("Employee") ) {
					
					RequestDispatcher req = request.getRequestDispatcher("employee_main.jsp");
					req.forward(request, response);
					 
				}
				else if(ls.loginValidate(UserName, Password) == 1 && Designation.equals("Project_Manager")) {
				
						session.setAttribute("username", UserName);
						System.out.println("project manager");
						RequestDispatcher req = request.getRequestDispatcher("PmMainPage.jsp");
						req.forward(request, response);
					}
				else if(ls.loginValidate(UserName, Password) == 1 && Designation.equals("Interviewer")) {
							
							session.setAttribute("username", UserName);
							RequestDispatcher req = request.getRequestDispatcher("interviewer_main.jsp");
							req.forward(request, response);
					}
					else
						{
							
							/*
							session.setAttribute("username", "");
							pw.println("Can't allow to insert");
							pw.println("<a href= login_employee.jsp> Back </a>");
							
							*/
							
							String errorMessage="Invalid Password";
							request.setAttribute("err",errorMessage);
							
							RequestDispatcher rd1 = request.getRequestDispatcher("ErrorPageEmp");
							rd1.include(request, response);

						}
					
				
		} catch (Exception e) {
			RequestDispatcher req = request.getRequestDispatcher("login_employee.jsp");
			req.forward(request, response);
		}
	}
	}

