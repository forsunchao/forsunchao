<%@ page language="java" pageEncoding="UTF-8" isELIgnored="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html>
<head>
	
	<title>员工管理信息系统</title>
	<base href="<%=basePath%>">
	<META HTTP-EQUIV="pragma" CONTENT="no-cache">
	<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
	<META HTTP-EQUIV="expires" CONTENT="0">
	<META http-equiv=Content-Type content="text/html; charset=utf-8">
	<LINK href="css/info.css" type=text/css rel=stylesheet>
	<link href="main.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="chrometheme/chromestyle.css" />
	<script type="text/javascript" src="chromejs/chrome.js">
</script>
<script src="Scripts/AC_RunActiveContent.js" type="text/javascript"></script>
	<style type="text/css">
	<!--
	
	td {
		font-size: 12px;
	}
	-->
	</style>
	<SCRIPT language=JavaScript type=text/JavaScript>
		var browser=navigator.appName;
		var ieSupported = true;
		if (browser != "Microsoft Internet Explorer") {
			ieSupported = false;
		}

		function check(form){
			if (ieSupported == false) {
				alert("The system only supports Microsoft Internet Explorer!");
				return false;
			}
			
			var flg = 0;
			if(form.userCode.value=="")flg=1;
			if(form.userPwd.value=="")flg=2;
			if(form.userCode.value==""&&form.userPwd.value=="")flg=1;
			switch(flg){
				case 0:return true;
				case 1:alert("Please Input the UserName!");form.userCode.focus();return false;
				case 2:alert("Please Input the PassWord!");form.userPwd.focus();return false;
			}
		}
		
		function keyDownFocus(){
			if(event.keyCode==13){
				if (check(document.logonForm) == true) {
					document.forms[0].submit();
				}
			}		
		}
		document.onkeydown=keyDownFocus;
	</SCRIPT>
	<SCRIPT src="js/functions.js"></SCRIPT>
	<LINK href="css/index.css" type=text/css rel=stylesheet>
	<SCRIPT language=JavaScript type=text/JavaScript>

function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);

</SCRIPT>

	<SCRIPT language=JavaScript>
<!--
function openHTML(){
	window.location.href="mainFrame.jsp";
}
window.moveTo(0,0)
window.resizeTo(screen.availwidth,screen.availheight)
function clicklogin(){
	if (check(document.logonForm) == true) {
		document.logonForm.submit();
	}
}


//-->
</SCRIPT>

<style type="text/css">
<!--
body {
	background-color: #3283C5;
}
#Layer1 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:1;
	left: 205px;
}
-->
</style>






<SCRIPT language="JavaScript" type="text/javascript">
function showMenu(d1){
var i;
for(i=1;i<10;i++){
if(i==d1){
document.getElementById(d1).style.display='block';
}
else
{
document.getElementById(i).style.display='none';
}
}
}
<!--
function statusMessageObject(p,d) {
this.msg = MESSAGE
this.out = " "
this.pos = POSITION
this.delay = DELAY
this.i = 0
this.reset = clearMessage
}
function clearMessage() {
this.pos = POSITION
}
var POSITION = 100
var DELAY = 5
var MESSAGE = "欢迎访问员工管理系统! Welcome to yuangongguanli.com "
var scroll = new statusMessageObject()
function scroller() {
for (scroll.i = 0; scroll.i < scroll.pos; scroll.i++) {
scroll.out += " "
}
if (scroll.pos >= 0)
scroll.out += scroll.msg
else scroll.out = scroll.msg.substring(-scroll.pos,scroll.msg.length)
window.status = scroll.out
scroll.out = " "
scroll.pos--
if (scroll.pos < -(scroll.msg.length)) {
scroll.reset()
}
setTimeout ('scroller()',scroll.delay)
}
function snapIn(jumpSpaces,position) {
var msg = scroll.msg
var out = ""
for (var i=0; i<position; i++)
{out += msg.charAt(i)}
for (i=1;i<jumpSpaces;i++)
{out += " "}
out += msg.charAt(position)
window.status = out
if (jumpSpaces <= 1) {
position++
if (msg.charAt(position) == ' ')
{position++ }
jumpSpaces = 100-position
} else if (jumpSpaces > 3)
{jumpSpaces *= .75}
else
{jumpSpaces--}
if (position != msg.length) {
var cmd = "snapIn(" + jumpSpaces + "," + position + ")";
scrollID = window.setTimeout(cmd,scroll.delay);
} else {
window.status=""
jumpSpaces=0
position=0
cmd = "snapIn(" + jumpSpaces + "," + position + ")";
scrollID = window.setTimeout(cmd,scroll.delay);
return false
}
return true
}
snapIn(200,0);
// -->
    
