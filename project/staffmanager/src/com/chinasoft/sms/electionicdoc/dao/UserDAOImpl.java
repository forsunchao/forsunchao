package com.chinasoft.sms.electionicdoc.dao;

import java.util.ArrayList;

import java.util.List;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Dynamicinfo;

/**
 * 
 * @author SunChao 
 * 
 */

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	Basicinfo basicinfo;
	Dynamicinfo dynamicinfo;

	public void add(Basicinfo basicinfo) {
		getHibernateTemplate().save(basicinfo);
	}

	public void delete(Basicinfo basicinfo) {
		getHibernateTemplate().delete(basicinfo);
	}

	public void update(Basicinfo basicinfo) {
		getHibernateTemplate().update(basicinfo);
	}
	
	public List<Basicinfo> query(String searchType, String conditionValue) {
		List<Basicinfo> list = new ArrayList<Basicinfo>();
		if ("0".equals(searchType)) {
			String sql = "from Basicinfo b where b.name='" + conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		} else if ("1".equals(searchType)) {
			String sql = "from Basicinfo b where b.staffNumber='" + conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		} else if ("2".equals(searchType)) {
			String sql = "from Basicinfo b where b.department='" + conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		} else if ("3".equals(searchType)) {
			String sql = "from Basicinfo b where b.education='" + conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		} else {
			String sql = "from Basicinfo b where b.ismarried='" + conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		}
		return list;
	}

	public Basicinfo getBasicinfo() {
		return basicinfo;
	}

	public void setBasicinfo(Basicinfo basicinfo) {
		this.basicinfo = basicinfo;
	}

	public Basicinfo queryBasicinfoById(Long staffNumber)
    {
		 return  (Basicinfo)this.getHibernateTemplate().get(Basicinfo.class, staffNumber);
	 
    }

	public int queryCountByMarried(String ismarried) {
		List<Object> ob = this.getHibernateTemplate().find("SELECT COUNT(*) FROM Basicinfo WHERE ismarried='" + ismarried + "'");
		int count = 0;
		if (ob != null) {
			count = ((Long) ob.get(0)).intValue();
		}
		return count;
	}

	public int queryCountBySex(String sex) {
		List<Object> ob = this.getHibernateTemplate().find("SELECT COUNT(*) FROM Basicinfo WHERE sex='" + sex + "'");
		int count = 0;
		if (ob != null) {
			count = ((Long) ob.get(0)).intValue();
		}
		return count;
	}
	public Dynamicinfo getDynamicinfo() {
		return dynamicinfo;
	}

	public void setDynamicinfo(Dynamicinfo dynamicinfo) {
		this.dynamicinfo = dynamicinfo;
	}

	public int queryCountByEducation(String education) {
		List<Object> ob = this.getHibernateTemplate().find("SELECT COUNT(*) FROM Basicinfo WHERE education='" + education + "'");
		int count = 0;
		if (ob != null) {
			count = ((Long) ob.get(0)).intValue();
		}
		return count;
	}
	public List<String> querystaffdate(Basicinfo bi) {
		List<String> date = new ArrayList<String>();
		date=this.getHibernateTemplate().find("select name from  Basicinfo where   to_char(birthday,'MM')=to_char(SYSDATE,'MM') AND  to_number(to_char(BIRTHDAY, 'DD'))- to_number(to_char(SYSDATE, 'DD'))<=10 and  to_number(to_char(BIRTHDAY, 'DD'))- to_number(to_char(SYSDATE, 'DD'))>=0 ");
		return date;
	}
	}


