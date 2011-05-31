<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查看合同</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">	
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
						<a href="javascript:history.back(-1)">返回首页</a>
					</li>

				</ul>

			</div>
			<!-- End Navigation -->

			<div class="clear"></div>

			<div id="righttop"></div>

			<!-- Begin Right Column -->
			<div id="rightcolumn">

				<h2>
					查看合同
				</h2>

				<div id="boxes">
					<hr />
				</div>
				<div>
    <table border="1" align="center" bordercolor="green">
					<tr>
						<td>姓名</td>
						<td>工号</td>
						<td>合同编号</td>
						<td>底薪</td>
						<td>签订日期</td>
						<td>到期日期</td>
						<td>合同签订情况</td>
						<td>合同全文</td>
					</tr>
						<s:iterator value="results" status="s">
					<tr>
					    <td><s:property value="results[#s.index].basicinfo.name" /></td>
						<td><s:property value="results[#s.index].basicinfo.staffNumber" /></td>
						<td><s:property value="results[#s.index].compactId" /></td>
						<td><s:property value="results[#s.index].salary" />	</td>
						<td><s:property value="results[#s.index].signDate" /></td>	
						<td><s:property value="results[#s.index].outDate" /></td>	
						<td><s:property value="results[#s.index].compactState" /></td>
						<td><a href="sms/contract/contract_details.do?conditionValue=<s:property value="results[#s.index].compactId" />" >查看</a></td>
					</tr>
					</s:iterator>
	      		</table>
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
