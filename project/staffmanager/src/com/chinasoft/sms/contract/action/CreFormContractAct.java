package com.chinasoft.sms.contract.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.sms.contract.service.ICreFormContractServ;

/**
 * 
 * @author jian.yao date 2010-9-27 创建正式合同action
 */

public class CreFormContractAct 
{
	private String[] cfArray;
	private ICreFormContractServ cfcs;
//	private ContractDraftShowAct cdsa =new ContractDraftShowAct();
	
/*	public ContractDraftShowAct getCdsa() {
		return cdsa;
	}
	public void setCdsa(ContractDraftShowAct cdsa) {
		this.cdsa = cdsa;
	}*/
	public CreFormContractAct() 
	{
		   //System.out.println("实例化.....CreFormContractAct...........");
	}
	public String[] getCfArray() 
	{
		return cfArray;
	}
	public void setCfArray(String[] cfArray) 
	{
		this.cfArray = cfArray;
	}
	public ICreFormContractServ getCfcs() 
	{
		return cfcs;
	}
	public void setCfcs(ICreFormContractServ cfcs) 
	{
		this.cfcs = cfcs;
	}
	/**
	 * ajax动态生成正式合同
	 * @return
	 * @throws IOException 
	 */
	public String execute() throws IOException  
	{
		HttpServletRequest   request=ServletActionContext.getRequest();
		HttpServletResponse  response=ServletActionContext.getResponse();
		response.setContentType("text/xml;charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		response.setCharacterEncoding("UTF-8");
		//1:成功 ;0:失败
		String flag="1";
		try{
		String cfstr=request.getParameter("cfstr");
		cfArray=cfstr.split(";");
		//放在方法里，for。
		for(int i=0;i<cfArray.length;i++)
		{
			Long compactId =new Long(Integer.parseInt(cfArray[i]));
	     	cfcs.CreateFormalContract(compactId);
		}
		}
		catch(Exception e){
			flag="0";	
		}
		response.getWriter().write(flag);
		
		return null;

		
		
	}

}
