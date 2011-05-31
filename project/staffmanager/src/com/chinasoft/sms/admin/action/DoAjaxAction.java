package com.chinasoft.sms.admin.action;

import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.admin.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class DoAjaxAction extends ActionSupport {
	UserService userService;
	public String execute() throws Exception {
		HttpServletRequest request= ServletActionContext.getRequest();
		HttpServletResponse response= ServletActionContext.getResponse();
		request.setCharacterEncoding("utf-8");
	     String name= URLDecoder.decode(request.getParameter("name"),"UTF-8");
	     String output="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
	     response.setContentType("text/xml;charset=UTF-8");
	     response.setHeader("Cache-Control", "no-cache");
		PrintWriter out=response.getWriter();
		int num = userService.queryCount(name);
	    if(num>=1)
	    	output+="<response>1</response>";
	     else
	    	 output+="<response>0</response>";  
	     out.println(output);
	     out.close();
	     return null;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	
}
