<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>注册</title>
<meta http-equiv="content-type">
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="css/style.css"/>
</head>
<body>
<div id="header" class="wrap">
	<img src="../images/logo.gif"/>
</div>
<div id="register" class="box">
	<h2>新用户注册</h2>
	<div class="content">
	   <form method="post" action="register.action">
			<dl>
				<dt>用户ID：</dt>
				<dd><input type="text" class="input-text" name="userid" value=""/></dd>
				<dt>用户名：</dt>
				<dd><input type="text" class="input-text" name="username" value=""/></dd>
				<dt>密码：</dt>
				<dd><input type="password" class="input-text" name="password" value=""/></dd>
				<dt>确认密码：</dt>
				<dd><input type="password" class="input-text" name="confirmPassword" value=""/></dd>
				<dt></dt>
				<dd><input type="submit" class="input-button" name="submit" value="" /></dd>
			</dl>
		</form>
		<div class="error"></div>
		<div class="error"></div>
	</div>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>