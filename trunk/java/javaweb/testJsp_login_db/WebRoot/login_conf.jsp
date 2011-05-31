<%@page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.sql.*" %>
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
		%>
		<%	
			final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
			final String DBURL = "jdbc:oracle:thin:@localhost:1521:orcl";
			final String DBUSER = "scott";
			final String DBPASSWORD = "tiger";
			Connection conn = null;
			//Statement stmt = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			boolean flag = false;
			try{
				Class.forName(DBDRIVER);
				conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
				//stmt = conn.createStatement();
				sql = "select name from person2 where name=? and password=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,name);
				pstmt.setString(2,password);
				//System.out.print(sql);
				//使用statement有注入漏洞
				//select name from person2 where name='sunchao' and password='ss' or 'xx'='xx';				
				//rs = stmt.executeQuery(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					flag = true;
				}
			} catch(Exception e){
				e.printStackTrace();
			} finally{
				rs.close();
				pstmt.close();
				conn.close();
			}
			
		%>
		<% 
			if(flag) {
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