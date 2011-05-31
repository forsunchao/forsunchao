<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <body>
    test1
    <!-- 这里如果是客户端跳转就不会取到值 -->
    <s:property value="name"/>
  </body>
</html>
