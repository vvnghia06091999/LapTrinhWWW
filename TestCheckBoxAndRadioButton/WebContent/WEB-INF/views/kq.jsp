<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><c:out value="${radio}"></c:out></h1>
	<c:forEach var="t" items="${check}">
		<h3><c:out value="${t}"></c:out></h3>
	</c:forEach>
</body>
</html>