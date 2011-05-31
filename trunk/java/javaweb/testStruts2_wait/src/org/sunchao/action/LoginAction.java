package org.sunchao.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String username;
	private String password;
	private Map session;
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
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			session.put("login", "µÇÂ¼³É¹¦");
			return SUCCESS;
		} else {
			return LOGIN;
		}
	}
	public void setSession(Map session) {
		this.session = session;
	}
}
