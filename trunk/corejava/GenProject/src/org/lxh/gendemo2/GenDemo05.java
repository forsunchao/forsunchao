package org.lxh.gendemo2;

public class GenDemo05 {

	public static void main(String[] args) {
		Point<Integer> p = new Point<Integer>();
		p.setX(10); // �������ꡣint --> Integer --> Object
		p.setY(10);// �������ꡣint --> Integer --> Object
		int x = p.getX() ;	// ȡ��X��Object --> Integer --> int
		int y = p.getY() ;	// ȡ��X��Object --> Float --> float
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
