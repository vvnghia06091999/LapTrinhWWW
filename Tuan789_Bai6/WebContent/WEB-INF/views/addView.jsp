<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="save">
		<TABLE>
			<TR>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</TR>
			<TR>
				<td>Salary</td>
				<td><form:input path="salary" /></td>
			</TR>
			<TR>
				<td>Designation</td>
				<td><form:input path="designation" /></td>
			</TR>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /> </td>
			</tr>
		</TABLE>
	</form:form>
</body>
</html>