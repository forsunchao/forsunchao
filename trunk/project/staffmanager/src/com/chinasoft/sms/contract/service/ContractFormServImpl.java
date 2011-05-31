package com.chinasoft.sms.contract.service;

import java.util.List;

import com.chinasoft.sms.contract.dao.IContractFormDao;
import com.chinasoft.sms.contract.pojo.Compactinfo;
/**
 * 
 * @author jian.yao 2010-09-25
 *
 */

public class ContractFormServImpl  implements IContractFormServ
{
	IContractFormDao cfd;

	public IContractFormDao getCfd() {
		return cfd;
	}

	public void setCfd(IContractFormDao cfd) {
		this.cfd = cfd;
	}

	public IContractFormDao getDao() {
		return cfd;
	}

	public void setDao(IContractFormDao cfd) {
		this.cfd = cfd;
	}

	public List<Compactinfo> listContractDraft() {
		//System.out.println("ִ��ContractFormServImpl�е�listContractDraft������xxxxxxxxxxxxxxxxx");
		// TODO Auto-generated method stub
		List<Compactinfo> p=cfd.listContractDraft();
		//System.out.println("ִ��ContractFormSevImpl�е�cfd.listContractdraft-----------");
		return p;

	}

}
