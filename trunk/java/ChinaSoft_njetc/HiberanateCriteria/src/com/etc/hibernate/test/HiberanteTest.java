package com.etc.hibernate.test;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import com.etc.hibernate.Book;

public class HiberanteTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化
		HiberanteTest hibernate =new HiberanteTest();
		/////////////////////////////////////////////
	    //hibernate.doAdd();
		hibernate.doQuery5();
		//hibernate.doDelete();
		//hibernate.doUpdate();
	}
	///book表新增
	public void doAdd(){
		//获得session
		for(int i=0;i<50;i++){
	Session session=new Configuration().configure().buildSessionFactory().openSession();
		//Session session=new Configuration().configure().buildSessionFactory().getCurrentSession();
		//Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			Book book=new Book();
			book.setBookName("java高级学习");
			book.setBookDesc("etc实训");
			session.save(book);
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	///book表查询:Criteria条件查询,Restriction和Order用法
	public void doQuery(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Criteria criteria=session.createCriteria(Book.class);
			criteria.add(Restrictions.like("bookDesc", "etc%"));
			List<Book> ls=criteria.list();
			for (Book book : ls) {
				System.out.println(book.getBookDesc()+":"+book.getBookName());
			}
			
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///book表查询:Criteria条件查询Projections统计用法，并且还可以添加条件
	public void doQuery2(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Criteria criteria=session.createCriteria(Book.class);
			Integer rowcowInteger=(Integer)criteria.setProjection(Projections.rowCount()).uniqueResult();
			//
			//Projections.projectionList();
			System.out.println(rowcowInteger);
			
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///book表查询:Criteria条件查询sqlRestriction原生sql用法
	public void doQuery1(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Criteria criteria=session.createCriteria(Book.class);
			criteria.add(Restrictions.sqlRestriction("{alias}.book_desc=?","etc实训",Hibernate.STRING));
			List<Book> ls=criteria.list();
			for (Book book : ls) {
				System.out.println(book.getBookDesc()+":"+book.getBookName());
			}
			
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///book表查询:Criteria条件查询Property投影用法
	public void doQuery3(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Criteria criteria=session.createCriteria(Book.class);
			criteria.setProjection(Property.forName("bookDesc"));
			List<String> ls=criteria.list();
			for (String book : ls) {
				System.out.println(book);
			}
			
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///book表查询:Criteria条件查询Example用法
	public void doQuery4(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Criteria criteria=session.createCriteria(Book.class);
			Book book=new Book();
			criteria.add(Example.create(book));
			List<Book> ls=criteria.list();
			for (Book bookq : ls) {
				System.out.println(bookq.getBookDesc());
			}
			
			tx.commit();
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///book表查询:Criteria条件查询Example用法
	public void doQuery5(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Connection criteria=session.connection();
			String sqlString="select * from book";
			try {
				Statement st=criteria.createStatement();
				ResultSet rSet=st.executeQuery(sqlString);
				while (rSet.next()) {
					System.out.println(rSet.getString("book_desc"));
				}

				tx.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
