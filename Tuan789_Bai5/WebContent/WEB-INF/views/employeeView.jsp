<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Salary</td>
			<td>Designation</td>
		</tr>
		<c:forEach var="emp" items="${list}">
			<tr>
				<td> ${emp.id} </td>
				<td> ${emp.name} </td>
				<td> ${emp.salary} </td>
				<td> ${designation.name} </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>