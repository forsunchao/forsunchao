<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<HTML>
	<head>
	<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>出现考核题目的页面</title>
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<script type="text/javascript">
function checkScore(){
 var  radioArray= document.getElementsByTagName("input");
 var  length=radioArray.length;
 var  radioName=false;
 var  testStr=/^score[[0-9]+]$/;
 var  radios;
 for(var index=0;index<length;index++){
    if(radioArray[index].type=="radio"&&testStr.test(radioArray[index].name)){
        if(radioName==radioArray[index].name){
        continue;
        }
        radioName=radioArray[index].name;
        radios=document.getElementsByName(radioName);
        var count=radios.length;
        var checked=false;
        for(var i=0;i<count;i++){
          if(radios[i].checked){
          checked=true;
          }
        }  
        if(!checked){
        alert("对不起,您还有未选择的考核项");
        return false;
        }    
    } 
   
 } 
  return true;    
}


</script>

	</head>

	<body>
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
					<h3>
						公司动态
					</h3>
					<h4>
						09.14.2010.
					</h4>
					<p>
						2010年第一季度新签合同金额大幅增长。1-3月公司新签合同额累计167.56亿元，同比增长43.27% ...
						<a href="#">详细信息</a>
					</p>


					<h4>
						09.09.2010.
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

				<table align="center">
					<h2>
						部门经理考核页面
					</h2>
				</table>
				<img src="images/3.png" class="floatTL" alt="image" width="95" />
				<p>
					本次考核适用于所有的员工，所有的员工应该秉着城市信用的原则参与考核，所有的参评人员都应该秉着公平公正的原则对员工进行考核，所有的考核结果将会告知员工本人，不得透露他人的考核信息，以免引起不必要的麻烦！
					<br />
				</p>
				<div id="boxes">
					<hr class="floatTL" />
				</div>
				<div>
					<table align="center">
						<h4>
							2010年**公司员工考核
						</h4>
					</table>
					<hr/>
				</div>
				<div>
					<form action="submitCheck.do" method="post"
						onsubmit="return checkScore();">
						<table align="center" border="1" width="400">
							<tr>
								<td>
									题号
								</td>
								<td>
									考核内容
								</td>
							</tr>
							<s:iterator value="paperList" status="s">

								<tr>
									<td>
										<s:property value="#s.index+1" />
									</td>
									<td>
										<s:property value="paperList[#s.index].checklibraryContent" />
										<br />
										<input type="radio"
											name="score[<s:property value='#s.index'/>]" value="10"
											onclick="isSelected(this.value)" />
										10
										<input type="radio"
											name="score[<s:property value='#s.index'/>]" value="8"
											onclick="isSelected(this.value)" />
										8
										<input type="radio"
											name="score[<s:property value='#s.index'/>]" value="6"
											onclick="isSelected(this.value)" />
										6
										<input type="radio"
											name="score[<s:property value='#s.index'/>]" value="4"
											onclick="isSelected(this.value)" />
										4
										<input type="radio"
											name="score[<s:property value='#s.index'/>]" value="2"
											onclick="isSelected(this.value)" />
										2
										<br/>
									</td>
								</tr>
							</s:iterator>
							<tr>	
							<td>		
							您选择的下一审核人是:</td><td>
							<select name="nextcheckor">
								<s:iterator value="checkperson" status="s">
									<option>
										<s:property value="checkperson[#s.index]" />
									</option>
								</s:iterator>
							</select>
							总经理！</td>
							</tr>
							<tr>
							<<td><input type="submit" name="Submit" value="提交" /></td>
                           </tr>
						</table>
					</form>
				</div>

			</div>
			<!-- End Right Column -->

			<div id="rightbottom">
			</div>

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

	</body>
</html>

