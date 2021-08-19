package binarysearch;

import org.junit.Test;

public class PivotIndex {

	/*
	 * There is an integer array nums sorted in ascending order (with distinct values). 
	 * Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such 
	 * that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
	 *  For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

	Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 
	if it is not in nums.
	You must write an algorithm with O(log n) runtime complexity.
 	Example 1:
	Input: nums = [4,5,6,7,0,1,2], target = 0
	Output: 4 

	 */
	@Test
	public void test1(){
		int []nums={4,5,6,7,0,1,2};
		int target=0;
		findTargetIndex(nums,target);
	}

	@Test
	public void test2(){
		int []nums={4,5,6,7,0,1,2};
		int target=10;
		findTargetIndex(nums,target);
	}

	@Test
	public void test3(){
		int []nums={4,5,6,7,0,1,2};
		int target=5;
		findTargetIndex(nums,target);
	}
	@Test
	public void test4(){
		int []nums={4,5,6,7,8,9,1};
		int target=9;
		findTargetIndex(nums,target);
	}
/*
 * 1.Initialize low as 0 high as length-1
 * 2.take the mid as low+high/2
 * 3.compare mid with target 
 * 4.if Mid>target--compare left and target--if left <mid and left>target--> left=mid
 * 5.If mid<target--compare left and target--if left >mid --right=mid
 * 6.if mid==target return it
 */
	private int findTargetIndex(int[] nums, int target) {
		int low=0,high=nums.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(nums[mid]==target){
				System.out.println(mid);
				return mid;
			}else if(nums[mid]>target){
			//	if(nums[low]<nums[mid] && nums[low]>target){
					low=mid;
				//}
			}else {
			//	if(nums[low]>nums[mid]){
					high=mid;
			//	}
			}
		}
		System.out.println("-1");
		return -1;

	}

}
