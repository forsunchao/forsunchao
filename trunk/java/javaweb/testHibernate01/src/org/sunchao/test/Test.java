package org.sunchao.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.sunchao.pojo.User;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		//д������
		User user = new User();
		user.setName("sunchao");
		user.setTitle("�ҵĵ�һ��hibernate����");
		user.setContent("�������ҷǳ��ĸ��˰�");
		user.setTime(new Date());
		//�������
		session.save(user);
		//�õ�����
		//user = (User)session.get(User.class, new Integer(12));//û�ҵ�����null
		//user = (User)session.load(User.class, new Integer(12));//û�ҵ��׳�Υ��
		user.setName("�ﳬ");
		session.update(user);
		transaction.commit();
	}
}
