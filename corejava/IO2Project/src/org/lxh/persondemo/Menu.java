package org.lxh.persondemo;

public class Menu { // ��ʾ�˵�
	public Menu() {
		while (true) {
			this.show();
		}
	}

	public void show() {
		System.out.println("====== Xxx ϵͳ ========");
		System.out.println("    [1]����������   ");
		System.out.println("    [2]���鿴����   ");
		System.out.println("    [3]���޸�����   ");
		System.out.println("    [4]��ɾ������   ");
		System.out.println("    [0]���˳�ϵͳ   ");
		InputData input = new InputData();
		int choose = input.getInt("\n\n��ѡ��", "��������������룬");
		switch (choose) {
		case 1: {
			Operate.add();
			break;
		}
		case 2: {
			Operate.find();
			break;
		}
		case 3: {
			Operate.update();
			break;
		}
		case 4: {
			Operate.delete();
			break;
		}
		case 0: {
			System.exit(1);
		}
		default: {
			System.out.println("��Ч��ѡ��");
		}
		}
	}
}
