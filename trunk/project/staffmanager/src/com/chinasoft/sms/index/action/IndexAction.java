package com.chinasoft.sms.index.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.electionicdoc.service.UserService;
import com.chinasoft.sms.index.service.IStaffService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

	private Basicinfo basicinfo;

	private IStaffService staffService;
	private UserService userService;
	private List<String> namelist;
	private List<String> namedate;
    private List<String>  date;
	private Basicinfo bi;

	public String doIndex() {

		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		Object ob = request.getSession().getAttribute("user");
		Basicinfo bi = null;
		if (ob != null) {
			bi = (Basicinfo) ob;
			namelist = staffService.query(bi);
			namedate = staffService.querystaffdate(bi);
			return "success";
		}
		return null;
	}

	public List<String> getNamedate() {
		return namedate;
	}

	public void setNamedate(List<String> namedate) {
		this.namedate = namedate;
	}



	public String doContract() {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		Object ob = request.getSession().getAttribute("user");
		Basicinfo bi = null;
		if (ob != null) 
		{
			bi = (Basicinfo) ob;
			if (bi.getRole() == 1||bi.getRole() == 4) 
			{
				return "success1";
			}
			else if (bi.getRole() == 2)
			{
				return "success2";
			} 
			else if (bi.getRole() == 3) 
			{
				return "success3";
			} 
			else
				return "noIndex";
		}
		return null;
	}

	public String doElection() {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		Object ob = request.getSession().getAttribute("user");
		Basicinfo bi = null;
		if (ob != null)
		{
			bi = (Basicinfo) ob;
		
			if (bi.getRole() == 1||bi.getRole() == 4) 
			{
		
				
				date = userService.querystaffdate(bi);
				return "success1";
			} 
			else if (bi.getRole() == 2)
			{
				return "success2";
			} else if (bi.getRole() == 3) 
			{
				return "success3";
			} 
			
			else
				
				return "noElection";
			}
		return null;
		
		

	}

	public String doMain() {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		Object ob = request.getSession().getAttribute("user");
		Basicinfo bi = null;
		if (ob != null) {
			bi = (Basicinfo) ob;
			if (bi.getRole() == 1) 
			{
				return "success1";
			} 
			else if (bi.getRole() == 2)
			{
				return "success2";
			} else if (bi.getRole() == 3) 
			{
				return "success3";
			} 
			else if (bi.getRole() == 4) {
				return "success4";
			}
			 else
				return "noMain";
		}
		return null;

	}

	public IStaffService getStaffService() {
		return staffService;
	}

	public void setStaffService(IStaffService staffService) {
		this.staffService = staffService;
	}

	public Basicinfo getBasicinfo() {
		return basicinfo;
	}

	public void setBasicinfo(Basicinfo basicinfo) {
		this.basicinfo = basicinfo;
	}

	public List<String> getNamelist() {
		return namelist;
	}

	public void setNamelist(List<String> namelist) {
		this.namelist = namelist;
	}

	public List<String> getDate() {
		return date;
	}

	public void setDate(List<String> date) {
		this.date = date;
	}

	public Basicinfo getBi() {
		return bi;
	}

	public void setBi(Basicinfo bi) {
		this.bi = bi;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
