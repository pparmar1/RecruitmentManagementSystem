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

<!-- Custom Fonts -->
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Employee</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/dashboard.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="css/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="css/awesome_fonts.css" rel="stylesheet" type="text/css">

<link href="css/signin.css" rel="stylesheet">


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">Employee</a>
			</div>
			<!-- Top Menu Items -->
			<ul class="nav navbar-right top-nav">
				<li class="dropdown">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-user"></i> 
<%String username=(String)session.getAttribute("username");%>
	 <%= username %> <b
						class="caret"></b></a>
					<ul class="dropdown-menu">

						<a href="LogoutServlet"><i class="fa fa-fw fa-power-off"></i> Log Out</a></li>
			</ul>
			</li>
			</ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="employee_main.jsp"><i class="fa fa-fw fa-dashboard"></i> Profile</a>
                    </li>
                    <li>
                        <a href="emp_jobs.jsp"><i class="fa fa-fw fa-bar-chart-o"></i>Jobs</a>
                    </li>
					<li>
                        <a href="emp_referral.jsp"><i class="fa fa-fw fa-table"></i>Referrals</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
				

  <div class="container">

       <div class="container" style="max-width:330px">

      <form class="form-rsignin" action="referralServlet" method="post">
        <h2 class="form-signin-heading" >Job Referral Form</h2>
	
	
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
	<select name="E_ID" class="form-control">
	<%
	while(rs.next())
	{
	String emp_id = rs.getString("E_ID");
	//String username = rs.getString("username");
	//String concat=emp_id+"-"+username;
	
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
	<select name=JOB_ID class="form-control">
	<%
	while(rs.next())
	{
	String job_id = rs.getString("JOB_ID");
	//String job_title=rs.getString("JOB_TITLE"); 
	//String concat=job_id+"-"+job_title; 
	%>
	<option value="<%=job_id %>"><%=job_id%></option>
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
	
	
	

	    </div><br/>
         <button class="btn btn-lg btn-primary btn-block" style="max-width:300px ; margin-left:423px"type="submit">Submit</button>
	 </form>   

    
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    </div>
</div>	
</div>
    </div>
	</div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>

</html>
