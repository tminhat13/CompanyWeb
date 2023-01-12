<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Employee</title>
</head>
<body>
<div align="center">
	<div align="left">
		<h2>Adding a New Employee</h2>
		<form:form action="employeeregister" method="post" modelAttribute="employee">
			<form:label path="empName">New Employee Name: </form:label>
			<form:input path="empName"/><br>
			<form:label path="salary">Salary: </form:label>
			<form:input path="salary"/><br>
			<form:label path="depObj.departmentCode">Department Code: </form:label>
			<form:input path="depObj.departmentCode"/><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</div>
</div>
</body>
</html>