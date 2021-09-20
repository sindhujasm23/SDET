package assessment4;

import java.util.Stack;

import org.junit.Test;

public class RemoveKDuplicates {

	/*
	 * You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together. We repeatedly make k duplicate removals on s until we no longer can.
Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.
 
Example 1:
Input: s = "abcd", k = 2
Output: "abcd"
Explanation: There's nothing to delete.
	 */


	@Test
	public void test1(){
		String s="deeedbbcccbdaa";
		int k=3;
		removeKDuplicates(s,k);
	}

	@Test
	public void test2(){
		String s="pbbcggttciiippooaais";
		int k=2;
		removeKDuplicates(s,k);
	}

	@Test
	public void test3(){
		String s="abcd";
		int k=2;
		removeKDuplicates(s,k);
	}

	private void removeKDuplicates(String s, int k) {
		Stack<Character> stack=new Stack<Character>();
		Stack<Integer> count=new Stack<Integer>();

		for (int i = 0; i < s.length(); i++) {
			if(!stack.empty()){
				if(stack.peek()==s.charAt(i)){
					stack.push(s.charAt(i));
					int val=count.pop();
					count.push(val+1);
				}else{
					stack.push(s.charAt(i));
					count.push(1);
				}

			}else{
				stack.push(s.charAt(i));
				count.push(1);
			}
			int each=count.peek();
			if(each==k){
				count.pop();
				while(each>0){
					stack.pop();
					each--;
				}
			}

		}
		System.out.println(stack);

	}
}
