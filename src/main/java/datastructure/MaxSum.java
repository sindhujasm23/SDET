package datastructure;

import java.util.Arrays;

import org.junit.Test;

public class MaxSum {
	
	/*
	 * Given an array nums of integers and integer k, return the maximum sum such that there exists i < j with nums[i] + nums[j] = sum and sum < k. If no i, j exist satisfying this equation, return -1.
 
	Example 1:

	Input: nums = [34,23,1,24,75,33,54,8], k = 60
	Output: 58
	Explanation: We can use 34 and 24 to sum 58 which is less than 60.

	Example 2:

	Input: nums = [10,20,30], k = 15
	Output: -1
	Explanation: In this case it is not possible to get a pair sum less that 15.

	Solve this in less than O(n) time complexity


	input-->int[],int
	output-->int
	constraint-->binary search
	
	 */
	
	@Test
	public void test1(){
		int nums[]={34,23,1,24,75,33,54,8};
		int k=60;
		findMaxSum(nums,k);
	}
	
	@Test
	public void test2(){
		int nums[]={10,20,30};
		int k=15;
		findMaxSum(nums,k);
	}
	
	@Test
	public void test3(){
		int nums[]={34,23,1,24,75,33,54,8};
		int k=160;
		findMaxSum(nums,k);
	}
	@Test
	public void test4(){
		int nums[]={34,23,1,24,75,33,54,8};
		int k=160;
		findMaxSum(nums,k);
	}

	private int findMaxSum(int[] nums, int k) {
		//Arrays.sort(nums);
		int left=0,right=nums.length-1,max=0;
		
		while(left<right){
			
			int mid=(left+right)/2;
			
		//	if(nums[left]+nums[right])

		}
		System.out.println(max);
		return max;
		
		
	}

}
