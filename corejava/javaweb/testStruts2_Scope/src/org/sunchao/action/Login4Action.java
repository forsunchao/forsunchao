package org.sunchao.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login4Action extends ActionSupport implements ServletRequestAware,ServletContextAware{
	/**
	 * �����ֻ�ȡ����:��Servlet�󶨣�IoC
	 * 
	 * ServletActionContext
	 * 
	 * �����ӿ�ServletRequestAware,ServletContextAware
	 */
	private String username;
	private String password;
	ActionContext context;
	
	HttpServletRequest request;//��ȡrequest����
	HttpSession	session;
	ServletContext application;
	
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setServletContext(ServletContext application) {
		this.application = application;
	}
	public String execute() {
		if(username.trim().equals("sunchao") && password.trim().equals("123456")) {
			
			session = request.getSession();//����ֻ��session
			
			request.setAttribute("req", "Login4Action��request����");
			session.setAttribute("ses", "Login4Action��session����");
			application.setAttribute("app", "Login4Action��application����");
			
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
