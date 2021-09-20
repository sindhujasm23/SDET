package praticeProblems;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MinBalancedString {

	@Test
	public void test1() {
		String s="azABaabza";
		System.out.println(minBalncedString(s));
	}

	@Test
	public void test2() {
		String s="TacoCat";
		System.out.println(minBalncedString(s));
	}

	@Test
	public void test3() {
		String s="sfsdgadafagd";
		System.out.println(minBalncedString(s));
	}

	private int minBalncedString(String s) {
		Set<Character> set=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		int left=0,right=0,max=-1;
		while(right<s.length()){
			char each=s.charAt(right);
			if(Character.isLowerCase(each)){
				if(set.contains(Character.toUpperCase(each))){
					right++;
					max=Math.max(max, right-left);
				}else{		
					//max=Math.max(max, right-left);
					right++;
					left=right;
				}
			}else{
				if(set.contains(Character.toLowerCase(each))){
					right++;
					max=Math.max(max, right-left);		
				}else{		
					//max=Math.max(max, right-left);	
					right++;
					left=right;
				}
			}
			
		}
		return max;


	}
}


