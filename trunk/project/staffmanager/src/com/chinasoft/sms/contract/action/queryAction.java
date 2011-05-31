package com.chinasoft.sms.contract.action;

import java.util.List;

import com.chinasoft.sms.contract.pojo.Compactinfo;
import com.chinasoft.sms.contract.service.ContractService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author jinhua.yang
 *
 */
public class queryAction extends ActionSupport {
	private ContractService contractservice;
	private String searchType;
    private String conditionValue;
    private List<Compactinfo> results;

	public ContractService getContractservice() {
		return contractservice;
	}

	public void setContractservice(ContractService contractservice) {
		this.contractservice = contractservice;
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

	public String doquery() throws Exception{
		results=contractservice.contractquery(searchType, conditionValue);
		return SUCCESS;

	}

	public List<Compactinfo> getResults() {
		return results;
	}

	public void setResults(List<Compactinfo> results) {
		this.results = results;
	}
}
