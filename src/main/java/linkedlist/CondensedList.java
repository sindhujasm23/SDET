package linkedlist;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import linkedlist.MergedLinkedList.Node;

public class CondensedList {
	/*
	 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with 
	 * even indices, and return the reordered list.
		The first node is considered odd, and the second node is even, and so on.
		Note that the relative order inside both the even and odd groups should remain as it was in the input.
		You must solve the problem in O(1) extra space complexity and O(n) time complexity.
	 *
	 * Input = Node
	 * Output = Node
	 *
	 */

	public class Node {
		int value;
		Node next;

		Node() {
		}

		Node(int val) {
			this.value = val;
			this.next = null;
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

	public Node condensedList(Node head) {
		if (head == null)
			return null;
		Node output = new Node();
		Node temp = output;
		Set<Integer> set = new HashSet<Integer>();
		while (head != null) {
			if(set.contains(head.value)) {
				head = head.next;
				temp.next=null;
			} else {
				set.add(head.value);
				temp.next = head;
				head = head.next;
				temp = temp.next;
			}		
		}
		return output.next;
	}

	public Node reorderNode(Node node){
		Node newNode=new Node();
		Node current=newNode;
		Node head=node;
		
		while(node!=null){
			
			current.next=node;
			node=node.next.next;
			current=current.next;
		}
		
		return newNode.next;

	}

	@Test
	public void test1() {
		Node head = addNode(7);
		head.next = addNode(2);
		head.next.next = addNode(3);
		head.next.next.next = addNode(4);
		head.next.next.next.next = addNode(5);
		Node reorder=reorderNode(head);
		printAllNodes(reorder);
		//printAllNodes(condensedList(reorder));
	}

	@Test
	public void test2() {
		Node head = addNode(1);
		head.next = addNode(2);
		head.next.next = addNode(3);
		//printAllNodes(condensedList(head));
	}

	@Test
	public void test3() {
		Node head = addNode(1);
		//printAllNodes(condensedList(head));
	}
}
