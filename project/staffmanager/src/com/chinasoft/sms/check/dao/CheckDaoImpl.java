package com.chinasoft.sms.check.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checkflowinfo;

public class CheckDaoImpl extends HibernateDaoSupport implements ICheckDao {
	public List<Basicinfo> queryACheckedByState(String state) {
		String hql = "SELECT bi FROM Basicinfo bi ,Checkflowinfo cf WHERE bi.staffNumber=cf.checktableinfo.basicinfo.staffNumber and cf.checkflowState='"
				+ state + "'";
		List<Basicinfo> list = this.getHibernateTemplate().find(hql);
		return list;
	}

	public List<Object[]> queryFlowinfoBystaffNub( final String staffNub) {
		Object ob = getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException {
				final StringBuffer sql = new StringBuffer();
				sql.append("SELECT");
				sql.append(" TB1.NAME,TB1.DEPARTMENT_NAME,TB1.ROLE,TB2.CHECKFLOW_STATE");
				sql.append(" FROM ");
				sql.append("(");
				sql.append(" SELECT");
				sql.append(" BI.STAFF_NUMBER,BI.NAME,BI.ROLE, DI.DEPARTMENT_NAME ");
				sql.append(" FROM BASICINFO  BI  , DEPARTMENTINFO  DI WHERE BI.DEPARTMENT_ID =DI.DEPARTMENT_ID) TB1,");
				sql.append(" (SELECT  CF.ACCEPTER AS staff_number , CF.CHECKFLOW_STATE   FROM  CHECKTABLEINFO CT , CHECKFLOWINFO CF WHERE   CT.CHECKTABLE_ID=CF.CHECKTABLE_ID  AND CT.STAFF_NUMBER=:staffNub   AND   (CF.CHECKFLOW_STEP ='bb'  OR  CF.CHECKFLOW_STEP ='cc') ORDER  BY CF.CHECKFLOW_STEP )");
				sql.append("TB2 WHERE TB1.STAFF_NUMBER=TB2.STAFF_NUMBER ");
				final Query query = session.createSQLQuery(sql.toString());
				query.setParameter("staffNub", staffNub);
				return query.list();
			}
		});
		
		List list=new ArrayList();
		if(ob!=null&& ob instanceof List)
		{
			list=(ArrayList)ob;
		}
		return list;
	}

}
