<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Data</title>
</head>
<body>
	<h1>Customer </h1>

	Hello, ${customer.firstName } ${customer.lastName } 
	<br><br>
	You requested for  ${customer.freePass} free passes.
	<br><br>
	You Enrolled in   ${customer.courseCode}
	<br><br>
	Passes will be send at  ${customer.postalCode }
	<br><br>
	
	Thank You
	<br>
	
</body>
</html>