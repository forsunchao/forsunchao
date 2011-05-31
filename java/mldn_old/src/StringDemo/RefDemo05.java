package StringDemo;
class Person3{
	private String name ;
	private int age;
	private Book2 book ;	// 一个人有一本书
	private Person3 child ;
	public Person3(String n,int a){
		this.setName(n) ;
		this.setAge(a) ;
	}
	public void setChild(Person3 c){
		child = c ;
	}
	public Person3 getChild(){
		return child ;
	}
	public void setBook(Book2 b){
		book = b ;
	}
	public void setName(String n){
		name = n ;
	}
	public void setAge(int a){
		age = a ;
	}
	public Book2 getBook(){
		return book ;
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
};
class Book2{
	private String title ;
	private float price ;
	private Person3 person ;
	public Book2(String t,float p){
		this.setTitle(t) ;
		this.setPrice(p) ;
	}
	public void setPerson3(Person3 p){
		person = p ;
	}
	public void setTitle(String t){
		title = t ;
	}
	public void setPrice(float p){
		price = p ;
	}
	public Person3 getPerson3(){
		return person ;
	}
	public String getTitle(){
		return title ;
	}
	public float getPrice(){
		return price ;
	}
};

public class RefDemo05{
	public static void main(String args[]){
		Person3 per = new Person3("张三",30) ;
		Person3 chd = new Person3("张四",10) ;
		Book2 bk = new Book2("Java基础",89.0f) ;
		Book2 bkc = new Book2("童话故事",89.0f) ;
		per.setChild(chd) ;
		chd.setBook(bkc) ;
		bkc.setPerson3(chd) ;
		per.setBook(bk) ;		// 一个人有一本书
		bk.setPerson3(per) ;	// 一本书属于一个人
		System.out.println(per.getBook().getTitle()) ;	// 由人找到其所拥有书的名字
		System.out.println(bk.getPerson3().getName()) ;	// 由书找到人的名字
	}
};