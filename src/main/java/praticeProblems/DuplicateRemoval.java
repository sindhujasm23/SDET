package praticeProblems;

import java.util.LinkedHashMap;
import java.util.Stack;

import org.junit.Test;

public class DuplicateRemoval {

	@Test
	public void test1() {
		String s="abcd";
		int k=2;
		//removeKDuplicatesUsingStack(s,k);
		removeKDuplicates(s,k);
	}

	@Test
	public void test2() {
		String s="deeedbbcccbdaad";
		int k=3;
		removeKDuplicatesUsingStack(s,k);
		removeKDuplicates(s,k);
	}

	@Test
	public void test3() {
		String s="abbcccd";
		int k=2;
		removeKDuplicatesUsingStack(s,k);
		removeKDuplicates(s,k);
	}
	@Test
	public void test4() {
		String s="abbcccd";
		int k=1;
		removeKDuplicatesUsingStack(s,k);
		removeKDuplicates(s,k);
	}


	
	private void removeKDuplicates(String s, int k) {
		
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		StringBuffer str= new StringBuffer();
		
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			if(map.get(s.charAt(i))==k){
			//	map.put(s.charAt(i), 0);
				map.remove(s.charAt(i));
			}
		}
		System.out.println(map);
		for(Character each:map.keySet()){
			int value=map.get(each);
			while(value>0){			
				str.append(each);
				value--;
			}
		}
		System.out.println(str.toString());
	}
	
	private void removeKDuplicatesUsingStack(String s, int k) {
		Stack<Character> stack1=new Stack<>();
		Stack<Integer> stack2=new Stack<>();
		StringBuffer str= new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if(!stack1.isEmpty()&& stack1.peek()==s.charAt(i)){
				stack1.push(s.charAt(i));
				stack2.push(stack2.peek()+1);				
			}else{
				stack1.push(s.charAt(i));
				stack2.push(1);		
			}
			if(stack2.peek()==k){
				int temp=k;					
				while(temp>0){
					stack1.pop();
					stack2.pop();
					temp--;
				}
			}
		}
	//	System.out.println(stack1);
		while(!stack1.isEmpty()){
			str.append(stack1.pop());
		}
		System.out.println(str.reverse().toString());
	}
}


