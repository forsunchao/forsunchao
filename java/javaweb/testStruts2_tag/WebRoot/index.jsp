<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<body>
		<s:form action="login" method="post">
			<s:textfield label="姓名" name="username" required="true" requiredposition="left"/>
			<s:password label="密码" name="password" required="true" requiredposition="left"/>
			<s:radio list="#{1:'男',0:'女'}" label="性别" name="sex" value="1"/>
			<s:checkbox label="婚否" name="marry" value="true"/>
			<s:checkboxlist list="#{1:'足球', 2:'篮球', 3:'排球', 4:'睡觉'}" label="爱好" name="love"/>
			
			<!-- 这个非常重要,从后台action取数据,使用bean标签-->
			<s:bean name="org.sunchao.action.FormAction" id="id"></s:bean>
			<s:select list="#id.province" name="formAction.province" label="籍贯" headerKey="-1" headerValue="----请选择省份----" emptyOption="true"/>
			<s:submit value="提交"/>
			<s:reset value="重置"/>
		</s:form>
	</body>
</html>