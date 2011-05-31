<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
	 <base href="<%=basePath%>">
		<title>管理合同模板</title>
		<link rel="stylesheet" type="text/css" href="css/style1.css" />
		<script type="text/javascript">
    </script>
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
					现有最新合同模板：--------------------如需修改请直接在下面文本域内修改-----------------
				</h2>

				<div id="boxes">
					<hr />
				</div>
				<div>
		<form action="sms/contract/contract_writeCon.do" method="post">
			<table>
				<tr>
					<td>
						<textarea id="contractId" name="contractText" rows="30" cols="100">
						${requestScope.contract}
                        </textarea>
					</td>
				</tr>
				<tr>
					<td>
			           <input  type="submit" value="生成新的合同模板"/>
					</td>
				</tr>
			</table>
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
