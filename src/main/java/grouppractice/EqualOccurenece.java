package grouppractice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import org.junit.Test;

public class EqualOccurenece {
//https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
	@Test
	public void test1() {
		String s="abacbc";
		areOccurenceEqual(s);
		System.out.println(areOccurenceEqualAsci(s));
	}

	@Test
	public void test2() {
		String s="aaabb";
		areOccurenceEqual(s);
		System.out.println(areOccurenceEqualAsci(s));
	}

	@Test
	public void test3() {
		String s="aaabbbcc";
		areOccurenceEqual(s);
		System.out.println(areOccurenceEqualAsci(s));
	}

	private boolean areOccurenceEqual(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);			
		}
		int val=map.get(s.charAt(0));
		for(Character each:map.keySet()){
		
			if(val!=map.get(each)){
				return false;
			}
		}
		return true;
	}
	
	private boolean areOccurenceEqualAsci(String s) {
		int occ[]=new int[26];
		for (int i = 0; i < s.length(); i++) {
			occ[s.charAt(i)-'a']++;
		}
		
		int val=0;
		for (int i = 0; i < occ.length; i++) {
			if(val==0 && occ[i]!=0){
				val=occ[i];
			}
			if(occ[i]!=0 && val!=occ[i]){
				return false;
			}
			
		}
		return true;
		
		
	}
}


