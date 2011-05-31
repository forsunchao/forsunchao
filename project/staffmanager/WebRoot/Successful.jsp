<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    
    <title>My JSP 'success.jsp' starting page</title>

  </head>
  
  <body>
   <!-- <form>
    id:<input type="text" name="id"><br><br>
    content:<input type="text" name="content"><br>
    </form> -->
    
    <table>
			<tr>
				<td>
					题库编号
				</td>
				<td>
					题库内容
				</td>
			</tr>

			<tr>
				<td>
					 <input type="text" readonly="true"  value="<s:property value='checklibraryinfo.checklibraryId' />"/>
				</td>
				<td>
					<input type="text"  value="<s:property value='checklibraryinfo.checklibraryContent' />">
				</td>
			</tr>
		</table>
  </body>
</html>
