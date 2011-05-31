<%@ page language="java" pageEncoding="utf-8" isELIgnored="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<base href="<%=basePath%>">
<title>员工电子合同</title>
<script type="text/javascript">
function nextPage(){
 var curPage=document.getElementById('pageCurPage').value*1+1;
 document.location='QueryAllAction.do?page.curPage='+curPage;
}
function prePage(){
var curPage=document.getElementById('pageCurPage').value*1-1;
 document.location='QueryAllAction.do?page.curPage='+curPage;
}
function goPage(){
var curPage=document.getElementById('goPage').value*1;
 document.location='QueryAllAction.do?page.curPage='+curPage;
}
</script>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>

<body >
<center>
   <!-- Begin Wrapper -->
   <div id="wrapper">
   
         <!-- Begin Header -->
         <div id="header">
		 
                <div class="logo"> 
                  <h1 id="lineone">15<span>UP</span></h1> 
		          <h2 id="linetwo">最高的目标，最大的挑战，最好的团队！！</h2>
               </div>		 
			   
		 </div>
		 <!-- End Header -->
		
                  
                  <div class="clear"></div>
		 
		 <!-- Begin Left Column -->
		 <div id="leftcolumn">
		 
			<div id="leftnav">
                                            			
		       <div class="col">
	             <ul>
			     <li><a href="admin_adduser.jsp" title="">添加用户</a></li>
			     
			     <li><a>查询用户</a></li>
			     <form action="QueryUserAction.do" method="post">
	               <font color=black> 按 </font>
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
			     <li><a href="QueryAllAction.do?page.curPage=1" title="">管理用户</a></li>
			     			      <li><a href="admin_index.jsp" title="">返回首页</a></li>
			      <li><a href="login.jsp" title="">注销</a></li>
                 </ul>
               </div>
           </div>
           <div id="leftnavbottom"></div>

                 <div class="clear"></div>
		 
		 </div>
		 <!-- End Left Column -->
 
                 <div id="righttop"></div>
		 
		 <!-- Begin Right Column -->
		 <div id="rightcolumn">
		        
         
                <h2>全不员工信息</h2>
                		        			<img src="images/2.png" class="floatTL" alt="image" width="95" />
         					<div id="boxes">
						<hr class="floatTL" />
					</div>
              
                <div id="boxes">
<table bgcolor="F0F8FF">
	 	<tr>
 	<td>姓名</td>
 	<td>密码</td>
 	<td>是否修改</td>
    <td>是否删除</td>
 	</tr>
 	
	<c:forEach items="${basicinfo}" var="basic" varStatus="stu">
	<tr>
		<td><input name="basicinfo.name" type="text" value='<c:out value="${basic.name}" />'/></td>
		<td><input name="basicinfo.password" type="text" value='<c:out value="${basic.password}" />'/></td>
        <td><a href="ModifyUserAction.do?staffNumber=<c:out value='${basic.staffNumber}'/>">修改</a>  </td>
        <td><a href="DeleteUserAction.do?staffNumber=<c:out value='${basic.staffNumber}'/>">删除</a></td>
        <td><input name="basicinfo.staffNumber" type="hidden" value='<c:out value="${basic.staffNumber}"/>'/></td>
      
	 </tr>
    </c:forEach>
    <debug></debug>
		</table> 
           </div>	 
				 <div>
				 <table>
				 <tr>
		       	 <td><label onclick="prePage()">上一页</label></td>
				 <td align="center"> <a href="QueryAllAction.do?page.curPage=1">首页</a></td>
				 <td><label onclick="nextPage()">下一页</label></td>
			
				 </tr>
				 <tr>
				 <td>
				 当前页
				 </td>
				 <td colspan="2">
				 <input type="text" disabled="disabled" name="page.curPage"  id="pageCurPage" value="<s:property value="page.curPage"/>">
				 </td>
				 </tr>
				 <tr>
				 <td>
				 跳转到
				 </td>
				 <td>
				 <input type="text" name="goPage"  id="goPage" onblur="goPage()"/>
				 </td>
				 </tr>
				 </table>
		   </div> 
				  <div>
	</div> 
		 </div>
		 <!-- End Right Column -->

                 <div id="rightbottom">   <p class="box"><a href="#"></a></p></div>
		 
		 <!-- Begin Footer -->
 <div id="footer">
 <p></p>
	<p id="legal">15UP &copy; 2010 by 15UP.com   Designed by <a href="#">15UP.html</a></p>
</div>		
			    

		 <!-- End Footer -->
		 
   </div>
   <!-- End Wrapper -->
 </center>  
</body>
</html>
