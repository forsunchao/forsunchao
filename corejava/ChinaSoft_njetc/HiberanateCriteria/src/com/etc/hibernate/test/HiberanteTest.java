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
		//ʵ����
		HiberanteTest hibernate =new HiberanteTest();
		/////////////////////////////////////////////
	    //hibernate.doAdd();
		hibernate.doQuery5();
		//hibernate.doDelete();
		//hibernate.doUpdate();
	}
	///book������
	public void doAdd(){
		//���session
		for(int i=0;i<50;i++){
	Session session=new Configuration().configure().buildSessionFactory().openSession();
		//Session session=new Configuration().configure().buildSessionFactory().getCurrentSession();
		//Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			Book book=new Book();
			book.setBookName("java�߼�ѧϰ");
			book.setBookDesc("etcʵѵ");
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
	///book���ѯ:Criteria������ѯ,Restriction��Order�÷�
	public void doQuery(){
		//���session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get��������
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
	///book���ѯ:Criteria������ѯProjectionsͳ���÷������һ������������
	public void doQuery2(){
		//���session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get��������
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
	///book���ѯ:Criteria������ѯsqlRestrictionԭ��sql�÷�
	public void doQuery1(){
		//���session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get��������
			Criteria criteria=session.createCriteria(Book.class);
			criteria.add(Restrictions.sqlRestriction("{alias}.book_desc=?","etcʵѵ",Hibernate.STRING));
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
	///book���ѯ:Criteria������ѯPropertyͶӰ�÷�
	public void doQuery3(){
		//���session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get��������
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
	///book���ѯ:Criteria������ѯExample�÷�
	public void doQuery4(){
		//���session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get��������
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
	///book���ѯ:Criteria������ѯExample�÷�
	public void doQuery5(){
		//���session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get��������
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
