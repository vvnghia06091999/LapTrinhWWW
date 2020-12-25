<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous"> -->
<!--<link rel="stylesheet" type="text/css" href="../css/fontawesome-free-5.13.0-web/css/all.css">  -->
<link
	href="<c:url value="css/fontawesome-free-5.13.0-web/css/all.css"/>"
	rel='stylesheet' type='text/css' />
<link href="<c:url value="css/bootstrap.min.css"/>" rel='stylesheet'
	type='text/css' />
<link href="<c:url value="css/bootstrap.css"/>" rel='stylesheet'
	type='text/css' />
<script src="<c:url value="js/jquery-3.3.1.min.js" />"></script>
<script src="<c:url value="js/bootstrap.min.js" />"></script>
<link href="<c:url value="css/css.css"/>" rel='stylesheet'
	type='text/css' />
<title>Shop Đồ Nam Nữ</title>
</head>
<style>
body {
	font-family: Arial;
	font-size: 17px;
	padding: 8px;
}

* {
	box-sizing: border-box;
}

.row {
	display: -ms-flexbox; /* IE10 */
	display: flex;
	-ms-flex-wrap: wrap; /* IE10 */
	flex-wrap: wrap;
	margin: 0 -16px;
}

.col-25 {
	-ms-flex: 25%; /* IE10 */
	flex: 25%;
}

.col-50 {
	-ms-flex: 50%; /* IE10 */
	flex: 50%;
}

.col-75 {
	-ms-flex: 75%; /* IE10 */
	flex: 75%;
}

.col-25, .col-50, .col-75 {
	padding: 0 16px;
}

.container_thanhtoan {
	background-color: #f2f2f2;
	padding: 5px 20px 15px 20px;
	border: 1px solid lightgrey;
	border-radius: 3px;
}

