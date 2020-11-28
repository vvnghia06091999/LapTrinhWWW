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
		
	</section>
	<footer>
		<jsp:include page="_footer.jsp"></jsp:include>
	</footer>
</body>
</html>