<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/21
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="commom.jsp" %>
<html>
<head>
    <title>注册</title>
    <link href="lib/bootstrap-3.3.7/css/bootstrap.css">
    <style>
        *{
            text-align: center;
        }
    </style>
</head>
<body>
<div class="h1">注册</div>
<div class="form-horizontal">
    <form action="/user/register.do">
    <div class="form-group">
        <label for="" class="col-xs-2">姓名：</label>
        <div class="col-xs-4"><input type="text" class="form-control" name="userName" /></div>
        <label for="" class="col-xs-2">密码：</label>
        <div class="col-xs-4"><input type="text" class="form-control" name="passWord" /></div>
        <label for="" class="col-xs-2">性别：</label>
        <div class="col-xs-4"><select type="" class="form-control" name="sex" >
            <option value="0">男</option>
            <option value="1">女</option>
        </select></div>
        <div class="col-xs-4"><input type="submit" class="form-control" value="register"/></div>
    </div>
    </form>
</div>

</body>
</html>
