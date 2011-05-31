package test;

public class ProducerConsumer {

	public static void main(String[] args) {
		ProductList ps = new ProductList();
		Producer px = new Producer(ps, "生产者X");
		Producer py = new Producer(ps, "生产者Y");
		Consumer ca = new Consumer(ps, "消费者A");
		Consumer cb = new Consumer(ps, "消费者B");
		Consumer cc = new Consumer(ps, "消费者C");
		new Thread(px).start();
		new Thread(py).start();
		new Thread(ca).start();
		new Thread(cb).start();
		new Thread(cc).start();
	}
}

/**
 * @author liuzhongbing
 * 产品类
 */
class Product {
	private String producedBy = "N/A";
	private String consumedBy = "N/A";

	// 构造函数，指明及生产者名字
	Product(String producedBy) {
		this.producedBy = producedBy;
	}

	// 消费，需要指明消费者名字
	public void consume(String consumedBy) {
		this.consumedBy = consumedBy;
	}

	public String toString() {
		return "产品, 生产者 = " + producedBy + ", 消费者 = "
				+ consumedBy;
	}

	public String getProducedBy() {
		return producedBy;
	}

	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}

	public String getConsumedBy() {
		return consumedBy;
	}

	public void setConsumedBy(String consumedBy) {
		this.consumedBy = consumedBy;
	}
}


/**
 * @author liuzhongbing
 * 这个class就是仓库，是生产者跟消费者共同争夺控制权的同步资源
 */
class ProductList {
	int index = 0;
	Product[] productList = new Product[6];

	// push使用来让生产者放置产品的
	public synchronized void push(Product product) {
		// 如果仓库满了
		while (index == productList.length) {
			try {
				System.out.println("  " + product.getProducedBy() + " is waiting.");
				// 等待，并且从这里退出push()
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 注意，notifyAll()以后，并没有退出，而是继续执行直到完成。
		productList[index] = product;
		index++;
		System.out.println(index + " " + product.getProducedBy() + " 生产了: " + product);
		
		// 因为我们不确定有没有线程在wait()，所以我们既然生产了产品，就唤醒有可能等待的消费者，让他们醒来，准备消费
		notifyAll();
		System.out.println("  " + product.getProducedBy() + " sent a notifyAll().");
	}

	// pop用来让消费者取出产品的
	public synchronized Product pop(String consumerName) {
		// 如果仓库空了
		while (index == 0) {
			try {
				System.out.println("  " + consumerName + " is waiting.");
				// 等待，并且从这里退出pop()
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 注意，notifyAll()以后，并没有退出，而是继续执行直到完成。
		// 取出产品
		index--;
		Product product = productList[index];
		product.consume(consumerName);
		System.out.println(index + " " + product.getConsumedBy() + " 消费了: " + product);
		
		// 因为我们不确定有没有线程在wait()，所以我们既然消费了产品，就唤醒有可能等待的生产者，让他们醒来，准备生产
		notifyAll();
		System.out.println("  " + consumerName + " sent a notifyAll().");
		return product;
	}
}

/**
 * @author liuzhongbing
 * 生产者
 */
class Producer implements Runnable {

	String name;
	ProductList ps = null;

	Producer(ProductList ps, String name) {
		this.ps = ps;
		this.name = name;
	}

	public void run() {
		while (true) {
			Product product = new Product(name);
			ps.push(product);
			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {

	String name;
	ProductList ps = null;

	Consumer(ProductList ps, String name) {
		this.ps = ps;
		this.name = name;
	}

	public void run() {
		while (true) {
			ps.pop(name);
			try {
				Thread.sleep((int) (Math.random() * 600));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