</SCRIPT>
<script language="javascript" type="text/javascript">
      function check(form){
			var  username=form.logName.value;
			if(username==""){
			alert("请输入用户名");
			return false;
			}
			var  logPwd=form.logPwd.value;
			if(logPwd==""){
			alert("请输入密码");
			return false;
			}
			
			var  testcodes=form.test.value;
			if(testcodes==""){
			alert("请输入验证码");
			return false;
			}
		  var codes=document.getElementById("codes").value;
		  testcodes=testcodes.toLowerCase();
		  codes=codes.toLowerCase();
		  if(testcodes!=codes){
		  alert("验证码输入误");
		  nextCodes();
		  testcodes="";
		  return false;
		  }
		  return true;
			
		}
   
 var charcodes="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0987654321";
 var codeCount=charcodes.length;
 var colors=new Array();
 colors.push("FFC1C1");
 colors.push("FFFFB3");
 colors.push("B5FFFF");
 colors.push("79BCFF");
 colors.push("FF9D6F");
 colors.push("9595FF");
 colors.push("CF9E9E");
 colors.push("CCFFFF");
 colors.push("FF99FF");
 colors.push("AADF00");
 colors.push("7F5FAA");
 colors.push("2AFFAA");
 var colorCount=colors.length;
 var  imgs=new Array();
 imgs.push("img/img1.jpg");
 imgs.push("img/img2.jpg");
 imgs.push("img/img3.jpg");
 imgs.push("img/img4.jpg");
 imgs.push("img/img5.jpg");
 imgs.push("img/img6.jpg");
 imgs.push("img/img7.jpg");
 imgs.push("img/img8.jpg");
 imgs.push("img/img9.jpg");
 imgs.push("img/img10.jpg");
 var  imgCount=imgs.length;
 function  nextCodes(){
  var randomdata= Number(String(Math.random()).substring(2));
  //设置背景
  document.getElementById("backgroundTb").background=imgs[randomdata%imgCount];
  //随即产生验证码code1
  randomdata= Number(String(Math.random()).substring(2));
  var code1=document.getElementById("code1")
  code1.innerHTML=charcodes.charAt(randomdata%codeCount);
  code1.style.color=colors[randomdata%colorCount];
  //随即产生验证码code2
  randomdata= Number(String(Math.random()).substring(2));
  var code2=document.getElementById("code2")
  code2.innerHTML=charcodes.charAt(randomdata%codeCount);
  code2.style.color=colors[randomdata%colorCount];
  //随即产生验证码code3
  randomdata= Number(String(Math.random()).substring(2));
  var code3=document.getElementById("code3")
  code3.innerHTML=charcodes.charAt(randomdata%codeCount);
  code3.style.color=colors[randomdata%colorCount];
  //随即产生验证码code4
  randomdata= Number(String(Math.random()).substring(2));
  var code4=document.getElementById("code4")
  code4.innerHTML=charcodes.charAt(randomdata%codeCount);
  code4.style.color=colors[randomdata%colorCount];
  //随即产生验证码code5
  
  var codes=document.getElementById("codes");
  codes.value=code1.innerHTML+code2.innerHTML+code3.innerHTML+code4.innerHTML;
  }
</script>
</head>

<BODY style="OVERFLOW-Y: hidden; OVERFLOW-X: hidden" leftMargin=0 topMargin=0 marginheight="0" marginwidth="0" class="bg" onload='document.logonForm.userCode.focus()'>
	<form name="logonForm" method="post" action="sms/login/userlogin.do"  onSubmit="return check(this);">
		<table width="799"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="799" height="88" background="images/login/top1.jpg"><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macrome&nbsp;dia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" width="799" height="88">
      <param name="movie" value="images/flash/top(3).swf" />
      <param name="quality" value="high" />
      <param name="wmode" value="transparent" />
      <embed src="images/flash/top(3).swf" width="799" height="82" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" wmode="transparent"></embed>
    </object></td>
  </tr>
  <tr>
    <td><img src="images/login/cengt.jpg" width="799" height="17"></td>
  </tr>
  <tr>
    <td width="799" height="259">
	<script>
var widths=799;              
var heights=259;              
var counts=4;   
img1=new Image ();img1.src='images/login/b1.gif'; 
img2=new Image ();img2.src='images/login/b2.gif'; 
img3=new Image ();img3.src='images/login/b3.gif'; 
img4=new Image ();img4.src='images/login/b4.gif'; 
  
url1=new Image ();url1.src='http://www.jzxue.com';
url2=new Image ();url2.src='http://www.jzxue.com';
url3=new Image ();url3.src='http://www.jzxue.com';
url4=new Image ();url4.src='http://www.jzxue.com';


