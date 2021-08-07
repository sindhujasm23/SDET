package datastructure;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DictionaryWords {

	/*
	 * 
	 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

	Note that the same word in the dictionary may be reused multiple times in the segmentation.
	Example 1:
	Input: s = "leetcode", wordDict = ["leet","code"]
	Output: true
	Explanation: Return true because "leetcode" can be segmented as "leet code".
	 */

	@Test
	public void test1(){
		String s="leetcode";
		List<String> wordDict=new ArrayList<String>();
		wordDict.add("leet");
		wordDict.add("code");

		System.out.println(findDict(s,wordDict));
	}


	@Test
	public void test2(){
		String s="applepenapple";
		List<String> wordDict=new ArrayList<String>();
		wordDict.add("apple");
		wordDict.add("pen");

		System.out.println(findDict(s,wordDict));
	}

	@Test
	public void test3(){
		String s="catsandog";
		List<String> wordDict=new ArrayList<String>();
		wordDict.add("cats");
		wordDict.add("and");
		wordDict.add("dog");
		wordDict.add("sand");
		wordDict.add("cat");

		System.out.println(findDict(s,wordDict));
	}

	@Test
	public void test4(){
		String s="cars";
		List<String> wordDict=new ArrayList<String>();
		wordDict.add("car");
		wordDict.add("ca");
		wordDict.add("rs");
		//wordDict.add("bbbbb");
		//wordDict.add("aa");

		System.out.println(findDict(s,wordDict));
	}

	private boolean findDict(String s, List<String> wordDict) {
		// TODO Auto-generated method stub
		String str=s;
		for(int i=0;i<wordDict.size();i++){
			if(str.contains(wordDict.get(i))){
				s=s.replace(wordDict.get(i), "");
			}
		}
		if(s.length()==0){
			return true;
		}else{
			return false;
		}
		
	}


}
