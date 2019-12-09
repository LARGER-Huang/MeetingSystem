<%@ page import="DAO.OrgDao" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="VO.Org" %>
<%@ page import="VO.User" %>
<%@ page import="DAO.UserDao" %>
<%@ page import="org.omg.PortableInterceptor.USER_EXCEPTION" %><%--
  Created by IntelliJ IDEA.
  User: Huang
  Date: 2019/11/17 017
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="wpoceans">
    <title>Meeting</title>
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
                    <a class="navbar-brand" href="#"><img src="assets/images/logo.png" alt="logo"></a>
                </div>
                <!-- end of nav-collapse -->
            </div>
            <!-- end of container -->
        </nav>
    </header>
    <!-- end of header -->

    <!-- start of wpo-hero -->
    <section class="wpo-hero-area wpo-hero-style-1">
        <div class="container">
            <div class="row">
                <div class="col col-lg-6 col-md-7">
                    <div class="wpo-hero-text">
                        <div class="wpo-hero-title">
                            <h2>已报名用户</h2>
                            <a href="OrgMeeting.jsp"><h3 style="color:white">☛返回会议</h3></a>
                        </div>
                        <div class="wpo-hero-para">
                            <%
                                String meetingId=(String)session.getAttribute("meetingId");
                                UserDao userDao=new UserDao();
                                ArrayList meeting= null;
                                try {
                                    meeting=userDao.searchUserMeeting(meetingId);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            %>
                            <table id="userTable" style="text-align: center;width: 1000px;color: orange;">
                                <tr>
                                    <td><p><b>会议号</b></p></td>
                                    <td><p><b>用户号</b></p></td>
                                    <td><p><b>姓名</b></p></td>
                                    <td><p><b>性别</b></p></td>
                                    <td><p><b>身份证号</b></p></td>
                                    <td><p><b>电话</b></p></td>
                                    <td><p><b>会议日期</b></p></td>
                                    <td><p><b>房间</b></p></td>
                                    <td><p><b>工作单位</b></p></td>

                                </tr>
                                <%
                                    for(int i=0;i<meeting.size();i++){
                                        User user=(User)meeting.get(i);
                                        if(user.getMeetingId()!=null){%>
                                <tr>

                                    <td><p><%=user.getMeetingId()%></p></td>
                                    <td><p><%=user.getUser_ID()%></p></td>
                                    <%
                                        if(user.getName()==null){%>
                                    <td><p><%="无"%></p></td>
                                    <%}
                                    else{
                                    %>
                                    <td><p><%=user.getName()%></p></td>
                                    <%}%>

                                    <%
                                        if(user.getSex()==null){%>
                                    <td><p><%="无"%></p></td>
                                    <%}
                                    else{
                                    %>
                                    <td><p><%=user.getSex()%></p></td>
                                    <%}%>

                                    <%
                                        if(user.getIdCard()==null){%>
                                    <td><p><%="无"%></p></td>
                                    <%}
                                    else{
                                    %>
                                    <td><p><%=user.getIdCard()%></p></td>
                                    <%}%>

                                    <%
                                        if(user.getTel()==null){%>
                                    <td><p><%="无"%></p></td>
                                    <%}
                                    else{
                                    %>
                                    <td><p><%=user.getTel()%></p></td>
                                    <%}%>

                                    <%
                                        if(user.getDate()==null){%>
                                    <td><p><%="无"%></p></td>
                                    <%}
                                    else{
                                    %>
                                    <td><p><%=user.getDate()%></p></td>
                                    <%}%>

                                    <%
                                        if(user.getRoom()==null){%>
                                    <td><p><%="无"%></p></td>
                                    <%}
                                    else{
                                    %>
                                    <td><p><%=user.getRoom()%></p></td>
                                    <%}%>

                                    <%
                                        if(user.getWorkplace()==null){%>
                                    <td><p><%="无"%></p></td>
                                    <%}
                                    else{
                                    %>
                                    <td><p><%=user.getWorkplace()%></p></td>
                                    <%}%>

                                    <td><button><a href="OrgUserUpdate.jsp?user_ID=<%=user.getUser_ID()%>">修改<a></button></td>
                                    <td><button><a href="OrgUserDelete?user_ID=<%=user.getUser_ID()%>">删除</a></button></td>
                                </tr>
                                <%}
                                }

                                %>
                            </table>
                            <button onclick="method5('userTable')">下载</button>
                        </div>

                    </div>
                </div>
            </div>
        </div> <!-- end container -->
        <div class="right-vec">
        </div>
    </section>
    <!-- end of wpo-hero -->
    <!-- end of page-wrapper -->

    <!-- All JavaScript files
    ================================================== -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- Plugins for this template -->
    <script src="assets/js/jquery-plugin-collection.js"></script>
    <!-- Custom script for this template -->
    <script src="assets/js/script.js"></script>
    <script>
        //打印表格
        var idTmr;

        function getExplorer() {
            var explorer = window.navigator.userAgent;
            //ie
            if(explorer.indexOf("MSIE") >= 0) {
                return 'ie';
            }
            //firefox
            else if(explorer.indexOf("Firefox") >= 0) {
                return 'Firefox';
            }
            //Chrome
            else if(explorer.indexOf("Chrome") >= 0) {
                return 'Chrome';
            }
            //Opera
            else if(explorer.indexOf("Opera") >= 0) {
                return 'Opera';
            }
            //Safari
            else if(explorer.indexOf("Safari") >= 0) {
                return 'Safari';
            }
        }

        function method5(tableid) {
            if(getExplorer() === 'ie') {
                var curTbl = document.getElementById(tableid);
                var oXL = new ActiveXObject("Excel.Application");
                var oWB = oXL.Workbooks.Add();
                var xlsheet = oWB.Worksheets(1);
                var sel = document.body.createTextRange();
                sel.moveToElementText(curTbl);
                sel.select();
                sel.execCommand("Copy");
                xlsheet.Paste();
                oXL.Visible = true;

                try {
                    var fname = oXL.Application.GetSaveAsFilename("Excel.xls",
                        "Excel Spreadsheets (*.xls), *.xls");
                } catch(e) {
                    print("Nested catch caught " + e);
                } finally {
                    oWB.SaveAs(fname);
                    oWB.Close(savechanges = false);
                    oXL.Quit();
                    oXL = null;
                    idTmr = window.setInterval("Cleanup();", 1);
                }

            } else {
                tableToExcel(tableid)
            }
        }

        function Cleanup() {
            window.clearInterval(idTmr);
            CollectGarbage();
        }
        var tableToExcel = (function() {
            var uri = 'data:application/vnd.ms-excel;base64,',
                template = '<html><head><meta charset="UTF-8"></head><body><table  border="1">{table}</table></body></html>',
                base64 = function(
                    s) {
                    return window.btoa(unescape(encodeURIComponent(s)))
                },
                format = function(s, c) {
                    return s.replace(/{(\w+)}/g, function(m, p) {
                        return c[p];
                    })
                }
            return function(table, name) {
                if(!table.nodeType)
                    table = document.getElementById(table)
                var ctx = {
                    worksheet: name || 'Worksheet',
                    table: table.innerHTML
                }
                window.location.href = uri + base64(format(template, ctx))
            }
        })()
    </script>
</div>
</body>

</html>

