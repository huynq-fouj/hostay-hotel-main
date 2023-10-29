<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String uri = request.getRequestURI();
String title = "Hostay";
String active = "home";
if (uri.contains("/hostay/about")) {
	title = "Về chúng tôi";
	active = "about";
}
if (uri.contains("/hostay/blog")) {
	title = "Bài viết";
	active = "blog";
}
if (uri.contains("/hostay/rooms")) {
	title = "Đặt phòng";
	active = "rooms";
}
if (uri.contains("/hostay/contact")) {
	title = "Liên hệ";
	active = "contact";
}
%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title><%=title%></title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="/hostay/assets/img/favicon.png" rel="icon">
  <link href="/hostay/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="/hostay/assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="/hostay/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="/hostay/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="/hostay/assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="/hostay/assets/css/style.css" rel="stylesheet">

</head>

<body>

<jsp:include page="searchForm.jsp" flush="true"></jsp:include>

<!-- ======= Header/Navbar ======= -->
  <nav class="navbar navbar-default navbar-trans navbar-expand-lg fixed-top">
    <div class="container">
      <button class="navbar-toggler collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#navbarDefault" aria-controls="navbarDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span></span>
        <span></span>
        <span></span>
      </button>
      <a class="navbar-brand text-brand" href="index.html">Estate<span class="color-b">Agency</span></a>

      <div class="navbar-collapse collapse justify-content-center" id="navbarDefault">
        <ul class="navbar-nav">

          <li class="nav-item">
            <a class="nav-link <%=(active == "home" ? "active" : "")%>" href="/hostay/">Trang chủ</a>
          </li>

          <li class="nav-item">
            <a class="nav-link <%=(active == "about" ? "active" : "")%>" href="/hostay/about/">Về chúng tôi</a>
          </li>

          <li class="nav-item">
            <a class="nav-link <%=(active == "rooms" ? "active" : "")%>" href="/hostay/rooms/">Đặt phòng</a>
          </li>

          <li class="nav-item">
            <a class="nav-link <%=(active == "blog" ? "active" : "")%>" href="/hostay/blog/">Bài viết</a>
          </li>

          <li class="nav-item">
            <a class="nav-link <%=(active == "contact" ? "active" : "")%>" href="/hostay/contact/">Contact</a>
          </li>
        </ul>
      </div>

      <button type="button" class="btn btn-b-n navbar-toggle-box navbar-toggle-box-collapse" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01">
        <i class="bi bi-search"></i>
      </button>

    </div>
  </nav><!-- End Header/Navbar -->
