<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>
</head>
<body>
	<h1>Student</h1>

	Hello, ${student.firstName } ${student.lastName }
	<br>
	<br> Country : ${student.country }
	<br>
	<br> Language Preference : ${student.language }
	<br>
	<br> Operating System :
	<ul>
		<c:forEach var="temp" items="${student.operatingSystem}">
			<li>${temp}</li>
		</c:forEach>

	</ul>
</body>
</html>