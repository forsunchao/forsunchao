<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
	<head>
		<title>成功页面</title>
	</head>
	<body>
		欢迎您!<br>
		<form action="add.action" method="post">
    	名称：<input type="text" name="gameItem.name"/><br>
    	时间：<input type="text" name="gameItem.time"/><br>
    	线路：<input type="text" name="gameItem.line"/><br>
    	版本详细介绍：<input type="text" name="gameItem.description"/><br>
    	主页地址：<input type="text" name="gameItem.mainPage"/><br>
    	<input type="submit" value="添加" />
    </form>
	</body>
</html>

