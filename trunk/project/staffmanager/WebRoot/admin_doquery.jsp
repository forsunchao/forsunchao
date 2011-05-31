<%@ page language="java" pageEncoding="utf-8" isELIgnored="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
 <base href="<%=basePath%>">
<title>管理员</title>
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
		        			<h2>查询结果</h2>
		        			<img src="images/2.png" class="floatTL" alt="image" width="95" />
         					<div id="boxes">
						<hr class="floatTL" />
					</div>
                <h2></h2>
              
                <div id="boxes">
	<table  border="1" bordercolor="#7FFFD4"  bgcolor="#F0F8FF" width="450" height="165" align="center"  >
			<caption><h1>员工基本信息表</h1></caption>
			<tr >
				<th ><font color="#000000" size="5">姓名</font></th>
				<th ><font color="#000000" size="5">学历</font></th>
				<th ><font color="#000000" size="5">部门</font></th>
				<th ><font color="#000000" size="5">婚否</font></th>
			</tr>
			 <c:forEach items="${basicinfo}" var="basic" varStatus="stu">
			 <tr>
			    <td align="center"><c:out value="${basic.name}" /></td>
				<td align="center"><c:out value="${basic.education}" /></td>
				<td align="center"><c:out value="${basic.department}" /></td>
				<td align="center"><c:out value="${basic.ismarried}" /></td>
			 </tr>
			 </c:forEach>
		</table> 
           </div>	 
				 
				 <div>
				 
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
