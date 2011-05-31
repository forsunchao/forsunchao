package com.chinasoft.sms.contract.service;

import java.util.List;

import com.chinasoft.sms.contract.pojo.Compactinfo;

/**
 * 
 * @author jian.yao data 2010-09-26
 * 列出待生成正式合同的草案service草案。
 *
 */
public interface IContractFormServ
{
	public List<Compactinfo> listContractDraft();
}
