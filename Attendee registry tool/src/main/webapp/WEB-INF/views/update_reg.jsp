<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@include file="list_all.jsp"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<form action="update" method="post" >
Email<input type="text" name="email"  value="<%=request.getAttribute("email") %>"/>
Mobile<input type="text" name="mobile"/>
<input type="submit" value="update"/>
</form>
</body>
</html>