	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h1 color="blue">
<%= session.getAttribute("name") %><br>
<%= session.getAttribute("add") %><br><br>
<%= session.getAttribute("phone") %><br>
<%= session.getAttribute("id") %><br>
<%= session.getAttribute("course") %><br></h1>
</body>
</html>