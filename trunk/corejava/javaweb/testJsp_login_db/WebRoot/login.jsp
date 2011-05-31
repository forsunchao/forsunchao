<%@page contentType="text/html;charset=UTF-8"%>
<html>
	<head>
		<title>登录</title>
	</head>
	<body>
		<center>
			<form action="login_conf.jsp" method="post">
				<table>
					<tr>
						<td colspan="2">用户登录(带数据库的)</td>
					</tr>
					<tr>
						<td>用户名：</td>
						<td><input type="text" name="uname"/></td>
					</tr>
					<tr>
						<td>密&nbsp;&nbsp;码：</td>
						<td><input type="password" name="upassword"/></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="登录"/><input type="reset" value="取消"/></td>
					</tr>
				</table>
			</form>
		</center>
	</body>
</html>