package org.sunchao.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sunchao.pojo.Guestbook;
import org.sunchao.util.HibernateSessionFactoryUtil;

public class Test {
	public static void main(String[] args) {
//		Test.add();
		Test.list();
//		Test.update();
//		Test.delete();
	}

	public static void add() {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		// 写入数据
		Guestbook gb = new Guestbook();
		gb.setName("sunchao");
		gb.setTitle("我的第一个hibernate程序");
		gb.setContent("哈哈，我非常的高兴啊");
		gb.setTime(new Date());
		// 保存对象
		session.save(gb);
		// 得到对象
		// user = (User)session.get(User.class, new Integer(12));//没找到返回null
		// user = (User)session.load(User.class, new Integer(12));//没找到抛出违例
		try {
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
	}

	public static void list() {
		Session session = HibernateSessionFactoryUtil.getSessionFactory()
				.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		// 写入数据
		Query query = session.createQuery("from Guestbook order by id desc");
		List<Guestbook> list = query.list();
		for(Guestbook gb:list) {
			System.out.print(gb.getId());
			System.out.println(gb.getName());
			System.out.println(gb.getTitle());
		}
		transaction.commit();
	}

	public static void update() {
		Session session = HibernateSessionFactoryUtil.getSessionFactory()
				.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		// 写入数据
		Guestbook gb = new Guestbook();
		// 得到对象
		gb = (Guestbook)session.get(Guestbook.class, new Integer(23));//没找到返回null
		// user = (User)session.load(User.class, new Integer(12));//没找到抛出违例
		gb.setName("张三");
		session.update(gb);
		transaction.commit();
	}

	public static void delete() {
		Session session = HibernateSessionFactoryUtil.getSessionFactory()
				.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		// 写入数据
		Guestbook gb = new Guestbook();
		// 得到对象
		gb = (Guestbook)session.get(Guestbook.class, new Integer(12));//没找到返回null
		session.delete(gb);
		transaction.commit();
	}

}
