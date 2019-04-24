<%@page import="java.util.*,com.manipal.model.*"%>

<%@page import="com.manipal.service.impl.CandidateServiceImplementation"%>
<%@page import="com.manipal.service.CandidateService"%>
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
	CandidateService service = new CandidateServiceImplementation();
	List<CandidateDetails> candidateList = new ArrayList<CandidateDetails>();
	candidateList = service.retrieveCandidateData();
	for(CandidateDetails detailsCan : candidateList)
	{
		out.println(
				"<table border = '0'>"+
				"<tr>"+
						"<td>"+detailsCan.getUsername() +"</td>"+
						"<td>"+detailsCan.getAddress() +"</td>"+ 
						"<td>"+detailsCan.getCity() + "</td>"+
						"<td>"+detailsCan.getContact_no() + "</td>"+
						"<td>"+detailsCan.getEmail()+ "</td>"+
						"<td>"+detailsCan.getDob() + "</td>"+
						"<td>"+detailsCan.getExperience() + "</td>"+
						"<td>"+detailsCan.getAddress() + "</td>"+
						"<td>"+detailsCan.getProof() + "</td>"+
						"<td>"+detailsCan.getProof_type()+"</td>"+
						"<td>"+detailsCan.getQualification()+"</td>"+
						"<td>"+detailsCan.getScore() + "</td>"+
						"<td>"+detailsCan.getDesignation() + "</td>"
						+"</tr>"+"</table>"
				);
		%>
	
	<%} %>

</body>
</html>