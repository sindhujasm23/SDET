package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz {

	
	/*
	 * Given an integer n, return a string array answer (1-indexed) where:

	answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
	answer[i] == "Fizz" if i is divisible by 3.
	answer[i] == "Buzz" if i is divisible by 5.
	answer[i] == i if non of the above conditions are true.
	
	input-->integer
	output-string list
	constraint hashmap and two pointer -2min
	
	 */
	
	@Test  //test data -5min
	public void test1(){
		int n=3;
		System.out.println(fizzBuzz(n));
	}

	@Test
	public void test2(){
		int n=5;
		System.out.println(fizzBuzz(n));
	}

	@Test
	public void test3(){
		int n=15;
		System.out.println(fizzBuzz(n));
	}
	
	@Test
	public void test4(){
		int n=2;
		System.out.println(fizzBuzz(n));
	}

	/*Brute force - 3min
	 * Time-O(n)
	 * Space-O(n)
	 * 
	 */
	
	/*Two Pointer with hash map -7min
	 * Initialize an hashmap with key as Integer and value as String
	 * Initialize left as 1 and right as n
	 * Check if left  is divisible by both 3 and 5 or either of 3 or 5
	 * If divisible by 3 and 5 , add  left as key and FizzBuzz as value
	 * If divisible by 3 , add  left as key and Fizz as value 
	 * If divisible by 5 , add  left as key and Buzz as value
	 * If not add left as key and value
	 * Do the same for right
	 * Increment left and decrement right and repeat it till left is less than equals to right
	 */
	
	private List<String> fizzBuzz(int n) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		int left=1,right=n;
		while(left<=right){
			if(left%3==0 && left%5==0){
				map.put(left, "FizzBuzz");
			}else if(left%3==0){
				map.put(left, "Fizz");
			}else if(left%5==0){
				map.put(left, "Buzz");
			}else{
				map.put(left, String.valueOf(left));
			}
			left++;
			
		}
		List<String> list=new ArrayList<String>();
		list.addAll(map.values());		
		return list;
	}
	
}
