package com.chinasoft.sms.contract.dao;

import com.chinasoft.sms.contract.pojo.Compactinfo;

/**
 * 
 * @author Jian.yao Date 2010/09/28
 *
 */

public interface IContractDraftDetailShowDao 
{
	public Compactinfo findCompactId(Long CompactId);
}
