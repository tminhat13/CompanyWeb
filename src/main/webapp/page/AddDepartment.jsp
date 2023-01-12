<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Department</title>
</head>
<body>
<h3><a href="http://localhost:8080/Home">Home</a></h3>
<div align="center">
	<div align="left">
		<h2>Adding a New Department</h2>
		<form:form action="departmentregister" method="post" modelAttribute="department">
			<form:label path="departmentName">New Department Name: </form:label>
			<form:input path="departmentName"/><br>
			<form:label path="city">City: </form:label>
			<form:input path="city"/><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</div>
</div>
</body>
</html>