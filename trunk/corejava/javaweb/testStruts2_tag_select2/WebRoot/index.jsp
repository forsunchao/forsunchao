<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<body>
		<s:form action="form" method="post">
			<s:bean name="org.sunchao.action.FormAction" id="id"></s:bean>
			<!-- 2级联动菜单 -->
			<s:doubleselect 
				list="#id.province" 
				name="province" 
				listKey="pid"
				listValue="pName"
				doubleList="#id.school[top]"
				doubleName="school"
				doubleListKey="sid"
				doubleListValue="sName"/>
				
			<!-- 分类选择菜单 -->
			<s:select label="歌手" name="singer" list="{}" headerKey="-1" headerValue="--请选择--" emptyOption="true">
				<s:optgroup label="男歌手" list="#{1:'成龙' , 2:'刘德华' , 3:'张学友' , 4:'王力宏'}"/>
				<s:optgroup label="女歌手" list="#{1:'那英' , 2:'韩红' , 3:'张韶涵' , 4:'王心凌'}"/>
			</s:select>
			
			<!-- 带选择也带输入的框 -->
			<s:combobox label="你从哪里得知本站点的，请选择或者输入" name="how" list="{'电视' , '网站广告' , 'google搜索的' , '不知道'}">
			</s:combobox>
			
			<!-- 可以上下移动的选择框 -->
			<s:updownselect name="upAndDown" list="{'湖人' , '火箭' , '掘金' , '马刺'}"
			moveDownLabel="下移" moveUpLabel="上移" selectAllLabel="全选"
			cssStyle="width:100"/>
			
			<!-- 可以左右移动、添加、删除的选择框 -->
			<s:optiontransferselect list="{'红色' , '蓝色' , '绿色' , '白色'}" name="color1" 
									doubleList="{'黄色' , '紫色' , '黑色' , '透明色'}" doubleName="color2"
									leftTitle="颜色一" rightTitle="颜色2"
									leftDownLabel="下移" leftUpLabel="上移"
									rightDownLabel="下移" rightUpLabel="上移"
									addAllToLeftLabel="全部左移" addAllToRightLabel="全部右移"
									addToLeftLabel="左移" addToRightLabel="右移"
									selectAllLabel="全部选择"/>
			<s:submit value="提交" />
			<s:reset value="重置" />
		</s:form>
		<s:debug></s:debug>
	</body>
</html>