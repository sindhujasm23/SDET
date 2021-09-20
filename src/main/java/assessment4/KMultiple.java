package assessment4;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class KMultiple {

	/*
	 * Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise. An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 
Example 1:
Input: nums = [23,2,4,6,7], k = 6
Output: true
Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
Example 2:
Input: nums = [23,2,6,4,7], k = 6
Output: true
Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
Example 3:
Input: nums = [23,2,6,4,7], k = 13
Output: false
	 */
	@Test
	public void test1(){
		int []input={23,2,4,6,7};
		int k=6;
		Assert.assertEquals(true, findMultipleK(input,k));
	}

	@Test
	public void test2(){
		int []input={23,2,4,6,7};
		int k=13;
		Assert.assertEquals(false, findMultipleK(input,k));
	}

	@Test
	public void test3(){
		int []input={23,2,4,6,7};
		int k=4;
		Assert.assertEquals(true, findMultipleK(input,k));
	}

	private boolean findMultipleK(int[] input, int k) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int rem=0;
		for (int i = 0; i < input.length; i++) {	
			rem= map.size()>0 ? (+input[i])%k : input[i]%k;
			
			if(map.containsKey(rem)||rem==0){
				return true;
			}else{
				map.put(rem, i);
			}
		}
		return false;
	}
}
