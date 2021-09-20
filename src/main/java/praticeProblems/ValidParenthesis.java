package praticeProblems;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Test;

public class ValidParenthesis {

	/*
	 * [{(
	 */

	@Test
	public void test1() {
		String input="[{()}]()";
		System.out.println(checkValidParenthesis(input));
	}

	@Test
	public void test2() {
		String input="[{)}]()";
		System.out.println(checkValidParenthesis(input));

	}

	@Test
	public void test3() {
		String input="](()){}";
		System.out.println(checkValidParenthesis(input));

	}
	
	@Test
	public void test4() {
		String input="((";
		System.out.println(checkValidParenthesis(input));

	}

	/*
	 * []()
	 * Initialize a stack of char arr
	 * Initialize hashmap with close bracket as key and open as val
	 * Traverse through the string
	 * push the open braces to stack
	 * if the char is close bracket and pop the elment and compare with map
	 * Repeat till end of loop
	 * if it does not match return false
	 * 
	 */
	private boolean checkValidParenthesis(String input) {
		Stack<Character> stack=new Stack<>();
		HashMap<Character,Character> map=new HashMap<>();

		map.put(']', '[');
		map.put('}', '{');
		map.put(')', '(');

		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='['||input.charAt(i)=='{'||input.charAt(i)=='('){
				stack.push(input.charAt(i));
			}else{
				int val=map.get(input.charAt(i));
				if(!stack.isEmpty() ){
					if(stack.pop()!=val ){
						return false;
					}
				}else{
					return false;						
				}

			}
		}
		if(stack.isEmpty()){
			return true;
		}else{
			return false;
		}

	}
}


