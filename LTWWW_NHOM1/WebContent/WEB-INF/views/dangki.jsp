<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<meta name="viewport" content="width=device-width, initial-scale=1">
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
<title>Đăng kí tài khoản</title>
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
						<div id="menu-overlay" class=""></div>
						<section class="bread-crumb">
							<span class="crumb-border"></span>
							<div class="container ">
								<div class="row">
									<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
										<ul class="breadcrumb">
											<li class="home"><a href="trangchuu"><span>Trang
														chủ</span></a> <span class="mr_lr">&nbsp;<i
													class="fas fa-chervon-right"></i>&nbsp;
											</span></li>

											<li><strong><span>Đăng ký tài khoản</span></strong></li>

										</ul>
									</div>
								</div>
							</div>
						</section>
						<div class="container margin-bottom-20">
							<div
								class="wrap_background_aside padding-top-15 margin-bottom-40">
								<h1 class="title_base_cus">Thông tin cá nhân</h1>
								<div class="row">
									<div class="col-lg-12 ">
										<div class="page-login">
											<div id="login">

												<form accept-charset="utf-8" action="dangki"
													id="customer_register" method="post">
													<input name="FormType" type="hidden"
														value="customer_register">

													<div class="form-signup"></div>
													<div class="form-signup clearfix">
														<div class="row">

															<div class="col-md-6">
																<fieldset class="form-group">
																	<label>Tên tài khoản <span class="required">*</span></label>
																	<input type="text" class="form-control form-control-lg"
																		value="" name="tentaikhoan" id="firstName"
																		placeholder="" required="">
																</fieldset>
															</div>
														</div>

														<div class="row">

															<div class="col-md-6">
																<fieldset class="form-group">
																	<label>Tên khách hàng <span class="required">*</span></label>
																	<input type="text" class="form-control form-control-lg"
																		value="" name="tenkhachhhang" placeholder=""
																		required="">
																</fieldset>
															</div>
														</div>
														<div class="row">
															<div class="col-md-6">
																<fieldset class="form-group">
																	<label>Email <span class="required">*</span></label> <input
																		type="email"
																		pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,63}$"
																		class="form-control form-control-lg" value=""
																		name="email" id="email" placeholder="" required="">
																</fieldset>
															</div>
															<div class="col-md-6">
																<fieldset class="form-group">
																	<label>Số điện thoại <span class="required">*</span></label>
																	<input type="text" name="sdt" id="phone"
																		pattern="^[0-9]{10}"
																		class="form-control form-control-lg" required="">
																</fieldset>
															</div>
															<div class="col-md-6">

																<fieldset class="form-group">
																	<label>Mật khẩu <span class="required">*</span>
																	</label> <input type="password"
																		class="form-control form-control-lg" value=""
																		name="password" id="password" placeholder=""
																		required="">
																</fieldset>
															</div>
														</div>


														<div class="col-xs-12 text-xs-left"
															style="margin-top: 30px; padding: 0">
															<button type="summit" value="Đăng ký"
																class="btn btn-style btn-primary-2" onclick="thongbao">Đăng
																ký</button>

															<div class="block social-login--facebooks">
																<p class="hoac_style">
															</div>

														</div>

													</div>

												</form>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>

					</div>

				</div>
			</div>
		</div>
	</div>




</body>
</html>
