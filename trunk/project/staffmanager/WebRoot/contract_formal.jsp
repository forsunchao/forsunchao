<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
 <base href="<%=basePath%>">
<title>确定为正式合同</title>
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
                确定为正式合同：--------------------以下为待确定为正式合同的合同草案的信息-----------------
                </h2>

                <div id="boxes">
                  <hr/>
           </div>	 	 
		   <div>

<form id="form02" name="form02"  method="post" action="sms/contract/cteateFormContract.do" >
 <script language="JavaScript">
function CheckAll(form)  
{
     for (var i=0;i<form.elements.length;i++)
     {
         var e = form.elements[i];
         if (e.name != 'checkbox')      
         e.checked = form.123.checked; 
     }
}
function check()
{
	 document.all.123.checked=false;
}

</script>
<table id="creFormConTb"  width="877" height="200" border="1"  bordercolor="#6633CC">

  <tr>

    <td width="83" scope="col">合同编号</td>
    <td width="124" scope="col">姓名</td>
    <td width="114" scope="col">员工号</td>
    <td width="104" scope="col">底薪</td>
    <td width="135" scope="col">合同签订日期</td>
    <td width="112" scope="col">合同到期日期</td>
    <td width="83" scope="col">&nbsp;</td>
	
  </tr>
  

 <s:iterator value="results" status="s"> 
 <tr>
  
    <td><s:property value="results[#s.index].compactId"/>&nbsp;</td>
    <td><s:property value="results[#s.index].basicinfo.name"/>&nbsp;</td>
    <td><s:property value="results[#s.index].basicinfo.staffNumber"/>&nbsp;</td>
    <td><s:property value="results[#s.index].salary"/>&nbsp;</td>
    <td><s:date name="results[#s.index].signDate" format="yyyy-MM-dd"/>&nbsp;</td>
    <td><s:date name="results[#s.index].outDate" format="yyyy-MM-dd"/>&nbsp;</td>
    <td><a href="sms/contract/conDeShow.do?compactId=<s:property value="results[#s.index].compactId"/>">确定为正式合同</a></td>
    
</tr>
  </s:iterator>

</table>

</form>		 
		   
	   
		   
		   </div> 
		 </div>
		 <!-- End Right Column -->

                 <div id="rightbottom">   <p class="box"><a href="#"></a></p></div>


   </div>
   <!-- End Wrapper -->
   
</body>
</html>

