<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>Struts2 File Upload</title>
		<script type="text/javascript">
			function addMore() {
				var td = document.getElementById("more");
				var br = document.createElement("br");
				var input = document.createElement("input");
				var button = document.createElement("input");
				input.type = "file";
				input.name = "file";
				button.type = "button";
				button.value = "-";
				button.onclick = function(){
					td.removeChild(br);
					td.removeChild(input);
					td.removeChild(button);
				}
				td.appendChild(br);
				td.appendChild(input);
				td.appendChild(button);
			}
		</script> 
	</head>

	<body>
		<s:head/>
		<!--  
		<s:form action="upload" method="post" enctype="multipart/form-data">
			<s:file label="请选择上传的图片" name="file"/>
			<s:submit value="上传"/>
		</s:form>
		-->
		
		<h1>*************多文件上传***************</h1>
		<s:form action="uploadList" method="post" enctype="multipart/form-data"> 
			<table align="center" width="60%" border="1">
				<tr>
				    <td>文件名称: <input type="text" name="title"/></td>
			    </tr>
			    <tr>
			   		<td>选择上传的文件:</td>
			   		<td id="more"><input type="file" name="file"><input type="button" value="+" onclick="addMore()"/></td>
			    </tr>
			    <tr>
			   		<td><s:submit value="上传" align="center"></s:submit></td>
			    </tr>   
		    </table> 
		</s:form> 
	</body>
</html>
