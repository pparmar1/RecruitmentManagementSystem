<%@page import="java.util.*,com.manipal.model.*"%>

<%@page import="com.manipal.service.impl.ScheduleServiceImpl"%>
<%@page import="com.manipal.service.ScheduleService"%>

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
ScheduleService ls=new ScheduleServiceImpl();
	List<schedule> projectList = new ArrayList<schedule>();
	projectList = ls.retrieveMethods();
	for(schedule s: projectList)
	{
		out.println("test"+s.getDATE1()+ "<br>");
	}
	
%> 
	
</body>
</html>