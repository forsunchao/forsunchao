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
<title>员工电子档案</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
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
			<form action="search.do" method="post" name="" id="">
			<li><a href="#" title="search">查询员工信息</a></li>
			
			<li>
			  <label>
			  <select name="searchType">
                <option value="0">姓名</option>
				<option value="1">员工号</option>
				<option value="2">部门</option>
				<option value="3">学历</option>
				<option value="4">婚否</option>
              </select>
			  </label>
			</li>
			<li>
			  <input name="conditionValue" type="text" size="20"/>
			   <li> <input type="image" src="images/search.gif" alt="go" width="24" height="24" onclick="this.form.submit()"/></li>
			   </form>
			   <li><a href="searchModUser.jsp" title="modify">修改员工信息</a></li>
			   <li><a href="addUser.jsp" title="insert">录入员工信息</a></li>
			<li><a href="login.jsp" title="logout">注销返回</a></li>
			<li><a href="#" title="consearch"></a></li>
		</ul>
                        </div>
           </div>
                        <div id="leftnavbottom"></div>

                  <div class="clear"></div>

             <div class="news">
                <h3>员工动态</h3>
                <h4>09.14.2010.</h4>
                     <p>2010年第一季度新签合同金额大幅增长。1-3月公司新签合同额累计167.56亿元，同比增长43.27% ... <a href="#">read more</a>  </p>


               <h4>09.09.2010.</h4>
                     <p>新签国际工程合同额折合71.01亿元，约占新签合同总额的42.38%；新签国内外水电工程合同额112.35亿元，约占新签合同总额的67.05%... <a href="#">read more</a>   </p>

           </div>
                  <div class="clear"></div>
             <div class="newsbottom"></div>
		 
		 </div>
		 <!-- End Left Column -->
 
                 <div id="righttop"></div>
		 
		 <!-- Begin Right Column -->
		 <div id="rightcolumn">
		       
                <h2>人事部电子档案管理</h2>
                <img src="images/1.png" class="floatTL" alt="image" width="95"/>
                <p>你好：###，欢迎你来到此界面！身份：######;员工：###################。 电子档案管理系统,通过建立统一的标准，规范整个电子文件管理，包括规范各业务系统的电子文件管理；构建完整的电子档案资源信息共享服务平台，支持档案管  理全过程的信息化处理，包括：采集、移交接收、归档、存储管理、借阅利用和编研发布等等，同时逐步将业务管理模式转换为服务化管理模式，以服务模型为业务  管理基础，业务流和数据流建立在以服务为模型的系统平台之上。  </p>	

               <div id="boxes">
                  <hr class="floatTL" />
                </div>	
				 <div>
				  <form action="search.do" method="post">
   		请输入要修改员工的：<select name="searchType">
				<option value="0">姓名</option>
				<option value="1">员工号</option>
				<option value="2">部门</option>
				<option value="3">学历</option>
				<option value="4">婚否</option>
		</select>
		<input type="text" name="conditionValue">
		<input type="submit" value="Search">
   </form>
   <jsp:include page="electionicdoc_foot.jsp"></jsp:include> 
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
 </center>
</body>
</html>
