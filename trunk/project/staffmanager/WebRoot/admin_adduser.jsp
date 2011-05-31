<%@ page language="java" pageEncoding="UTF-8" isELIgnored="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
 <base href="<%=basePath%>">
<title>管理员</title>

 <script type="text/javascript">
    var passwordRE=/^[a-zA-Z]\S{5,17}$/;
    var nameRE= /^[\u4E00-\u9FA5]{2,4}$/;
	function  checkForm(){
	//1.验证用户名
	var name=document.getElementById("basicinfo.name").value;
	var password=document.getElementById("basicinfo.password").value;
	if(""==name){
	alert("请输入用户名");
	event.returnValue=false;
	return ;
	}
    if(!nameRE.test(name)){
	alert("用户名格式错误");
	event.returnValue=false;
	return ;
	}
	//2.验证密码

	if(""==password){
	alert("密码不能为空");
	event.returnValue=false;
	return ;
	}
	if(!passwordRE.test(password)){
	 alert("你输入的密码格式错误");
	 event.returnValue=false;
	return ;
	}
	//3.验证确认密码
	var confirmpw=document.getElementById("confirmpw").value;
	 if(confirmpw==""){
	 alert("确认密码不能为空");
	 event.returnValue=false;
	return ;}
	 if(password!=confirmpw){
	 alert("前后密码不一致");
	 event.returnValue=false;
	return ;}
  //4.身份证不能为空
	 var id=document.getElementById("basicinfo.personId").value;
     if(""==id){
     alert("身份证不能为空！");
	 event.returnValue=false;
	 return ;}
  //5.工号不能为空
	var id=document.getElementById("basicinfo.staffNumber").value;
     if(""==id){
     alert("工号不能为空！");
	 event.returnValue=false;
	 return ;}
     return true;
     }


     
    function createXMLHttpRequest(){
     if(window.XMLHttpRequest){
     XMLHttpReq = new XMLHttpRequest();
     }
     else if(window.ActiveXObject){
     try{
     XMLHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
     }catch(e){
       try{
            XMLHttpReq= new ActiveXObject("Microsoft.XMLHttp");
       }catch(e){}
     }
     
     }
     }
  
     function sendRequest(url){
     createXMLHttpRequest();
     XMLHttpReq.open("POST",url,true);
     XMLHttpReq.onreadystatechange = processResponse;
     XMLHttpReq.send(null);
     }
       function  processResponse(){
       if(XMLHttpReq.readyState == 4){
         if(XMLHttpReq.status == 200){
          var response = XMLHttpReq.responseXML.getElementsByTagName("response")[0].firstChild.data;
            if("1"==response){
             alert("该用户名已经存在!");
             document.getElementById("basicinfo.name").value="";
            }

           }else{
           window.alert("您请求的页面有异常;");
           }
         }
       }
       
       function  checkName(name){
       //Ajax检验用户名是否存在
       var url="doajax.do?name="+name;
       url=encodeURI(url);
       url=encodeURI(url);
	   sendRequest(url);
       }
    </script>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>

