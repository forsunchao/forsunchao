<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<body>
		<form action="login.action" method="post">
			  姓名：<input type="text" name="username"><br>
			  密码：<input type="password" name="password"><br>
			  <s:token></s:token><!-- 防止表单重复提交,如果发现重复提交，则为用户返回一个错误页面 -->
			  <input type="submit" value="提交">
		</form>
	</body>
</html>