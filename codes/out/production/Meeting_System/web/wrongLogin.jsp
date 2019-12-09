<%--
  Created by IntelliJ IDEA.
  User: Huang
  Date: 2019/11/23 023
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <meta name="author" content="" />
    <!-- Facebook and Twitter integration -->
    <meta property="og:title" content=""/>
    <meta property="og:image" content=""/>
    <meta property="og:url" content=""/>
    <meta property="og:site_name" content=""/>
    <meta property="og:description" content=""/>
    <meta name="twitter:title" content="" />
    <meta name="twitter:image" content="" />
    <meta name="twitter:url" content="" />
    <meta name="twitter:card" content="" />

    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet">

    <!-- Animate.css -->
    <link rel="stylesheet" href="assets_login/css/animate.css">
    <!-- Icomoon Icon Fonts-->
    <link rel="stylesheet" href="assets_login/css/icomoon.css">
    <!-- Themify Icons-->
    <link rel="stylesheet" href="assets_login/css/themify-icons.css">
    <!-- Bootstrap  -->
    <link rel="stylesheet" href="assets_login/css/bootstrap.css">

    <!-- Magnific Popup -->
    <link rel="stylesheet" href="assets_login/css/magnific-popup.css">

    <!-- Owl Carousel  -->
    <link rel="stylesheet" href="assets_login/css/owl.carousel.min.css">
    <link rel="stylesheet" href="assets_login/css/owl.theme.default.min.css">

    <!-- Theme style  -->
    <link rel="stylesheet" href="assets_login/css/style.css">

    <!-- Modernizr JS -->
    <script src="assets_login/js/modernizr-2.6.2.min.js"></script>
    <!-- FOR IE9 below -->
    <!--[if lt IE 9]>
    <script src="assets_login/js/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<div id="page">
    <div class="page-inner">
        <nav class="gtco-nav" role="navigation">
            <div class="gtco-container">

                <div class="row">
                    <div class="col-sm-4 col-xs-12">
                        <div id="gtco-logo"><a href="index.jsp">首页 <em>.</em></a></div>
                    </div>
                    <div class="col-xs-8 text-right menu-1">
                        <ul>
                            <li class="btn-cta"><a href="register.jsp"><span>注册</span></a></li>
                        </ul>
                    </div>
                </div>

            </div>
        </nav>

        <header id="gtco-header" class="gtco-cover" role="banner" style="background-image: url(assets_login/images/img_4.jpg)">
            <div class="overlay"></div>
            <div class="gtco-container">
                <div class="row">
                    <div class="col-md-12 col-md-offset-0 text-left">
                        <div class="row row-mt-15em">
                            <div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
                                <span class="intro-text-small">Welcome to Meetings</span>
                                <h1>开启你的主场</h1>
                            </div>
                            <div class="col-md-4 col-md-push-1 animate-box" data-animate-effect="fadeInRight">
                                <div class="form-wrap">
                                    <div class="tab">
                                        <ul class="tab-menu">
                                            <li class="active gtco-first"><a href="#" data-tab="signup">会议参加者</a></li>
                                            <li class="gtco-second"><a href="#" data-tab="login">会议组织者</a></li>
                                        </ul>
                                        <div class="tab-content">
                                            <div class="tab-content-inner active" data-content="signup">
                                                <form action="UserLogin" method="post">
                                                    <div class="row form-group">
                                                        <div class="col-md-12">
                                                            <label>ID</label>
                                                            <input type="text" class="form-control" name="user_ID"  placeholder="请重新输入……" required>
                                                        </div>
                                                    </div>
                                                    <div class="row form-group">
                                                        <div class="col-md-12">
                                                            <label>Password</label>
                                                            <input type="password" class="form-control" name="user_password" required>
                                                        </div>
                                                    </div>

                                                    <div class="row form-group">
                                                        <div class="col-md-12">
                                                            <input type="submit" class="btn btn-primary" value="登录">
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>

                                            <div class="tab-content-inner" data-content="login">
                                                <form action="OrgLogin" method="post">
                                                    <div class="row form-group">
                                                        <div class="col-md-12">
                                                            <label>ID</label>
                                                            <input type="text" class="form-control" name="org_ID"  placeholder="请重新输入……" required>
                                                        </div>
                                                    </div>
                                                    <div class="row form-group">
                                                        <div class="col-md-12">
                                                            <label>Password</label>
                                                            <input type="password" class="form-control" name="org_password" required>
                                                        </div>
                                                    </div>

                                                    <div class="row form-group">
                                                        <div class="col-md-12">
                                                            <input type="submit" class="btn btn-primary" value="登录">
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
        </header>

        <!-- jQuery -->
        <script src="assets_login/js/jquery.min.js"></script>
        <!-- jQuery Easing -->
        <script src="assets_login/js/jquery.easing.1.3.js"></script>
        <!-- Bootstrap -->
        <script src="assets_login/js/bootstrap.min.js"></script>
        <!-- Waypoints -->
        <script src="assets_login/js/jquery.waypoints.min.js"></script>
        <!-- Carousel -->
        <script src="assets_login/js/owl.carousel.min.js"></script>
        <!-- countTo -->
        <script src="assets_login/js/jquery.countTo.js"></script>
        <!-- Magnific Popup -->
        <script src="assets_login/js/jquery.magnific-popup.min.js"></script>
        <script src="assets_login/js/magnific-popup-options.js"></script>
        <!-- Main -->
        <script src="assets_login/js/main.js"></script>

</body>
</html>
