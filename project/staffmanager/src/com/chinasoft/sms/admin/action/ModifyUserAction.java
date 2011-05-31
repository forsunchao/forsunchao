package com.chinasoft.sms.admin.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.admin.service.UserService;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ModifyUserAction extends ActionSupport{
      private  String staffNumber;
      private Basicinfo basicinfo;
      private UserService userService;
	public String getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}
	public Basicinfo getBasicinfo() {
		return basicinfo;
	}
	public void setBasicinfo(Basicinfo basicinfo) {
		this.basicinfo = basicinfo;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("basicinfo",  userService.queryList(staffNumber));
		return SUCCESS;
	}
   
	
      
}
