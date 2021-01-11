<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href="${pageContext.servletContext.contextPath }/">
<title>Thêm Sinh Viên</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>
	<h2>Thêm Sinh Viên</h2>
	<h1>${message }</h1>
	<form:form action="themSinhVien" method="POST"
		modelAttribute="commandSinhVien" enctype="multipart/form-data">
		<div>
			<label>Tên Sinh Viên</label>
			<form:input path="hoTen" />
			<form:errors path="hoTen"></form:errors>
		</div>
		<div>
			<label>Giới Tính</label>
			<form:input path="gioiTinh" />
		</div>
		<div>
			<label>Ngày sinh (MM/dd/yyyy)</label>
			<form:input path="ngaySinh" />
		</div>
		<div>
			<label>Hinh SV</label>
			<form:input path="photo" type="file" />
		</div>
		<div>
			<label>Chuyên ngành</label>
			<form:select path="chuyenNganh.id" items="${dsCN }"
				itemLabel="tenChuyenNganh" itemValue="id"></form:select>
		</div>
		<hr>
		<form:button>Thêm</form:button>
	</form:form>
</body>
</html>