package praticeProblems;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Test;

public class ValidParan {

	@Test
	public void test1() {
		String s="()";
		findValidParenthesis(s);
	}

	@Test
	public void test2() {
		String s="({])";
		findValidParenthesis(s);
	}

	@Test
	public void test3() {
		String s="{()}";
		findValidParenthesis(s);
	}

	private boolean findValidParenthesis(String s) {

		HashMap<Character,Character> map=new HashMap<>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
		Stack<Character> stack=new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){
				if(!stack.isEmpty()){
					if(stack.pop()!=map.get(s.charAt(i))) return false;
				}else{
					return false;
				}
			}else if(s.charAt(i)=='(' || s.charAt(i)=='['||s.charAt(i)=='{'){
				stack.push(s.charAt(i));
			}
		}
		if(stack.isEmpty())
			return true;
		else return false;

	}
}


