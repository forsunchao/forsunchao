<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<html>
  <body>
    <form action="login.action" method="post">
    	姓名：<input type="text" name="username"><br>
    	密码:<input type="password" name="password"><br>
    	权限：<select name="role">
    			<option value="1">管理员</option>
    			<option value="0">普通用户</option>
    		</select>
    		<br>
    		<input type="submit" value="提交"> 
    </form>
  </body>
</html>
