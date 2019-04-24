<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%@page import="com.manipal.DAO.jdbc.*"%>
    <%@page import="com.manipal.model.*"%>
    <%@page import="com.manipal.service.*"%>
    <%@page import="com.manipal.service.impl.*"%>
    <%@page import="com.manipal.DAO.jdbc.*"%>
    <%@page import="com.manipal.DAO.jdbc.*"%>
    <%@page import="com.manipal.model.CandidateDetails"%>
    <%@page import="java.sql.*"%>
    
    <%@page import="com.manipal.DAO.*"%>
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

    <title>Candidate</title>

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
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Candidate Name</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> <%String username=(String)session.getAttribute("username");%>
	 <%= username %> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                       
                            <a href="LogoutServlet"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="candidate_main.jsp"><i class="fa fa-fw fa-dashboard"></i> Profile</a>
                    </li>
                    <li>
                        <a href="can_jobs.jsp"><i class="fa fa-fw fa-bar-chart-o"></i>Jobs</a>
                    </li>
                   <!--  <li>
                        <a href="can_update_status.jsp"><i class="fa fa-fw fa-table"></i>Status</a>
                    </li> -->
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
				
		 <div class="container" style="max-width:330px">		
<form method="post" action="EditCandidateController">

<%

	//CandidateDetails cd = null;
	String candidateID = request.getParameter("candidateId");
	
	CandidateService cs = new CandidateServiceImplementation();
	CandidateDetails cd = cs.retriveCandidateUserData(candidateID);
	
	%>
	
	<label> Username:</label>
	<input type="text" class="form-control" name="username" placeholder="username" value="<%=cd.getUsername()%>">
	<label> Name:</label>
		
        <input type="text" class="form-control" name="name" placeholder="First Middle Last" value="<%=cd.getName()%>">

		<label > Gender:</label>
				<input type="radio" name="gender" value="male"> Male
				<input type="radio" name="gender" value="female"> Female
				<br>
		<label> Date of birth:</label>
        <input type="date" class="form-control" name="dob" value="<%=cd.getDob()%>">

	<label> Contact:</label>
        <input type="text" class="form-control" name="contact" value="<%=cd.getContact_no()%>">
		
		<label> Address:</label>
        <input type="text" class="form-control" name="address" value="<%=cd.getAddress()%>" >

	<label> City:</label>
        <input type="text" class="form-control" name="city" value="<%=cd.getCity()%>">
	<label> State:</label>
        <input type="text" class="form-control" name="state" value="<%=cd.getState()%>">
		
		<label> Email-id:</label>
        <input type="text" class="form-control" name="email" value="<%=cd.getEmail()%>">
		

	 <h3 class="form-signin-heading">Government Id Proof:</h3>
		  <label> Id Type:</label>
		  <select class="form-control" id = "prooftype" name = "prooftype" value="<%=cd.getProof_type()%>">
       <option value="PAN Card">PAN Card</option>
  <option value="AADHAAR Card">AADHAAR Card</option>
  <option value="password">Passport</option>
 
</select><br>
		<label> Id Number:</label>
		 <input type="text" class="form-control" name="pnumber" value="<%=cd.getProof()%>">
        
		
	
	<h3 class="form-signin-heading">Educational Details:</h3>
	<label> Qualification:</label>
        <input type="text" class="form-control" name="gradscore" value="<%=cd.getQualification()%>">
	
		
	<label> Score:</label>
        <input type="text" class="form-control" name="score" value="<%=cd.getScore()%>">
		
		  <h3 class="form-signin-heading">Job Criteria:</h3>
	
	<label> Experience:</label>
        <input type="text" class="form-control" name="experience" value="<%=cd.getExperience()%>">
	<<%-- label> Designation:</label>
        <input type="text" class="form-control" name="designation" value="<%=cd.getDesignation()%>">
	<% %> --%>
	<br>
<input type="submit" value="Submit" class="btn btn-lg btn-primary btn-block">

<br><br>
</form></div></div></div>
</div></div></div></body>
</html>