package com.chinasoft.sms.electionicdoc.action;


import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.electionicdoc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class AddUserAction extends ActionSupport {
	private Basicinfo basicinfo;
	private UserService userService;

	public String execute() throws Exception {
		userService.add(basicinfo);
		return SUCCESS;
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
}
