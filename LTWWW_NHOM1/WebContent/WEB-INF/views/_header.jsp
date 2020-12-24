<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<div class="header_menu">
	<div class="row">
		<div class="col-xl-3 col-lg-2 col-md-12 col-sm-12 col-xs-12">
			<div class="logo">
				<a href="#"
					style="display: block; line-height: 100px; height: 100px;"> <img
					src="images/logo.png">
				</a>
			</div>
		</div>
		<div class="col-xl-7 col-lg-8 col-md-12">
			<div class="header_service">
				<div class="row">
					<div class="col-lg-6">
						<div class="wrp">
							<div class="font-awesome">
								<i class="fas fa-truck" style="line-height: 53px;"></i>
							</div>
						</div>
						<div class="text" id="text-vanchuyen">
							<p style="color: #66a182; font-size: 16px;">Miễn phí vận
								chuyển</p>
							<span style="font-size: 14px;">Với đơn hàng trị giá trên <strong>1.000.000</strong>
							</span>
						</div>
					</div>
					<div class="col-lg-6">
						<div class="wrp">
							<div class="font-awesome">
								<i class="fas fa-phone" style="line-height: 53px;"></i>
							</div>
						</div>
						<div class="text" id="text-vanchuyen">
							<p style="color: #66a182; font-size: 16px;">Đặt hàng nhanh</p>
							<span style="font-size: 14px;">Gọi ngay <strong>18006750</strong>
							</span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-xl-2 col-lg-2 hidden-md hiden-sm hidden-xs"
			id="giohang">
			<div class="cart visible-xl visible-lg hidden-md hidden-sm hidden-xs">
				<a href="#" id="icon-cart"> <img src="images/icon-cart.png"
					style="padding-top: 12px;">
				</a>
				<div class="text-giohang">
					<a href="giohang" style="font-size: 16px; color: #66a182;">Giỏ
						hàng</a>
					<p style="margin: 0 0 15px 0;">
						(<span style="color: red;">${cart.soLuongItiem() }</span>) Sản
						phẩm
					</p>
				</div>
			</div>
		</div>
	</div>
</div>