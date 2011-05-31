package org.sunchao.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private int role;		//用于判断登陆的权限
	private String nextActionName;//下一个action的名字
	public String execute() throws Exception {
		if(username != null && password != null) {
			if(role == 1) {
				this.nextActionName = "admin";
			} else {
				this.nextActionName = "user";
			}
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getNextActionName() {
		return nextActionName;
	}
	public void setNextActionName(String nextActionName) {
		this.nextActionName = nextActionName;
	}
}
