package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StartEndIndex {
	/*
	 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
	If target is not found in the array, return [-1, -1].
	You must write an algorithm with O(log n) runtime complexity.

	Example 1:
	Input: nums = [5,7,7,8,8,10], target = 8
	Output: [3,4]
	Example 2:
	Input: nums = [5,7,7,8,8,10], target = 6
	Output: [-1,-1]
	Example 3:
	Input: nums = [], target = 0
	Output: [-1,-1]
	 */
	@Test
	public void test1(){
		int[]nums={5,7,7,8,8,10};
		int target=8;
		findStartEndIndex(nums,target);
	}
	
	@Test
	public void test2(){
		int[]nums={5,7,7,8,8,10};
		int target=6;
		findStartEndIndex(nums,target);
	}
	@Test
	public void test3(){
		int[]nums={5,7,7,7,8,10};
		int target=7;
		findStartEndIndex(nums,target);
	}
	
	@Test
	public void test4(){
		int[]nums={7,7,7,7,7};
		int target=7;
		findStartEndIndex(nums,target);
	}
	@Test
	public void test5(){
		int[]nums={7,7,7,7,10};
		int target=10;
		findStartEndIndex(nums,target);
	}
	@Test
	public void test6(){
		int[]nums={0,1,2,3,3,4,4,5,5,6,6,7,7,7,9,9,11,11,11,12,12,12,12};
		int target=12;
		findStartEndIndex(nums,target);
	}
	/*
	 * Time complexity:O(logn)
	 * 1.Initialize low as 0 high as length-1 mid as low+high/2
	 * 2.Traverse through till low is less than equal high
	 * 3.compare mid with target
	 * 4.if mid is greater than target -->high=mid-1
	 * 5.if mid is lower than target -->low=mid+1
	 * 6.if mid equals target -->compare low and high with target
	 * 7.if low and high matches return the index
	 * 8.if low does not match -->low-- and compare
	 * 9.If high does not match -->high++ and compare
	 * 10.Repeat till end of the loop
	 */
	
	private int[] findStartEndIndex(int[] nums, int target) {
		int low=0,high=nums.length-1;
		
		int output[]={-1,-1};
		if(nums.length==0) return output;
		
		while(low<=high){
			int mid=(low+high)/2;
			//System.out.println(mid);
			if(mid==low && mid==high && nums[mid]!=target){			
				break;
			}
			if(nums[mid]<target){
				low=mid+1;
			}else if(nums[mid]>target){
				high=mid-1;

			}else if(nums[mid]==target){
				if(nums[low]==target && nums[high]==target){
					output[0]=low;
					output[1]=high;
					break;
				}else if(nums[low]!=target){
					low++;
					output[0]=mid;
				}
				else{
					high--;
					output[1]=mid;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(output));
		return output;

	}


}
