package praticeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class RemoveInvalidParenthesis {

	/*
	 * Remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:

It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
 
Example 1:

Input: s = “abc(a(c)e)de)"
Output: “abc(a(c)e)de"
Explanation: “abc(a(ce)de)" , “abc(a(c)ede)" would also be accepted.

	 */

	@Test
	public void test1() {
		String s="abc(a(c)e)de)";
		removeInvalidParenthesisUsingStack(s);
	}

	@Test
	public void test2() {
		String s="a)b(c)d";
		removeInvalidParenthesisUsingStack(s);
	}

	@Test
	public void test3() {
		String s="))((";
		removeInvalidParenthesisUsingStack(s);
	}

	@Test
	public void test4() {
		String s="(a(b(c)d)";
		removeInvalidParenthesisUsingStack(s);
	}

	private void removeInvalidParenthesisUsingStack(String s) {

		Stack<Character> openStack=new Stack<Character>();
		Stack<Integer> index=new Stack<>();
		List<Integer> removeIndex=new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='('){
				openStack.push(s.charAt(i));
				index.push(i);
			}else if(s.charAt(i)==')'){
				if(openStack.isEmpty()){
					removeIndex.add(i);
				}else{
					openStack.pop();
					index.pop();
				}
			}
		}

		while(!index.isEmpty()){
			removeIndex.add(index.pop());
		}
		
		StringBuffer str=new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if(!removeIndex.contains(i)){
				str.append(s.charAt(i));	
			}
		}
		System.out.println(str.toString());

	}

	private void removeInvalidParenthesis(String s) {
		int closeIndex=0,startIndex=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==')'){
				closeIndex=i;
				break;
			}

			if(s.charAt(i)=='('){
				startIndex=i;				
			}			
		}
		for (int i = 0; i < s.length(); i++) {


		}



	}
}


