<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="true"%>
<%@page import="com.chinasoft.sms.check.pojo.Basicinfo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	        + request.getServerName() + ":" + request.getServerPort()
	        + path + "/";
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

<<<<<<< .mine
			   
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
			<li>s</li>
		</ul>
                        </div>
           </div>
                        <div id="leftnavbottom"></div>
=======
				</div>
				<!-- End Navigation -->
>>>>>>> .r1266

				<div class="clear"></div>

				<!-- Begin Left Column -->
				<div id="leftcolumn">

					<div id="leftnav">

						<div class="col">
							<ul>
								<li>
									<a href="#" title="search">查询员工信息</a>
								</li>

								<li>
									<label>
										<select name="searchType">
											<option value="0">
												姓名
											</option>
											<option value="1">
												员工号
											</option>
											<option value="2">
												部门
											</option>
											<option value="3">
												学历
											</option>
											<option value="4">
												婚否
											</option>
										</select>
									</label>
								</li>
								<li>
									<input name="conditionValue" type="text" size="20" />
								<li>
									<input type="image" src="images/search.gif" alt="go" width="24"
										height="24" onclick="this.form.submit()" />
								</li>

<<<<<<< .mine
               <div id="boxes">
                  <hr class="floatTL" />
                </div>	
				 <div>
				  <center><h3>修改员工信息</h3></center>
  	<form action="update.do" method="post">
  		<table border="1">
  			<tr>
  				<td>身份证号：</td>
  				<td>
  					<input type="text" name="basicinfo.personid" value="<s:property value="basicinfo.staffNumber" />">
  				</td>
  			</tr>
  			<tr>
  				<td>姓名：</td>
  				<td><input type="text" name="basicinfo.name" value="<s:property value="basicinfo.name" />"></td>
  			</tr>
  			<tr> 
  				<td>英文名：</td>
  				<td><input type="text" name="basicinfo.enname" value="<s:property value="basicinfo.enname" />" ></td>
  			</tr>
  			<tr>
  				<td>密码：</td>
  				<td><input type="password" name="basicinfo.password" value="<s:property value="basicinfo.personId" />"></td>
  			</tr>
  			<tr>
  				<td>生日：</td>
  				<td><input type="text" name="basicinfo.birthday" value="<s:property value="basicinfo.birthday" />"></td>
  			</tr>
  			<tr>
  				<td>籍贯：</td>
  				<td><input type="text" name="basicinfo.nation" value="<s:property value="basicinfo.nation" />"></td>
  			</tr>
  			<tr>
  				<td>教育：</td>
  				<td>
                    <select name="basicinfo.education">
						<c:if test="${requestScope.basicinfo.education=='硕士'}">
							<option value="硕士" selected="selected">硕士</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education!='硕士'}">
							<option value="硕士">硕士</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education=='博士'}">
							<option value="博士" selected="selected">博士</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education!='博士'}">
							<option value="博士">博士</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education=='本科'}">
							<option value="本科" selected="selected">本科</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education!='本科'}">
							<option value="本科">本科</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education=='专科'}">
							<option value="专科" selected="selected">专科</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education!='专科'}">
							<option value="专科">专科</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education=='高中'}">
							<option value="高中" selected="selected">高中</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education!='高中'}">
							<option value="高中">高中</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education=='其他'}">
							<option value="其他" selected="selected">其他</option>
						</c:if>
						<c:if test="${requestScope.basicinfo.education!='其他'}">
							<option value="其他" >其他</option>
						</c:if>
					</select>
				</td>
  			</tr>
  			<tr>
  				<td>婚否：</td>
  				<td><input type="radio" checked="checked" name="basicinfo.ismarried" value="Y">是&nbsp;<input type="radio" name="basicinfo.ismarried" value="N">否</td>
  			</tr>
  			<tr>
  				<td>所属部门：</td>
  				<td>
  					<select name="basicinfo.department">
  				        <c:if test="${requestScope.basicinfo.department}=='项目部'">
  							<option value="项目部" selected="selected">项目部</option>
  						</c:if>
  						<c:if test="${requestScope.basicinfo.department}!='项目部'">
  							<option value="项目部">项目部</option>
  					    </c:if>
  					   
					    <c:if test="${requestScope.basicinfo.department}=='技术部'">
  							<option value="技术部" selected="selected">技术部</option>
  						</c:if>
  						<c:if test="${requestScope.basicinfo.department}!='技术部'">
  							<option value="技术部">技术部</option>
  					    </c:if>
  					   
						<c:if test="${requestScope.basicinfo.department}=='支撑部'">
  							<option value="支撑部" selected="selected">支撑部</option>
  						</c:if>
  						<c:if test="${requestScope.basicinfo.department}!='支撑部'">
  							<option value="支撑部">支撑部</option>
  					    </c:if>
  					   
						<c:if test="${requestScope.basicinfo.department}=='人事部'">
  							<option value="人事部" selected="selected">人事部</option>
  						</c:if>
  						<c:if test="${requestScope.basicinfo.department}!='人事部'">
  							<option value="人事部">人事部</option>
  					    </c:if>
  					    
  					    <c:if test="${requestScope.basicinfo.department}=='其他部门'">
  							<option value="其他部门" selected="selected">其他部门</option>
  						</c:if>
  						<c:if test="${requestScope.basicinfo.department}!='其他部门'">
  							<option value="其他部门">其他部门</option>
  					    </c:if>
				  </select>
  				</td>
  			</tr>
  			<tr>
  				<td>权限：</td>
  				<td>
					<select name="basicinfo.role">
  				        <c:if test="${requestScope.basicinfo.role}=='0'">
  							<option value="0" selected="selected">管理员</option>
  						</c:if>
  						<c:if test="${requestScope.basicinfo.role}!='0'">
  							<option value="0">管理员</option>
  					    </c:if>
  					   
					    <c:if test="${requestScope.basicinfo.role}=='1'">
  							<option value="1" selected="selected">经理</option>
  						</c:if>
  						<c:if test="${requestScope.basicinfo.role}!='1'">
  							<option value="1">经理</option>
  					    </c:if>
  					   
						<c:if test="${requestScope.basicinfo.role}=='2'">
  							<option value="2" selected="selected">人事部</option>
  						</c:if>
  						<c:if test="${requestScope.basicinfo.role}!='2'">
  							<option value="2">人事部</option>
  					    </c:if>
  					   
						<c:if test="${requestScope.basicinfo.role}=='3'">
  							<option value="3" selected="selected" >普通员工</option>
  						</c:if>
  						<c:if test="${requestScope.basicinfo.role}!='3'">
  							<option value="3">普通员工</option>
  					    </c:if>
				  </select>
  				</td>
  			</tr>
  			<tr>
  				<td><input type="submit" value="保存"></td>
  				<td><input type="reset" value="取消"></td>
  			</tr>
  		</table>
  	</form>
  	<jsp:include page="electionicdoc_foot.jsp"></jsp:include>
		   </div> 
				  <div>
				  <a href="#"><img src="images/button/04.gif" alt="image" class="floatTL"/></a>
				   <a href="#">  <img src="images/button/03.gif" alt="image" class="floatTR"/></a>		        
				    </div>  
		 
		 </div>
		 <!-- End Right Column -->
