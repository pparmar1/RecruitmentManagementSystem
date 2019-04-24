<%@page import="java.util.*,com.manipal.model.*"%>

<%@page import="com.manipal.service.impl.ScheduleServiceImpl"%>
<%@page import="com.manipal.service.ScheduleService"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.manipal.DAO.jdbc.*" %>
 <%@page import="com.manipal.service.*"%>    
 <%@page import="com.manipal.service.impl.CandidateServiceImplementation"%>
 <%@page import="java.sql.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Job Referral </title>

    <!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug
    <link href="css/login.css" rel="stylesheet">-->

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
  </head>

  <body>

    <div class="container">

      <form class="form-signin" action="referralServlet" method="post">
        <h2 class="form-signin-heading">Job Referral Form</h2>
	
	
	<!-- <label> Referral ID:</label>
        <input type="text" class="form-control" name="R_ID" required> -->
    
    <%
		Connection con = null;
		PreparedStatement ps = null;
	try
	{
		con=DataBaseConnection.getDBConnection();
		String sql = "SELECT * FROM employeedetails";
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(); 
	%>
	<tr><td>
	<p> Employee ID :</td><td>
	<select name=E_ID>
	<%
	while(rs.next())
	{
	String emp_id = rs.getString("E_ID");
	String username = rs.getString("username");
	String concat=emp_id+"-"+username;
	
	%>
	<option value="<%=emp_id %>"><%=emp_id%></option>
	<%}%>
	</select>
	</p></td></tr>
	<%
	}
	catch(Exception sqe)
	{ 
	out.println(sqe);
	}
	%>
	
	
	
    <%
		
	try
	{
		con=DataBaseConnection.getDBConnection();
		String sql = "SELECT * FROM job";
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(); 
	%>
	<tr><td>
	<p> Job ID :</td><td>
	<select name=JOB_ID>
	<%
	while(rs.next())
	{
	String job_id = rs.getString("JOB_ID");
	String job_title=rs.getString("JOB_TITLE"); 
	String concat=job_id+"-"+job_title; 
	%>
	<option value="<%=concat %>"><%=concat%></option>
	<%}%>
	</select>
	</p></td></tr>
	<%
	}
	catch(Exception sqe)
	{ 
	out.println(sqe);
	}
	%>
    
        
	

	<label>Candidate's Name :</label>
        <input type="text" class="form-control" name="name" required autofocus>
	
	<label> Contact No. :</label>
        <input type="text" class="form-control" name="contact" required autofocus>
    
    <label> Email ID :</label>
        <input type="text" class="form-control" name="email" required autofocus>
	
	
	

	    </div>
         <button class="btn btn-lg btn-primary btn-block" style="max-width:300px ; margin-left:525px"type="submit">Submit</button>
	 </form>   

    
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
