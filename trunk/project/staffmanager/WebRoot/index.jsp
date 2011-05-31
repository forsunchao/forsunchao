<%@ page language="java" pageEncoding="UTF-8" isELIgnored="true"%> <!-- å¦æè¿éæ¹æfalseï¼å¯è½è¯å«ä¸äºJSTLæ ç­¾ -->
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
		<script src="js/2.js" language="javascript">
</script>
		<script>
<!--
lstart=200
loop=true
speed=350 
pr_step=5 
function makeObj(obj,nest){
nest=(!nest) ? '':'document.'+nest+'.'
this.css=(document.layers) ? eval(nest+'document.'+obj):eval(obj+'.style')
this.scrollHeight=document.layers?this.css.document.height:eval(obj+'.offsetHeight')
this.up=goUp
this.obj = obj + "Object"
eval(this.obj + "=this")
return this
}
function goUp(speed){
if(parseInt(this.css.top)>-this.scrollHeight){
this.css.top=parseInt(this.css.top)-pr_step
setTimeout(this.obj+".up("+speed+")",speed)

}else if(loop) {
this.css.top=lstart
eval(this.obj+".up("+speed+")")
}
}
function slideInit(){
oSlide=makeObj('divNews','divCont')
oSlide.css.top=lstart
oSlide.up(speed)
}
onload=slideInit
//-->
</script>

		<title>åå·¥ä¿¡æ¯ç®¡çç³»ç»</title>
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>

	<body bgcolor="#ffffff" onLoad="startclock()">
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
							æé«çç®æ ï¼æå¤§çææï¼æå¥½çå¢éï¼ï¼
							<br>
							<br>
								<form name='jsfrm'>
						<center>
							<input type=text name='face' size=25>
						</center>
					</form>
						</h2>
					</div>
				</div>
			
				<!-- End Header -->
             
				<!-- Begin Navigation -->
				<div id="navigation">

					<ul>
						<li>
							<a href="login.jsp">ç»å½é¡µé¢</a>
						</li>
						<li>
							<a href="myaccount.jsp">æçè´¦æ·</a>
				
						</li>
						<li>
							<a href="sms/login/indexElection.do">çµå­æ¡£æ¡</a>
						</li>
						<li>
							<a href="sms/login/indexContract.do">çµå­åå</a>
						</li>
						<li>
							<a href="indexMain.do">çµå­èæ ¸</a>
						</li>
						
					</ul>

				</div>
					<font size="5" color="0ff00">æ¬¢è¿ä½ ï¼  <c:out value="${sessionScope.user.name}"/></font>
					
				<!-- End Navigation -->

				<div class="clear"></div>

				<!-- Begin Left Column -->
			
				<div id="leftcolumn">
					

					
					<div class="clear"></div>
                  
					<div class="news">
				
						<center>
							
							<h2>
								<FONT
									style="FONT-WEIGHT: 10px; FONT-SIZE: 30px; FILTER: blur(add = 1, direction = 20, strength = 10); WIDTH: 200px; POSITION: relative"
									color=green>çæ¥ç¥ç¦</FONT>
							</h2>
						</center>

						<s:if test="namedate.size==0">
							<marquee width="150" height="55" scrollamount="4"
								onMouseOver="this.stop()" onMouseOut="this.start()">
								<font size="5"><B> <font color=#00FF00>ä»&nbsp</font>
										<font color=olive>å¤©&nbsp</font> <font color=red>æ²¡&nbsp</font>
										<font color=#4B0082>æ&nbsp</font> <font color=#FF69B4>å&nbsp</font>
										<font color=#FFB6C1>å·¥&nbsp</font> <font color=#FFD700>ç&nbsp</font>
										æ¥</B>
								</font>
							</marquee>
						</s:if>


						<c:forEach items="${namedate}" var="name">
						
								<marquee direction="up" width="150" height="55" scrollamount="1"
									onMouseOver="this.stop()" onMouseOut="this.start()">

									<h2><font color=#F08080face= "é¶ä¹¦" size=5>ç¥&nbsp</font><font size=4><c:out
											value="${name}" />
									</font></h2>
									<br>
									<h2><font face="é¶ä¹¦" size=5><font color=#00FF00>ç</font><font
										color=olive>æ¥</font><font color=red>å¿«</font><font
										color=#4B0082>ä¹</font><font color=#FF69B4>ï¼</font>
									</font></h2>

								</marquee>

							<br>
							
							
						</c:forEach>
						
					</div>
						
					
					<div class="newsbottom"></div>

				</div>
				
				<!-- End Left Column -->
				
				<div id="righttop"></div>

				<!-- Begin Right Column -->
				<div id="rightcolumn">

								<center>
						<h2>
							<fort size=6 color=#FF0000>
							å&nbspå&nbspæ&nbspé
							</fort>
						</h2>
					</center>
					<s:if test="namelist.size==0">
						<MARQUEE direction=right width=250 height=50
							onMouseOver="this.stop()" onMouseOut="this.start()">
							<FONT face=é¶ä¹¦ color=blue size=5>æ²¡&nbspæ&nbspå&nbspå&nbspå°&nbspæ
							</FONT>
						</MARQUEE>
						
					</s:if>

					<center>
						<c:forEach items="${namelist}" var="name">


						<marquee direction="up" width="150" height="55" scrollamount="1"
									onMouseOver="this.stop()" onMouseOut="this.start()">

									<font size=4 color=blue><c:out
											value="${name}" />
									</font>
									<br>
									<font face="é¶ä¹¦" size=5><font color=#00FF00>å</font><font
										color=olive>å</font><font color=red>è¦</font><font
										color=#4B0082>å°</font><font color=#FF69B4>æ</font>
										
									</font>

								</marquee>
					</c:forEach>

					</center>

					
					
					<div id="boxes">
						<hr class="floatTL" />
						
					</div>

					<div>

						<center>
							<h2>
								<font size="4" color="#040c1c">ä¸­è½¯å½éåè¶å¹è®­ä¸­å¿ï¼ETCï¼</font>
							</h2>
						</center>
						<div align="left">
							<font color="#040c1c">

								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;</font><font
								size="3" face="åæä»¿å®" color="#040c1c"> </font><font
								color="#0000ff" size="2"><font color="#040c1c">ä¸­è½¯å½éåè¶å¹è®­ä¸­å¿ï¼ETCï¼æ¯ä¸­è½¯å½éæèµçITæè²éå¢.äººææ¯ä¸­è½¯å½ééå¢æ<br>&nbsp;<br> ä¹åå±çæ ¸å¿å¨åï¼å¦ä½ä¸»å¨ææåå¼è¿äººæãå¹å»äººæï¼ä»æºå¤´ä¸æé ç«äºçååä¼å¿æ¯ITæ <br>
									å¡ä¼ä¸çå¶èä¹éãç±ä¸­è½¯æ»å¬å¸å¹¶å¥ä¸­è½¯å½éçä¸­è½¯æ»å¬å¸è®¡ç®æºå¹è®­ä¸­å¿ï¼å¹è®­ä¸­å¿ï¼æ¿æ <br>
									äºä¸­å½éäººæå¨å¤åå¹å»çä»»å¡ï¼è¿ä»å±å¹è®­åç±»ITä¸ä¸äººæ50ä½ä¸äººæ¬¡ï¼æ¯å½åç¬¬ä¸å®¶éè¿ <br> <br>ISO9001è®¤è¯çå¹è®­æºæã&ldquo;ä¸­è½¯å¹è®­&rdquo;åçæ¯ä¸çç¥åç&ldquo;ä¸­é«ç«¯ITææ¯å¹è®­&rdquo;åçãæ¯å¾®è½¯<br>
									<br>ææé« çº§ææ¯å¹è®­ä¸­å¿ï¼CPLSï¼ãSUNææJavaæè²å¹è®­ä¸­å¿ï¼ASECï¼ãIBMè½¯ä»¶é¨ææå¹<br>
									<br>è®­ä¸­ å¿ï¼ï¼å¹è®­ä¸­å¿åæ¶æ¯åä¿¡æ¯äº§ä¸é¨è®¡ç®æºææ¯å¹è®­ä¸­å¿ï¼æ¯åä¿¡äº§é¨çå¹è®­æ¯ææºæï¼<br> <br>ååæ¿
									æäºè®¡ç®æºä¿¡æ¯ç³»ç»éæé¡¹ç®ç»çãé«çº§é¡¹ç®ç»çï¼ä¿¡æ¯ç³»ç»ççå·¥ç¨å¸è®¤å®æ åç<br> <br>å¶å®åå¹è®­
									å·¥ä½ï¼è¿ä»å¹å»äº10000ä½åä¿¡æ¯ç³»ç»éæé¡¹ç®ç»çãé«çº§é¡¹ç®ç»çï¼åä¿¡æ¯ç³»<br> <br>ç»ççéçä¸­è½¯
									å½éå¨ä¸»è¥ä¸å¡ç¹å«æ¯è½¯ä»¶å¤åä¸å¡ä¸çè¿çåå±ï¼å¯¹äººæçéæ±éä¹è¶<br> <br>æ¥è¶å¤§ï¼å¨è¿ç§æåµ
									ä¸ï¼å¹è®­ä¸­å¿ä¾é èªèº«å¤å¹´çç§¯ç´¯ï¼äº2005å¹´å¨åäº¬æå¹³ä¸­è½¯è½¯ä»¶å­<br> <br>å»ºæäº&ldquo;ä¸­è½¯å½éè½¯ä»¶äººæå¹
									å»åºå°&rdquo;ï¼äººæå¹å»åºå°ï¼ï¼è¯¥åºå°åå¬é¢ç§¯4000ä½å¹³æ¹ç±³ï¼å¯<br> <br>åæå®¹çº³å­¦å900åãäººæå¹å»åº
									å°æ¯æ¯æä¸­è½¯å½éé«éåå±çäººææç¥ç»æé¨åï¼è½¯ä»¶å<br> <br>å¤åä¸å¡å¿«éåå±çéè¦äººææ¯æå¹³ å°ã</font>
							</font>
							<font color="#0000ff"><font size="3" face="ä»¿å®_GB2312"
								color="#040c1c"><br> </font> </font>
						</div>
					</div>
				</div>
				<div id="footer">
					<p id="legal">
						15UP.com Designed by
						<a href="member.jsp">15UP.html</a>
					</p>
				</div>


				<!-- End Footer -->

			</div>
			<!-- End Wrapper -->
		</center>
		
	</body>
</html>
