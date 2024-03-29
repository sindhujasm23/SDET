package linkedlist;

import org.junit.Test;

public class MergedLinkedList {
	public class Node{
		int value;
		Node next;
		Node(){
			next = null;
		}
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

	public Node mergeNodes1(Node node1, Node node2) {
		// create a new node (merged), current node
		Node merged = new Node();
		Node current = merged;
		while(node1 != null && node2 != null) {
			if(node1.value < node2.value) {
				current.next = node1;
				node1 = node1.next;
			} else {
				current.next = node2;
				node2 = node2.next;
			}
			current = current.next;
		}
		current.next = node1 == null ? node2 : node1;
		return merged.next;
	}
	
	
	
	
	
	
	// Recursive Algo 
	/*
	 * 1) Break point to come out of the recursion
	 * 2) What condition you need to call the recursion
	 * 3) What argument / value pass to the recursion
	 * 
	 */
	public Node mergeNodes(Node node1, Node node2) {

		if(node1 == null) // break point 
			return node2;

		if(node2 == null)
			return node1;

		// compare
		if(node1.value < node2.value) {
			node1.next = mergeNodes(node1.next,node2);
			return node1;
		} else {
			node2.next = mergeNodes(node1, node2.next);
			return node2;
		}
	}

	@Test
	public void test1() {
		Node head1 = addNode(1);
		head1.next = addNode(3);
		head1.next.next = addNode(5);
		
		Node head2 = addNode(2);
		head2.next = addNode(4);
		head2.next.next = addNode(6);

		Node mergeNodes = mergeNodes1(head1, head2);
		printAllNodes(mergeNodes);
	}
}
