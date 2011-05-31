<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'TestJsp.jsp' starting page</title>
    
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
    Test Jsp<br>
  	<a href="test1/test1.action">test1</a><br>
  	<a href="test2/test2.action">test2</a><br>
  	<a href="test3/test3.action">test3</a><br>
  	
  	<a href="add.action">Ôö</a><br>
  	<a href="delete.action">É¾</a><br>
  	<a href="modify.action">¸Ä</a><br>
  	<a href="select.action">²é</a><br>
  	
  </body>
</html>
