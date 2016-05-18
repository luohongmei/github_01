<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<base href="/Vote/">
<title>在线投票</title>
<meta http-equiv="content-type">
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="css/style.css"/>
</head>
<body>
<div id="header" class="wrap">
	<img src="images/logo.gif"/>
</div>
<div id="navbar" class="wrap">
	<div class="profile">
		您好,${sessionScope.user.username}
		<span class="return"><a href="Subject!list.action">返回列表</a></span>
		<span class="addnew"><a href="Subject!read.action">添加新投票</a></span>
		<span class="modify"><a href="Subject!modify.action">维护</a></span>
	</div>
	<div class="search">
		<form method="post" action="Subject!search.action">
			<input type="text" name="keywords" class="input-text" value=""/><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>
<div id="vote" class="wrap">
	<h2>参与投票</h2>
	<ul class="list">
		<li>
			<h4>在线投票</h4>
			<p class="info">共有 ${sessionScope.voteBean.optionCount} 个选项，已有 ${sessionScope.voteBean.voteUserCount}个网友参与了投票。</p>
			<form method="post" action="save.action">
			    <input type="hidden" name="sub_id" value="${sessionScope.voteBean.sub_id}"/> 
			    <input type="hidden" name="userid" value="${sessionScope.user.userid}"/>
				<ol>
				<c:set var="type" value="${sessionScope.voteBean.type eq 1 ? 'radio':'checkbox'}"/>
				  <c:forEach items="${sessionScope.voteBean.options}" var="option">
					<li><input type="${type}" name="op_id"  value="${option.op_id}"/>${option.option1}</li>
				 </c:forEach>  
				</ol>
				<p class="voteView"><input type="image" src="images/button_vote.gif"/><a href="Vote!view.action?entityId=103"><img src="images/button_view.gif" /></a></p>
			</form>
		</li>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>