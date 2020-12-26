<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<style type="text/css">
.table &amp ;amp ;gt ;tbody &amp ;amp ;gt ;tr &amp ;amp ;gt ;td, .table
	 &amp ;amp ;gt ;tfoot &amp ;amp ;gt ;tr &amp ;amp ;gt ;td {
	vertical-align: middle;
}

@media screen and (max-width: 600px) {
	table#cart tbody td .form-control {
		width: 20%;
		display: inline !important;
	}
	.actions .btn {
		width: 36%;
		margin: 1.5em 0;
	}
	.actions .btn-info {
		float: left;
	}
	.actions .btn-danger {
		float: right;
	}
	table#cart thead {
		display: none;
	}
	table#cart tbody td {
		display: block;
		padding: .6rem;
		min-width: 320px;
	}
	table#cart tbody tr td:first-child {
		background: #333;
		color: #fff;
	}
	table#cart tbody td:before {
		content: attr(data-th);
		font-weight: bold;
		display: inline-block;
		width: 8rem;
	}
	table#cart tfoot td {
		display: block;
	}
	table#cart tfoot td .btn {
		display: block;
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
							<li><a href="formdangki"><span>Đăng ký</span></a></li>
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
							<li><a
								href="<c:url value="/thongtincanhan?tenTaiKhoan=${tk.tenTaiKhoan }"/>"><span>Xem
										thông tin cá nhân</span></a></li>
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
						<div class="section_sidebar_slider">
							<div class="container">
								<div class="row">
									<div
										class="dqdt-sidebar sidebar left-content col-lg-3 col-md-12 hidden-sm hidden-xs">
										<div class="wrap_background_aside asidecollection">

											<aside
												class="aside-item sidebar-category collection-category margin-bottom-20">
												<div class="aside-title">
													<h2 class="title-head margin-top-0 cate">
														<i class="fas fa-bars"></i><span>Danh mục sản phẩm</span>
													</h2>
												</div>
												<div class="aside-content">
													<nav class="nav-category navbar-toggleable-md">
														<ul class="nav navbar-pills">





															<li class="nav-item "><a href="aothun"
																class="nav-link a1">Áo Thun</a></li>




															<li class="nav-item "><a href="aophong"
																class="nav-link a1">Áo phông</a></li>




															<li class="nav-item "><a href="aosomi"
																class="nav-link a1">Áo sơ mi</a></li>




															<li class="nav-item "><a href="aococtay"
																class="nav-link a1">Áo cộc tay</a></li>




															<li class="nav-item "><a href="quanjean"
																class="nav-link a1">Quần Jean Nam</a></li>




															<li class="nav-item "><a class="nav-link"
																href="tatcasanpham">Tất cả sản phẩm</a></li>



															<li class="nav-item "><a class="nav-link"></a></li>
															<li class="nav-item "><a class="nav-link"></a></li>
															<li class="nav-item "><a class="nav-link"></a></li>


															<!--<li class=" fix-show nav-item "><a class="nav-link" href="/san-pham-khuyen-mai">Sản phẩm khuyến mãi</a></li>  -->
														</ul>
													</nav>
												</div>
											</aside>

										</div>
									</div>
									<section class="main-cart-page main-container col1-layout">
										<div class="main container cartpcstyle">
											<div class="wrap_background_aside margin-bottom-40">
												<div class="header-cart">
													<h1 class="title_cart">
														<span>Danh sách chi tiết đơn hàng</span>
													</h1>
													<div class="container">
														<table id="cart" class="table table-hover table-condensed">
															<tr>
																<th>Mã đơn hàng</th>
																<th>Tên sản phẩm</th>
																<th>Đơn giá</th>
																<th>Số lượng</th>
															</tr>
															<c:forEach items="${listChiTietKhachHang }" var="lctdh">
																<c:set var="maKhachHang"
																	value="${lctdh.donHang.khachHang.maKhachHang }"
																	scope="session"></c:set>
																<tr>
																	<td>${lctdh.donHang.maDonHang }</td>
																	<td>${lctdh.sanPham.tenSanPham }</td>
																	<td>${lctdh.donGia }</td>
																	<td>${lctdh.soLuong }</td>
																</tr>
															</c:forEach>
															<tr>
																<td colspan="4"><a
																	href="<c:url value="/dsDonHangKhachHang?tenTaiKhoan=${tk.tenTaiKhoan }"/>">Quay
																		lại</a></td>
															</tr>
														</table>
													</div>



												</div>
											</div>

										</div>
									</section>


								</div>
							</div>
						</div>
</body>

</html>