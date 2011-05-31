package org.sunchao.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login3Action extends ActionSupport{
	/**
	 * 第三种获取方法:与Servlet绑定，非IoC
	 * 
	 * ServletActionContext
	 * 
	 */
	private String username;
	private String password;
	ActionContext context;
	
	HttpServletRequest request;//获取request对象
	HttpSession	session;
	ServletContext application;
	
	public String execute() {
		if(username.trim().equals("sunchao") && password.trim().equals("123456")) {
			request = ServletActionContext.getRequest();
			session = request.getSession();
			application = ServletActionContext.getServletContext();
			
			request.setAttribute("req", "Login3Action的request属性");
			session.setAttribute("ses", "Login3Action的session属性");
			application.setAttribute("app", "Login3Action的application属性");
			
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
}
