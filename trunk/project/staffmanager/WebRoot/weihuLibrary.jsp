<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>人事部考核界面</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="onclock.js"></script>

   <script language="javascript">
   function bb(id){
     document.location="CheckDelectAction.do?id="+id;
   }
      function aa(id){
      
     
   window.location="updatelibrary.jsp?id="+id;
   }
   function CheckAll(form)  {
       for (var i=0;i<form.elements.length;i++){
               var e = form.elements[i];
               if (e.name != 'checkbox')      
                   e.checked = form.checkinfo.checked; 
               }
            }
      function check(){
	      document.all.checkinfo.checked=false
            }			
   </script>
</head>

<body onLoad="clockon(bgclock)">
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
			<li><a href="getAllAction.do" title="">发起考核</a></li>   
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


				 <form  action="getcheckpaperAction.do" method = "post">
				 		<table align="center" border="1" width="400">
				<tr>
					<td>
						             <center><font size=3>数据库更新</font></center>  
					</td>
				</tr>
				<tr>
				<td><input type="checkbox" name="checkinfo" onclick="CheckAll(this.form)"></td>
				<td>题号</td>
				<td>考核内容</td>
				</tr>
				<s:iterator value="results" status="s">
			
					<tr>
						<td>
							<input type="checkbox" name="checkLib" value="<s:property value="results[#s.index].checklibraryId"/>" onclick="check()"/></td>
						<td>
						<s:property value="results[#s.index].checklibraryId" />
						</td>
						<td>
					  <s:property value="results[#s.index].checklibraryContent" />
						</td>
			           <td><input type="button" name="button" value="删除" onclick="bb('<s:property value="results[#s.index].checklibraryId"/>');"></td>
						<td><input type="button" name="button" value="修改" onclick="aa('<s:property value="results[#s.index].checklibraryId"/>')"></td>
					</tr> 
		</s:iterator>
		<tr>
		
		<td>考核内容代号：</td><td><input name="paperid" type="text" /></td>
		<td>
		<input type="submit" name="Submit" value="   提交   " />
        </td>
  		</tr>
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
   </center>
</body>
</html>


