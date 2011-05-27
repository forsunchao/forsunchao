package org.lxh.gendemo7;

public class PersonDemo {
	public static void main(String args[]){
		Person<Basic> per = null ;
		per = new Person<Basic>() ;
		Basic b = new Basic("уехЩ",22) ;
		
		per.setInfo(b) ;
		System.out.println(per.getInfo());
	}
}
