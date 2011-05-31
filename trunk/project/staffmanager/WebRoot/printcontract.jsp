<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
  <title>打印合同页面</title>
  <script type="text/javascript">
 function  window.onload(){
  document.getElementById("printdiv").innerHTML=window.opener.document.getElementById("printContext").innerHTML;
 window.print(); 
 }
  </script>
  </head>
  <body>
    <div  id="printdiv">

	</div>		
  </body>
</html>
