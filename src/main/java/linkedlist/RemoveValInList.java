package linkedlist;

import org.junit.Test;

public class RemoveValInList {

	public class Node{

		int value;
		Node next;

		public Node(int key){
			this.value=key;
			next=null;
		}

	}
	public Node addNode(int key){
		return new Node(key);
	}

	public void printAllNode(Node node){
		while(node!=null){
			System.out.println(node.value);
			node=node.next;
		}
	}

	public Node removeVal(Node node,int val){
		Node prev=new Node(0);
		Node current=prev;
		if(node==null) return node;
		while(node!=null){

			if(node.value==val){
				current.next=node.next;
				node=node.next;
			}else{
				current.next=node;
				node=node.next;
				current=current.next;
			}			
		}
		return prev.next;
	}
	Node prev=new Node(0);
	Node current=prev;
	public Node removeValUsigRecursion(Node node,int val){
		
		if(node==null) return prev.next;
		if(node.value==val){
			current.next=removeValUsigRecursion(node.next,val);			
		}else{
			current.next=node;		
			current=current.next;
		}		
		return removeValUsigRecursion(node.next,val);
	}

	@Test
	public void test1(){
		Node head=addNode(1);
		head.next=addNode(2);
		head.next.next=addNode(3);
		head.next.next.next=addNode(4);
		head.next.next.next.next=addNode(2);
		printAllNode(removeValUsigRecursion(head,2));
	}

	@Test
	public void test2(){
		Node head=addNode(7);
		head.next=addNode(7);
		head.next.next=addNode(7);
		head.next.next.next=addNode(7);
		head.next.next.next.next=addNode(7);
		printAllNode(removeValUsigRecursion(head,7));
	}

	@Test
	public void test3(){
		Node head=null;
		printAllNode(removeValUsigRecursion(head,2));
	}

}
