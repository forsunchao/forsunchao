<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>Struts2 File Upload</title>
	</head>

	<body>
		<h1>恭喜你，图片上传成功！</h1><br>
		<!-- 
		<img src="upload/<s:property value="rename"/>">
		-->
		<s:iterator value="rename" status="s">
		<img src="upload/<s:property value="rename[#s.index]"/>">
		</s:iterator>
		
		<s:debug></s:debug>
	</body>
</html>
