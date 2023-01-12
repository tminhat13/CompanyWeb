<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><a href="http://localhost:8080/Home">Home</a></h3>
<c:forEach var="data" items="${employees}">
	<div class="dept-item">
		<c:out value="Employee Name: ${data.empName}"/>
	    <c:out value="| "></c:out>
	    <a href="http://localhost:8080/employees/${data.empName}">Employee Details</a>
	    <br><br>
	</div>
</c:forEach>
</body>
</html>