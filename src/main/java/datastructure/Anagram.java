package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Anagram {


	@Test
	public void test1(){
		String s = "cbaebabacd";
		String c = "abc";
		Assert.assertArrayEquals(findAnagramBruteForce(s,c),new int[] {0,6});
	}

	@Test
	public void test2(){
		String s = "pancdnacm";
		String c = "ancd";
		Assert.assertArrayEquals(findAnagramBruteForce(s,c),new int[] {1,3,4});
	}



	@Test
	public void test3(){
		String s = "abacbabc";
		String c = "abc";
		Assert.assertArrayEquals(findAnagramBruteForce(s,c),new int[] {1,2,3,5});
	}
	
	@Test
	public void test4(){
		String s = "abab";
		String c = "ab";
		Assert.assertArrayEquals(findAnagramBruteForce(s,c),new int[] {0,1,2});
	}
	
	@Test
	public void test5(){
		String s = "abacbabc";
		String c = "a";
		Assert.assertArrayEquals(findAnagramBruteForce(s,c),new int[] {0,2,5});
	}
//"abacbabc"
	//"abc"
	/*
	 * 1.Traverse through the loop for each character of string
	 * 2.Check if the current char is present in anagram
	 * 3.If present, remove the matching charcter from anagram 
	 * 4.Traverse through another loop starting from next char till anagrams length
	 * 5.compare current char of inner loop is present in anagram
	 * 		a.If present, remove the matching charcter from anagram
	 * 		b.If not break the inner loop
	 * 		c.If all characters are present add the outerlopp index to list
	 * 
	 */
	//String s = "cbaebabacd";
	//String c = "abc";
	private int[] findAnagramBruteForce(String s, String c) {
		boolean isAnagram=false;
		
		String target=c;
		List<Integer> list=new ArrayList<Integer>();
	
		for (int i = 0; i <s.length()-target.length()+1; i++) {
			c=target;
			int index=c.indexOf(s.charAt(i));
			if(index!=-1 && c.length()>1){
				c=c.substring(0, index)+c.substring(index+1,c.length());
				for (int j = i+1; j < i+target.length(); j++) {
					 isAnagram=false;
					 index=c.indexOf(s.charAt(j));
					if(index!=-1){
						isAnagram=true;
						c=c.substring(0, index)+c.substring(index+1,c.length());
					}else{
						break;
					}
				}
				if(isAnagram){
					list.add(i);
				}
			}else if(index!=-1){
				list.add(i);
			}

		}
		
		int[] output=new int[list.size()];
		for(int j=0;j<list.size();j++){
			output[j]=list.get(j);
		}
		System.out.println(Arrays.toString(output));
		return output;

	}

	private int[] findAnagram(String s, String c) {
		// TODO Auto-generated method stub
		int i=c.length(),index1=0;
		//String temp=s.substring(0, c.length());
		while(i<s.length()){
			if(c.indexOf(s.charAt(i))!=-1 && c.indexOf(s.charAt(index1))!=-1){

			}else{
				i++;
				index1++;
			}
		}
		int[] output=new int[s.length()];
		//		int j=0;
		//		for(int i=0;i<s.length();i++){
		//			//String temp=s.charAt(i);
		//			if(c.indexOf(s.charAt(i))==-1){
		//				
		//			}
		//		}
		//		System.out.println(Arrays.toString(output));
		return output;
	}
}