=======
								<li>
									<a href="searchModUser.jsp" title="modify">修改员工信息</a>
								</li>
								<li>
									<a href="addUser.jsp" title="insert">录入员工信息</a>
								</li>
								<li>
									<a href="login.jsp" title="logout">注销返回</a>
								</li>
								<li>
									<a href="#" title="consearch"></a>
								</li>
							</ul>
						</div>
					</div>
					<div id="leftnavbottom"></div>
>>>>>>> .r1266

					<div class="clear"></div>

					<div class="news">
						<h3>
							员工动态
						</h3>
						<h4>
							09.14.2010.
						</h4>
						<p>
							2010年第一季度新签合同金额大幅增长。1-3月公司新签合同额累计167.56亿元，同比增长43.27% ...
							<a href="#">read more</a>
						</p>


						<h4>
							09.09.2010.
						</h4>
						<p>
							新签国际工程合同额折合71.01亿元，约占新签合同总额的42.38%；新签国内外水电工程合同额112.35亿元，约占新签合同总额的67.05%...
							<a href="#">read more</a>
						</p>

					</div>
					<div class="clear"></div>
					<div class="newsbottom"></div>

				</div>
				<!-- End Left Column -->

				<div id="righttop"></div>

				<!-- Begin Right Column -->
				<div id="rightcolumn">

					<h2>
						人事部电子档案管理
					</h2>
					<img src="images/1.png" class="floatTL" alt="image" width="95" />
					<p>
						你好：###，欢迎你来到此界面！身份：######;员工：###################。
						电子档案管理系统,通过建立统一的标准，规范整个电子文件管理，包括规范各业务系统的电子文件管理；构建完整的电子档案资源信息共享服务平台，支持档案管
						理全过程的信息化处理，包括：采集、移交接收、归档、存储管理、借阅利用和编研发布等等，同时逐步将业务管理模式转换为服务化管理模式，以服务模型为业务
						管理基础，业务流和数据流建立在以服务为模型的系统平台之上。
					</p>

					<div id="boxes">
						<hr class="floatTL" />
					</div>
					<div>
						<center>
							<h3>
								修改员工信息
							</h3>
						</center>
						<form action="updateBasicinfo.do" method="post">
							<table border="1">

								<tr>
									<td>
										身份证号：
									</td>
									<td>
										<input type="text" name="basicinfo.personId" value="<s:property value="basicinfo.personId" />">
										<input type="hidden" name="basicinfo.staffNumber" value="<s:property value="basicinfo.staffNumber" />">
									</td>
								</tr>
								<tr>
									<td>
										姓名：
									</td>
									<td>
										<input type="text" name="basicinfo.name" value="<s:property value="basicinfo.name" />">
									</td>
								</tr>
								<tr>
									<td>
										英文名：
									</td>
									<td>
										<input type="text" name="basicinfo.enname" value="<s:property value="basicinfo.enname" />">
									</td>
								</tr>
								<tr>
									<td>
										密码：
									</td>
									<td>
										<input type="password" name="basicinfo.password"
											value="<s:property value="basicinfo.password" />">
									</td>
								</tr>
								<tr>
									<td>
										生日：
									</td>
									<td>
										<input type="text" name="basicinfo.birthday"
											value="<s:property value="basicinfo.birthday" />">
									</td>
								</tr>
								<tr>
									<td>
										籍贯：
									</td>
									<td>
										<input type="text" name="basicinfo.nation"
											value="<s:property value="basicinfo.nation" />">
									</td>
								</tr>
								<tr>
									<td>
										教育：
									</td>
									<td>
										<select name="basicinfo.education">
											<c:if test="${requestScope.basicinfo.education=='硕士'}">
											<option value="硕士" selected="selected">硕士</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education!='硕士'}">
											<option value="硕士">硕士</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education=='博士'}">
											<option value="博士" selected="selected">博士</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education!='博士'}">
											<option value="博士">博士</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education=='本科'}">
											<option value="本科" selected="selected">本科</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education!='本科'}">
											<option value="本科">本科</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education=='专科'}">
											<option value="专科" selected="selected">专科</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education!='专科'}">
											<option value="专科">专科</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education=='高中'}">
											<option value="高中" selected="selected">高中</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education!='高中'}">
											<option value="高中">高中</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education=='其他'}">
											<option value="其他" selected="selected">其他</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.education!='其他'}">
											<option value="其他" >其他</option>
											</c:if>
								            <c:if test="${requestScope.basicinfo.education==null}">
											<option value="其他" selected="selected">其他</option>
											</c:if>

										</select>
									</td>
								</tr>
								<tr>
									<td>
										婚否：
									</td>
									<td>
									    <c:if test="${requestScope.basicinfo.ismarried=='T'}">
										<input type="radio" checked="checked" name="basicinfo.ismarried" value="T">
										</c:if>
										<c:if test="${requestScope.basicinfo.ismarried!='T'}">
										<input type="radio"  name="basicinfo.ismarried" value="T">
										</c:if>
										是&nbsp;
										<c:if test="${requestScope.basicinfo.ismarried=='F'}">
										<input type="radio" checked="checked" name="basicinfo.ismarried" value="F">
										</c:if>
										<c:if test="${requestScope.basicinfo.ismarried!='F'}">
										<input type="radio"  name="basicinfo.ismarried" value="F">
										</c:if>
										否
									</td>
								</tr>
								<tr>
									<td>
										所属部门：
									</td>
									<td>
										<select name="basicinfo.department">
											
											<c:if test="${requestScope.basicinfo.department=='项目部'}">
											<option value="项目部" selected="selected">项目部</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department!='项目部'}">
											<option value="项目部">项目部</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department=='技术部'}">
											<option value="技术部" selected="selected">技术部</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department!='技术部'}">
											<option value="技术部">技术部</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department=='支撑部'}">
											<option value="支撑部" selected="selected">支撑部</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department!='支撑部'}">
											<option value="支撑部">支撑部</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department=='人事部'}">
											<option value="人事部" selected="selected">人事部</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department!='人事部'}">
											<option value="人事部">人事部</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department=='其他部门'}">
											<option value="其他部门" selected="selected">其他部门</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department!='其他部门'}">
											<option value="其他部门">其他部门</option>
											</c:if>
											 <c:if test="${requestScope.basicinfo.department==null}">
											<option value="其他" selected="selected">其他</option>
											</c:if>
											
										</select>
									</td>
								</tr>
								<tr>
									<td>
										权限：
									</td>
									<td>
										<select name="basicinfo.role">
										<c:if test="${requestScope.basicinfo.role=='0'}">
											<option value="0" selected="selected">管理员</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department!='0'}">
											<option value="0">管理员</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.role=='1'}">
											<option value="1" selected="selected">经理</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department!='1'}">
											<option value="1">经理</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.role=='2'}">
											<option value="2" selected="selected">人事部</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department!='2'}">
											<option value="2">人事部</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.role=='3'}">
											<option value="3" selected="selected">普通员工</option>
											</c:if>
											<c:if test="${requestScope.basicinfo.department!='3'}">
											<option value="3">普通员工</option>
											</c:if>
										</select>
									</td>
								</tr>
								<tr>
									<td>
										<input type="submit" value="保存">
									</td>
									<td>
										<input type="reset" value="取消">
									</td>
								</tr>

							</table>
						</form>
						<jsp:include page="electionicdoc_foot.jsp"></jsp:include>
					</div>
					<div>
						<a href="#"><img src="images/button/04.gif" alt="image"
								class="floatTL" />
						</a>
						<a href="#"> <img src="images/button/03.gif" alt="image"
								class="floatTR" />
						</a>
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
		</center>
	</body>
</html>


