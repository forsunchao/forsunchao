package com.chinasoft.sms.contract.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.contract.pojo.Compactinfo;
/**
 * 
 * @author jian.yao date 2010-09-27
 *
 */

public class CreFormContractDaoImpl extends  HibernateDaoSupport implements ICreFormContractDao {

/*	private Compactinfo  cpt;
	public Compactinfo getCpt() {
		return cpt;
	}
	public void setCpt(Compactinfo cpt) {
		this.cpt = cpt;
	}*/
	public String setCompactState(Long compactId) {
		//System.out.println("ִ��CreFormContractDaoImpl--------------------xxxxxxxx");
		Compactinfo compactinfo=(Compactinfo)this.getHibernateTemplate().load(Compactinfo.class,compactId);
		System.out.println(compactinfo+"--------------------xxxxxxxx");
		if(null==compactinfo)
		{
			return "fail";
		}
		else
		{
		compactinfo.setCompactState("T");
		this.getHibernateTemplate().update(compactinfo);
		return "success";
		}
	}


	
	

}
