<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
		欢迎<s:property value="user.username"/> ，登录成功
		<hr>
		注意：属性、方法首先必须为public的<br>
		
		<h2>属性获取：</h2>
		名字(普通对象属性)属性获取：<s:property value="user.username"/><br>
		地址(普通对象属性)属性获取：<s:property value="user.address.addr"/><br>
		静态属性获取：<s:property value="@org.sunchao.vo.Address@country"/><br>
		<hr>
		
		<h2>方法获取：</h2>
		调用值栈中对象的普通方法：<s:property value="user.get()"/><br>
		调用Action中的静态方法：<s:property value="@org.sunchao.action.LoginAction@get2()"/><br>
		调用JDK类中的静态方法：<s:property value="@java.lang.Math@floor(44.56)"/><br>
		调用JDK类中的静态方法（同上java.lang包可以省略不写）：<s:property value="@@floor(44.56)"/><br>
		调用JDK类中的静态方法：<s:property value="@java.lang.Math@max(1,100)"/><br><p>
		<hr>
		
		<h2>构造方法获取：</h2>
		调用普通类的构造方法：<s:property value="new org.sunchao.vo.Student('张三','清华大学',22)"/>&nbsp;&nbsp;&nbsp;[打印的是对象的地址]<br>
		调用普通类的构造方法,得到对象，使用对象再调用属性：<s:property value="new org.sunchao.vo.Student('张三','清华大学',22).name"/><br>
		调用普通类的构造方法,得到对象，使用对象再调用普通方法：<s:property value="new org.sunchao.vo.Student('张三','清华大学',22).getSchool()"/><br>
		<hr>
		
		<h2>集合获取：</h2>
		获取Array:<s:property value="array"/><br>
		Size:<s:property value="array.length"/><br>
		迭代获取：
		<s:iterator value="array">
			<s:property />
		</s:iterator>
		<br>
		获取数组中某个:<s:property value="array[2]"/><br><br>
		
		
		获取List:<s:property value="testList"/><br>
		Size:<s:property value="testList.size"/><br>
		isEmpty:<s:property value="testList.isEmpty"/><br>
		迭代获取：
		<s:iterator value="testList">
			<s:property />
		</s:iterator>
		<br>
		使用获取数组方法来获取List中某个:<s:property value="testList[3]"/><br><br>
		
		获取Set:<s:property value="testSet"/><br>
		Size:<s:property value="testSet.size"/><br>
		isEmpty:<s:property value="testSet.isEmpty"/><br>
		迭代获取：
		<s:iterator value="testSet">
			<s:property />
		</s:iterator>
		<br>
		获取Set中某个(没有顺序，不能使用下标，使用迭代获取):同上
		<s:iterator value="testSet">
			<s:property />
		</s:iterator>
		<br><br>
		
		获取Map:<s:property value="testMap"/><br>
		Size:<s:property value="testMap.size"/><br>
		isEmpty:<s:property value="testMap.isEmpty"/><br>
		迭代获取：
		<s:iterator value="testMap">
			<s:property />
		</s:iterator>
		<br>
		所有keys：<s:property value="testMap.keys"/><br>
		所有values：<s:property value="testMap.values"/><br>
		获取Map中某个(使用键来获取):<s:property value="testMap['key3']"/><br><br>
		<hr>
		
		<h2>利用投影技术取List中对象的某一个属性：</h2>
		获取学生list中的name：<s:property value="stus.{name}"/><br>
		获取学生list中的第一个学生的name：<s:property value="stus.{name}[0]"/><br>
		
		<hr>
		<h2>利用选择技术取List中对象的某一个属性：</h2>
		获取学生list中学生年龄大于21岁的学生：<s:property value="stus.{?#this.age>21}"/><br>
		获取学生list中学生年龄大于21岁的学生姓名：<s:property value="stus.{?#this.age>21}.{name}"/><br>
		获取学生list中学生年龄大于21岁的学生姓名的第一个：<s:property value="stus.{?#this.age>21}.{name}[0]"/><br>
		获取学生list中学生年龄大于21岁的学生姓名的第一个：<s:property value="stus.{^#this.age>21}.{name}"/><br>
		获取学生list中学生年龄大于21岁的学生姓名的最后一个：<s:property value="stus.{$#this.age>21}.{name}"/><br>
		
		<hr>
		<h2>获取内置对象属性：</h2>
		request:<s:property value="#request.req"/><br>
		session:<s:property value="#session.ses"/><br>
		值栈:<s:debug/><br>
	</body>
</html>