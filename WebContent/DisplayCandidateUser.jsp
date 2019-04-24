<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.manipal.DAO.jdbc.ConnectionHelper"%>
    <%@page import="com.manipal.DAO.jdbc.DataBaseConnection"%>
    <%@page import="java.sql.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
			String user=request.getParameter("username");
			String pass=request.getParameter("password");
			Connection con = ConnectionHelper.getMySqlConnection();
			//Connection con = DataBaseConnection.getDBConnection();  
           	Statement st=con.createStatement();
           	ResultSet rs=st.executeQuery("select * from candidatedetails where username='"+user+"' and password='"+pass+"'");
           int count=0;
          while(rs.next())
          {
                              count++;
          }

                    if(count>0){
            out.println("welcome "+user);
            Statement s=con.createStatement();
           	ResultSet rst=s.executeQuery("select * from candidatedetails where username='"+user+"' and password='"+pass+"'");
          	while(rst.next()){
              System.out.println(rst.getString("name"));
            %>
            <h3>Your Information</h3>
            <table>
            <tr><td>FirstName:</td><td><input type="text" name="name" value="<%=rst.getString("name")%>"></td></tr>
            
            <tr><td>Address:</td><td><input type="text" name="name" value="<%=rst.getString("address")%>"></td></tr>
            <tr><td>Contact No:</td><td><input type="text" name="name" value="<%=rst.getString("contactNo")%>"></td></tr>
            <tr><td>Email:</td><td><input type="text" name="name" value="<%=rst.getString("email")%>"></td></tr>
           </table>
            <%
          }
          }
          else
          {
                       response.sendRedirect("login.jsp");
          }
}

catch(Exception e){
    System.out.println(e);
}
%>

</body>
</html>