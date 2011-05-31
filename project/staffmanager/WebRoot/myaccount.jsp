<%@ page contentType="text/html;charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
	<head>
		<base href="<%=basePath%>">
		<title>个人账户管理</title>
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>

	<body>
		<center>
			<!-- Begin Wrapper -->
			<div id="wrapper">

				<!-- Begin Header -->
				<div id="header">

					<div class="logo">
						<h1 id="lineone">
							15
							<span>UP</span>
						</h1>
						<h2 id="linetwo">
							最高的目标，最大的挑战，最好的团队！！
						</h2>
					</div>

				</div>
				<!-- End Header -->

				<!-- Begin Navigation -->
				<div id="navigation">
 <ul>
						<li>
							<a href="middleForward.jsp">首页</a>
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
							<a href="sms/login/indexMain.do">电子考核</a>
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
								<!--  <li>
									<a>我的账户</a>
								</li>
								<li>
									<a>我的消息</a>
								</li>-->
								<li>
									<a href="javascript:insert();">修改密码</a>
								</li>
							</ul>
						</div>
					</div>
					<div id="leftnavbottom"></div>

					<div class="clear"></div>

					<div class="news">
						<h3>
							公司动态
						</h3>
						<h4>
							09.18.2010
						</h4>
						<p>
							2010年第一季度新签合同金额大幅增长。1-3月公司新签合同额累计167.56亿元，同比增长43.27% ...
							<a href="#">详细信息</a>
						</p>


						<h4>
							09.13.2010
						</h4>
						<p>
							新签国际工程合同额折合71.01亿元，约占新签合同总额的42.38%；新签国内外水电工程合同额112.35亿元，约占新签合同总额的67.05%...
							<a href="#">详细信息</a>
						</p>

					</div>
					<div class="clear"></div>
					<div class="newsbottom"></div>

				</div>
				<!-- End Left Column -->

				<div id="righttop"></div>

				<!-- Begin Right Column -->
				<div id="rightcolumn">

					<h2>
						修改个人密码
					</h2>
					<img src="images/2.png" class="floatTL" alt="image" width="95" />
					<p>
						&nbsp;&nbsp;&nbsp;&nbsp;个人密码是您登陆本系统的重要凭证，请妥善保管。如密码丢失等问题，请联系系统管理员帮助解决！谢谢合作！
					</p>

					<div id="boxes">
						<hr class="floatTL" />
					</div>
					<br>
					<br>
					<div id=show_fresh>
						<img src="images/B1.jpg" width="500" height="400" alt="work hard!">
					</div>
					<div>
						<a href="#"><img src="images/button/04.gif" alt="image"
								height="40" class="floatTL" /> </a><a href="#"><img
								src="images/button/03.gif" height="40" alt="image"
								class="floatTR" /> </a>
					</div>
				</div>
				<script type="text/javascript" language="javascript">
		 var request;
 function createRequest(){
  		if (window.XMLHttpRequest) { 
             request = new XMLHttpRequest(); 
     　　}else if (window.ActiveXObject) { 
             　request = new ActiveXObject("Microsoft.XMLHTTP"); 
     　　}
  		}
      　   function action(url){
			createRequest();
  			request.open("POST",url, true);   
  			request.onreadystatechange = showMessage;           
             　 request.send(null); 
  }  
    function showMessage(){ 

　 if (request.readyState == 4) { 

    if (request.status == 200){
      
       var message=request.responseText;
       var msgSpan=document.getElementById("message");
       msgSpan.style.color="red";
       if(message==1){
         alert( "修改成功");
         document.getElementById('show_fresh').innerHTML="<img src=\"images/B1.jpg\" width=\"500\" height=\"400\" alt=\"work hard!\">";
       }
       else if(message==0){
    //msgSpan.innerHTML="密码错误";
        alert("密码错误");
        return;
     }
     else if(message==3){
    //msgSpan.innerHTML="密码错误";
        alert("对不起，您输入的两次新密码不一致！");
        return;
     }
       }
       }
    }
    function insert(){
     //alert('1');
     document.getElementById('show_fresh').innerHTML=" 原始密码：<input type=\"password\" name=\"oldPassword\" id=\"oldPassword\"/><br><br>新 密 码：<input name=\"newPassword\" id=\"newPassword\" type=\"password\"/><br><br>确认密码：<input type=\"password\" name=\"confirmPassword\" id=\"confirmPassword\"/><br><br><br><br><input type=\"button\" value=\"提交\" onclick=\"validateSubmit();\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"button\" value=\"返回\" onclick=\"validateCancel();\">";
    }
    function validateSubmit(){
       //alert('1');
       var a=document.getElementById('oldPassword').value;
       var b=document.getElementById('newPassword').value;
       var c=document.getElementById('confirmPassword').value;
       var url="sms/login/accountUpdate.do?oldPassword="+a+"&newPassword="+b+"&confirmPassword="+c+"&date="+new Date();
       action(url);
      
    }
    function validateCancel()
    {
   if(confirm("确定返回？"))
      document.getElementById('show_fresh').innerHTML="<img src=\"images/B1.jpg\" width=\"500\" height=\"400\" alt=\"work hard!\">";

    return false;
       }
 </script>
				<!-- End Right Column -->

				

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
		<div id="message">

		</div>
	</body>
</html>
