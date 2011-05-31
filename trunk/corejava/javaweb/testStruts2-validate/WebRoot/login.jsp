<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
	<body>
		
		<s:head/>
		<s:form action="login" method="post">
			<s:textfield label="用户名" name="user.username"></s:textfield>
			<s:password label="密码" name="user.password"></s:password>
			<s:submit value="登录"/><s:reset value="取消"/>
		</s:form>
	</body>
</html>
