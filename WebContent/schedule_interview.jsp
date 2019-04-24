<%@page import="java.util.*,com.manipal.model.*"%>

<%@page import="com.manipal.service.impl.ScheduleServiceImpl"%>
<%@page import="com.manipal.service.ScheduleService"%>
<%@page import="org.apache.taglibs.standard.tag.common.xml.ForEachTag"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="static com.manipal.DAO.jdbc.ConnectionHelper.*" %>
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

    <title>Schedule Interview</title>

    <!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug
    <link href="css/login.css" rel="stylesheet">-->

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
  </head>

  <body>

    <div class="container">

     <!--  <form class="form-signin" action="scheduleInsert" method="post">
        <h2 class="form-signin-heading">Schedule Interview </h2>
		<label> Schedule-ID :</label>
        <input type="text" class="form-control" name="SCHEDULE_ID" >
       
	    <label> Job-ID :</label>
        <input type="text" class="form-control" name="JOB_ID" required>
				
		<label> Date :</label>
        <input type="date" class="form-control" name="DATE" required autofocus>

		<label> Time :</label>
        <input type="text" class="form-control" name="TIME" required autofocus>
				
        <div class="checkbox">
         
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
      </form> -->
      
      
     <form class="form-signin" action="insert_schedule" method="post">
        <h2 class="form-signin-heading">Schedule Interview </h2>
 	<%
		Connection con = null;
		PreparedStatement ps = null;
	try
	{
		con=getMySqlConnection();
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
	<option value="<%=concat %>"><%=concat %></option>
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
	
	<label> Date :</label>
        <input type="date" class="form-control" name="DATE" required autofocus>

		<label> Time :</label>
        <input type="text" class="form-control" name="TIME" required autofocus>

      <div class="checkbox">
         
         </div>
         <button class="btn btn-lg btn-primary btn-block" style="max-width:300px ; margin-left:50px"type="submit">Submit</button>
	 </form>   

    
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
