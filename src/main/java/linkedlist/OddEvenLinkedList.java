package linkedlist;

import java.util.Collections;

import org.junit.Test;

public class OddEvenLinkedList {

	public class Node{

		int value;
		Node next;
		Node(int key){
			this.value = key;
			next = null;
		}
	}

	public Node addNode(int key) {
		return new Node(key);
		
	}


	public void printAllNodes(Node node) {
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
			
		}
	}

	public Node oddEvenNode(Node node){
		Node odd=new Node(0);

		while(node!=null){
			odd.next=node;
			//System.out.println(node.value);
			node=node.next.next;
		}
		return odd;
	}


	@Test
	public void test1(){
		Node head1 =addNode(1);
		head1.next=addNode(2);
		head1.next.next=addNode(3);
		head1.next.next.next=addNode(4);
		head1.next.next.next.next=addNode(5);
		Node odd=oddEvenNode(head1);
		printAllNodes(odd);
	}

}
