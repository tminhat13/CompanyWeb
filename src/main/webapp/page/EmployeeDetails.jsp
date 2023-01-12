<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<h3><a href="http://localhost:8080/Home">Home</a></h3>
	<div class="outer-contrainer" align="center">
		<h2>Employee Details</h2>
		<div class="container" align="justify">
			<p>Employee Name: ${data.empName}</p>
			<p>Salary: ${data.salary}</p>
			<p>Department: ${data.depObj.departmentName}</p>
		</div>
	</div>
</body>
</html>