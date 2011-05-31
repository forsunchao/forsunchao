package com.chinasoft.sms.login.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.check.pojo.Basicinfo;

/**
 * 
 * @author jian.yao date 2010-09-18 用户登录验证(身份、权限)dao
 */
//注意extends  HibernateDaoSupport 
public class loginDaoImpl extends  HibernateDaoSupport implements loginDao {

	//验证方法
	public Basicinfo loginvalidate(String logName, String logPwd) 
	{
		// TODO Auto-generated method stub
		//选取用户名和身份正确的记录，得到的是列表。
		List list=this.getHibernateTemplate().find("from Basicinfo where name='"+logName+"' and password='"+logPwd+"'");
		//System.out.println("执行-------------loginDaoImpl-----------");

		
			//从得到的对象列表中选取第一条记录。
		if(null==list || list.size()==0)
		{
			return null;
			
		}
			Basicinfo p=(Basicinfo)list.get(0);
			//System.out.println(p.toString()+"(loginDaoImpl)打印显示身份验证方法后，所获起的 记录————————————————");
//			p.getRole();
			return p ;

	}
	
}
