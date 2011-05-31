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

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
	<base href="<%=basePath%>">
		<title>修改合同草案</title>
		<link rel="stylesheet" type="text/css" href="css/style1.css" />
		<style type="text/css">
		.input1{
		border-style:solid;
		border-left-width:0px;
		border-right-width:0px;
		border-top-width:0px;
		border-bottom-width:1px;
		width:100px;
		color:#000000;
		font-size:15px;
		font-weight:bold;
		}
		.input2{
		border-style:solid;
		border-left-width:0px;
		border-right-width:0px;
		border-top-width:0px;
		border-bottom-width:1px;
		width:80px;
		color:#000000;
		font-size:18px;
		font-weight:bold;
		background:#CCCCCC;
}
		
        </style>
	  <script type="text/javascript">
       function queryCompactinfo(URL) {   
        var success = createXMLHTTPRequest();   
        if (!success) {   
            return;   
        }       
        xmlHttpRequest.onreadystatechange = callback;   
        xmlHttpRequest.open("POST", URL, true);    
        xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded"); 
        xmlHttpRequest.send(null); 
    }   
    //回调函数   
    function callback() {    
        if (xmlHttpRequest.readyState == 4) {   
            //判断http的交互是否成功   
            if (xmlHttpRequest.status == 200) {   
                //获取服务器器端返回的数据   
                //获取服务器段输出的纯文本数据   
                var compactinfo = xmlHttpRequest.responseXML;   
                //Ajax请求处理没有发生异常  
             var compactId= compactinfo.getElementsByTagName("compactId")[0].firstChild.nodeValue ;
             var salary= compactinfo.getElementsByTagName("salary")[0].firstChild.nodeValue ;
             var outDate= compactinfo.getElementsByTagName("outDate")[0].firstChild.nodeValue ;
             var signDate= compactinfo.getElementsByTagName("signDate")[0].firstChild.nodeValue ;
             var name= compactinfo.getElementsByTagName("name")[0].firstChild.nodeValue ;
              var  contrtexts=document.getElementsByName("contrtext");
              contrtexts[0].value=compactId;
              contrtexts[1].value=name;          
              contrtexts[2].value=signDate;          
              contrtexts[3].value=outDate;          
              contrtexts[4].value=salary;          
              document.getElementById("compactId").value=compactId;
              document.getElementById("salary").value=salary;
              document.getElementById("outDate").value=outDate;
              document.getElementById("signDate").value=signDate;
              document.getElementById("name").value=name;
            } else {   
                alert("出错了！！！");   
            }   
        }   
    }   
    
    //创建XMLHTTPRequest对象来进行AJAX的异步数据交互   
    function createXMLHTTPRequest() {   
        //1.创建XMLHttpRequest对象   
        //这是XMLHttpReuquest对象无部使用中最复杂的一步   
        //需要针对IE和其他类型的浏览器建立这个对象的不同方式写不同的代码   
        if (window.XMLHttpRequest) {   
            //针对FireFox，Mozillar，Opera，Safari，IE7，IE8   
            xmlHttpRequest = new XMLHttpRequest();   
            //针对某些特定版本的mozillar浏览器的BUG进行修正   
            if (xmlHttpRequest.overrideMimeType) {   
                xmlHttpRequest.overrideMimeType("text/xml");   
            }   
        } else if (window.ActiveXObject) {   
            //针对IE6，IE5.5，IE5   
            //两个可以用于创建XMLHTTPRequest对象的控件名称，保存在一个js的数组中   
            //排在前面的版本较新   
            var activexName = [ "MSXML2.XMLHTTP", "Microsoft.XMLHTTP" ];   
            for ( var i = 0; i < activexName.length; i++) {   
                try {   
                    //取出一个控件名进行创建，如果创建成功就终止循环   
                    //如果创建失败，回抛出异常，然后可以继续循环，继续尝试创建   
                    xmlHttpRequest = new ActiveXObject(activexName[i]);   
                    break;   
                } catch (e) {   
                }   
            }   
        }   
        //确认XMLHTtpRequest对象是否创建成功   
        if (!xmlHttpRequest) {   
            alert("XMLHttpRequest对象创建失败!!");   
            return false;   
        } else {   
            //0 - 本地响应成功   
            //alert(xmlhttp.readyState);   
            return true;   
        }   
    } 
    //ajax动态查询员工合同信息
    function  selectOnchange()
    { var staffNumber=document.getElementById("staffNumber").value;
      var URL="sms/contract/queryCompactinfo.do?searchType=9&&conditionValue="+staffNumber;
      queryCompactinfo(URL);
    }
       //设置合同相关填写项未只读状态
    function window.onload()
    {   var  contrtexts=document.getElementsByName("contrtext");

    }
    

    function   isDate(datestr){ 
var dateRE=/^19[0-9]{2}|2[0-9]{3}(-[0-9]{2}){2}$/;
var date=Number(datestr.substring(8,10));
var month=Number(datestr.substring(5,7));
var year=Number(datestr.substring(0,4));
var s_monthRE=/^4|6|9|11$/;
var b_monthRE=/^1|3|5|7|8|10|12$/;
if(!dateRE.test(datestr)){
alert("修改错误>>>>>>>   \n请输入\"19YY-MM-DD\"或\"2YYY-MM-DD\"式样的日期!!");
return false;
}
else {if(month==0||month>12){
alert("修改错误>>>>>>>   \n月份的数值应在1-12之内！");
return false;}
if(b_monthRE.test(String(month))&&date>31){
alert("修改错误>>>>>>>   \n"+String(month)+"月日期的数值应在1-31之内！");
return false;
}
if(s_monthRE.test(String(month))&&date>30){
alert("修改错误>>>>>>>   \n"+String(month)+"月日期的数值应在1-30之内！");
return false;
}
if(month==2){
  if(isleapyear(year)){
  if(date>29){
  alert("修改错误>>>>>>>   \n"+String(year)+"为闰年，2月日期的数值应在1-29之内！");
  return false;
  }
  }else{
  if(date>28){
  alert("修改错误>>>>>>>   \n"+String(year)+"为平年，2月日期的数值应在1-28之内!");
  return false;
  }
  }
  }
}
return true;

}

