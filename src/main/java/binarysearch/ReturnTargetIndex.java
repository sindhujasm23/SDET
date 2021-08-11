package binarysearch;


import org.junit.Test;

public class ReturnTargetIndex {

	/*
	 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
	If not, return the index where it would be if it were inserted in order.
	You must write an algorithm with O(log n) runtime complexity.
 
	Example 1:
	Input: nums = [1,3,5,6], target = 5
	Output: 2
	Example 2:
	Input: nums = [1,3,5,6], target = 2
	Output: 1
	Example 3:
	Input: nums = [1,3,5,6], target = 7
	Output: 4
	Example 4:
	Input: nums = [1,3,5,6], target = 0
	Output: 0
	 */
	@Test
	public void test1(){
		int[]nums={1,3,5,6};
		int target=5;
		findTargetIndex(nums,target);
	}
	
	@Test
	public void test2(){
		int[]nums={1,3,5,6};
		int target=2;
		findTargetIndex(nums,target);
	}

	@Test
	public void test3(){
		int[]nums={1,3,5,6};
		int target=7;
		findTargetIndex(nums,target);
	}
	
	@Test
	public void test4(){
		int[]nums={3,6,7,8,10};			
		int target=5;
		findTargetIndex(nums,target);
	}
	
	
	private int findTargetIndex(int[] nums, int target) {
		int low=0,high=nums.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(nums[mid]==target){
				//System.out.println(mid);
				return mid;
			}
			
			if(nums[mid]>target){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		if(high==-1) return 0;
		
		//System.out.println( high+1);
		return high+1;
		
		
	}
	
}
