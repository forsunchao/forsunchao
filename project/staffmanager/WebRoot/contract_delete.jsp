<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!--  
<s:iterator value="results" status="s">
<s:property value="results[#s.index].basicinfo.name" />
<s:property value="results[#s.index].basicinfo.staffNumber" />
<s:property value="results[#s.index].compactId" />
<s:property value="results[#s.index].salary" />
<s:property value="results[#s.index].signDate" />
<s:property value="results[#s.index].outDate" />
<s:property value="results[#s.index].compactState" />							
</td></tr></s:iterator>
-->

<html>
	<head>
	<base href="<%=basePath%>">
		<title>删除合同草案</title>
		<link rel="stylesheet" type="text/css" href="css/style1.css" />
	</head>

	<body>
		<!-- Begin Wrapper -->
		<div id="wrapper">

			<!-- Begin Header -->
			<div id="header"></div>
			<!-- End Header -->
            
			<!-- Begin Navigation -->
			<div id="navigation">

				<ul>
					<li>
						<a href="contract_ministryofpersonnel.jsp">返回首页</a>
					</li>

				</ul>

			</div>
			<!-- End Navigation -->

			<div class="clear"></div>

			<div id="righttop"></div>

			<!-- Begin Right Column -->
			<div id="rightcolumn">

				<h2>
					删除合同草案：--------------------以下为所有未签的合同草案的信息-----------------
				</h2>

				<div id="boxes">
					<hr />
				</div>
				<div>
		<script language="JavaScript">
       function CheckAll(form)  {
          for (var i=0;i<form.elements.length;i++){
                var e = form.elements[i];
               if (e.name != 'checkbox')      
                   e.checked = form.compactinfo.checked; 
               }
            }
      function check(){
	      document.all.compactinfo.checked=false;
            }
         </script>
		<form action="sms/contract/dodelete.do" method="post">
			<table border="1" align="center" bordercolor="green">
				<tr>
					<td>
						<input type=checkbox name="compactinfo" value="<s:property value="results[#s.index].compactId" />"
							onclick="CheckAll(this.form)" >全选
					</td>
					 <td>姓名</td>
					<td>
						工号
					</td>
					<td>
						合同编号
					</td>
					<td>
						底薪
					</td>
					<td>
						签订日期
					</td>
					<td>
						到期日期
					</td>
					<td>
						合同签订情况
					</td>
				</tr>
				<s:iterator value="results" status="s">
					<tr>
						<td>
							<input type=checkbox  name="delcompactId" value="<s:property value="results[#s.index].compactId" />" onclick="check()">
						</td>
						<td><s:property value="results[#s.index].basicinfo.name" /></td>
						<td>
							<s:property value="results[#s.index].basicinfo.staffNumber" />
						</td>
						<td>
							<s:property value="results[#s.index].compactId" />
						</td>
						<td>
							<s:property value="results[#s.index].salary" />
						</td>
						<td>
							<s:property value="results[#s.index].signDate" />
						</td>
						<td>
							<s:property value="results[#s.index].outDate" />
						</td>
						<td>
							<s:property value="results[#s.index].compactState" />
						</td>
					</tr>
				</s:iterator>	
				
			</table>
			<br>
			<table align="center"><tr><input type="Submit" value="删除" ></tr></table>
		</form>
		<P>
				</div>
			</div>
			<!-- End Right Column -->

			<div id="rightbottom">
				<p class="box">
					<a href="#"></a>
				</p>
			</div>


		</div>
		<!-- End Wrapper -->

	</body>
</html>
