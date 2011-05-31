package com.chinasoft.sms.contract.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.contract.pojo.Compactinfo;

/**
 * 
 * @author jian.yao
 * 从数据库中选取草案。
 *
 */
public interface IContractFormDao
/*
 * 命名规范如此接口前+"I"，实现接口时后面+"Impl"
 */
{
	public List<Compactinfo> listContractDraft();

}
