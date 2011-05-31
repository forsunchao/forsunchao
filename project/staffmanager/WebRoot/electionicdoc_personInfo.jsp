<%@ page isELIgnored="false" language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%><!-- 这个标签使用的是jstl标签 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'searchResult.jsp' starting page</title>
  </head>
  
  <body>
	<center><h3>员工信息</h3></center>
	
		<table border="1">
				<tr>
					<th>员工号</th>
					<th>姓名</th>
					<th>所属部门</th>
					<th>英文名</th>
					<th>身份证号</th>
					<th>生日</th>
					<th>籍贯</th>
					<th>教育程度</th>
					<th>婚否</th>
					<th>部门编号</th>
					<th>权限</th>
					<th>更新信息</th>
				</tr>
				<s:iterator value="results" status="s">
				<tr>
					<td><s:property value="results[#s.index].staffNumber" /></td>
					<td><s:property value="results[#s.index].name" /></td>
					<td><s:property value="results[#s.index].department" /></td>
					<td><s:property value="results[#s.index].enname" /></td>
					<td><s:property value="results[#s.index].personId" /></td>
					<td><s:property value="results[#s.index].birthday" /></td>
					<td><s:property value="results[#s.index].nation" /></td>
					<td><s:property value="results[#s.index].education" /></td>
					<td><s:property value="results[#s.index].ismarried" /></td>
					<td><s:property value="results[#s.index].departmentinfo" /></td>
					<td><s:property value="results[#s.index].role" /></td>
					<td><a href="update.do?staffNumber=<s:property value="results[#s.index].staffNumber"/>">修改</a></td>
				</tr>
				</s:iterator>
				
			</table> 
		<jsp:include page="electionicdoc_foot.jsp"></jsp:include>
  </body>
</html>
