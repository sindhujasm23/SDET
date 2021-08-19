package slidingwindow;

import java.util.HashMap;

import org.junit.Test;

public class ContainsDuplicate {

	/*
	 * Given an integer array nums and an integer k, return true if there are
	 *  two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

	Example 1:

	Input: nums = [1,2,3,1], k = 3
	Output: true
	 */
	
	@Test
	public void test1(){
		int nums[]={1,2,3,1};
		int k=3;
		System.out.println(containsDuplicate(nums,k));
	}
	@Test
	public void test2(){
		int nums[]={1,0,1,1};
		int k=1;
		System.out.println(containsDuplicate(nums,k));
	}
	@Test
	public void test3(){
		int nums[]={1,2,3,1,2,3};
		int k=2;
		System.out.println(containsDuplicate(nums,k));
	}

	private boolean containsDuplicate(int[] nums, int k) {
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])){
				int temp=Math.abs(i-map.get(nums[i]));
				if(temp<=k){
					return true;
				}
			}
				map.put(nums[i], i);
			
		}
		return false;
		
	}
	
	
	
}
