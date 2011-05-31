<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>登录</title>
	
  </head>
  
  <body>
  <center>
     <form action="login_conf.jsp" method="post">
     	<table>
     		<tr>
     			<td colspan="2">用户登录</td>
     		</tr>
     		<tr>
     			<td>用户名：</td>
     			<td><input type="text" name="name"/></td>
     		</tr>
     		<tr>
     			<td>密&nbsp;&nbsp;码：</td>
     			<td><input type="password" name="password"/></td>
     		</tr>
     		<tr>
     			<td colspan="2"><input type="submit" value="登录"/><input type="reset" value="取消"/></td>
     		</tr>
     	</table>
     </form>
   </center>
  </body>
</html>
