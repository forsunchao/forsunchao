package org.lxh.comparesdemo;

class BinaryTree { // ����������Ĳ�����
	class Node {
		private Comparable data; // �����������������
		private Node left; // ������
		private Node right;// ������

		public Node(Comparable<?> data) {
			this.data = data;
		}

		public void addNode(Node newNode) {
			if (newNode.data.compareTo(this.data) <= 0) { // ����������
				if (this.left == null) {// ��û��������������ֱ�ӱ����ڴ˽ڵ��µ�������
					this.left = newNode;// ����������
				} else {
					this.left.addNode(newNode);// ���¼����ж�
				}
			}
			if (newNode.data.compareTo(this.data) > 0) { // ����������
				if (this.right == null) {// ��û��������������ֱ�ӱ����ڴ˽ڵ��µ�������
					this.right = newNode;// ����������
				} else {
					this.right.addNode(newNode);// ���¼����ж�
				}
			}
		}

		public void printNode() { // �����������
			if (this.left != null) {// ����������
				this.left.printNode(); // �����ҵ������������
			}
			System.out.println(this.data); // �ҵ�������
			if (this.right != null) {// ����������
				this.right.printNode(); // �����ҵ������������
			}
		}
	}

	private Node root; // ���ڵ�

	public void add(Comparable data) {// ��������
		Node newNode = new Node(data); // ʵ�����ڵ���
		if (this.root == null) {// û�и��ڵ�
			this.root = newNode; // ��һ���ڵ���Ϊ���ڵ�
		} else {
			this.root.addNode(newNode);
		}
	}

	public void print() { // ���
		this.root.printNode();// ���ȫ���Ľڵ�
	}
}

public class CompareableDemo03 {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree() ;
		bt.add(3) ;
		bt.add(5) ;
		bt.add(1) ;
		bt.add(0) ;
		bt.add(1) ;
		bt.add(9) ;
		bt.print() ;
	}

}
