<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href="${pageContext.servletContext.contextPath }/">
<title>Danh Sách Sinh Viên</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style type="text/css">
table {
	width: 100%;t
	border: 1px solid black;
}

table, tr, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>
	<c:forEach items="${listChuyenNganh }" var ="cn">
		<h1>${cn.tenChuyenNganh }</h1>
		<table table class="table table-hover">
		<c:forEach items="${cn.dsSinhViens}" var="sv">
			<tr>
				<td>${sv.hoTen }</td>
				<td>${sv.gioiTinh }</td>
				<td><img alt="" src="images/${sv.photo}" width=150px height=100px></td>
			</tr>
		</c:forEach>
		</table>
	</c:forEach>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>