
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
	<base href="<%=basePath%>">
		<title>确定为正式合同〈详细〉</title>
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
						<a href="sms/contract/contract_formal.do">返回</a>
					</li>

				</ul>

			</div>
			<!-- End Navigation -->

			<div class="clear"></div>

			<div id="righttop"></div>

			<!-- Begin Right Column -->
			<div id="rightcolumn">

				<h2>确定为正式合同</h2>
		<div id="boxes">
					<hr />
				</div>
				<div>

		<form  method="post" action="sms/contract/cteateFormContract2.do">
		<table>
			<tr>
				<td width="80">合同编号:</td>
				<td width="200"><s:property  value="result.compactId"/>&nbsp;
				<input  type="hidden" name="compactId"  value="<s:property  value='result.compactId'/>"/>
				</td>
				<td width="45">底薪:</td>
				<td width="205"><s:property value="result.salary"/>&nbsp;</td>
				<td width="45">工号:</td>
				<td width="105"><s:property value="result.basicinfo.staffNumber"/>&nbsp;</td>
			</tr>
			<tr>
				<td width="300">合同到期日期:</td>
				<td width="205"><s:property value="result.outDate" />&nbsp;</td>
				<td width="350">合同签订日期:</td>
				<td width="205"><s:property value="result.signDate" />&nbsp; </td>
				<td width="80">姓名:</td>
				<td width="100"><s:property value="result.basicinfo.name"/>&nbsp;</td>
			</tr>
			<tr>
				<td width="105">合同签订情况:</td>
				<td  colspan="5" align="left" ><s:property value="result.compactState" />&nbsp;</td>
			</tr>
				
			<tr>
		      <td  colspan="6" align="left" ><input type="Submit" name="" value="提交确定为正式合同"></td>
			</tr>
		 
			<tr>
				<td><b>合同文本</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td colspan="5" align="left"><input type="button" name="" value="打印" onClick="doPrint()"></td>
			</tr>
			<tr>	
			<td colspan="6" align="left">
			<OBJECT id="WebBrowser" height="0" width="0" 
      classid="CLSID:8856F961-340A-11D0-A96B-00C04FD705A2"
      VIEWASTEXT>
      </OBJECT>	
      <script language="javascript">
      function doPrint() { 
       window.open("/staffmanager/printcontract.jsp","printpage","height=700,width=900,left=150,top=50,toolbar=yes,scrollbars=yes");
      }
      </script>
      <!--startprint-->	
            <div  id="printContext" >
			<textarea  name="contractText" rows="60" cols="105" readonly="readonly" >${requestScope.contract} </textarea>
			</div>
				<P>
            
            </P>
	  <!--endprint-->
	
      
      <script language="JavaScript">
      var hkey_root,hkey_path,hkey_key
      hkey_root="HKEY_CURRENT_USER"
      hkey_path="\\Software\\Microsoft\\Internet Explorer\\PageSetup\\"
	  </script>
            </td>
            </tr>
	</table>
	</form>
				
				</div>
			</div>
			<!-- End Right Column -->

			<div id="rightbottom">
				
			</div>


		</div>
		<!-- End Wrapper -->
	</body>
</html>

 
