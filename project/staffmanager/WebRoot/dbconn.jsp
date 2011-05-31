<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "java.sql.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>出现考核须知的页面</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script language="javascript">
   function changecolor(row){
      document.getElementById(row).style.backgroundColor='#CCCCFF';
   }
   function resetcolor(row){
      document.getElementById(row).style.backgroundColor='';
   }
</script>
</head>

<body>
                   <!-- 数据库连接查询 -->
    <%
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null; 
        Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
        String url = "jdbc:oracle:thin:@localhost:1521:NJETC";
        String name = "staffmanager";
        String password = "manager";
        conn = DriverManager.getConnection(url,name,password); 
        stat = conn.createStatement();
        String sql = "select * from BASICINFO";
        rs = stat.executeQuery(sql);
    %>
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
                <li><a href="0.html">首页</a></li>
				 <li><a href="#">我的账户</a></li>
                <li><a href="#">电子档案</a></li>
                <li><a href="#">电子合同</a></li>
                <li><a href="#">考核</a></li>
                <li><a href="#">e-mail</a></li>
               </ul>	 
			   
		 </div>
		 <!-- End Navigation -->
                  
                  <div class="clear"></div>
		 
		 <!-- Begin Left Column -->
		 <div id="leftcolumn">
		 
			<div id="leftnav">
                        
                        <div class="col">
	        <ul>
			<li><a href="khxz.jsp" title="">参与考核</a></li>
			<li><a href="ckkh.jsp" title="">查看考核进度/结果</a></li>     
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
		       
                <table align="center"><h2>考核须知</h2></table>
                <img src="images/3.png" class="floatTL" alt="image" width="95"/>
                <p>本次考核适用于所有的员工，所有的员工应该秉着城市信用的原则参与考核，所有的参评人员都应该秉着公平公正的原则对员工进行考核，所有的考核结果将会告知员工本人，不得透露他人的考核信息，以免引起不必要的麻烦！<br /> </p>	

                <div id="boxes">
                  <hr class="floatTL" />
                </div>	
				 <div>
				  <table align="center"><h4>考核进度与结果</h4></table>
				  <hr/> 
		         </div>
		         <div>
		         
		         <table width="437" border="1" cellpadding="1" cellspacing="1" align="center" height="84">
                      <tr>
					    
						<th>员工号</th>
					    <th>部门ID</th>
					    <th>姓名</th>
					    <th>English Name</th>
					    <th>密码</th>
					    <th>身份证号码</th>
					    <th>生日</th>
					    <th>种族</th>
					    <th>学历</th>
					    <th>婚否</th>
					    <th>部门</th>
					    <th>角色</th>
					  </tr>
					<%
					  while(rs.next()){
					    out.print("<tr align='center' id='row1' onmouseover='changecolor('row1')' onmouseout='resetcolor('row1')'>");
					    
						out.print("<td>"+ rs.getString("STAFF_NUMBER")+"</td>");
					    out.print("<td>"+ rs.getString("DEPARTMENT_ID")+"</td>");
					    out.print("<td>"+ rs.getString("NAME")+"</td>");
					    out.print("<td>"+ rs.getString("ENNAME")+"</td>");
					    out.print("<td>"+ rs.getString("PASSWORD")+"</td>");
					    out.print("<td>"+ rs.getString("PERSON_ID")+"</td>");
					    out.print("<td>"+ rs.getString("BIRTHDAY")+"</td>");
					    out.print("<td>"+ rs.getString("NATION")+"</td>");
					    out.print("<td>"+ rs.getString("EDUCATION")+"</td>");
					    out.print("<td>"+ rs.getString("ISMARRIED")+"</td>");
					    out.print("<td>"+ rs.getString("DEPARTMENT")+"</td>");
					    out.print("<td>"+ rs.getString("ROLE")+"</td>");
					    out.print("</tr>");
					  }
					  if(rs != null){rs.close();}
					  if(stat != null){stat.close();}
					  if(conn != null){conn.close();}
					  %>
					</table><br />
					<table align="center" width="440" height="47">
					  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="返回" onclick="window.location.href='main.jsp'" align="rjght"/>
					
					</table>
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
   
</body>
</html>

