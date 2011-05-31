<%@page contentType="text/html;charset=UTF-8"%>
<html>
	<head>
		<title>登录</title>
	</head>
	<body>
		<%
			//接收参数
			String name = request.getParameter("uname");
			String password = request.getParameter("upassword");
			//判断参数
			if("sunchao".equals(name) && "123456".equals(password)) {//这样写不会出现空指针异常
		%>
			<!-- 这是服务器端跳转 -->
			<jsp:forward page="login_success.jsp">
				<jsp:param name="name" value="<%=name %>"/>
			</jsp:forward>
		<%		
			} else {
		%>
			<jsp:forward page="login_fail.jsp"></jsp:forward>
		<%
			}
		%>
	</body>
</html>