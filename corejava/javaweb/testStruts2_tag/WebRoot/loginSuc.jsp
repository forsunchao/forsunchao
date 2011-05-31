<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
	欢迎<s:property value="username"/> ，登录成功<br>
		密码是：<s:property value="password"/><br>
		性别是：<s:property value="sex"/>（1代表男性，0代表女性）<br>
		婚姻状况：<s:property value="marry"/><br>
		业余爱好：<s:property value="love"/>（1代表足球，2代表篮球，3代表排球，4代表睡觉）<br>
		籍贯：<s:property value="formAction.province"/>
		<s:debug></s:debug>
	</body>
</html>