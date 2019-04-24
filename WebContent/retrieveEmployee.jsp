<%@page import="java.util.*,com.manipal.model.*"%>

<%@page import="com.manipal.service.impl.EmployeeServiceImpl"%>
<%@page import="com.manipal.service.employeeService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	employeeService service = new EmployeeServiceImpl();
	List<details> detailList = new ArrayList<details>();
	detailList = service.retrieveEmployeeData();
	for(details detailsEmp : detailList)
	{
		out.println(
				detailsEmp.getUsername() + "<br>" +
				detailsEmp.getAddress() + "<br>"+
				detailsEmp.getCity() + "<br>"+
				detailsEmp.getContact() + "<br>"+
				detailsEmp.getEmail()+ "<br>"+
				detailsEmp.getDob() + "<br>"+
				detailsEmp.getExperience() + "<br>"+
				detailsEmp.getAddress() + "<br>"+
				detailsEmp.getProof() + "<br>"+
				detailsEmp.getProof_type()+"<br>"+
				detailsEmp.getQualification()+"<br>"+
				detailsEmp.getScore() + "<br>"+
				detailsEmp.getDesignation() + "<br>"
				);
		%>
	
	<%} %>

</body>
</html>