<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="heade_menunav">
	<div class="wrap_main d-none d-lg-block d-xl-block">
		<div class="bg-header-nav">
			<div class="row">
				<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
					<nav class="header-nav">
						<ul class="item_big">
							<li class="nav-item  active "><a class="a-img"
								href="trangchu" title="Trang chủ"> <span>Trang chủ</span>
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
									<li><a href="quanjean" title="Áo cộc tay">Quần Jean
											Nam</a></li>
									<li><a href="tatcasanpham" title="Áo cộc tay">Tất cả
											sản phẩm</a></li>
									<li>
								</ul></li>
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
							<form action="timkiem" method="get"
								class="input-group search-bar" role="search">
								<input type="text" name="timkiem" value="" autocomplete="off"
									placeholder="Tìm kiếm..."
									class="input-group-field auto-search visible_index">
								<button type="submit"
									class="visible_index btn icon-fallback-text">
									<i class="fa fa-search"></i>
								</button>
							</form>
						</div>
					</div>

				</div>
			</div>
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


									</ul>
								</nav>
							</div>
						</aside>

					</div>
				</div>
				<div class="col-lg-9 col-md-12 col-sm-12 col-xs-12">
					<div class="sectionslider">
						<div class="section home-slider">

							<div id="demo" class="carousel slide" data-ride="carousel">

								<!-- Indicators -->
								<ul class="carousel-indicators">
									<li data-target="#demo" data-slide-to="0" class="active"></li>
									<li data-target="#demo" data-slide-to="1"></li>
									<li data-target="#demo" data-slide-to="2"></li>
								</ul>
								<div class="carousel-inner">
									<div class="carousel-item active">
										<img src="images/slider_1.jpg" alt="Los Angeles" width="1100"
											height="600">
									</div>
									<div class="carousel-item">
										<img src="images/slider_2.jpg" alt="Chicago" width="1100"
											height="600">
									</div>
									<div class="images/slider_1.jpg">
										<img src="images//slider_1.jpg" alt="New York" width="1100"
											height="600">
									</div>
								</div>
								<a class="carousel-control-prev" href="#demo" data-slide="prev">
									<span class="carousel-control-prev-icon"></span>
								</a> <a class="carousel-control-next" href="#demo" data-slide="next">
									<span class="carousel-control-next-icon"></span>
								</a>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>