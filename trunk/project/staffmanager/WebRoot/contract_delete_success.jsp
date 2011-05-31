<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>删除成功</title>
	</head>

	<body>
		<h1>
			删除成功！！
		</h1>
		<br>
		<br>
		<a href="/staffmanager/contract_ministryofpersonnel.jsp">返回首页</a>
		<br>
		<br>
	</body>
</html>
