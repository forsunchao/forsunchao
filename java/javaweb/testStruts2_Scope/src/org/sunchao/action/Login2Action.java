package org.sunchao.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login2Action extends ActionSupport{
	/**
	 * �ڶ��ֻ�ȡ����:��IoC���õıȽ���
	 * ActionContext get(Object) ,getSession, getApplication�����������ܹ���ȡMap���͵�request,session,application
	 * ��ȡʱ���Ȼ�ȡһ��ActionContext����Ȼ���ٵ���������������
	 * ע�⣬���ʹ�ô˷�����������execute()�����н��г�ʼ��
	 */
	private String username;
	private String password;
	ActionContext context;
	
	Map request;//��ȡrequest����
	Map	session;
	Map application;
	
	public String execute() {
		if(username.trim().equals("sunchao") && password.trim().equals("123456")) {
			context = ActionContext.getContext();
			request = (Map)context.get("request");
			session = context.getSession();
			application = context.getApplication();
			request.put("req", "request����");
			session.put("ses", "session����");
			application.put("app", "app����");
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
