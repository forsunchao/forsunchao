package org.sunchao.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login2Action extends ActionSupport{
	/**
	 * 第二种获取方法:非IoC，用的比较少
	 * ActionContext get(Object) ,getSession, getApplication这三个方法能够获取Map类型的request,session,application
	 * 获取时首先获取一个ActionContext对象，然后再调用上面三个方法
	 * 注意，如果使用此方法，必须在execute()方法中进行初始化
	 */
	private String username;
	private String password;
	ActionContext context;
	
	Map request;//获取request对象
	Map	session;
	Map application;
	
	public String execute() {
		if(username.trim().equals("sunchao") && password.trim().equals("123456")) {
			context = ActionContext.getContext();
			request = (Map)context.get("request");
			session = context.getSession();
			application = context.getApplication();
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
