package com.chinasoft.sms.electionicdoc.action;

import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.electionicdoc.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport
{
	private UserService userService;
	private Long staffNumber;
	private Basicinfo basicinfo;

	public String update() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		HttpServletResponse response = (HttpServletResponse) ctx.get
        (ServletActionContext.HTTP_RESPONSE);
		response.setCharacterEncoding("UTF-8");
		try
		{
		 userService.update(basicinfo);
		}
		catch (Exception e)
		{   
			response.getWriter().print("<script type=\"text/javascript\">alert(\"更新用户信息发生异常\");window.history.back(); </script>");
		    return null;
		}
		response.getWriter().print("<script type=\"text/javascript\">alert(\"修改成功\");window.history.back(); </script>");
		return null;
	}
	
	
	public  String query() throws Exception
	{
	   basicinfo=userService.queryBasicinfoById(staffNumber);
	   return SUCCESS;
	}
	
	public UserService getUserService()
	{
		return userService;
	}

	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}

	public Long getStaffNumber()
	{
		return staffNumber;
	}

	public void setStaffNumber(Long staffNumber)
	{
		this.staffNumber = staffNumber;
	}

	public Basicinfo getBasicinfo()
	{
		return basicinfo;
	}

	public void setBasicinfo(Basicinfo basicinfo)
	{
		this.basicinfo = basicinfo;
	}
}
