package com.chinasoft.sms.electionicdoc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.electionicdoc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class QueryPersonalAction extends ActionSupport implements ServletRequestAware {
	private String searchType;//查询信息的类型编号0，1，2，3……
	private String conditionValue;//查询的内容，比如按姓名，工号等……
	private UserService userService;
	private List<Basicinfo> results;
	private HttpServletRequest request;
	private String name;


	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request=arg0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Basicinfo> getResults() {
		return results;
	}

	public void setResults(List<Basicinfo> results) {
		this.results = results;
	}

	public String execute() throws Exception {
		Basicinfo basicinfo = (Basicinfo)request.getSession().getAttribute("user");
		name = basicinfo.getName();
		results = userService.query("0", name);
		return SUCCESS;
	}
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getConditionValue() {
		return conditionValue;
	}
	public void setConditionValue(String conditionValue) {
		this.conditionValue = conditionValue;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