<body >
<center>
   <!-- Begin Wrapper -->
   <div id="wrapper">
   
         <!-- Begin Header -->
         <div id="header">
		 
                <div class="logo"> 
                  <h1 id="lineone">15<span>UP</span></h1> 
		          <h2 id="linetwo">最高的目标，最大的挑战，最好的团队！！</h2>
               </div>		 
			   
		 </div>
		 <!-- End Header -->
		
                  
                  <div class="clear"></div>
		 				<!-- Begin Right Column -->
			



		 
		 
		 
		 <!-- Begin Left Column -->
		 <div id="leftcolumn">
		 
			<div id="leftnav">
                                            			
		       <div class="col">
	             <ul>
			    <li><a href="admin_adduser.jsp" title="">添加用户</a></li>
			     
			     <li><a>查询用户</a></li>
			     <form action="QueryUserAction.do" method="post">
			    
	   <font color=black> 按 </font>
	   <select name="searchType">
				<option value="0">员工号</option>
				<option value="1">姓名</option>
				<option value="2">部门</option>
				<option value="3">学历</option>
				<option value="4">婚否</option>
		</select>
		<input type="text" name="conditionValue">
		<input type="submit" value="提交">
	</form>
			     <li><a href="QueryAllAction.do?Page.curPage=1" title="">管理用户</a></li>
			      <li><a href="admin_index.jsp" title="">返回首页</a></li>
			      <li><a href="login.jsp" title="">注销</a></li>
                 </ul>
               </div>
           </div>
           <div id="leftnavbottom"></div>

                 <div class="clear"></div>
		 
		 </div>
		 <!-- End Left Column -->
 
                 <div id="righttop"></div>
		 
		 <!-- Begin Right Column -->
		 <div id="rightcolumn">
            					<h2>
						添加用户
					</h2>
					<img src="images/2.png" class="floatTL" alt="image" width="95" />
					<p>
						&nbsp;&nbsp;&nbsp;&nbsp;管理员添加用户！
					</p>
					<p>
						<font size="5" color="0ff00">欢迎你！  <c:out value="${sessionScope.user.name}"/></font>
					</p>

					<div id="boxes">
						<hr class="floatTL" />
					</div>
              
                <div id="boxes">
    <form   action="adduser.do" id="adduser" name="form1" method="post"  >
   <table align="center" bgcolor="F0F8FF" >               <!--   onSubmit="return checkForm();"-->
  <tr>
     <th align="center">
    <h2>添加用户</h2>
      </th>
	</tr>
  <tr>
  <td>
  用户名:</TD><TD><input name="basicinfo.name" type="text"  onblur="checkName(this.value)" /><span style="color:#F00; font-size:18px">*</span> &nbsp;&nbsp;<span style="color:#F00; font-size:12px">用户名为中文姓名</span>
  </td>
  </tr>
  <tr>
  <td>
  密   码：</TD><TD><input name="basicinfo.password"  type="password"  style="width:150px" /><span style="color:#F00; font-size:18px">*</span> &nbsp;&nbsp;<span style="color:#F00; font-size:12px">密码以字母开头长度在6-18之间</span>
  </td>
  </tr>
   <tr>
  <td>
 确认密码：</TD><TD><input id="confirmpw"  type="password"  style="width:150px" /><span style="color:#F00; font-size:18px">*</span> &nbsp;&nbsp;<span style="color:#F00; font-size:12px">确认密码必须与密码相同</span>
  </td>
  </tr>
   <tr>
  <td>
  身份证：</TD><TD><input name="basicinfo.personId"  type="text"/><span style="color:#F00; font-size:18px">*</span> &nbsp;&nbsp;<span style="color:#F00; font-size:12px">必填</span>
  </td>
  </tr>
     <tr>
  <td>
  工号：</TD><TD><input name="basicinfo.staffNumber"  type="text"/><span style="color:#F00; font-size:18px">*</span> &nbsp;&nbsp;<span style="color:#F00; font-size:12px">必填</span>
  </td>
  </tr>
   <tr>
   <td>
  <input type="submit" value="添加"  align="left"  onclick="checkForm()"/>
  </td>
  <td >
  <input type="reset" value="撤销" align="right"/>
  </td>
  </tr>
  </table>
 </form>
           </div>	 
				 
				 <div>
				 
		   </div> 
				  <div>
	</div> 
		 </div>
		 <!-- End Right Column -->

                 <div id="rightbottom">   <p class="box"><a href="#"></a></p></div>
		 
		 <!-- Begin Footer -->

		       
 <div id="footer">
 <p></p>
	<p id="legal">15UP &copy; 2010 by 15UP.com   Designed by <a href="#">15UP.html</a></p>
</div>		
			    

		 <!-- End Footer -->
		 
   </div>
   <!-- End Wrapper -->
 </center>  
</body>
</html>
