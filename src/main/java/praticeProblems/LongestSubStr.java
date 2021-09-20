package praticeProblems;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class LongestSubStr {

	@Test
	public void test1() {
		String s="abcabcbb";
		//findLongestSubStr(s);
		findLongestSubStrUsingSet(s);
	}

	@Test
	public void test2() {
		String s="bbbbb";
	//	findLongestSubStr(s);
		findLongestSubStrUsingSet(s);
	}

	@Test
	public void test3() {
		String s=" ";
		//findLongestSubStr(s);
		findLongestSubStrUsingSet(s);
	}
	@Test
	public void test4() {
		String s="pwwkew";
		//findLongestSubStr(s);
		findLongestSubStr(s);
	//	lengthOfLongestSubstring(s);
	}

	public int lengthOfLongestSubstring(String s) {
		int max=0,currentMax=0;
		StringBuilder subString=new StringBuilder();
		int left=0,right=0;
		while(right<s.length()){
			if(subString.toString().indexOf(s.charAt(right))==-1){
				subString.append(s.charAt(right++));	
				currentMax=subString.length();
				max=Math.max(max,currentMax);
			}else{
				subString.deleteCharAt(left);
			}
		}

		//abcabcbb
		System.out.println(max);
		return max;
	}
	//pwwkew abcd
	private void findLongestSubStr(String s) {
		int maxLength=0,val=0;
		HashMap<Character,Integer> map= new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))){
				val=Math.max(val,map.get(s.charAt(i))+1);
			}
			map.put(s.charAt(i), i);
			maxLength=Math.max(maxLength, i-val+1);//1
		}
		System.out.println(maxLength);
	
	}
	//pwwkew
	private void findLongestSubStrUsingSet(String s) {
		HashSet<Character> set=new HashSet<Character>();
		int left=0,right=0,max=0;
		while(right<s.length()){
			if(set.contains(s.charAt(right))){
				set.remove(s.charAt(left));
				left++;
			}else{
				set.add(s.charAt(right++));	
			}
			max=Math.max(max, set.size());
		}
		System.out.println(max);
	}
}


