package org.lxh.gendemo1;

public class GenDemo02 {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10.3f); // �������ꡣfloat --> Float --> Object
		p.setY(10.6f);// �������ꡣfloat --> Float --> Object
		float x = (Float)p.getX() ;	// ȡ��X��Object --> Float --> float
		float y = (Float)p.getY() ;	// ȡ��X��Object --> Float --> float
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
