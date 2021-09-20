package grouppractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class RepeatedDNASeq {
	//https://leetcode.com/problems/repeated-dna-sequences/
	@Test
	public void test1() {
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		findRepeatedDNA(s);
	}

	@Test
	public void test2() {
		String s = "AAAAAAAAAAAAA";
		findRepeatedDNA(s);
	}

	private List<String> findRepeatedDNA(String s) {
		HashMap<String ,Integer> map=new HashMap<String,Integer>();
		String temp="";
		List<String> str=new ArrayList<>();
		if(s.length()<10) return str;
		for (int i = 0; i < 10; i++) {
			temp=temp+s.charAt(i);
		}
		map.put(temp, 1);
		for (int i = 10; i < s.length(); i++) {
			temp=temp.substring(1);
			temp=temp+s.charAt(i);
			map.put(temp, map.getOrDefault(temp, 0)+1);		
		}

		for(String each:map.keySet()){
			if(map.get(each)>1){
				str.add(each);
			}
		}
		System.out.println(str);
		return str;
	}


}


