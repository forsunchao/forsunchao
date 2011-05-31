package com.chinasoft.sms.check.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checkflowinfo;
import com.chinasoft.sms.check.pojo.Checkparticularresultinfo;
import com.chinasoft.sms.check.pojo.Checktableinfo;

public class StaffCheckImpl extends HibernateDaoSupport implements IStaffCheck
{
	public boolean isCheck(String  username) 
	{
		String sql = " FROM Checkflowinfo cf WHERE cf.commiter='"+username+"'";
		List list = this.getHibernateTemplate().find(sql);
		//String isCheck =  (String)list.get(0);
		return list.size() > 0;
	}

	public boolean insertCheck(Checktableinfo checktableinfo,Checkflowinfo checkflowinfo) 
	{
		this.getHibernateTemplate().save(checktableinfo);
		this.getHibernateTemplate().save(checkflowinfo);
		return true;
	}

	public List<Basicinfo> viewCheck(String username,String state, String step) {
		String sql = "select b from Checkflowinfo c,Basicinfo b  where c.checkflowState ='"+state+"' and c.checkflowStep = '"+step+"' and c.accepter = '"+username+"'and c.commiter = b.name ";
		
		return this.getHibernateTemplate().find(sql);
	}

	public boolean updateCheck(String commitname,String beizhu,String username,long totalscore)
	{
		
		String sql = "select c.checkflowGrade from Checkflowinfo c where c.commiter='"+commitname+"' and c.accepter='"+username+"'";
		String tempScore =  (String)this.getHibernateTemplate().find(sql).get(0);
		long score = Long.parseLong(tempScore);
		long totalscoreto = (long) (score +  (totalscore*0.3));
		//update CHECKFLOWINFO c set c.checkflow_state = '0' ,c.checkflow_step = 'cc' where c.commiter = '15';
	//	String hql = hql = "update Menu a set a.power=" + power + " where a.id=" + menuId;
		final String hql = "update Checkflowinfo c set c.checkflowState ='0' ,c.checkflowStep = 'bb' ,c.rejectRemark = '"+ beizhu +"' ,c.checkflowGrade = '" + totalscoreto + "' where c.commiter = '" + commitname +"'";
		this.getHibernateTemplate().execute(new HibernateCallback() 
		{
			public Object doInHibernate(Session session) throws HibernateException, SQLException 
			{
				return session.createQuery(hql).executeUpdate();
			}
		});
	return true;

		/*Checkflowinfo checkflowinfo = new Checkflowinfo();
		if(checkflowinfo.getCommiter().equalsIgnoreCase(commitname)) {
			checkflowinfo.setCheckflowState("0");
			checkflowinfo.setCheckflowStep("cc");
			checkflowinfo.setRejectRemark("beizhu");
			long k = Long.parseLong(checkflowinfo.getCheckflowGrade());
			checkflowinfo.setCheckflowGrade(Long.toString((long) (k*(0.2)+totalscore)));
		}
	     this.getHibernateTemplate().update(checkflowinfo);
	     return checkflowinfo;
	     */
	}
	public boolean updateCheckto(String commitname,String beizhu,String username,long totalscore) 
	{    
		String sql = "select c.checkflowGrade from Checkflowinfo c where c.commiter='"+commitname+"' and c.accepter='"+username+"'";
		String tempScore =  (String)this.getHibernateTemplate().find(sql).get(0);
		long score = Long.parseLong(tempScore);
		
		//update CHECKFLOWINFO c set c.checkflow_state = '0' ,c.checkflow_step = 'cc' where c.commiter = '15';
	//	String hql = hql = "update Menu a set a.power=" + power + " where a.id=" + menuId;
		long totalscoreto = (long) (score +  (totalscore*0.6));
		final String hql = "update Checkflowinfo c set c.checkflowState ='0' ,c.checkflowStep = 'cc' ,c.rejectRemark = '"+ beizhu +"' ,c.checkflowGrade = '" + totalscoreto + "' where c.commiter = '" + commitname +"'";
		this.getHibernateTemplate().execute(new HibernateCallback() 
		{
			public Object doInHibernate(Session session) throws HibernateException, SQLException 
			{
				return session.createQuery(hql).executeUpdate();
			}
		});
	return true;
	}
	/*
	public List<Checkparticularresultinfo> checkresult() {
		String sqlString = "from  Checkparticularresultinfo c ";
		List<Checkparticularresultinfo> list = this.getHibernateTemplate().find(sqlString);
		return list;
	}*/
	public List<Checkflowinfo> checkresult() {
		String sql = "from Checkflowinfo c where c.accepter='王sir'";
		List<Checkflowinfo> list = this.getHibernateTemplate().find(sql);
		return list;
	}
	public List<Checkflowinfo> checkstep() {
		String sqlString = "from  Checkflowinfo c order by  checkflowId";
		List<Checkflowinfo> list = this.getHibernateTemplate().find(sqlString);
		return list;
	}
	public List<Checkflowinfo> personstep(String username) {
		String sql = "from Checkflowinfo c where c.commiter ='"+username+"' and c.accepter='王sir'";
		return this.getHibernateTemplate().find(sql);
	
	}
	/*public boolean vaildb(String commitname,String accepter) {
		String sql = " FROM Checkflowinfo cf  WHERE cf.commiter='"+commitname+"' and cf.accepter='"+accepter+"'";
		List list = this.getHibernateTemplate().find(sql);
		//String isCheck =  (String)list.get(0);
		return list.size() <1;
	}*/
}
