package org.lxh.gendemo1;

public class GenDemo03 {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX("����120��"); // �������ꡣString --> Object
		p.setY("��γ230��");// �������ꡣString --> Object
		String x = (String)p.getX() ;	// ȡ��X��Object --> String
		String y = (String)p.getY() ;	// ȡ��X��Object --> String
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
