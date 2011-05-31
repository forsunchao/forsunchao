<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
	<base href="<%=basePath%>">
		<title>经理电子档案</title>
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<script type="text/javascript">
		function  doquerySubmit()
		{
		document.forms[0].submit();
		}
		function viewchartSubmit()
		{
		var type=document.getElementById('chartType').value;
		window.open("viewchart.do?chartType="+type,"chart","height=650,width=800,left=100,top=50,menubar=no,toolbar=mo");
		}
        </script>
		<SCRIPT> 
		var speed=90;
		var _demo; 
		var _demo1; 
		var _demo2; 
		function  window.onload()
		{
		_demo=document.getElementById("demo");
		_demo1=document.getElementById("demo1");
		_demo2=document.getElementById("demo2"); 
		demo2.innerHTML=demo1.innerHTML ;
		}
		function Marquee()
		{ 
		if(_demo2.offsetTop-_demo.scrollTop<=0){ 
		_demo.scrollTop-=_demo1.offsetHeight; 
		}
		else
		{ 
		_demo.scrollTop++ ;
		} 
		} 
		var MyMar=setInterval(Marquee,speed); 
		_demo.onmouseover=function()
		{
		 clearInterval(MyMar);
		} 
		_demo.onmouseout=function() 
		{
		MyMar=setInterval(Marquee,speed);
		} 
        </SCRIPT>
	</head>
	<body>
	<center>
		<!-- Begin Wrapper -->
		<div id="wrapper">
			<!-- Begin Header -->
	         <div id="header">
				<div class="logo">
					<h1 id="lineone">15
					    <span>UP</span>
					</h1>
					<h2 id="linetwo">最高的目标，最大的挑战，最好的团队！！</h2>
				</div>
			</div>
			<!-- End Header -->
			<!-- Begin Navigation -->
			<div id="navigation">
				<ul>
					<li>
							<a href="middleForward.jsp">登录页面</a>
						</li>
						<li>
							<a href="myaccount.jsp">我的账户</a>
				
						</li>
						<li>
							<a href="sms/login/indexElection.do">电子档案</a>
						</li>

					<li>
							<a href="sms/login/indexContract.do">电子合同</a>
						</li>
						<li>
							<a href="indexMain.do">电子考核</a>
						</li>

				</ul>

			</div>
			<!-- End Navigation -->

			<div class="clear"></div>

			<!-- Begin Left Column -->
			<div id="leftcolumn">

				<div id="leftnav">

					<div class="col">
						<ul>
  
							<form action="doquery.do" method="post">


								<li>
									<a href="" title="search1"><s:property value="getText('login.username')"/></a>
									<!-- 查询员工信息 -->
									<label>

										<select name="searchType">
											<option value="0">
											<s:property value="getText('an.username')"/>	
										
											</option>
											<option value="1">
											<s:property value="getText('an.gonghao')"/>	
											</option>
											<option value="2">
											<s:property value="getText('an.bumen')"/>	
											</option>
											<option value="3">
										<s:property value="getText('an.xueli')"/>	
											</option>
											<option value="4">
												<s:property value="getText('an.hun')"/>		
											</option>
										</select>
									</label>
								</li>
								<input name="conditionValue" type="text" size="20" />

								<li>
									<a href="javascript:doquerySubmit()">
									   <img src="images/search.gif" alt="" width="24" height="24" />
									</a>
								</li>
							</form>
							<li>
								<select name="chartType">
									<option value="1"><s:property value="getText('hunbi')"/>	</option>
									<option value="2"><s:property value="getText('nannv')"/>		</option>
									<option value="3"><s:property value="getText('xuewei')"/>		</option>
									&nbsp;&nbsp;&nbsp;&nbsp;
								</select>
								<a href="javascript:viewchartSubmit()"><font color=#F08080face="隶书"><s:property value="getText('chakan')"/></FONT></a>
							
							</li>

							<li>
									<a href="ReportServer?reportlet=WorkBook2.cpt&_=1286866599218"><font color=#coco88face="隶书"><s:property value="getText('f/m')"/></font></a>
							</li>
							<li>
							<a href="ReportServer?reportlet=WorkBook3.cpt&_=1286961745062"><font color=#coco88face="隶书"><s:property value="getText('ji')"/></font></a>
							</li>
						</ul>
					</div>
				</div>
				<div id="leftnavbottom"></div>

				<div class="clear"></div>

				<div class="news">
					<h3>
						<s:property value="getText('company')"/>&nbsp;&nbsp;
						<br>
					</h3>
					<script language="javaScript">
today=new Date();
function initArray(){
this.length=initArray.arguments.length
for(var i=0;i<this.length;i++)
this[i+1]=initArray.arguments[i] }
var d=new initArray(
"星期日",
"星期一",
"星期二",
"星期三",
"星期四",
"星期五",
"星期六");
document.write(
"<font color=#4B0082 style='font-size:13pt;font-family: 隶书'> ",
today.getYear(),"年",
today.getMonth()+1,"月",
today.getDate(),"日",
d[today.getDay()+1],
"</font>" ); 
</script>
					<p>
						<c:forEach items="${date}" var="name">
							<font color=#F08080face="隶书" >祝&nbsp</font>
							<font size=4><c:out value="${name}" />生日快乐</font>
						</c:forEach>
					</p>




				</div>
				<div class="clear"></div>
				<div class="newsbottom"></div>

			</div>
			<!-- End Left Column -->

			<div id="righttop"></div>

			<!-- Begin Right Column -->
			<div id="rightcolumn">
			<ul>
<li>
					<a href="lang.do?request_locale=en_US">英语</a></li>
  <li>
  <a href="lang.do?request_locale=zh_CN">中文</a>
  
					</li>
			</ul>
				<h2>
					<s:property value="getText('theme')"/>
				</h2>
				<img src="images/1.png" class="floatTL" alt="image" width="95" />
				<DIV id=demo style="OVERFLOW: hidden; WIDTH: 365px; HEIGHT: 120px">
					<DIV id=demo1>
						<p>
							<s:property value="getText('a')"/>
							<font color=#F08080 face="隶书"><c:out
									value="${sessionScope.user.name}" />
							</font>，<s:property value="getText('b')"/>
							<br>
							<s:property value="getText('c')"/>
							<br>
							<s:property value="getText('d')"/>
							<br>
							<s:property value="getText('e')"/>
							<br>
							<s:property value="getText('f')"/>
							<br>
				
							<s:property value="getText('h')"/>
							<br>
						<p>
					</DIV>
					<DIV id=demo2></DIV>

				</DIV>
				<div id="boxes">
					<hr class="floatTL" />
				</div>
				<div>

					<img src="images/B1.jpg" class="floatTL" alt="image" width="508"
						style="height: 334px;" height="334" />

				</div>
				<div>
					<p></p>

				</div>


			</div>
			<!-- End Right Column -->

			<div id="rightbottom">
				<p class="box">
					<a href="#"></a>
				</p>
			</div>

			<!-- Begin Footer -->


			<div id="footer">
				<p></p>
				<p id="legal">
					15UP &copy; 2010 by 15UP.com Designed by
					<a href="#">15UP.html</a>
				</p>
			</div>


			<!-- End Footer -->

		</div>
		<!-- End Wrapper -->
		</center>
	</body>
</html>
