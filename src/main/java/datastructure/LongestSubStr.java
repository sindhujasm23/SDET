package datastructure;

import org.junit.Test;

public class LongestSubStr {

	@Test
	public void test1(){
		String s="pwwkew";
		findLongestSubString(s);
	}

	private int findLongestSubString(String s) {
		int left=0,right=0,max=0,uniquecount=0;
		int[] count = new int[128];

		for (right = 0; right < s.length(); right++) {
			count[s.charAt(right)]++;
		
				
		}

		return max;
	}

}
