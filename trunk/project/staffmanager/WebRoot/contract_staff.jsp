<%@ page contentType="text/html;charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
   <base href="<%=basePath%>">
<title>员工电子合同</title>
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
			     <li><a>查询：</a></li>
			     
                 </ul><a href="sms/contract/doquery.do?searchType=9&conditionValue=${sessionScope.user.staffNumber}">我的合同</a>
               </div>
           </div>
           <div id="leftnavbottom"></div>

                 <div class="clear"></div>

             <div class="news">
                <h3>员工动态</h3>
                <h4>09.18.2010</h4>
                     <p>2010年第一季度新签合同金额大幅增长。1-3月公司新签合同额累计167.56亿元，同比增长43.27% ... <a href="#">详细信息</a></p>


               <h4>09.13.2010</h4>
                     <p>新签国际工程合同额折合71.01亿元，约占新签合同总额的42.38%；新签国内外水电工程合同额112.35亿元，约占新签合同总额的67.05%... <a href="#">详细信息</a></p>

           </div>
                  
				  <div class="clear"></div>
                  <div class="newsbottom"></div>
		 
		 </div>
		 <!-- End Left Column -->
 
                 <div id="righttop"></div>
		 
		 <!-- Begin Right Column -->
		 <div id="rightcolumn">
		       
                <h2>员工电子合同管理</h2>
                <img src="images/2.png" class="floatTL" alt="image" width="95"/>
                <p>合同管理必须解决实际业务管理中的问题，专注于企业合同管理的动态化、智能化、网络化，为企业提供合理的流程和业务约束以及全方位的合同管理功能，包括合同起草、合同审批、文本管理、履约监督、结算安排、智能提醒合同收付款、项目管理、合同结款情况统计分析、报表输出和决策支持等。</p>	

                <div id="boxes">
                  <hr class="floatTL" />
           </div>	 
				 
				 <div>
				  <img src="images/B2.jpg" class="floatTL" alt="image" width="500" height="400"/> 
		   </div> 
				  <div>
				  <a href="#"><img src="images/button/03.gif" alt="image" class="floatTL"/></a><a href="#"><img src="images/button/04.gif"  alt="image" class="floatTR"/></a></div> 
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
