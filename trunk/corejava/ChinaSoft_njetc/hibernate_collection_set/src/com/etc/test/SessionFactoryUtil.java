package com.etc.test;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//单态实例
public class SessionFactoryUtil {
	
	private static SessionFactory SessionFactory;
	private SessionFactoryUtil(){
		
	}
	static{
		
		try {
			SessionFactory=new Configuration().configure().buildSessionFactory();
			System.out.println("SessionFactory 创建成功！");

		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static SessionFactory getInstance() {
     return SessionFactory;
	}
}
