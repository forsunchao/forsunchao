<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<html>
	<head>
		<title>首页面</title>
	</head>
	<body>
		首页面
		<form action="query.action" method="post">
			<input type="submit" value="取" />
		</form>

		<s:iterator value="list" status="status">
			<s:property value="name" />
			<s:property value="time" />
			<s:property value="line" />
			<s:property value="description" />
			<s:property value="mainPage" />
			<br>
		</s:iterator>
	</body>
</html>

