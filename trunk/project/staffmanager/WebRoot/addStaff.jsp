<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>管理用户</title>
  </head>
<body>
 <div align="center">
 <form   action="sms/admin/adduser.do" id="adduser" name="form1" method="post" >
  <table align="center" >
  <tr>
     <TD colspan="2" style="font-size:60px; font-weight:800">
 &nbsp;&nbsp; &nbsp;添加用户
      </TD>
	</tr>
  <tr>
  <td>
   用户名<input name="basicinfo.name" type="text"  />
  </td>
  </tr>
  <tr>
  <td>
  密码：<input name="basicinfo.password"  type="password"  )"/>
  </td>
  </tr>
  <tr>
  <td>
  身份证：<input name="basicinfo.personId"  type="text"  )"/>
  </td>
  </tr>
   <tr>
   <td>
  <input type="submit" value="添加"  align="left"/>
  </td>
  <td >
  <input type="reset" value="撤销" align="right"/>
  
  </td>
  </tr>
  </table>
 </form>
 </div>
</body>
</html>
