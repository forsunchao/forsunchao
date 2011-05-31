<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
	欢迎<s:property value="username"/> ，登录成功
	<hr>
	<!-- ognl表达式 -->
	request属性接收：<s:property value="#request.req"/><br><!-- 或者${requestScope.req} -->
	session属性接收：<s:property value="#session.ses"/><br>
	application属性接收：<s:property value="#application.app"/><br>
	</body>
</html>