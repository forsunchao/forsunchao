package com.chinasoft.sms.admin.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.common.Page;


public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public boolean addUser(Basicinfo basicinfo) {
		this.getHibernateTemplate().save(basicinfo);
		return true;
	}

	public boolean delUser(Basicinfo basicinfo) {
	this.getHibernateTemplate().delete(basicinfo);
		return true;
	}

	public List<Basicinfo> queryList(String hql) {
				return  this.getHibernateTemplate().find(hql);
	}
	
	
	public List<Basicinfo>  queryUser(final 	Page page,  String name) {
		// TODO Auto-generated method stub
        List queryResults = (List)getHibernateTemplate().execute(new HibernateCallback()
        {
            public Object doInHibernate(Session session)
            throws SQLException
        {
                Criteria criteriaForTotalNum = session.createCriteria(Basicinfo.class);
                Criteria criteriaForPages = session.createCriteria(Basicinfo.class);
                    int totalNum =
                        ((Number)criteriaForTotalNum.setProjection(Projections.rowCount()).list().get(0)).intValue();
                    page.setTotalNum(totalNum);
                    List results =
                        criteriaForPages.setMaxResults(page.getNumPerPage()).setFirstResult(page.getFirstResult()).list();

            return results;	
        }
        });
		return queryResults;
	}

	public Basicinfo queryUser(Long staffNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateUser(Basicinfo basicinfo) {
		this.getHibernateTemplate().update(basicinfo);
		return true;
	}

	public int queryCount(String hql) {
		 return this.getHibernateTemplate().find(hql).size();
	}
	


	}

