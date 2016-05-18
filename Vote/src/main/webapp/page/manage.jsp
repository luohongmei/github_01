<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
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
	<img src="images/logo.gif" />
</div> 
<div id="navbar" class="wrap">
	<div class="profile">
   <c:choose>
		<c:when test="${sessionScope.user.username eq null}">
		      <a href="page/index.jsp">登录</a>
		</c:when>
    </c:choose>
		您好,${sessionScope.user.username}
		<span class="return"><a href="Subject!list.action">返回列表</a></span>
		<span class="addnew"><a href="page/add.jsp">添加新投票</a></span>
		<span class="modify"><a href="Subject!modify.action">维护</a></span>
		
	</div>
	<div class="search">
		<form method="post" action="Subject!search.action">
			<input type="text" name="keywords" class="input-text" value=""/><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>

<div id="vote" class="wrap">
	<h2>投票列表</h2>
	<ul class="list">
	  <c:forEach items="${sessionScope.subjectBean}" var="p" >
		<li <c:if test="${p.sub_id%2==0}">  class="odd"</c:if>>
			<h4>				
				<a href="look.action?sub_id=${p.sub_id}">${p.title}</a>
			</h4>
			<div class="join"><a href="join.action?sub_id=${p.sub_id}">我要参与</a></div>
			<p class="info">共有 ${p.optionCount}个选项，已有${p.voteUser}个网友参与了投票。</p>
		</li>
	</c:forEach>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>