<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href="${pageContext.servletContext.contextPath }/">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>
	<H1>NEW SINH VIEN THÀNH CÔNG</H1>

	<div>${student.hoTen }</div>
	<div>
		<img alt="" src="images/${student.photo}">
	</div>
	<div></div>

</body>
</html>