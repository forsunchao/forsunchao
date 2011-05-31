package OODemo;
class Address {
	private String national ;
	private String province ;
	private String city ;
	private String street ;
	private String zipcode ;
	public Address(){}
	public Address(String n,String p,String c,String s,String z){
		this.setNational(n) ;
		this.setProvince(p) ;
		this.setCity(c) ;
		this.setStreet(s) ;
		this.setZipcode(z) ;
	}
	public String getInfo(){
		return	"��ַ��Ϣ��" + "\n" +
				"\t|- ���ң�" + this.getNational() + "\n" +
				"\t|- ʡ�ݣ�" + this.getProvince() + "\n" +
				"\t|- ���У�" + this.getCity() + "\n" +
				"\t|- �ֵ���" + this.getStreet() + "\n" +
				"\t|- �ʱࣺ" + this.getZipcode()  ;				
	}
	public void setNational(String n){
		national = n ; 
	}
	public void setProvince(String p){
		province = p ;
	}
	public void setCity(String c){
		city = c ;
	}
	public void setStreet(String s){
		street = s ;
	}
	public void setZipcode(String z){
		zipcode = z ;
	}
	public String getNational(){
		return national ;
	}
	public String getProvince(){
		return province ;
	}
	public String getCity(){
		return city ;
	}
	public String getStreet(){
		return street ;
	}
	public String getZipcode(){
		return zipcode ;
	}
};
public class AddressDemo{
	public static void main(String args[]){
		Address add = new Address("�й�","����","������","������","100088") ;
		System.out.println(add.getInfo()) ;
	}
};