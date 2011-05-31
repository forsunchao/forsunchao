package com.chinasoft.sms.check.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checklibraryinfo;
import com.chinasoft.sms.check.pojo.Dynamicinfo;

public class DynamicinfoDAOImpl extends HibernateDaoSupport implements IDynamicinfoDAO
{
	  Dynamicinfo dyi;
	public Dynamicinfo getDyi() 
	{
		return dyi;
	}
	//
	public void setDyi(Dynamicinfo dyi) 
	{
		this.dyi = dyi;
	}
	//
	public boolean insertLibrarypaper(Dynamicinfo dyi) 
	{
		this.getHibernateTemplate().save(dyi);
		return true;
	}

	public List<Dynamicinfo> querycheckpaper(long dyid) {
		
		String	sql= "select d.checklibraryinfo from Dynamicinfo d where d.dynamicNumber  = ";
		      return this.getHibernateTemplate().find(sql+dyid);
		}
	
}
