package com.chinasoft.sms.index.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.check.pojo.Basicinfo;

public class StaffDAOImpl extends HibernateDaoSupport implements IStaffDAO {

	/**
	 * 根据用户角色查询合同到期
	 */
	public List<String> query(Basicinfo bi) 
	{
		// 获取角色
		List<String> nameList = new ArrayList<String>();
		

		long role = bi.getRole().longValue();
		if (role == 0)
		{
			
			return nameList;
		}
		if (role == 1 || role == 2||role==3)// 经理，人事部查询所有合同到期
		{
			nameList = this
					.getHibernateTemplate()
					.find(
							"select ci.basicinfo.nameId from  Compactinfo ci where   to_char(ci.outDate,'YYYY-MM')=to_char(SYSDATE,'YYYY-MM')");

		}
		if (role == 3) 
		{
			nameList = this
					.getHibernateTemplate()
					.find(
							"select ci.basicinfo.nameId from   Compactinfo  ci   where    to_char(ci.outDate,'YYYY-MM')=to_char(SYSDATE,'YYYY-MM') and ci.basicinfo.nameId='"
									+ bi.getNameId() + "'");

			// 普通员工查询自己有没有到期
		}

		/*
		 * List<Compactinfo> ci = this.getHibernateTemplate().find("from
		 * Compactinfo ci where ci.basicinfo.nameId='" + name_id + "' and
		 * ci.basicinfo.password='" + password + "'");
		 */
		// int length=ci.size();
		//		 
		// for(int index=0;index<length;index++){
		//			
		// ci.get(index);
		// }
		//		  

		/*
		 * if (ci != null) { DateFormat df= new SimpleDateFormat("yyyy-MM");
		 * //System.out.println(String.valueOf(ci.get(0).getOutDate())); return
		 * String.valueOf(df.format(ci.get(0).getOutDate()));
		 *  }
		 */

		return nameList;
	}

	public List<String> querystaffdate(Basicinfo  bi) 
	{
		List<String> namedate = new ArrayList<String>();
		namedate=this.getHibernateTemplate().find("select name from  Basicinfo where   to_char(birthday,'MM-DD')=to_char(SYSDATE,'MM-DD')");
		// TODO Auto-generated method stub
		return namedate;
	}
	
	
}
