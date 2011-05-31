<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="org.sunchao.factory.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>登录</title>
	
  </head>
  
  <body>

	<!-- 使用Javabean -->
	<jsp:useBean id="person" scope="request" class="org.sunchao.vo.Person"/>
	<!-- 通过JavaBean的自省机制自动为属性赋值 -->
	<jsp:setProperty name="person" property="*"/>
	
<%
	System.out.println(person.getName());
	//通过DAO工厂类取得一个PersonDao实例，进行验证
	if(DAOFactory.getPersonDAOInstance().isLogin(person)) {
%>
	<jsp:forward page="login_success.jsp"></jsp:forward>
<%
	} else {
%>
	<jsp:forward page="login_fail.jsp"></jsp:forward>
<%		
	}
%>
  </body>
</html>
