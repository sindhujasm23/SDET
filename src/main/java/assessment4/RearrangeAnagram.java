package assessment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class RearrangeAnagram {

	/*
	 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
List<List<String>>
 
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:
Input: strs = [""]
Output: [[""]]
Example 3:
Input: strs = ["a"]
Output: [["a"]]
	 */
	@Test
	public void test1(){
		String input[]={"eat","tea","tan","ate","nat","bat"};
		rearrangeAnagram(input);
	}

	private List<List<String>> rearrangeAnagram(String[] input) {
		HashMap<String,List<String>> map= new HashMap<String,List<String>>();
		
		for (int i = 0; i < input.length; i++) {
			String each=input[i];
			int[] temp=new int[26];
			for (int j = 0; j < each.length(); j++) {
				temp[each.charAt(j) - 97]++;
			}
			//System.out.println(temp.toString());
			String key=Arrays.toString(temp);
			//System.out.println(key);
			if(map.containsKey(String.valueOf(key))){
				List<String> list=map.get(key);
				list.add(input[i]);
				map.put(key, list);
			}else{
				List<String> list=new ArrayList<String>();
				list.add(input[i]);
				map.put(key, list);
			}

		}
		 List<List<String>> output=new ArrayList<List<String>> ();
	        output.addAll(map.values());
	        return output;
	}




}