.input_thanhtoan {
	width: 100%;
	margin-bottom: 20px;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

label {
	margin-bottom: 10px;
	display: block;
}

.icon-container {
	margin-bottom: 20px;
	padding: 7px 0;
	font-size: 24px;
}

.btn {
	background-color: #4CAF50;
	color: white;
	padding: 12px;
	margin: 10px 0;
	border: none;
	width: 100%;
	border-radius: 3px;
	cursor: pointer;
	font-size: 17px;
}

.btn:hover {
	background-color: #45a049;
}

a {
	color: #2196F3;
}

hr {
	border: 1px solid lightgrey;
}

span.price {
	float: right;
	color: grey;
}

/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
@media ( max-width : 800px) {
	.row {
		flex-direction: column-reverse;
	}
	.col-25 {
		margin-bottom: 20px;
	}
}
</style>
<body>
	<input type="hidden" value="${tk.tenTaiKhoan }" name="tenTaiKhoan">
	<c:set var="tentk" value="${tk.tenTaiKhoan }" scope="session"></c:set>
	<div class="container-fluid">
		<div class="topheader">
			<div class="row">
				<div class="col-md-4" id="navbar-header">
					<c:if test="${tentk==null}">
						<ul>
							<li><a href="dangnhap"><span>Đăng nhập</span></a></li>
							<li><a href="#"><span>Đăng ký</span></a></li>
						</ul>

					</c:if>
					<c:if test="${tentk!=null}">
						<ul>
							<li><a href="dangnhap"><span>Xin Chào
										${tk.tenTaiKhoan } </span></a></li>
							<li><a href="dangxuat"><span>Đăng Xuất</span></a></li>
						</ul>
					</c:if>
				</div>
				<div class="col-md-8" id="navbar-header-right">
					<ul>
						<c:if test="${tentk!=null}">
							<li><a href="thongtincanhan"><span>Xem thông tin
										cá nhân</span></a></li>
							<li><a
								href="<c:url value="/dsDonHangKhachHang?tenTaiKhoan=${tk.tenTaiKhoan }"/>"><span>Đơn
										hàng</span></a></li>
						</c:if>
					</ul>
				</div>
			</div>
		</div>
		<!-- _header.jsp  -->
		<div>
			<jsp:include page="_header.jsp"></jsp:include>
		</div>
	</div>
	<div class="header_nav_main section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12">
					<div class="heade_menunav">
						<div class="wrap_main d-none d-lg-block d-xl-block">
							<div>
								<jsp:include page="menu2.jsp"></jsp:include>
							</div>
						</div>
					</div>
				</div>
			</div>
			<h2>Vemouse</h2>
			<p>Vui lòng nhập đúng thông tin trước khi thanh toán</p>
			<div class="row">
				<div class="col-75">
					<div class="container_thanhtoan">
						<form:form action="xacnhanthanhtoan" method="POST"
							modelAttribute="kH">
							<div class="row">
								<div class="col-50">
									<h3>Thông tin cá nhân</h3>
									<label for="fname"><i class="fa fa-user"></i> Họ và
										tên:</label>
									<form:input path="tenKhachHang" class="input_thanhtoan"
										type="text" placeholder="Nguyễn Văn Hoàng"
										title="Tên Không Được Nhập Số Hoặc Kí Tự Đặt Biệt" />
									<form:errors path="tenKhachHang" cssClass="error"
										style="color:red;"></form:errors>
									<label for="email"><i class="fa fa-envelope"></i> Email</label>
									<form:input path="email" class="input_thanhtoan" type="text"
										placeholder="nguyenvanhoang34iuh@gmai.com" />
									<form:errors path="email" cssClass="error" style="color:red;"></form:errors>
									<label for="adr"><i class="fa fa-address-card-o"></i>
										Địa chỉ nhận hàng:</label>
									<form:input path="diaChi" class="input_thanhtoan" type="text"
										title="Địa Chỉ Không Được Nhập Kí Tự Đặt Biệt"
										placeholder="14 Lê Văn Bảo, Gò Vấp" />
									<form:errors path="diaChi" cssClass="error" style="color:red;"></form:errors>
									<div class="row">
										<div class="col-50">
											<label for="soDienThoai">Số điện thoai: </label>
											<form:input path="soDienThoai" class="input_thanhtoan"
												type="text" title="Số điện thoại có 10 số"
												placeholder="0898136956" />
											<form:errors path="soDienThoai" cssClass="error"
												style="color:red;"></form:errors>
										</div>
									</div>
								</div>

								<div class="col-50">
									<h3>Hình thức thanh toán</h3>
									<label for="fname">Thanh toán tại nhà</label>
								</div>

							</div>
							<input type="hidden" name="tenTaiKhoan"
								value="${tk.tenTaiKhoan }">

							<input type="hidden" name="action" value="xacnhanthanhtoan">
							<button type="submit" value="Xác Nhận Thanh Toán" class="btn">Xác
								Nhận Thanh Toán</button>
						</form:form>
						<script>
							function thongbao() {
								confirm("Đơn hàng đã được đặt thành công!!!");
							}
						</script>
					</div>
				</div>
				<div class="col-25">
					<div class="container_thanhtoan">
						<h4>
							Danh sách sản phẩm <span class="price" style="color: black"><i
								class="fa fa-shopping-cart"></i> <b>${cart.soLuongItiem() }</b></span>
						</h4>


						<c:forEach items="${cart.getGioHang()}" var="sp">
							<p>
								<a href="#">${sp.tenSanpham }</a> <span class="price">SL:
									${sp.soLuong } ${sp.soLuong*sp.donGia}</span>
							</p>
							<br />
						</c:forEach>


						<hr>
						<p>
							Tổng tiền: <span class="price" style="color: black"><b>
									<fmt:setLocale value="vi_VN" /> <fmt:formatNumber
										value="${cart.TongTien() }" type="currency" />
							</b></span>
						</p>
					</div>
				</div>
			</div>
</body>

</html>