package com.etc.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestHibernate hibernate = new TestHibernate();
		//hibernate.insert();
		//hibernate.delete();
		//hibernate.query();
		hibernate.update();
	}
	
	public void insert() {
		//获得session
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		//Session session=new Configuration().configure().buildSessionFactory().getCurrentSession();
		//Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			Book book=new Book();
			book.setName("java高级学习");
			book.setDescription("etc实训");
			session.save(book);
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(){
		//获得session
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		//Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Book book=new Book();
			book.setId(1);
			session.delete(book);
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query(){
		//获得session
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		//Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Book book=(Book)session.get(Book.class,1);
			if(book==null)return;
			System.out.println(book);
			//load方法测试
			//Book book=(Book)session.load(Book.class,1);
			System.out.println(book.getName());
			System.out.println(book.getDescription());
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(){
    	//获得session
    	Session session=new Configuration().configure().buildSessionFactory().openSession();
		//Session session=SessionFactoryUtil.getInstance().getCurrentSession();
        Transaction tx=session.beginTransaction();
        try {
			 session.beginTransaction();
	         //get方法测试
             Book book=new Book();
             book.setId(2);
             book.setDescription("东南大学");
             book.setName("出版社");
		     session.update(book);
		     tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
