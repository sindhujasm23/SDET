package datastructure;

import java.util.Arrays;

import org.junit.Test;

public class PerumutationSubStrng {
	
	
	@Test
	public void test1(){
		String s1="ab";
		String s2="eidbaooo";
		findSubStrng(s1,s2);
	}
	
	@Test
	public void test2(){
		String s1="ab";
		String s2="eidboaoo";
		findSubStrng(s1,s2);
	}
	
	@Test
	public void test3(){
		String s1="ab";
		String s2="b";
		findSubStrng(s1,s2);
	}
	/*
	 * 1.Add charcter of s1 to map with occurences
	 * 2.Traverse through s2 from satrt index
	 * 3.take the substring from start index till s1 length
	 * 4.load the character in int array
	 * 5.compare the charcter count with hash map if it contains 
	 */
	
	//String s1="ab";
	//String s2="eidbaooo";
	private boolean findSubStrng(String s1, String s2) {
		
		return false;
		
		
	}

}
