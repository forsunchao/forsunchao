package org.lxh.syndemo;

class Stole {
	public synchronized void say(Police police) {
		System.out.println("把钱给我，放人");
		police.give();
	}

	public synchronized void give() {
		System.out.println("小偷把人放了。");
	}
}

class Police {
	public synchronized void say(Stole stole) {
		System.out.println("把人放了，我给你钱。");
		stole.give();
	}

	public synchronized void give() {
		System.out.println("警察把钱钱给了。");
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
