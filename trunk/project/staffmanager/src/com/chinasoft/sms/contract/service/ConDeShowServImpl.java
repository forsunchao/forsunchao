package com.chinasoft.sms.contract.service;

import java.util.List;

import com.chinasoft.sms.contract.dao.IContractDraftDetailShowDao;
import com.chinasoft.sms.contract.pojo.Compactinfo;

/**
 * 
 * @author Jian.Yao Date 2010/09/28
 *
 */


public class ConDeShowServImpl implements IConDeShowServ 
{
	private IContractDraftDetailShowDao cdds;
	
	public IContractDraftDetailShowDao getCdds() {
		return cdds;
	}

	public void setCdds(IContractDraftDetailShowDao cdds) {
		this.cdds = cdds;
	}

	public Compactinfo showCompact(Long CompactId) {
		Compactinfo result=cdds.findCompactId(CompactId);
		return result;
	}

	

}
