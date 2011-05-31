package org.sunchao.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{//多实现这3个接口
	/**
	 * 第一种获取方法:IoC模式，比较推荐用
	 *
	 * 不需要初始化
	 * 
	 */
	private String username;
	private String password;
	//ActionContext context;这个不需要了
	
	Map request;//获取request对象
	Map	session;
	Map application;
	
	public void setRequest(Map request) {
		this.request = request;
	}

	public void setSession(Map session) {
		this.session = session;
	}
	
	public void setApplication(Map application) {
		this.application = application;
	}

	public String execute() {
		if(username.trim().equals("sunchao") && password.trim().equals("123456")) {
			/*context = ActionContext.getContext();
			request = (Map)context.get("request");
			session = context.getSession();
			application = context.getApplication();*/
			
			request.put("req", "request属性");
			session.put("ses", "session属性");
			application.put("app", "app属性");
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
