<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
	<body>
		
		<s:head/>
		<s:form action="reg" method="post">
			<s:textfield label="用户名" name="user.username"></s:textfield>
			<s:password label="密码" name="user.password"></s:password>
			<s:password label="确认密码" name="user.repassword"></s:password>
			<s:textfield label="邮箱" name="user.email"></s:textfield>
			<s:textfield label="年龄" name="user.age"></s:textfield>
			<s:submit value="注册"/><s:reset value="取消"/>
		</s:form>
	</body>
</html>
