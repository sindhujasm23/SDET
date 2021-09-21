package stringproblems;

import java.util.HashMap;

import org.junit.Test;

public class WordPattern {
	//https://leetcode.com/problems/word-pattern/
	@Test
	public void test1() {
		String pattern ="abba";
		String s="dog cat cat dog";
		System.out.println(matchPattern(pattern,s));
	}

	@Test
	public void test2() {
		String pattern ="abba";
		String s="dog cat cat fish";
		System.out.println(matchPattern(pattern,s));
	}

	@Test
	public void test3() {
		String pattern ="aaaa";
		String s="dog cat cat dog";
		System.out.println(matchPattern(pattern,s));
	}

	@Test
	public void test4() {
		String pattern ="aaa";
		String s="dog dog dog dog";
		System.out.println(matchPattern(pattern,s));
	}

	private boolean matchPattern(String pattern, String s) {
		HashMap<Character,String> map=new HashMap<>();
		String str[]=s.split("\\s+");
		if(pattern.length()<str.length || str.length<pattern.length()) return false;
		for (int i = 0; i < pattern.length(); i++) {
			if(map.containsKey(pattern.charAt(i))){
				if(!str[i].equalsIgnoreCase(map.get(pattern.charAt(i)))){
					return false;
				}
			}else{
				if(!map.values().contains(str[i])){
					map.put(pattern.charAt(i), str[i]);
				}else{
					return false;
				}
			}

		}
		//System.out.println(map);
		return true;

	}
}


