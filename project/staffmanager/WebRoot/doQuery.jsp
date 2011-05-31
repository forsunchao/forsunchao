<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'doQuery.jsp' starting page</title>
  </head>
  
  <body>
	<form action="sms/admin/QueryUserAction.do" method="post">
	    查询员工信息：<br><br><br>按
	    <select name="searchType">
				<option value="0">员工号</option>
				<option value="1">姓名</option>
				<option value="2">部门</option>
				<option value="3">学历</option>
				<option value="4">婚否</option>
		</select>
		<input type="text" name="conditionValue">
		<input type="submit" value="提交">
	</form>

  </body>
</html>
