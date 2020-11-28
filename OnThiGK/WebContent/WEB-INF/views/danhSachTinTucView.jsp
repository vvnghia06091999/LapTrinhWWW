<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh Sách Tin Tức</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style type="text/css">
body {
	width: 100%;
	border: 1px solid black;
}

header {
	width: 100%;
	height: auto;
	border-bottom: 1px solid black;
	text-align: center;
}

nav {
	width: 100%;
	height: auto;
	border-bottom: 1px solid black;
	text-align: center;
}

section {
	width: 100%;
	height: auto;
	border-bottom: 1px solid black;
	text-align: center;
}

footer {
	width: 100%;
	height: auto;
	border-bottom: 1px solid black;
	text-align: center;
}

a {
	color: black;
}

table {
	width: 100%;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
li{
	color: red;
}
</style>
</head>
<body>
	<header>
		<jsp:include page="_header.jsp"></jsp:include>
	</header>
	<menu class="container">
		<jsp:include page="_menu.jsp"></jsp:include>
	</menu>
	<section class="container">
		<c:forEach var="danhmuc" items="${dsDanhMuc}">
			<li><b>Tên Danh Mục : ${danhmuc.tenDanhMuc }</b></li>
			<div>
				<table class="table table-hover">
					<tr>
						<td>Mã Tin Tức</td>
						<td>Tiêu Đề</td>
						<td>Nội Dung</td>
						<td>Liên Kết</td>
					</tr>
					<c:forEach var="tintuc" items="${danhmuc.dsTinTuc}">
						<tr>
							<td>
								<c:out value="${tintuc.maTT}"></c:out>
							</td>
							<td>
								<c:out value="${tintuc.tieuDe}"></c:out>
							</td>
							<td>
								<c:out value="${tintuc.noiDungTT}"></c:out>
							</td>
							<td>
								<c:out value="${tintuc.lienKet}"></c:out>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</c:forEach>
	</section>
	<footer class="container">
		<jsp:include page="_footer.jsp"></jsp:include>
	</footer>
</body>
</html>