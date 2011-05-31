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
		// д������
		Guestbook gb = new Guestbook();
		gb.setName("sunchao");
		gb.setTitle("�ҵĵ�һ��hibernate����");
		gb.setContent("�������ҷǳ��ĸ��˰�");
		gb.setTime(new Date());
		// �������
		session.save(gb);
		// �õ�����
		// user = (User)session.get(User.class, new Integer(12));//û�ҵ�����null
		// user = (User)session.load(User.class, new Integer(12));//û�ҵ��׳�Υ��
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
		// д������
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
		// д������
		Guestbook gb = new Guestbook();
		// �õ�����
		gb = (Guestbook)session.get(Guestbook.class, new Integer(23));//û�ҵ�����null
		// user = (User)session.load(User.class, new Integer(12));//û�ҵ��׳�Υ��
		gb.setName("����");
		session.update(gb);
		transaction.commit();
	}

	public static void delete() {
		Session session = HibernateSessionFactoryUtil.getSessionFactory()
				.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		// д������
		Guestbook gb = new Guestbook();
		// �õ�����
		gb = (Guestbook)session.get(Guestbook.class, new Integer(12));//û�ҵ�����null
		session.delete(gb);
		transaction.commit();
	}

}
