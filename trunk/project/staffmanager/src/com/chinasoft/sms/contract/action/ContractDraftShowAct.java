package com.chinasoft.sms.contract.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.chinasoft.sms.contract.pojo.Compactinfo;
import com.chinasoft.sms.contract.service.IContractFormServ;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author jian.yao 2010-9-25
 * 列出 待生成正式合同的草案 列表的action！
 *
 */

public class ContractDraftShowAct extends ActionSupport implements ServletRequestAware{
	private IContractFormServ cfs;
	private List<Compactinfo> results;
	private String detail;

	
	public IContractFormServ getCfs() {
		return cfs;
	}


	public void setCfs(IContractFormServ cfs) {
		this.cfs = cfs;
	}


	public List<Compactinfo> getResults() {
		return results;
	}


	public void setResults(List<Compactinfo> results) {
		this.results = results;
	}


	public ContractDraftShowAct() 
	{
		//System.out.println("实例化ContractFormalAction...........");
	}

		
	public IContractFormServ getCfsi() 
	{
		return cfs;
	}

	public void setCfsi(IContractFormServ cfsi) 
	{
		this.cfs = cfs;
	}

	
	public void setServletRequest(HttpServletRequest arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public String execute()
	{
		
		//System.out.println("执行execute（）----------------------------execute（）-----");
		//System.out.println("detail的值是：；；；；；；"+detail);
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		Object ob = request.getSession().getAttribute("user");
		//将查询出来的已考核、未考核、驳回考核流程信息存放到request里面去
//		request.setAttribute("checkflowlist", checkService.queryACheckedByState(state));
		//request.setAttribute("results", cfs.listContractDraft());
		
		results=cfs.listContractDraft();
		//其实永远返回“success”
//		if(null==ob)
//			return "noLogin";
//		else
//		{
			if(null==detail)
				return "success";
			else
				return "detail";
//		}
	}
	
	
}
