package org.lxh.gendemo1;

public class GenDemo01 {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10); // �������ꡣint --> Integer --> Object
		p.setY(10);// �������ꡣint --> Integer --> Object
		int x = (Integer)p.getX() ;	// ȡ��X��Object --> Integer --> int
		int y = (Integer)p.getY() ;	// ȡ��X��Object --> Float --> float
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
