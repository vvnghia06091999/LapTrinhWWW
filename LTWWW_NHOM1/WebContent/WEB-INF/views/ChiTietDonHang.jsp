<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
						<section class="main-cart-page main-container col1-layout">
							<div class="main container cartpcstyle">
								<div class="wrap_background_aside margin-bottom-40">
									<div class="header-cart">
										<h1 class="title_cart">
											<span>Giỏ hàng</span>
										</h1>
										<div class="container">
											<table id="cart" class="table table-hover table-condensed">
												<thead>
													<tr>
														<th style="width: 50%">Tên sản phẩm</th>
														<th style="width: 10%">Giá</th>
														<th style="width: 8%">Số lượng</th>
														<th style="width: 22%" class="text-center">Thành tiền</th>
														<th style="width: 10%"></th>
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${cart.getGioHang() }" var="sp">
														<form method="POST" action="MuaHang">
															<tr>
																<td data-th="Product">
																	<div class="row">
																		<div class="col-sm-2 hidden-xs">
																			<img src="${sp.urlHinhAnh}" alt="${sp.urlHinhAnh}"
																				class="img-responsive" width="100">
																		</div>
																		<div class="col-sm-10">
																			<h4 class="nomargin">${sp.tenSanpham }</h4>
																			<c:if test="${sp.soLuongConTrongKho > 0}">
																				<p style="color: blue;">Số lượng
																					${sp.soLuongConTrongKho}</p>
																			</c:if>
																			<c:if test="${sp.soLuongConTrongKho == 0}">
																				<p style="color: red;">Số lượng
																					${sp.soLuongConTrongKho}</p>
																				<p style="color: red;">Hết Hàng</p>
																			</c:if>
																		</div>
																	</div>
																</td>
																<td data-th="Price">${sp.donGia}</td>
																<td data-th="Quantity"><input
																	class="form-control text-center" value="${sp.soLuong }"
																	type="number" name="soLuong" min="1" max="300">
																	<c:if test="${sp.soLuong > sp.soLuongConTrongKho}">
																		<p style="color: red;">Không đủ SL</p>
																	</c:if></td>
																<!-- 
																	<td data-th="Subtotal" class="text-center">${sp.soLuong*sp.donGia}</td>
																 -->
																<td data-th="Subtotal" class="text-center"><fmt:setLocale
																		value="vi_VN" /> <fmt:formatNumber
																		value="${sp.soLuong*sp.donGia}" type="currency" /></td>

																<td class="actions" data-th=""><input type="hidden"
																	name="id" value="${sp.id}">
																	<button class="btn btn-info btn-sm" type="submit"
																		name="action" value="update">
																		<i class="fa fa-edit"></i>
																	</button>
																	<button class="btn btn-danger btn-sm" type="submit"
																		name="action" value="delete">
																		<i class="fa fa-remove">Xóa</i>
																	</button></td>
															</tr>

														</form>

													</c:forEach>

												</tbody>
												<tfoot>
													<tr class="visible-xs">
														<td class="text-center"><strong> đ</strong></td>
													</tr>

													<tr>
														<td style="text-align: left;"><a href="trangchu"
															class="btn btn-warning"><i class="fa fa-angle-left"></i>
																Tiếp tục mua hàng</a></td>
														<td colspan="2" class="hidden-xs"></td>
														<td class="hidden-xs text-center"><strong>Tổng
																tiền <fmt:setLocale value="vi_VN" /> <fmt:formatNumber
																	value="${cart.TongTien() }" type="currency" />
														</strong></td>
														<c:if
															test="${cart.checkSoLuongCon() ==1 && cart.TongTien() >0}">
															<td><a
																href="<c:url value="/thanhtoan?action=thanhtoan&tenTaiKhoan=${tentk}"/>"
																class="btn btn-success btn-block">Thanh toán <i
																	class="fa fa-angle-right"></i></a></td>
														</c:if>
														<c:if test="${cart.checkSoLuongCon() == -1}">
															<td><a href="#" class="btn btn-danger btn-block">Thanh
																	toán <i class="fa fa-angle-right"></i>
															</a></td>
															<p style="color: red;">Vui Lòng Kiểm Tra Lại Số Lượng
																Hợp Lệ Trước Khi Thanh Toán</p>
														</c:if>
														<c:if test="${cart.TongTien() == 0 }">
															<td><a href="#" class="btn btn-danger btn-block">Thanh
																	toán <i class="fa fa-angle-right"></i>
															</a></td>
															<p style="color: red;">Vui Lòng Kiểm Tra Lại Số Lượng
																Hợp Lệ Trước Khi Thanh Toán</p>
														</c:if>
													</tr>
												</tfoot>
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