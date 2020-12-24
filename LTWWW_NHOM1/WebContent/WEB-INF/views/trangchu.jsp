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
<title>Trang Chủ</title>
</head>

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
					<!-- Menu -->
					<div>
						<jsp:include page="_menu.jsp"></jsp:include>
					</div>
				</div>
			</div>
			<div class="col-xl-12 col-lg-12">
				<div class="row">
					<c:forEach items="${listDanhMuc }" var="dm">
						<div class="title-modules">
							<h2 class="title_h2">
								<a href="#">${dm.tenDanhMuc }</a>
							</h2>
						</div>
						<c:forEach items="${listSanPham }" var="sp">
							<c:if test="${dm.maDanhMuc == sp.danhMuc.maDanhMuc  }">
								<div class="col-xl-4 clo-lg-4" style="text-align: center;">
									<form action="MuaHang" method="POST">
										<img src="${sp.urlHinh}" class="img-responsive"
											style="width: 100%">
										<p class="text-danger">${sp.tenSanPham }</p>
										<p class="text-info">${sp.donGia }</p>
										<p>
											<input type="hidden" name="maSanPham" value="${sp.maSanPham}">
											<input type="hidden" name="tenSanPham"
												value="${sp.tenSanPham}"> <input type="hidden"
												name="urlHinh" value="${sp.urlHinh}"> <input
												type="hidden" name="donGia" value="${sp.donGia}"> <input
												type="hidden" name="soLuong" value="1"> <input
												type="hidden" name="action" value="add">
										</p>
										<p>
											<a
												href="<c:url value="/xemthongtinsanpham?maSanPham=${sp.maSanPham}"/>"><input
												type="button" class="btn btn-primary" value="Xem hàng" /></a> <input
												type="submit" class="btn btn-primary" value="Mua hàng" />
										</p>
									</form>
								</div>

							</c:if>
						</c:forEach>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	</div>
	
	<!-- _footer.jsp -->
	<div>
		<jsp:include page="_footer.jsp"></jsp:include>
	</div>

</body>

</html>