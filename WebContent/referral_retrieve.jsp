<%@page import="java.util.*,com.manipal.model.*"%>

<%@page import="com.manipal.service.impl.ReferralServiceImpl"%>
<%@page import="com.manipal.service.ReferralService"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
		  
	  
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
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">Candidate Name</a>
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
                        <a href="interviewer_main.jsp"><i class="fa fa-fw fa-dashboard"></i> Profile</a>
                    </li>
                    <li>
                        <a href="int_jobs.jsp"><i class="fa fa-fw fa-bar-chart-o"></i>Jobs</a>
                    </li>
                    <!-- <li>
                        <a href="int_update.jsp"><i class="fa fa-fw fa-table"></i>Update Status</a>
                    </li> -->
					<li>
                        <a href="referral_retrieve.jsp"><i class="fa fa-fw fa-table"></i>Referrals</a>
                    </li>
					<li>
                        <a href="int_can.jsp"><i class="fa fa-fw fa-table"></i>Schedules</a>
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

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">

<table class="table table-striped table-bordered">
<H2>REFERRAL INFORMATION</H2>
<tr>
<th>Referral Id</th>
<th>Employee Id</th>
<th>Job Id</th>
<th>Referral Name</th>
<th>contact</th>
<th>Email</th>
<th>status</th>
</tr>
<%
ReferralService ls=new ReferralServiceImpl();
	List<referral> projectList = new ArrayList<referral>();
	projectList = ls.retrieveMethods();
	for(referral s: projectList)
	{
		out.print("<tr>");
		out.print("<td>");
		out.println(s.getR_ID());
		out.print("</td>");
		out.print("<td>");
		out.print(s.getE_ID());
		out.print("</td>");
		out.print("<td>");
		out.print(s.getJOB_ID());
		out.print("</td>");
		out.print("<td>");
		out.print(s.getName());
		out.print("</td>");
		out.print("<td>");
		out.print(s.getContact());
		out.print("</td>");
		out.print("<td>");
		out.println(s.getEmail());
		out.print("</td>");
		out.print("<td>");
		out.println(s.getStatus());
		out.print("</td>");
		out.print("</tr>");
		
	}

%>
</table>
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
