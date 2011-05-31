<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="com.chinasoft.sms.contract.action.PieChartAction " %>
<%@ page import="java.io.PrintWriter"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
    <head>
    <link rel="stylesheet" type="text/css" href="css/style1.css"/>
		<TITLE>报表</TITLE>
	</HEAD>
	<BODY>

		<!-- Begin Wrapper -->
		<div id="wrapper">
			<div id="header"></div>
			
			<div id="righttop"></div>
			<!-- Begin Right Column -->
			<div id="rightcolumn">
				<%
					PieChartAction  pie = new PieChartAction ();
					String filename = pie.generatePieChart(request, session,
					        new PrintWriter(out));
					String graphURL = request.getContextPath()+ "/servlet/DisplayChart?filename=" + filename;
				%>
				<p align="center">
					<img src="<%=graphURL%>" width=700 height=500 border=0
						usemap="#<%= filename %>" />
				</p>
			</div>
			<!-- End Right Column -->

			<div id="rightbottom"></div>
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
	</BODY>
</HTML>