var nn=1;
var key=0;
function change_img()
{if(key==0){key=1;}
else if(document.all)
{document.getElementById("pic").filters[0].Apply();document.getElementById("pic").filters[0].Play(duration=2);}
eval('document.getElementById("pic").src=img'+nn+'.src');
eval('document.getElementById("url").href=url'+nn+'.src');
for (var i=1;i<=counts;i++){document.getElementById("xxjdjj"+i).className='axx';}
document.getElementById("xxjdjj"+nn).className='bxx';
nn++;if(nn>counts){nn=1;}
tt=setTimeout('change_img()',4000);}
function changeimg(n){nn=n;window.clearInterval(tt);change_img();}
document.write('<style>');
document.write('.axx{padding:1px 7px;border-left:#cccccc 1px solid;}');
document.write('a.axx:link,a.axx:visited{text-decoration:none;color:#fff;line-height:12px;font:9px sans-serif;background-color:#666;}');
document.write('a.axx:active,a.axx:hover{text-decoration:none;color:#fff;line-height:12px;font:9px sans-serif;background-color:#999;}');
document.write('.bxx{padding:1px 7px;border-left:#cccccc 1px solid;}');
document.write('a.bxx:link,a.bxx:visited{text-decoration:none;color:#fff;line-height:12px;font:9px sans-serif;background-color:#D34600;}');
document.write('a.bxx:active,a.bxx:hover{text-decoration:none;color:#fff;line-height:12px;font:9px sans-serif;background-color:#D34600;}');
document.write('</style>');
document.write('<div style="width:'+widths+'px;height:'+heights+'px;overflow:hidden;text-overflow:clip;">');
document.write('<div><a id="url"><img id="pic" style="border:0px;filter:progid:dximagetransform.microsoft.wipe(gradientsize=1.0,wipestyle=4, motion=forward)" width='+widths+' height='+heights+' /></a></div>');
document.write('<div style="filter:alpha(style=1,opacity=10,finishOpacity=80);background: #888888;width:100%-2px;text-align:right;top:-12px;position:relative;margin:1px;height:12px;padding:0px;margin:0px;border:0px;">');
for(var i=1;i<counts+1;i++){document.write('<a href="javascript:changeimg('+i+');" id="xxjdjj'+i+'" class="axx" target="_self">'+i+'</a>');}
document.write('</div></div>');
change_img();
    </script></td>
  </tr>
  <tr background="images/login/buu.jpg">
    <td height="143" align="center">
	<table width="286" border="0" cellspacing="0" cellpadding="0" height="122">
      <tr>
        <td width="60"> 登陆名: </td>
        <td colspan="8"><input type="text" name="logName" value="">        </td>
      </tr>
      <tr>
        <td width="60"> 密码: </td>
        <td colspan="8"><input type="password" name="logPwd" size="22" value="">        </td>
      </tr>
      <tr>
        <td width="60">验证码：</td>
        <td width="53"><input type="text" name="test" size="6"></td>
        <td width="63">
		<table  id="backgroundTb" cellpadding="0" cellspacing="0" background="img/img10.jpg" width="60"  height="40" style="font-size: 40px; font-weight: 600;">
        <tr >
          <td width="20" id="code1" style="font-size:18px"></td>
          <td width="20" id="code2" style="font-size:18px"></td>
          <td width="20" id="code3" style="font-size:18px"></td>
          <td width="20" id="code4" style="font-size:18px"></td>
		 
        </tr>
      </table>
      </td>
     
         <td width="62"  font-weight:500; font-family:Georgia, "Times New Roman", Times, "serif" onMouseDown="nextCodes()" >换一张</td>
        </tr>
      <tr>
        <td>&nbsp;</td>
        
        <td><input type="Submit" name="login" value="登录"  ></td>
        <td colspan="7" align="center"><input  type="Reset" name="reset" value="取消"></td>
        <td width="19" height="30">
      
        <!--  &nbsp;&nbsp;<A href="#">
					 <img height=19 src="images/login_en.gif" width=72 border=0>
					</A>
					&nbsp;&nbsp;
					<A onclick=window.close() href="#">
					  <img height=19 src="images/cancel_en.gif" width=72 border=0>
					</A>
					-->
					
					</td>

        </tr>
        </table>
 
  </td>
  
  </tr>

  <tr>
    <td height="69" background="images/login/bu.jpg"><div align="center">
      <p>版权所有</p>
      <p>员工管理信息系统 </p>
    </div></td>
  </tr>
</table>
<input type="hidden" id="codes"/>	
</form>	
</BODY>
</html>
<script>
		if (ieSupported == false) {
			document.write("<html><body>The system only supports Microsoft Internet Explorer!</body></html>");
		}
</script>
<script>
//right click Menu
function lockContextmenu(event) {
	if (event == null) {
		window.event.returnValue=false;
		return false;
	} else {
		event.returnValue=false;
		return false;
	}
}
document.oncontextmenu=lockContextmenu;
nextCodes();
</script>
