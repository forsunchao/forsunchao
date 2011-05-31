package com.chinasoft.sms.admin.action;


import com.chinasoft.sms.admin.service.UserService;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.opensymphony.xwork2.ActionSupport;

public class AddUserAction extends ActionSupport{

	private Basicinfo basicinfo;

	private UserService adduserservice;
	
	public Basicinfo getBasicinfo() {
		return basicinfo;
	}


	public void setBasicinfo(Basicinfo basicinfo) {
		this.basicinfo = basicinfo;
	}


	public UserService getAdduserservice() {
		return adduserservice;
	}


	public void setAdduserservice(UserService adduserservice) {
		this.adduserservice = adduserservice;
	}


	public String execute() throws Exception {
		
		adduserservice.addUser(basicinfo);
		
		return SUCCESS;
	}



     
}
