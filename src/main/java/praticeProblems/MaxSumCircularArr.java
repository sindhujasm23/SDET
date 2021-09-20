package praticeProblems;

import org.junit.Test;

public class MaxSumCircularArr {
//https://leetcode.com/problems/maximum-sum-circular-subarray/
	@Test
	public void test1() {
		int nums[]={1,-2,3,-2};
		findMaxSum(nums);
	}

	@Test
	public void test2() {
		int nums[]={5,-3,5};
		findMaxSum(nums);
	}

	@Test
	public void test3() {
		int nums[]={3,-1,2,-1};
		findMaxSum(nums);
	}
	

	@Test
	public void test4() {
		int nums[]={-2,4,-5,4,-5,9,4};
		findMaxSum(nums);
	}


	private int findMaxSum(int[] nums) {
		 int currentSum=nums[0],maxSum=nums[0],totalSum=nums[0];
		 if(nums.length==1) return nums[0];
			for (int i = 1; i < nums.length; i++) {
				currentSum+=nums[i];
				currentSum=Math.max(currentSum, nums[i]);	
				maxSum=Math.max(maxSum, currentSum);
				totalSum+=nums[i];
			}
			//System.out.println(totalSum);
			currentSum=nums[0];
			int circularMin=nums[0];
			for (int i = 1; i<nums.length-1; i++) {
				currentSum+=nums[i];
				currentSum=Math.min(currentSum, nums[i]);	
				circularMin=Math.min(circularMin, currentSum);
				
			}
			System.out.println(Math.max(maxSum,totalSum-circularMin));
	        return Math.max(maxSum,totalSum-circularMin);
	}

	

}


