package com.chinasoft.sms.electionicdoc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.electionicdoc.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DoQueryAction extends ActionSupport {
	private String searchType;//查询信息的类型编号0，1，2，3……
	private String conditionValue;//查询的内容，比如按姓名，工号等……
	private UserService userService;
	private List<Basicinfo> results;
    private List<String>  date;
	private Basicinfo bi;

	public String execute() throws Exception {
		results = userService.query(searchType, conditionValue);
		return SUCCESS;
	}
	public String dodate()throws Exception{

		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		request.getSession().getAttribute("user");
		
		date = userService.querystaffdate(bi);
			return "success";
		}
	public String doquery() throws Exception {
		results = userService.query(searchType, conditionValue);
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("basicinfo", results );
		return SUCCESS;
	}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
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
	public List getResults() {
		return results;
	}
	public void setResults(List results) {
		this.results = results;
	}
}
