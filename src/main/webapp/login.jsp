<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/21
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="commom.jsp" %>
<html>
<head>
    <title>登录</title>
    <link href="lib/bootstrap-3.3.7/css/bootstrap.css">
    <style>
        *{
           text-align: center;
        }
    </style>
    <script src="js/jquery-1.11.0.js"></script>
</head>
<body>
<div class="h2 col-lg-12 s">登录</div>
<div class="form-horizontal">
    <div class="form-group">
        <form action="/user/login.do">
        <div class="col-xs-2">姓名：<input type="text" class="form-control glyphicon glyphicon-icon-user" name="userName"/></div>
        <div class="col-xs-2"><label for="" class="col-xs-2">密码：</label><input type="password" class="form-control" name="passWord"/></div>
        <div class="col-xs-4"><input type="submit" class="form-control" value="login" id="login"/></div>
        <label for="register" class="col-xs-2">没有帐号?</label>
        <div class="col-xs-4"><input type="button" class="form-control" value="register" id="register"/></div>
    </form>
    </div>
</div>
<script>
    $("#register").click(function () {
        window.location.href="register.jsp"
    });

</script>

</body>
</html>
