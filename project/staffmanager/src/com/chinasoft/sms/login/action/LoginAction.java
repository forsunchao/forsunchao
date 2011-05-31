package com.chinasoft.sms.login.action;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.login.service.LoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author jian.yao date 2010-09-18 用户登录验证
 */
//加了session功能，implements ServletRequestAware
public class LoginAction extends ActionSupport implements ServletRequestAware{

	// 用户名
	private String logName;
	// 密码
	private String logPwd;
	LoginService loginservice;
	
	HttpServletRequest request;


	public LoginAction() {
		
   //System.out.println("实例化LoginAction...........");
	}

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String execute() {
		Basicinfo flag= loginservice.userLogin(logName, logPwd);
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get

(ServletActionContext.HTTP_REQUEST);
		request.getSession().setAttribute("user", flag);
//		request.getSession().setAttribute("user_key", flag);
//		request.getSession().setAttribute(arg0, arg1)
		if(null==flag ||null==flag.getRole())
		{
			JOptionPane.showMessageDialog(null,"请您输入正确的用户名或密码!");
			return "noLogin";
		}
		else
		{
			if(flag.getRole()==0)
			{
				return "administrator";
			}
			else
			return "success";
		}
	}

	public String getLogPwd() {
		return logPwd;
	}

	public void setLogPwd(String logPwd) {
		this.logPwd = logPwd;
	}
	public LoginService getLoginservice() {
		return loginservice;
	}

	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}


	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}


}
