package petshopdemo;

public class Cat implements Pet {
	private String name ;
	private int age ;
	private float price ;
	
	public Cat(String name, int age, float price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString() {
		return "宠物猫的名字：" + this.name + "，年龄：" + this.age + "，价格：" + this.price;
	}
}
