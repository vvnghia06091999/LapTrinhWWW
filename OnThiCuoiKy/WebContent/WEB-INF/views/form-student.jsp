<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="from"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm Sinh Viên</title>
</head>
<body>
	<from:form action="themSV" method="POST" modelAttribute="sinhVien">
		<div>
			<label>Tên Sinh Viên</label>
			<from:input path="tenSinhVien" />
		</div>
		<div>
			<label>Ngày Sinh</label>
			<from:input path="ngaySinh" />
		</div>
		<div>
			<label>Điểm</label>
			<from:input path="diem" />
		</div>
		<div>
			<label>Hình</label>
			<from:input path="" type="file" />
		</div>
		<div>
			<label>Chuyên Ngành</label>
			<from:select path="" itemLabel="" itemValue=""></from:select>
		</div>
	</from:form>

</body>
</html>