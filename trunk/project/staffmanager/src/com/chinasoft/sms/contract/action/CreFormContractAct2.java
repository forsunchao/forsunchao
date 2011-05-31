package com.chinasoft.sms.contract.action;

import java.io.IOException;

import org.apache.struts2.ServletActionContext;
import com.chinasoft.sms.contract.service.ICreFormContractServ;

/**
 * 
 * @author jian.yao date 2010-9-27 action
 */

public class CreFormContractAct2 {

	// 合同内容
	private String contractText;
	// 合同编号
	private String compactId;
	private ICreFormContractServ cfcs;

	public String getCompactId() {
		return compactId;
	}

	public void setCompactId(String compactId) {
		this.compactId = compactId;
	}

	public CreFormContractAct2() {

	}

	public ICreFormContractServ getCfcs() {
		return cfcs;
	}

	public void setCfcs(ICreFormContractServ cfcs) {
		this.cfcs = cfcs;
	}

	/**
	 * 写合同并设置合同状态
	 * 
	 * @return
	 */
	public String execute() throws IOException  
	{
		contractText = contractText.replaceAll("\t", "   ");
		String strArray[] = contractText.split("\r\n");
		String conPath = ServletActionContext.getRequest().getSession()
				.getServletContext().getRealPath("/contractfile")
				+"\\" +compactId + ".docx";
		String flag = "fail";
		cfcs.writeContract(strArray, conPath);

		try{
		Long conId =new Long(Integer.parseInt(compactId));
     	cfcs.CreateFormalContract(conId);
		}
		catch(Exception e){
		}
		return "success";

	}

	public String getContractText() {
		return contractText;
	}

	public void setContractText(String contractText) {
		this.contractText = contractText;
	}

}
