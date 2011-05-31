<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <body>
    <s:text name="%{getText('login_welcome')}"/>
    <s:property value="user.username"/> 
    <s:label key="login_success"/><!-- 不建议使用，使用第一个 -->
  </body>
</html>
