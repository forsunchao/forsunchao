package com.chinasoft.sms.contract.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.contract.pojo.Compactinfo;

/**
 * 
 * @author Jian.Yao
 *
 */
public class ConDraDeShowDaoImpl extends HibernateDaoSupport implements IContractDraftDetailShowDao 
{


	public Compactinfo findCompactId(Long CompactId) 
	{
		//System.out.println("-------------------执行ConDraDeShowDaoImpl----------------");
		
		//		List list=this.getHibernateTemplate().find("from Compactinfo where CompactId='"+CompactId+"'");

		//		Compactinfo result=(Compactinfo)list.get(0);
		Compactinfo result=(Compactinfo)this.getHibernateTemplate().load(Compactinfo.class,CompactId);
		System.out.println(result.toString()+"(ConDraDeShowDaoImpl)打印findCompactId(Long CompactId)方法后，所获起的 记录————————————————");

		return result;
	}
	

}
