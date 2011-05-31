<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>人事部考核界面</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="onclock.js"></script>
</head>

<body onLoad="clockon(bgclock)">
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
		 
		 <!-- Begin Navigation -->
         <div id="navigation">
<ul>
                <li><a href="index.jsp">首页</a></li>
				<li>
							<a href="myaccount.jsp">我的账户</a>
						</li>
						<li>
							<a href="index_doc.jsp">电子档案</a>
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
			<li><a href="#" title="">发起考核</a></li>   
			<li><a href="#" title="">关闭考核</a></li>
			 <li><a href="getAllAction.do" title="">更新考核库</a></li>
			 <li><a href="#" title="">查看考核流程</a></li>
			  <li><a href="#" title="">考核结果汇总</a></li>  
		</ul>
              </div>
           </div>
                        <div id="leftnavbottom"></div>

                  <div class="clear"></div>

             <div class="news">
                <h3>员工动态</h3>
                <h4><div id="bgclock" class="word_Green"></div></h4>
                     <p>2010年第一季度新签合同金额大幅增长。1-3月公司新签合同额累计167.56亿元，同比增长43.27% ...              <a href="#">详细信息</a>  </p>


               <h4>09.09.2010.</h4>
                     <p>新签国际工程合同额折合71.01亿元，约占新签合同总额的42.38%；新签国内外水电工程合同额112.35亿元，约占新签合同总额的67.05%... <a href="#">详细信息</a>   </p>

           </div>
                  <div class="clear"></div>
             <div class="newsbottom"></div>
		 
		 </div>
		 <!-- End Left Column -->
 
                 <div id="righttop"></div>
		 
		 <!-- Begin Right Column -->
		 <div id="rightcolumn">
		       
                <h2>人事部考核界面</h2>
                <img src="images/3.png" class="floatTL" alt="image" width="95"/>
                <p>合同管理必须解决实际业务管理中的问题，专注于企业合同管理的动态化、智能化、网络化，为企业提供合理的流程和业务约束以及全方位的合同管理功能，包括合同起草、合同审批、文本管理、履约监督、结算安排、智能提醒合同收付款、项目管理、合同结款情况统计分析、报表输出和决策支持等。 </p>	

                <div id="boxes">
                  <hr class="floatTL" />
                </div>	
				 <div>
				 <form action="checkchoose.do">
				 <table align="center">
				  <tr>
				  
	             <td align="center">
	             <select name="paperid" class="selectclass">
	             <option value="3">
				 <font size=3px>3</font></option>
				   <option value="2">
				 <font size=3px>2</font></option>
				   <option value="1">
				 <font size=3px>1</font></option>
				 <option value="4">
				 				 <font size=3px>4</font></option>
				   <option value="5">
				 <font size=3px>5</font></option>
				   <option value="6">
				 <font size=3px>6</font></option>
				 				   <option value="7">
				 <font size=3px>7</font></option>
				   <option value="8">
				 <font size=3px>8</font></option></select>
				 </td>
				  </tr>
				  <tr><input type="submit" name="Submit" value="提交" /></tr>
				  
			</table>
		   </div> 
				  <div>
				  <a href="#"><img src="images/button/04.gif" alt="image" class="floatTL"/></a>
				   <a href="#">  <img src="images/button/03.gif" alt="image" class="floatTR"/></a>		        
				    </div>  
		 
		 </div>
		 <!-- End Right Column -->

                 <div id="rightbottom"> </div>
		 
		 <!-- Begin Footer -->

		       
 <div id="footer">
 <p></p>
 
	<p id="legal">15UP &copy; 2010 by 15UP.com   Designed by <a href="#">15UP.html</a></p>

</div>		
			    

		 <!-- End Footer -->
		 
   </div>
   <!-- End Wrapper -->
   
</body>
</html>

