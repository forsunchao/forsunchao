<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查看合同全文</title>
    <link rel="stylesheet" type="text/css" href="css/style1.css" />


  </head>
  
  <body>
    <!-- Begin Wrapper -->
		<div id="wrapper">

			<!-- Begin Header -->
			<div id="header">



			</div>
			<!-- End Header -->

			<!-- Begin Navigation -->
			<div id="navigation">

				<ul>
					<li>
						<a href="javascript:history.back(-1)">返回</a>
					</li>

				</ul>

			</div>
			<!-- End Navigation -->

			<div class="clear"></div>

			<div id="righttop"></div>

			<!-- Begin Right Column -->
			<div id="rightcolumn">

				<h2>
					合同全文
				</h2>

				<div id="boxes">
					<hr />
				</div>
				<div>
				 <!--   <form action="sms/contract/dodetails.do" method="post">-->
				<tr>
				<td>
				<textarea wrap=soft name=contractText rows=60 cols=105 readonly="readonly">${requestScope.contract}</textarea>
				</td>
				</tr>
				<!-- </form>  -->
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
