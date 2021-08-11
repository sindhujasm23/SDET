package recursion;

import org.junit.Test;

public class ReverseString {
	
	@Test
	public void test1(){
		String s="Program";
		System.out.println(reverseString(s));
	}
	
	@Test
	public void test2(){
		String s="helloworld";
		System.out.println(reverseString(s));
	}

	private String reverseString(String s) {
		if(s.length()==0) return "";
		StringBuilder str=new StringBuilder();		
		str.append(s.charAt(s.length()-1));
		str.append(reverseString(s.substring(0,s.length()-1)));
		return str.toString();
	}

}
