<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<body>
	<center><h1><s:text name="login_page"/></h1><br>
		<a href="ChangeLang.action?lang=1"><s:text name="CHINESE"/></a>
		<a href="ChangeLang.action?lang=2"><s:text name="ENGLISH"/></a>
		<s:form action="login.action" method="post">
			  <s:textfield key="login_username" name="user.username"/><br>
			  <s:password key="login_password" name="user.password"/><br>
			  	<s:submit key="login_submit"/>
		</s:form>
	</center>
	</body>
</html>