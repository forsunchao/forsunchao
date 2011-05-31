package com.etc.test;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.etc.Employee1;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateTest test=new HibernateTest();
		test.load();
		//test.add();
	}
	///Employee1������
	public void add(){
		//���session
		Session session=SessionFactoryUtil.getInstance().openSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			Employee1 employee1=new Employee1();
			employee1.setEName("22");
			employee1.setEAddress("ddd");
			employee1.getPhoneses().add("33");
			session.save(employee1);
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///Employee1��ѯ
	public void load(){
		//���session
		Session session=SessionFactoryUtil.getInstance().openSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
		
			Employee1 employee12=(Employee1)session.get(Employee1.class, 1);
			System.out.println(employee12.getEName());
			Set eSet=employee12.getPhoneses();
			for (Object object : eSet) {
				System.out.println(object);
			}
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
