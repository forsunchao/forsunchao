package com.chinasoft.sms.admin.action;

import com.chinasoft.sms.admin.service.UserService;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport{
	private UserService userService;
	private Basicinfo basicinfo;
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public Basicinfo getBasicinfo() {
		return basicinfo;
	}

	public void setBasicinfo(Basicinfo basicinfo) {
		this.basicinfo = basicinfo;
	}

	@Override
	public String execute() throws Exception {
		userService.updateUser(basicinfo);
		return SUCCESS;
	}
	
	
	
}
