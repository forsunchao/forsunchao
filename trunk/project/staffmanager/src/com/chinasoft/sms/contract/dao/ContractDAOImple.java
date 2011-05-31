package com.chinasoft.sms.contract.dao;

import java.util.ArrayList;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.contract.pojo.Compactinfo;
/***
 * 
 * @author jinhua.yang
 *
 */
public class ContractDAOImple extends HibernateDaoSupport implements
		ContractDAO {
	private Compactinfo compactinfo;

	public boolean contractnew(Compactinfo compactinfo) {
		doInsert(compactinfo);
		return true;
	}

	public List<Compactinfo> contractquery(String searchType,
			String conditionValue) {
		return doQuery(searchType, conditionValue);
	}

	public boolean contractmodify(Compactinfo compactinfo) {
		doUpdate(compactinfo);
		return true;
	}

	public boolean contracdelete(Long[] delcompactId) {
		doDelete(delcompactId);
		return true;
	}

	private void doInsert(Compactinfo compactinfo) {
		getHibernateTemplate().save(compactinfo);
	}

	private List<Compactinfo> doQuery(String searchType, String conditionValue) {
		List<Compactinfo> list = new ArrayList<Compactinfo>();
		if (searchType.equals("0")) {
			String sql = "from Compactinfo c where c.basicinfo.name='"
					+ conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		}
		if (searchType.equals("1")) {
			String sql = "from Compactinfo  where to_char(signDate,'YYYY-MM')='"
					+ conditionValue + "'";

			list = getHibernateTemplate().find(sql);
		}
		if (searchType.equals("2")) {
			String sql = "from Compactinfo  where to_char(outDate,'YYYY-MM')='"
					+ conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		}
		if (searchType.equals("3")) {
			String sql = "from Compactinfo  where to_char(signDate,'YYYY')='"
					+ conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		}
		if (searchType.equals("4")) {
			String sql = "from Compactinfo  where to_char(outDate,'YYYY')='"
					+ conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		}
		if (searchType.equals("5")) {
			String sql = "from Compactinfo c where c.compactState='F'";
			list = getHibernateTemplate().find(sql);
		}
		if (searchType.equals("6")) {
			String sql = "from Compactinfo c where c.compactId='"
					+ conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		}
		if (searchType.equals("7")) {	
			String sql = "from Basicinfo b where b.staffNumber not in(select c.basicinfo.staffNumber from Compactinfo c)";
			list=getHibernateTemplate().find(sql );
			}
		if (searchType.equals("8")) {	
			String sql = "from Compactinfo c ";
			list=getHibernateTemplate().find(sql );
		}
		if (searchType.equals("9")) {
			String sql = "from Compactinfo c where c.basicinfo.staffNumber='"
				+ conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		}
		return list;
	}
	public void doUpdate(Compactinfo compactinfo) {
		getHibernateTemplate().update(compactinfo);
	}

	public void doDelete(Long[] delcompactId) {
		for (int i = 0; i < delcompactId.length; i++)
			// getHibernateTemplate().delete(delcompactId[i]);
			this.getHibernateTemplate().delete(
					getHibernateTemplate().load(Compactinfo.class,
							new Long(delcompactId[i])));

	}

	public Compactinfo getCompactinfo() {
		return compactinfo;
	}

	public void setCompactinfo(Compactinfo compactinfo) {
		this.compactinfo = compactinfo;
	}


	public List<Basicinfo> basicinfoquery(String conditionValue) {
		List<Basicinfo> list = new ArrayList<Basicinfo>();
			String sql = "from  Basicinfo b where b.staffNumber not in(select c.basicinfo.staffNumber from Compactinfo c) and b.staffNumber='"+ conditionValue + "'";
			list = getHibernateTemplate().find(sql);
		return list;
	}

	
	public Compactinfo contractquery1(Long conditionValue) {
		/*String sql = "from Compactinfo c where c.compactId='"
			+ conditionValue + "'";
			list = getHibernateTemplate().find(sql);*/
		Compactinfo result=(Compactinfo)this.getHibernateTemplate().load(Compactinfo.class,conditionValue);
		return result;
	}

	

}
