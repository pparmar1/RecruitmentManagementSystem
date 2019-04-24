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
import com.manipal.service.UniqueUserName;
import com.manipal.service.impl.LoginServiceImpl;
import com.manipal.service.impl.UniqueUserNameImpl;

@WebServlet("/UniqueUserNameValidation")
public class UniqueUserNameValidation extends HttpServlet  {
	

	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside servlet");
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		try {
	
			String UserName = request.getParameter("user_name");
			String Password = request.getParameter("password");
			   
			HttpSession session = request.getSession();
			UniqueUserName un = new UniqueUserNameImpl();
			
			System.out.println("1");
			
				if (un.UniqueUser(UserName, Password) == 1 ) {
					
					String errorMessage="User Name Already Exists";
					request.setAttribute("err",errorMessage);
					
					System.out.println("4");
					
					
					RequestDispatcher rd1 = request.getRequestDispatcher("SameUserNameError");
					rd1.include(request, response);

					
				}
				else
				{			
					RequestDispatcher rd1 = request.getRequestDispatcher("insertData1");
					rd1.include(request, response);

					//pw.println("<a href= insertData1> Back </a>");
				}
					
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
