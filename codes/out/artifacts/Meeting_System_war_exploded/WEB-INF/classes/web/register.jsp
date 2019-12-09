<%--
  Created by IntelliJ IDEA.
  User: Huang
  Date: 2019/11/17 017
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="wpoceans">
    <title></title>
    <link href="assets/css/themify-icons.css" rel="stylesheet">
    <link href="assets/css/flaticon.css" rel="stylesheet">
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/animate.css" rel="stylesheet">
    <link href="assets/css/owl.carousel.css" rel="stylesheet">
    <link href="assets/css/owl.theme.css" rel="stylesheet">
    <link href="assets/css/slick.css" rel="stylesheet">
    <link href="assets/css/slick-theme.css" rel="stylesheet">
    <link href="assets/css/swiper.min.css" rel="stylesheet">
    <link href="assets/css/owl.transitions.css" rel="stylesheet">
    <link href="assets/css/jquery.fancybox.css" rel="stylesheet">
    <link href="assets/css/odometer-theme-default.css" rel="stylesheet">
    <link href="assets/css/nice-select.css" rel="stylesheet">
    <link href="assets/css/style.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<!-- start page-wrapper -->
<div class="page-wrapper">
    <!-- start preloader -->
    <div class="preloader">
        <div class="sk-folding-cube">
            <div class="sk-cube1 sk-cube"></div>
            <div class="sk-cube2 sk-cube"></div>
            <div class="sk-cube4 sk-cube"></div>
            <div class="sk-cube3 sk-cube"></div>
        </div>
    </div>
    <!-- end preloader -->
    <!-- Start header -->
    <header id="header" class="wpo-site-header wpo-header-style-2">
        <div class="topbar">
            <div class="container">
                <div class="row">
                    <div class="col col-md-6 col-sm-7 col-12">
                        <div class="contact-intro">
                            <ul>
                                <li><i class="fi flaticon-phone"></i>+0086 3831880</li>
                                <li><i class="fi flaticon-mail"></i> 1149823272@qq.com</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col col-md-6 col-sm-5 col-12">
                        <div class="contact-info">
                            <ul>
                                <li><a href="index.jsp">首页</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- end topbar -->
        <nav class="navigation navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="open-btn">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp"><img src="assets/images/logo.png" alt></a>
                </div>
            </div><!-- end of container -->
        </nav>
    </header>
    <!-- end of header -->
    <!-- .breadcumb-area start -->
    <div class="breadcumb-area">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="breadcumb-wrap">
                        <h2>Welcome to join us!</h2>
                        <h2>欢迎用户注册！</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- .breadcumb-area end -->

    <!-- start wpo-contact-form-map -->
    <section class="wpo-contact-form-map section-padding">
        <div class="container">
            <div class="row">
                <div class="co-lg-10 col-lg-offset-1 col-12">
                    <div class="row">
                        <div class="col col-lg-6 col-12">
                            <div class="contact-form">
                                <h2>用户注册表</h2>
                                <form method="post" action="Register" class="contact-validation-active" id="contact-form-main">
                                    <div>
                                        <input type="number" class="form-control" name="id"  placeholder="Your ID Numbers" required>
                                    </div>
                                    <div>
                                        <input type="password" class="form-control" name="password" placeholder="Password" required>
                                    </div>
                                    <div class="submit-area">
                                        <button type="submit" class="theme-btn submit-btn">注册</button>
                                        <div id="loader">
                                            <i class="ti-reload"></i>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                        <div class="col col-lg-6 col-12">
                            <div class="wpo-contact-info">
                                <div class="info-item">
                                    <h2>Nanchang University</h2>
                                    <div class="info-wrap">
                                        <div class="info-icon">
                                            <i class="fi flaticon-internet"></i>
                                        </div>
                                        <div class="info-text">
                                            <span>Office Address</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="info-item">
                                    <h2>1149823272@qq.com.com</h2>
                                    <div class="info-wrap">
                                        <div class="info-icon">
                                            <i class="fi flaticon-mail"></i>
                                        </div>
                                        <div class="info-text">
                                            <span>Official Mail</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="info-item">
                                    <h2>+0086 3831880</h2>
                                    <div class="info-wrap">
                                        <div class="info-icon">
                                            <i class="fi flaticon-support-1"></i>
                                        </div>
                                        <div class="info-text">
                                            <span>Official Phone</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div> <!-- end container -->
    </section>
    <!-- end wpo-contact-form-map -->
</div>
<!-- end of page-wrapper -->
<!-- All JavaScript files
================================================== -->
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<!-- Plugins for this template -->
<script src="assets/js/jquery-plugin-collection.js"></script>
<!-- Custom script for this template -->
<script src="assets/js/script.js"></script>
</body>

</html>

