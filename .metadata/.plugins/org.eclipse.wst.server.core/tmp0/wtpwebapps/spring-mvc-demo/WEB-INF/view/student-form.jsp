<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<h1>Student</h1>
	<form:form action="processForm" modelAttribute="student">
		<hr>
First Name : <form:input path="firstName" />
		<br>
		<br>
Last Name  : <form:input path="lastName" />
		<br>
		<br>
Country    : 
<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<br>
Language   :
<%--
 Java<form:radiobutton path="language" value="Java"/>
PHP<form:radiobutton path="language" value="PHP"/>
Python<form:radiobutton path="language" value="Python"/>
 --%>
		<form:radiobuttons path="language" items="${student.languageOptions}" />
		<br>
		<br>
Operating Systems :
<form:checkboxes path="operatingSystem"
			items="${student.operatingSystemOptions }" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>