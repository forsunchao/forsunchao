package LinkDemo;
class Node1{
	private String name ;	// ����ڵ������
	private Node1 next ;		// ������һ���ڵ�
	public Node1(String name){
		this.name = name ;
	}
	public void setNext(Node1 next){
		this.next = next ;
	}
	public Node1 getNext(){
		return this.next ;
	}
	public String getName(){
		return this.name ;
	}
};
public class LinkDemo01{
	public static void main(String args[]){
		Node1 root = new Node1("���ڵ�") ;
		Node1 n1 = new Node1("��һ�ڳ���");
		Node1 n2 = new Node1("�ڶ��ڳ���");
		Node1 n3 = new Node1("�����ڳ���");

		root.setNext(n1) ;
		n1.setNext(n2) ;
		n2.setNext(n3) ;
		print(root) ;
	}
	public static void print(Node1 node){
		if(node!=null){
			System.out.print(node.getName() + " --> ") ;
		}
		if(node.getNext()!=null){
			print(node.getNext()) ;
		}
	}
};