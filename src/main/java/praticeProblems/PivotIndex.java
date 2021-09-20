package praticeProblems;

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
	//4 5 6 7 0 1 2
	private int findTargetIndex(int[] nums, int target) {
		int left=0,right=nums.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]==target) {
				System.out.println(mid);
				return mid;				
			}else if(nums[mid]>nums[left]) {
				{
					if(target>=nums[left] &&target<nums[mid]) {
						right=mid-1;
					}else {
						left=mid+1;
					}
				}
			}else {
				if(target<=nums[right] &&nums[mid]>target) {
					left=mid+1;
				}else {
					right=mid-1;
				}
			}
		}
		return -1;
	}
	private int searchNumberAfterRotate(int[] n, int target) {
		// TODO Auto-generated method stub
		int low = 0, high = n.length - 1; //4,5,6,7,0,1,2
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;

			if (n[mid] == target) {
				System.out.println(mid);
				return mid;
			} else if (n[mid] < target) {
				if (n[high] < n[mid]) {
					low = mid + 1;

				} else {
					if (n[high] >= target) {
						low = mid + 1;

					} else
						high = mid - 1;

				}
			} else {
				if (n[high] < n[mid]) {
					if (n[mid] >= target) {
						low = mid + 1;
					} else
						high = mid - 1;
				} else
					high = mid - 1;
			}
		}
		return -1;

	}
}
