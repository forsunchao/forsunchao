package com.etc.hibernate.test;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javassist.convert.Transformer;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;

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
		hibernate.doQuery9();
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
	///book表查询:hql语句Query用法
	public void doQuery(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Query query=session.createQuery("from Book");
			query.setMaxResults(5);
			query.setFirstResult(10);
			//List<Book> bookList=query.list();
			Iterator<Book> bookList=query.iterate();

//			for (Book book : bookList) {
//				System.out.println(book.getBookDesc()+":"+book.getBookName());
//			}
			while (bookList.hasNext()) {
				System.out.println(	 ((Book)(bookList.next())).getBookDesc());
			}

			tx.commit();

			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///book表查询:hql语句Query用法
	public void doQuery1(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Query query=session.createQuery("from Book");
			List<Book> bookList=query.list();
			tx.commit();
			for (Book book : bookList) {
				System.out.println(book.getBookDesc()+":"+book.getBookName());
			}
			
			
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///book表查询:hql语句继承查询用法
	public void doQuery2(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Query query=session.createQuery("from java.lang.Object");
			List<Object> bookList=query.list();
			tx.commit();
			for (Object object : bookList) {
				System.out.println(object.getClass().getName());
			}
			
			
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///book表查询:hql语句投影查询用法
	public void doQuery3(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			//Query query=session.createQuery("select bookName,bookDesc from Book");
			//Query query=session.createQuery("select new Book(bookName,bookDesc) from Book");
			Query query=session.createQuery("select  new Map(b.bookName as name,b.bookDesc as desc) from Book b  where bookName=:name order by bookName desc");
              // query.setString(0, "java高级学习1");
			query.setParameter("name", "java高级学习");
			//			List<Object[]> bookList=query.list();
//			tx.commit();
//			for (Object[] book : bookList) {
//				System.out.println(book[0]+":"+book[1]);
//			}
			List<Map> bookList=query.list();
			tx.commit();
			for (Map book : bookList) {
				//System.out.println(book.get("0")+":"+book.get("1"));
				System.out.println(book.get("name")+":"+book.get("desc"));
			}
			
			
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doQuery4(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Query query=session.createQuery("update Book set bookDesc='java 南京ETC学习'");
			int bookList=query.executeUpdate();
			System.out.println(bookList);
			tx.commit();
			
			
			
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doQuery5(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			//get方法测试
			Query query=session.getNamedQuery("bookquery");
			List<Book> bookList=query.list();
			tx.commit();
			for (Book book : bookList) {
				System.out.println(book.getBookDesc()+":"+book.getBookName());
			}
			
			
			//session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doQuery7(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			String sqlString="select {b.*} from book b";
			SQLQuery query=session.createSQLQuery(sqlString);
//			List<Object[]> bookList=query.list();
//			for (Object[] book : bookList) {
//				System.out.println(book[0]+":"+book[1]);
//			}
			query.addEntity("b",Book.class);
			List<Book> bookList=query.list();
			
			for (Book book : bookList) {
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

	public void doQuery6(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			String sqlString="select * from book";
			SQLQuery query=session.createSQLQuery(sqlString);
//			List<Object[]> bookList=query.list();
//			for (Object[] book : bookList) {
//				System.out.println(book[0]+":"+book[1]);
//			
			query.addEntity(Book.class);
		     List<Book> bookList=query.list();
		
			for (Book book : bookList) {
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

	public void doQuery8(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			String sqlString="select b.book_name  from book b";
			SQLQuery query=session.createSQLQuery(sqlString);
		query.addScalar("bookName",Hibernate.STRING);
		query.setResultTransformer(Transformers.aliasToBean(Book.class));
//			List<Object[]> bookList=query.list();
//			for (Object[] book : bookList) {
//				System.out.println(book[0]+":"+book[1]);
//			
			//query.addEntity(Book.class);
			List<Book> bookList=query.list();
			
			for (Book book : bookList) {
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
	public void doQuery9(){
		//获得session
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			session.beginTransaction();
			Query query=session.getNamedQuery("bookquery1");
//			List<Object[]> bookList=query.list();
//			for (Object[] book : bookList) {
//				System.out.println(book[0]+":"+book[1]);
//			
			//query.addEntity(Book.class);
			List<Book> bookList=query.list();
			
			for (Book book : bookList) {
				System.out.println("dd");
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
}
