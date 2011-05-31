package test;

public class CheckInOut {

	public static void main(String[] args) {
		BankCard card = new BankCard();
		Parent px = new Parent(card, "爸爸", 1500, 500);
		Parent py = new Parent(card, "妈妈", 1000, 800);
		Parent pz = new Parent(card, "爷爷", 800, 1000);
		Children ca = new Children(card, "大女儿", 400, 600);
		Children cb = new Children(card, "二女儿", 300, 600);
		Children cc = new Children(card, "三儿子", 500, 600);
		new Thread(px).start();
		new Thread(py).start();
		new Thread(pz).start();
		new Thread(ca).start();
		new Thread(cb).start();
		new Thread(cc).start();
	}
}

class BankCard {
	int sum = 0;

	// 存款
	public synchronized void save(String name, int count) {
		// 如果存了足够的钱就不在存了
		while (sum > 5000) {
			try {
				System.out.println(name + "\t存款: 发现钱够了");
				// 等待，并且从这里退出push()
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 注意，notifyAll()以后，并没有退出，而是继续执行直到完成。
		this.sum += count;
		System.out.println(name + "\t存入了 [￥" + count + "]\t余额 [￥" + this.sum + "]");
		
		// 因为我们不确定有没有线程在wait()，所以我们既然存了钱，就唤醒有可能等待的孩子，让他们醒来，准备取款
		notifyAll();
		System.out.println("\t" + name + "告诉孩子存钱了");
	}

	// 取款
	public synchronized void cost(String name, int count) {
		// 如果钱不够了，就不再取款
		while (sum < count) {
			try {
				System.out.println(name + "\t取款: 等钱花" + count);
				// 等待，并且从这里退出pop()
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 注意，notifyAll()以后，并没有退出，而是继续执行直到完成。
		this.sum -= count;
		System.out.println(name + "\t取走了 [￥" + count + "]\t余额 [￥" + this.sum + "]");
		
		// 因为我们不确定有没有线程在wait()，所以我们既然消费了产品，就唤醒有可能等待的生产者，让他们醒来，准备生产
		notifyAll();
		System.out.println("\t" + name + "告诉父母取钱了");
	}
}


class Parent implements Runnable {
	
	BankCard card = null;// 银行卡
	String name;// 姓名
	int count;// 存款数量
	int interval;// 存款时间间隔

	Parent(BankCard card, String name, int count, int interval) {
		this.card = card;
		this.name = name;
		this.count = count;
		this.interval = interval;
	}

	public void run() {
		while (true) {
			card.save(name, count);
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Children implements Runnable {

	BankCard card = null;// 银行卡
	String name;// 姓名
	int count;// 取款数量
	int interval;// 取款时间间隔

	Children(BankCard card, String name, int count, int interval) {
		this.card = card;
		this.name = name;
		this.count = count;
		this.interval = interval;
	}


	public void run() {
		while (true) {
			//int count = (int) (Math.random() * degree);
			card.cost(name, count);
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
