package LinkDemo;
class Node1{
	private String name ;	// 保存节点的名字
	private Node1 next ;		// 保存下一个节点
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
		Node1 root = new Node1("根节点") ;
		Node1 n1 = new Node1("第一节车厢");
		Node1 n2 = new Node1("第二节车厢");
		Node1 n3 = new Node1("第三节车厢");

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