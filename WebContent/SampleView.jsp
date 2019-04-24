
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.*,com.manipal.model.*"%>
<%@page import="com.manipal.service.impl.AddJobServiceImpl"%>
<%@page import="com.manipal.service.AddJobService"%>
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
	AddJobService service = new AddJobServiceImpl();
	List<AddJob> list = new ArrayList<AddJob>();
	list = service.getAllJobs();
for(AddJob a : list){
	
	System.out.println(a.getDomain());
}
%>


	
</body>
</html>