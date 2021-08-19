package assessment4;

import org.junit.Test;

import junit.framework.Assert;

public class PracticeProblem1 {

	/*
	 * Problem 1)
	Given an int array [1,4,20,3,10,5] and target sum 33.
	If target subarray sum is found, return true else false
	Time : 20 Minutes 
	- Write another 2 test data (edge and neg)
	- Pseudo Code for Optimised Solution
	- Code, Debug
	- Time everything 
	- Do it yourself !! 
	 * 
	 * input-int[],int
	 * output-boolean
	 * constraint-sliding window
	 */


	@Test //3min
	public void test1(){
		int []nums={1,4,20,3,10,5};
		int sum=27;
		Assert.assertEquals(true,findTargetSum(nums,sum));
	}

	@Test
	public void test2(){
		int []nums={12,7,3,5,10};
		int sum=33;
		Assert.assertEquals(false,findTargetSum(nums,sum));
	}

	@Test
	public void test3(){
		int []nums={3,3,3,3};
		int sum=3;
		Assert.assertEquals(true,findTargetSum(nums,sum));
	}

	/*4min
	 * Initialize left as 0 right as 0 sum as 0
	 * Traverse through the loop till right is less than arrays length
	 * add the right value to sum and check if sum is equal to target sum
	 * if equal return true
	 * if sum is less increment right and add the next value and continue
	 * if sum is more than target sum decrement the value of left from sum and contiue
	 * Repeat till end of the loop
	 * 
	 */

	private boolean findTargetSum(int[] nums, int sum) {
		int left=0,right=1,currentSum=nums[0];

		while(right<nums.length){
			if(currentSum==sum){
				return true;
			}else if(currentSum<sum){
				currentSum+=nums[right++];
			}else{
				currentSum-=nums[left++];
			}
		}
		return false;
	}


}
