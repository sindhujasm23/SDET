package praticeProblems;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class LongestNonRepeatedSubstring {

	/*
	 * 
	 */
	@Test
	public void test1() {
		String s = "abcabcbb";
		findLongSubStr(s);
	}

	@Test
	public void test2() {
		String s = "bbbb";
		findLongSubStr(s);
	}

	@Test
	public void test3() {
		String s = "pwwkew";
		findLongSubStr(s);
	}

	/*
	 * Initialize left as 0 right as 1
	 * 
	 */

	private int findLongSubStr(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		String output="";
		int left=0,right=0,count=0,res=0;
		while(right<s.length()){
			char c = s.charAt(right);
			map.put(c, map.getOrDefault(c, 0) + 1);
			if(map.get(c) > 1) count++;
			right++;

			while (count > 0) {
				//if (map[s.charAt(begin++)]-- > 1) counter--;
				char charTemp = s.charAt(left);
				if (map.get(charTemp) > 1) count--;
				map.put(charTemp, map.get(charTemp)-1);
				left++;
			}
			res = Math.max(res, right - left);
		}
		System.out.println(res);
		return res;
	}





}


