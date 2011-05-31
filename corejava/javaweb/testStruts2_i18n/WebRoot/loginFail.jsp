<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<body>
	<s:text name="login_fail"/><br>
	<a href="index.jsp"><s:text name="%{getText('login_again')}"/></a>
	</body>
</html>