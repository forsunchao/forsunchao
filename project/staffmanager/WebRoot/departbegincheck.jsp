<%@ page language="java"  pageEncoding="utf-8" isELIgnored="true"%>
                                                                   
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>出现考核须知的页面</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />

</head>

<body>
<center/>
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
		      <h2>部门经理开始审核</h2>
                <img src="images/3.png" class="floatTL" alt="image" width="95"/>
                <p>本次考核适用于所有的员工，所有的员工应该秉着城市信用的原则参与考核，所有的参评人员都应该秉着公平公正的原则对员工进行考核，所有的考核结果将会告知员工本人，不得透露他人的考核信息，以免引起不必要的麻烦！<br /> </p>	

                <div id="boxes">
                  <hr class="floatTL" />
                </div>	
                <div>
                <form action="submitCheckto.do" method="post">
请在此输入审核成绩：<input type="text" name="totalscore"><br><br>

请进行评价：<br><br>
<textarea name="beizhu" rows="12" cols="55" type="text"></textarea>
<br><br>
下一审核人：    总经理<input type="text" name="nextcheckor" value="王sir"/>
<br>
<input type="submit" value="提交">
</form>
		        </div>		 
         </div>
		 <!-- End Right Column -->

                 <div id="rightbottom">
                 
                 </div>
		 
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

