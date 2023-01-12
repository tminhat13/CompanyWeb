<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Departments</title>
</head>
<body>
<h3><a href="http://localhost:8080/Home">Home</a></h3>
<c:forEach var="department" items="${departments}">
	<div class="dept-item">
		<c:out value="Department Name: ${department.departmentName}"/>
	    <c:out value="| City: ${department.city}"/> <br><br>
	</div>
</c:forEach>
</body>
</html>