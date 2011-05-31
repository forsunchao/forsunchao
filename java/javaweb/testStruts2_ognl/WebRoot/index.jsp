<%@ page language="java" pageEncoding="UTF-8"%>
<html>
	<body>
	ognl表达式<br><br><br><br><br>
		<form action="login.action" method="post">
			  姓名：<input type="text" name="user.username"><br>
			  密码：<input type="password" name="user.password"><br>
			  地址：<input type="text" name="user.address.addr">
			  <input type="submit" value="提交">
		</form>
	</body>
</html>