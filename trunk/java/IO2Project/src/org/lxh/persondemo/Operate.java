package org.lxh.persondemo;

public class Operate {
	public static void add() {
		InputData input = new InputData();
		String name = input.getString("����������");
		int age = input.getInt("�������䣺", "����Ĳ������֣�");
		Person per = new Person(name, age);
		FileOperate operate = new FileOperate("d:\\pers.ser");
		try {
			operate.save(per);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void find() {
		FileOperate operate = new FileOperate("d:\\pers.ser");
		Person per = null;
		try {
			per = (Person) operate.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (per != null) {
			System.out.println(per);
		} else {
			System.out.println("û���κε����ݡ�");
		}
	}

	public static void update() {
		FileOperate operate = new FileOperate("d:\\pers.ser");
		Person per = null;
		try {
			per = (Person) operate.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		InputData input = new InputData();
		String name = input.getString("����������ԭ������" + per.getName() + "����");
		int age = input.getInt("�������䣨ԭ���䣺" + per.getAge() + "����", "����Ĳ������֣�");
		per = new Person(name, age);
		operate = new FileOperate("d:\\pers.ser");
		try {
			operate.save(per);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void delete() {
		FileOperate operate = new FileOperate("d:\\pers.ser");
		try {
			operate.save(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
