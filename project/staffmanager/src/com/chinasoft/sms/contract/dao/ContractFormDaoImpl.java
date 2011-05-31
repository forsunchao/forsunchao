package com.chinasoft.sms.contract.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.contract.pojo.Compactinfo;
/**
 * 
 * @author jian.yao Date 2010-09-26
 *查找合同草案
 */

public class ContractFormDaoImpl  extends  HibernateDaoSupport implements IContractFormDao{

	//List list=this.getHibernateTemplate().find("from Compactinfo where compactState='F'");
//	
	public List<Compactinfo> listContractDraft() 
	{
		// TODO Auto-generated method stub
		//查找方法
//		System.out.println("执行ContractFormDaoImplx--------------------xxxxxxxx");
		List<Compactinfo> list=this.getHibernateTemplate().find("from Compactinfo where compactState='F'");
//		Compactinfo p = (Compactinfo) list;
		String arg =list.toString();
		System.out.println(arg);
		return list;
		
	}

}
