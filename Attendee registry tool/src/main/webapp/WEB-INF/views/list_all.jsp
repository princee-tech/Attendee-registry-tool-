
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp"%>
<%@ page import="java.sql.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Registration</title>
</head>
<body>
<h2>All Registration</h2>
<table>
<tr>
<th>Name</th>
<th>City</th>
<th>Email</th>
<th>Mobile</th>
<th>delete</th>
<th>Update</th>
</tr>
<%
ResultSet set=(ResultSet)request.getAttribute("result");
while(set.next()){
%>
<tr>
<td><%=set.getString(1) %></td>
<td><%=set.getString(2) %></td>
<td><%=set.getString(3) %></td>
<td><%=set.getString(4) %></td>

<td><a href="delete?email=<%=set.getString(3)%>" >delete</a></td>
<td><a href="update?email=<%=set.getString(3)%>&mobile=<%=set.getString(4) %>" >update</a></td>

</tr>

<%}%>

</table>
</body>
</html>