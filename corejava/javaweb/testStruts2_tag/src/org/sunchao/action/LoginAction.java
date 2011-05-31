package org.sunchao.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	private int sex;
	private boolean marry;
	private int[] love;
	private FormAction formAction;
	
	public FormAction getFormAction() {
		return formAction;
	}
	public void setFormAction(FormAction formAction) {
		this.formAction = formAction;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	public int[] getLove() {
		return love;
	}
	public void setLove(int[] love) {
		this.love = love;
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
	
	public String execute() {
		if(username.trim().equals("sunchao") && password.trim().equals("123456")) {
			return "loginSuc";
		} else {
			return "loginFail";
		}
	}
	public boolean isMarry() {
		return marry;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
}
