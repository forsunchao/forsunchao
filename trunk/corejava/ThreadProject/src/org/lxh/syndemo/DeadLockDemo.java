package org.lxh.syndemo;

class Stole {
	public synchronized void say(Police police) {
		System.out.println("��Ǯ���ң�����");
		police.give();
	}

	public synchronized void give() {
		System.out.println("С͵���˷��ˡ�");
	}
}

class Police {
	public synchronized void say(Stole stole) {
		System.out.println("���˷��ˣ��Ҹ���Ǯ��");
		stole.give();
	}

	public synchronized void give() {
		System.out.println("�����ǮǮ���ˡ�");
	}
}

public class DeadLockDemo implements Runnable {
	private Stole stole = new Stole();
	private Police police = new Police();

	public DeadLockDemo() {
		new Thread(this).start();
		police.say(stole);
	}

	public void run() {
		stole.say(police);
	}

	public static void main(String[] args) {
		new DeadLockDemo();
	}

}
