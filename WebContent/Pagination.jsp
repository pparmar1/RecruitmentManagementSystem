<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.*,com.manipal.model.*"%>
<%@page import="com.manipal.service.impl.JobServiceImpl"%>
<%@page import="com.manipal.service.JobService"%>

<!DOCTYPE html>
<head>
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css'>
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/font-awesome.min.css" rel="stylesheet" />
<link href="css/style.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="css/dataTables.bootstrap.css">
<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.js"></script>
<script type="text/javascript" src="js/dataTables.bootstrap.js"></script>
</head>
<body>
	<%
		JobService service = new JobServiceImpl();
		 List<AddJob> list = new ArrayList<AddJob>();
			list = service.getAllJobs();
		             //   List<AddJob> jobs=(List<AddJob>) request.getAttribute("list");
		         if(list!=null){
	%>
	<div class="table-responsive">
		<table id="tblContact" class="table table-striped table-bordered"
			cellspacing="0" style="width: 100%;">
			<thead>
				<tr>
					<th>Title</th>
					<th>Description</th>
					<th>Skills</th>
					<th>Domain</th>
					<th>Experience</th>
					<th>Expiry Date</th>
					<th>Location</th>
				</tr>
			</thead>
			<%
				for(AddJob job : list){
			%>


			<tbody>
				<tr>
					<td><%=job.getJobTitle()%></td>
					<td><%=job.getJobDesc()%></td>
					<td><%=job.getSkillset()%></td>
					<td><%=job.getDomain()%></td>
					<td><%=job.getExperience()%></td>
					<td><%=job.getDate()%></td>
					<td><%=job.getLocation()%></td>
				</tr>

			</tbody>
			<%
				}
			%>
		</table>

		<%
			}
		%>

	</div>
	<script>
		$(document).ready(function() {
			$('#tblContact').dataTable({
				"iDisplayLength" : 5,
				"lengthMenu" : [ 5, 10, 25, 50, 100 ]
			});
		});
	</script>

</body>
</html>