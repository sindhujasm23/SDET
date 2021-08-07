package datastructure;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class UniqueSbString {

	/*
	 * Return the lexicographically smallest subsequence of s that contains all the distinct characters of s
	 *  exactly once.
	 *  Input: "abbcafcb" Output: "bcaf"
	 */

	@Test
	public void test1(){
		String s="abbcafcb";
		System.out.println(findSubString(s));
	}

	private String findSubString(String s) {
		Set<Character> set=new HashSet<Character>();
		StringBuffer str=new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if(set.contains(s.charAt(i))){
				
			}else{
				str.append(s.charAt(i));
				set.add(s.charAt(i));
			}
		}
	
		for (Character each:set) {
			str.append(each);

		}

		return str.toString();

	}

}
