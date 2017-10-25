<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    用户数据<br>
    <form action="user/save.do" method="post">
    	<input type="text" name="userid"/><br/>
    	<input type="text" name="username"/><br/>
    	<input type="text" name="password"/><br/>
    	<input type="submit" value="提交">
    </form>
    <c:forEach items="${list}" var="user">
    	${user.userid}-----${user.username}-----${user.password}<a href="user/delete.do?userid=${user.userid}">删除</a>
    	&nbsp;&nbsp;<a href="user/queryone.do?userid=${user.userid}">修改</a><br/>
    </c:forEach>
  </body>
</html>
