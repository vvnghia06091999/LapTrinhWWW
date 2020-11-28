<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm Tin Tức</title>
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
	height: 500px;
	border-bottom: 1px solid black;
	text-align: center;
}

footer {
	width: 100%;
	height: auto;
	border-bottom: 1px solid black;
	text-align: center;
}
</style>
</head>
<body>
	<header>
		<jsp:include page="_header.jsp"></jsp:include>
	</header>
	<menu>
		<jsp:include page="_menu.jsp"></jsp:include>
	</menu>
	<section>
		<div>
			<h3><b>Thêm Tin Tức</b></h3>
		</div>
		<form action="themTinTuc" method="post">
			<div>
			<label>Tiêu Đề : </label>
			<input type="text" name="tieuDe">
		</div>
		
		<div>
			<label>Nội Dung : </label> <br>
			<textarea rows="10" cols="30" name="noiDungTT"></textarea>
		</div>
		
		<div>
			<label>Liên Kết :</label> 
			<input type="text" name="lienKet">
		</div>
		
		<div>
			<label>Danh mục : </label>
			<input list="dsdanhmuc" name="tenDanhMuc">
			<datalist id ="dsdanhmuc">
				<c:forEach var="danhmuc" items="${dsDanhMuc}">
					<option value="${danhmuc.tenDanhMuc}">
				</c:forEach>
			</datalist>
		</div>
		<div>
			<input type="submit" value="Tạo Tin Tức">
		</div>
		</form>
	</section>
	<footer>
		<jsp:include page="_footer.jsp"></jsp:include>
	</footer>
</body>
</html>