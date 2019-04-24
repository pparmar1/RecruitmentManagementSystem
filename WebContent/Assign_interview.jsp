


<%@page import="com.manipal.DAO.jdbc.DataBaseConnection,java.sql.*"%>



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
							<form class="form-signin" action="InsertAssignInterview"
								method="post">
								<h2 class="form-signin-heading">Assign Interview</h2>



								<!-- <label> Schedule Id:</label>
        <input type="text" class="form-control" name="Schedule_ID" required autofocus>
 -->

								<%
									Connection con = null;
									PreparedStatement ps = null;
									try {
										con = DataBaseConnection.getDBConnection();
										String sql = "SELECT * FROM schedule_interview";
										ps = con.prepareStatement(sql);
										ResultSet rs = ps.executeQuery();
								%><tr>
									<td>
										<p>Schedule Id:
									</td>
									<td><select name="schedule_id" class="form-control">
											<%
												while (rs.next()) {
														String sid = rs.getString("SCHEDULE_ID");
											%>
											<option value="<%=sid%>"><%=sid%></option>
											<%
												}
											%>
									</select>
										</p></td>
								</tr>
								<%
									} catch (Exception sqe) {
										out.println(sqe);
									}
								%>

								<!-- <label> Interviewer Id:</label>
        <input type="text" class="form-control" name="I_ID" required>
         -->
								<%
									try {
										con = DataBaseConnection.getDBConnection();
										String sql = "SELECT * FROM interviewer";
										ps = con.prepareStatement(sql);
										ResultSet rs = ps.executeQuery();
								%><tr>
									<td>
										<p>Interviewer ID :
									</td>
									<td><select name="I_ID" class="form-control">
											<%
												while (rs.next()) {
														String iid = rs.getString("I_ID");
											%>
											<option value="<%=iid%>"><%=iid%></option>
											<%
												}
											%>
									</select>
										</p></td>
								</tr>
								<%
									} catch (Exception sqe) {
										out.println(sqe);
									}
								%>




								<!-- 	<label> Candidate Id:</label>
        <input type="text" class="form-control" name="C_ID" required>
 -->

								<%
									try {
										con = DataBaseConnection.getDBConnection();
										String sql = "SELECT * FROM candidatedetails";
										ps = con.prepareStatement(sql);
										ResultSet rs = ps.executeQuery();
								%><tr>
									<td>
										<p>Candidate ID :
									</td>
									<td><select name="C_ID" class="form-control">
											<%
												while (rs.next()) {
														String cid = rs.getString("C_ID");
											%>
											<option value="<%=cid%>"><%=cid%></option>
											<%
												}
											%>
									</select>
										</p></td>
								</tr>
								<%
									} catch (Exception sqe) {
										out.println(sqe);
									}
								%>
							
						</div>
						<button class="btn btn-lg btn-primary btn-block"
							style="max-width: 374px; margin-left: 375px" type="submit">Sign
							in</button>
						</form>

					</div>
					<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
