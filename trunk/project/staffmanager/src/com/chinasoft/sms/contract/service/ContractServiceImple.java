package com.chinasoft.sms.contract.service;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.contract.dao.ContractDAO;

import com.chinasoft.sms.contract.pojo.Compactinfo;
/**
 * 
 * @author jinhua.yang
 *
 */
public class ContractServiceImple implements ContractService {
	private ContractDAO contractDAO;
	private Compactinfo compactinfo;

	public boolean contractnew(Compactinfo compactinfo) {
		contractDAO.contractnew(compactinfo);
		return true;
	}

	public boolean contractdelete(Long[] delcompactId) {
		contractDAO.contracdelete(delcompactId);
		return true;
	}

	public boolean contractmodify(Compactinfo compactinfo) {
		contractDAO.contractmodify(compactinfo);
		return true;
	}

	public List<Compactinfo> contractquery(String searchType,
			String conditionValue) {
		return contractDAO.contractquery(searchType, conditionValue);
	}

	public ContractDAO getContractDAO() {
		return contractDAO;
	}

	public void setContractDAO(ContractDAO contractDAO) {
		this.contractDAO = contractDAO;
	}

	public Compactinfo getCompactinfo() {
		return compactinfo;
	}

	public void setCompactinfo(Compactinfo compactinfo) {
		this.compactinfo = compactinfo;
	}

	public List<Basicinfo> basicinfoquery(String conditionValue) {
		return contractDAO.basicinfoquery(conditionValue);
	}

	
	public Compactinfo contractquery1( Long conditionValue) {
		
		return contractDAO.contractquery1(conditionValue);
	}



}
