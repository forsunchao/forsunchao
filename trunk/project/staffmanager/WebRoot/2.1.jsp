<%@ page language="java"  import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html >
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>人事部门考核界面</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>

<body>
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
							<a href="sms/login/indexContract.do">电子合同</a></li>
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
			<li><a href="vail.do" title="">参与考核</a></li>   
			<li><a href="checkflow.do?state=0" title="">已审核</a></li>
			 <li><a href="checkflow.do?state=1" title="">未审核</a></li>
			 <li><a href="checkflow.do?state=2" title="">驳回</a></li>  
		</ul>
              </div>
           </div>
                        <div id="leftnavbottom"></div>

                  <div class="clear"></div>

             <div class="news">
                <h3>公司动态</h3>
                <h4>09.14.2010.</h4>
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
		       
                <h2>您已成功完成考核</h2>
                <img src="images/3.png" class="floatTL" alt="image" width="95"/>
                <p>合同管理必须解决实际业务管理中的问题，专注于企业合同管理的动态化、智能化、网络化，为企业提供合理的流程和业务约束以及全方位的合同管理功能，包括合同起草、合同审批、文本管理、履约监督、结算安排、智能提醒合同收付款、项目管理、合同结款情况统计分析、报表输出和决策支持等。 </p>	

                <div id="boxes">
                  <hr class="floatTL" />
                </div>
                <table align="center" hspace="150" vspace="150" height="50" width="450">
                      <font size="8" color="blue">您已成功完成考核！</font><br/>
                         <h3>现在时间是：<br/> 
                       <c:set var = "date" value = "<%=new java.util.Date() %>"/>
                       <fmt:formatDate value="${date}" pattern="yyyy年MM月dd日" type="date" dateStyle="full"/><br/> </h3> 
				</table>
		 
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
  