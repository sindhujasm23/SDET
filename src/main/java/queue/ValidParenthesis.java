package queue;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class ValidParenthesis {


	@Test
	public void test1(){
		String s="(()";
		Assert.assertEquals(2,findLongValidParenthesisUsingStack(s));
	}

	@Test
	public void test2(){
		String s=")()())";
		Assert.assertEquals(4,findLongValidParenthesisUsingStack(s));
	}

	@Test
	public void test3(){
		String s="()(()";
		Assert.assertEquals(2,findLongValidParenthesisUsingStack(s));
	}


	private int findLongValidParenthesis(String s) {		
		int output=0;
		for (int i = 0; i < s.length()-1; i++) {			
			if(s.charAt(i)=='('&&s.charAt(i+1)==')'){
				output+=2;				
			}			
		}
		System.out.println(output);
		return output;	
	}
//(()
	private int findLongValidParenthesisUsingStack(String s) {		
		int output=0;
		Stack<Character> stack=new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='('){
				//output++;
				stack.push(s.charAt(i));
			}else if(!stack.isEmpty()){
					//output++;
					stack.pop();			
				
			}else{
				output++;
			}
		}
		if(stack.isEmpty() && output==0){
			System.out.println(s.length());
			return s.length();
		}else{
			System.out.println(s.length()-stack.size()-output);
			return s.length()-stack.size()-output;
		}
			
	}

}
