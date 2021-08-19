package kandane;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArray {
	/*
	 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum 
	 * and return its sum.

	A subarray is a contiguous part of an array.a
	 */
	@Test
	public void test1(){
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		Assert.assertEquals(6, findMaxSum(nums));;
	}
	@Test
	public void test2(){
		int[] nums={1};
		Assert.assertEquals(1, findMaxSum(nums));;
	}
	@Test
	public void test3(){
		int[] nums={5,4,-1,7,8};
		Assert.assertEquals(23, findMaxSum(nums));;
	}

	private int findMaxSum(int[] nums) {
		// TODO Auto-generated method stub
		int windowSum=nums[0],maxSum=nums[0];
		
		if(nums.length==0) {
			throw new RuntimeException("Array is empty");
		}
		
		for (int i = 1; i < nums.length; i++) {
			windowSum=Math.max(windowSum+nums[i], nums[i]);
			maxSum=Math.max(maxSum, windowSum);
			
		}
		return maxSum;
	}
}
