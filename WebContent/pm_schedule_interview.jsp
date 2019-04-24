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

<title>Project Manager</title>

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
				<a class="navbar-brand" href="index.html">Project Manager</a>
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
					<li class="active"><a href="PmMainPage.jsp"><i
							class="fa fa-fw fa-dashboard"></i> Profile</a></li>
					<li><a href="javascript:;" data-toggle="collapse"
						data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Jobs
							<i class="fa fa-fw fa-caret-down"></i></a>
						<ul id="demo" class="collapse">
							<li><a href="pm_add_jobs.jsp">Add Jobs</a></li>
							<li><a href="pm_view_jobs.jsp">View Jobs</a></li>
							<li><a href="pm_delete_jobs.jsp">Delete Jobs</a></li>
						</ul> <!--  <li>
                        <a href="Candidate_status.jsp"><i class="fa fa-fw fa-table"></i>Status</a>
                    </li> -->
					<li><a href="pm_can.jsp"><i class="fa fa-fw fa-table"></i>Candidates</a>
					</li>
					<li><a href="pm_ref.jsp"><i class="fa fa-fw fa-table"></i>Referrals</a>
					</li>
					<li><a href="javascript:;" data-toggle="collapse"
						data-target="#d"><i class="fa fa-fw fa-arrows-v"></i>
							Interviewers <i class="fa fa-fw fa-caret-down"></i></a>
						<ul id="d" class="collapse">
							<li><a href="Interviewer.jsp">Add Interviewer</a></li>
							<li><a href="Interviewer_retrieve.jsp">View Interviewer</a>
							</li>
							<li><a href="deleteInterviewer.jsp">Delete Interviewer</a></li>
						</ul>
					<li><a href="pm_schedule_interview.jsp"><i
							class="fa fa-fw fa-table"></i>Schedule Interview</a></li>
					<li><a href="Assign_interview.jsp"><i
							class="fa fa-fw fa-table"></i>Assign Interview</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
      
     <form class="form-signin" action="insert_schedule" method="post">
        <h2 class="form-signin-heading">Schedule Interview </h2>
 	<%
		Connection con = null;
		PreparedStatement ps = null;
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
