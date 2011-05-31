
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
		<title>创建合同草案</title>
		<link rel="stylesheet" type="text/css" href="css/style1.css" />
		<style type="text/css">
.input1 {
	border-style: solid;
	border-left-width: 0px;
	border-right-width: 0px;
	border-top-width: 0px;
	border-bottom-width: 1px;
	width: 100px;
	color: #000000;
	font-size: 15px;
	font-weight: bold;
}

.input2 {
	border-style: solid;
	border-left-width: 0px;
	border-right-width: 0px;
	border-top-width: 0px;
	border-bottom-width: 1px;
	width: 80px;
	color: #000000;
	font-size: 18px;
	font-weight: bold;
	background: #CCCCCC;
}
</style>
		<script type="text/javascript">
       function newCompactinfo(URL) {   
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
                var basicinfo = xmlHttpRequest.responseXML;   
                //Ajax请求处理没有发生异常 
            // var staffNumber= basicinfo.getElementsByTagName("staffNumber")[0].firstChild.nodeValue;
             var name= basicinfo.getElementsByTagName("name")[0].firstChild.nodeValue ;
             var  contrtexts=document.getElementsByName("contrtext");
              //contrtexts[0].value=staffNumber;
              contrtexts[1].value=name;           
             //document.getElementById("compactId").value=staffNumber;
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
    {var staffNumber=document.getElementById("staffNumber").value;
      var URL="sms/contract/newCompactinfo.do?conditionValue="+staffNumber;
      newCompactinfo(URL);
    }
    //设置合同相关填写项为只读状态
    function window.onload()
    {   var  contrtexts=document.getElementsByName("contrtext");

    }
    function writeConText(value,index){
    var  contrtexts=document.getElementsByName("contrtext");
    contrtexts[index].value=value;
    }
    
    function writeDate(value,index){
     if(isDate(value)){
      writeConText(value,index)
     }
    }
    function   isDate(datestr){ 
var dateRE=/^19[0-9]{2}|2[0-9]{3}(-[0-9]{2}){2}$/;
var month=Number(datestr.substring(5,7));
var date=Number(datestr.substring(8,10));
var year=Number(datestr.substring(0,4));
var s_monthRE=/^4|6|9|11$/;
var b_monthRE=/^1|3|5|7|8|10|12$/;
if(!dateRE.test(datestr)){
alert("请输入\"19YY-MM-DD\"或\"2YYY-MM-DD\"式样的日期！");
return false;
}
else {if(month==0||month>12){
alert("月份的数值应在1-12之内！");
return false;}
if(b_monthRE.test(String(month))&&date>31){
alert(String(month)+"月日期的数值应在1-31之内！");
return false;
}
if(s_monthRE.test(String(month))&&date>30){
alert(String(month)+"月日期的数值应在1-30之内！");
return false;
}
if(month==2){
  if(isleapyear(year)){
  if(date>29){
  alert(String(year)+"为闰年，2月日期的数值应在1-29之内！");
  return false;
  }
  }else{
  if(date>28){
  alert(String(year)+"为平年，2月日期的数值应在1-28之内！");
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
alert("薪资应为数值型数据！");
return false;
}
  function writenum(value,index){
     if(isNum(value)){
      writeConText(value,index)
     }
    }
/*function   isDate(checktext){ 
var   datetime; 
var   year,month,day; 
var   gone,gtwo; 
if(Trim(checktext)!= " "){ 
    datetime=Trim(checktext).substring(0,10); 
     if(datetime.length==10)
        { 
          year=datetime.substring(0,4); 
          if(isNaN(year)==true){ 
           alert( "请输入日期!格式为(yyyy-mm-dd)   \n例(2010-01-01)！ "); 
           return false;
          } 
          gone=datetime.substring(4,1); 
          month=datetime.substring(5,2); 
          if(isNaN(month)==true){ 
           alert( "请输入日期!格式为(yyyy-mm-dd)   \n例(2010-01-01)！ ");  
           return false;
          } 
          gtwo=datetime.substring(7,1); 
          day=datetime.substring(8,2); 
          if(isNaN(day)==true){ 
           alert( "请输入日期!格式为(yyyy-mm-dd)   \n例(2010-01-01)！ "); 
           return false;
          } 
          if((gone== "-")&&(gtwo== "-")){ 
           if(month <1||month> 12)   {   
              alert( "月份必须在01和12之间! ");  
              return false; 
           }   
           if(day <1||day> 31){   
              alert( "日期必须在01和31之间! "); 
              return false;
           }else{ 
                  if(month==2){                
                     if(isLeapYear(year)&&day>29){   
                     alert( "二月份日期必须在01到29之间! ");  
                     return false;             
                     }               
                     if(!isLeapYear(year)&&day>28){   
                       alert( "二月份日期必须在01到28之间! ");  
                       return false;             
                     }      
                    }   
                   if((month==4||month==6||month==9||month==11)&&(day> 30)){   
                        alert( "在四，六，九，十一月份   \n日期必须在01到30之间! ");
                        return false;
                     }   
                    } 
                 }
             else{ 
                   alert( "请输入日期!格式为(yyyy-mm-dd)   \n例(2010-01-01) "); 
                   return false;
                 }
    }
    else{ 
           alert( "请输入日期!格式为(yyyy-mm-dd)   \n例(2010-01-01) "); 
           return false;
        }       
} 
 return true;
}
*/  
    
    
    
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
					创建合同草案
				</h2>

				<div id="boxes">
					<hr />
				</div>
				<div>
					<form action="sms/contract/donew.do" method="post">
						<table>
							<tr>
								<td width="82">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 合同编号:
								</td>
								<td width="166">
									<!--  <input id="compactId" type="text" name="compactinfo.compactId">-->
									<!--  <font color="#ff0000">--由系统自动生成--</font>-->
									<input type="text" value="--由系统生成--"
										onblur="writeConText(this.value,0)" readonly="readonly" >
								</td>
								<td width="82">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp; 底薪:
								</td>
								<td width="167">
									<input id="salary" type="text" name="compactinfo.salary"  value="直接输入数字"
										onblur="writenum(this.value,4)" onFocus="if(value==defaultValue)

{value='';this.style.color='#000'}" onBlur="if(!value){value=defaultValue;this.style.color='#999'}" 

style="color:#999999">
								</td>
								<td width="30">
									工号:
								</td>
								<td width="250">
									<select id="staffNumber"
										name="compactinfo.basicinfo.staffNumber"
										onchange="selectOnchange()">
										<option>请选择</option>
										<s:iterator value="results" status="s">
											<option
												value="<s:property value="results[#s.index].staffNumber"/>">
												<s:property value="results[#s.index].staffNumber" />
											</option>
										</s:iterator>
									</select><font color="red">*没有合同的员工号</font>
								</td>
							</tr>
							<tr>
								<td width="82" height="36">
									合同到期日期:
								</td>
								<td width="166">
									<input id="outDate" type="text" name="compactinfo.outDate" value="日期格式：YYYY-MM-DD"
										onblur="writeDate(this.value,3)" onFocus="if(value==defaultValue)

{value='';this.style.color='#000'}" onBlur="if(!value){value=defaultValue;this.style.color='#999'}" 

style="color:#999999">
								</td>
								<td width="82">
									合同签订日期:
								</td>
								<td width="167">
									<input id="signDate" type="text" name="compactinfo.signDate"  value="日期格式：YYYY-MM-DD"
										onblur="writeDate(this.value,2)" onFocus="if(value==defaultValue)

{value='';this.style.color='#000'}" onBlur="if(!value){value=defaultValue;this.style.color='#999'}" 

style="color:#999999">
								</td>
								<td width="30">
									姓名:
								</td>
								<td width="250">
									<input id="name" type="text" name="compactinfo.basicinfo.name"
										readonly="readonly">
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
									<input type="Submit" value="提交草案">
								</td>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<td align="right">
									<input type="Reset" value="取消">
								</td>
							</tr>
							<tr>
								<td>
									<b>合同模板</b>

								</td>

								<!--	<td>
									<select name="">
										<option>
										<option value="">
											普通员工合同模板
										<option value="">
											经理合同模板
										<option value="">
											其他合同模板
									</select>
								</td>  -->
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