function isleapyear(year){
if (0==year%4&&((year%100!=0)||(year%400==0)))
 return true;
 else 
 return false; 
}
function isNum(checktext)
{
if(isNaN(checktext))
alert("修改错误>>>>>>>   \n薪资应为数值型数据！");
}
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
					修改合同草案
				</h2>

				<div id="boxes">
					<hr />
				</div>
				<div>
					<form action="sms/contract/domodify.do" method="post">
						<table>
							<tr>
								<td width="82">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 合同编号: 
								</td>
								<td width="166">
									<input id="compactId" type="text" name="compactinfo.compactId" readonly="readonly">
								<td width="82"> 
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; 底薪: 
								</td>
								<td width="167">
									<input id="salary" type="text" name="compactinfo.salary" onclick="isNum(this.value)">
								</td>
								<td width="30">
									工号:
								</td>
								<td width="250">
									<select  id="staffNumber" name="compactinfo.basicinfo.staffNumber" onchange="selectOnchange()">
										<option>请选择</option>
										<s:iterator value="results" status="s">
											<option
												value="<s:property value="results[#s.index].basicinfo.staffNumber" />">
												<s:property value="results[#s.index].basicinfo.staffNumber" />
											</option>
										</s:iterator>
									</select><font color="red">*已有合同草案的员工号</font>
								</td>
							</tr>
							<tr>
								<td width="82" height="36">合同到期日期: 
								</td>
								<td width="166">
									<input id="outDate" type="text" name="compactinfo.outDate" onclick="isDate(this.value)">
								</td>
								<td width="82">
									合同签订日期:
								</td>
								<td width="167">
									<input  id="signDate" type="text" name="compactinfo.signDate" onclick="isDate(this.value)">
								</td>
								<td width="30">
									姓名:
								</td>
								<td width="250">
									<input   id="name" type="text" name="compactinfo.basicinfo.name" readonly="readonly">
								</td>
							</tr>
							<tr>
								<td width="82" height="33"> 
									合同签订情况: 
								</td>
								<td width="166">
									<input type="radio" checked="checked"
										name="compactinfo.compactState" value="F">
									未签
								</td>
							</tr>
							<tr>
								<td height="40" align="right">
									<input type="Submit" value="提交更新">
								</td>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<td align="right">
									<input type="Reset" value="取消">
								</td>
							</tr>

							<tr>
								<td>
									<b>合同草案:</b>
								</td>	
								<!-- <td>
									<select name="">
										<option value="">
										XXXXX(合同草案的名字)
										<option value="">
										   普通员工合同模板
										<option value="">
											经理合同模板
										<option value="">
											其他合同模板
									</select>
								</td> -->
							</tr>
						</table>
						<hr>
					<div> 
					${requestScope.contract} 
					</div>
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
