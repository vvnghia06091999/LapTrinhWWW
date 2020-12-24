<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="bg-header-nav">
	<div class="row">
		<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
			<nav class="header-nav">
				<ul class="item_big">
					<li class="nav-item  active "><a class="a-img" href="trangchu"
						title="Trang chủ"> <span>Trang chủ</span>
					</a></li>
					<li class="nav-item "><a class="a-img" href="gioithieu"
						title="Giới thiệu"> <span>Giới thiệu</span>
					</a></li>
					<li class="nav-item "><a class="a-img" href=""
						title="Sản phẩm"> <span>Sản phẩm</span><i
							class="fa fa-angle-down"></i>
					</a>
						<ul class="item_small">
							<li><a href="aothun" title="Áo Thun">Áo Thun</a></li>
							<li><a href="aophong" title="Áo phông">Áo phông</a></li>
							<li><a href="aosomi" title="Áo sơ mi">Áo sơ mi</a></li>
							<li><a href="aococtay" title="Áo cộc tay">Áo cộc tay</a></li>
							<li><a href="quanjean" title="Áo cộc tay">Quần Jean Nam</a></li>
							<li><a href="tatcasanpham" title="Áo cộc tay">Tất cả sản
									phẩm</a></li>

						</ul>
					</li>
					<li class="nav-item "><a class="a-img" href="tintuc"
						title="Tin tức"> <span>Tin tức</span>
					</a></li>
					<li class="nav-item "><a class="a-img" href="lienhe"
						title="Liên hệ"> <span>Liên hệ</span>
					</a></li>
				</ul>
			</nav>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
			<div class="serachpc">
				<div class="searchform">
					<form action="timkiem" method="get" class="input-group search-bar"
						role="search">
						<input type="text" name="timkiem" value="" autocomplete="off"
							placeholder="Tìm kiếm..."
							class="input-group-field auto-search visible_index">
						<button type="submit" class="visible_index btn icon-fallback-text">
							<i class="fa fa-search"></i>
						</button>
					</form>
				</div>
			</div>

		</div>
	</div>
</div>