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
		//写入数据
		User user = new User();
		user.setName("sunchao");
		user.setTitle("我的第一个hibernate程序");
		user.setContent("哈哈，我非常的高兴啊");
		user.setTime(new Date());
		//保存对象
		session.save(user);
		//得到对象
		//user = (User)session.get(User.class, new Integer(12));//没找到返回null
		//user = (User)session.load(User.class, new Integer(12));//没找到抛出违例
		user.setName("孙超");
		session.update(user);
		transaction.commit();
	}
}
