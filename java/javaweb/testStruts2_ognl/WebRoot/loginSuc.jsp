<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
	欢迎<s:property value="user.username"/> ，登录成功
	<hr>
	
	名字属性获取：<s:property value="user.username"/><br>
	地址属性获取：<s:property value="user.address.addr"/><br>
	调用值栈中对象的普通方法：<s:property value="user.get()"/><br>
	
	<hr>
	调用Action中的静态方法：<s:property value="@org.sunchao.action.LoginAction@get2()"/><br>
	调用JDK类中的静态方法：<s:property value="@java.lang.Math@floor(44.56)"/><br>
	调用JDK类中的静态方法（同上java.lang包可以省略不写）：<s:property value="@@floor(44.56)"/><br>
	调用JDK类中的静态方法：<s:property value="@java.lang.Math@max(1,100)"/><br><p>
	
	静态属性获取：<s:property value="@org.sunchao.vo.Address@country"/><br>
	调用普通类的构造方法：<s:property value="new org.sunchao.vo.Student('张三','清华大学',22).name"/><br>
	
	<hr>
	获取List:<s:property value="testList"/>&nbsp;&nbsp;&nbsp;&nbsp;获取List中某个:<s:property value="testList[3]"/><br>
	
	获取Set:<s:property value="testSet"/>&nbsp;&nbsp;&nbsp;&nbsp;获取Set中某个:<s:property value="testSet[1]"/><br>
	
	获取Map:<s:property value="testMap"/>&nbsp;&nbsp;&nbsp;&nbsp;获取Map中某个:<s:property value="testMap[1]"/><br>
	</body>
</html>