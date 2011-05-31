package org.sunchao.action;

import org.sunchao.vo.User;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String doDefault() {
		return LOGIN;
	}
	public String execute() {
		if(user.getUsername().trim().equals("sunchao") && user.getPassword().trim().equals("123456")) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
