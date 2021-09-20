package grouppractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ContainsDuplicate {
	//https://leetcode.com/problems/contains-duplicate-iii/
	@Test
	public void test1() {
		int nums[]={1,2,3,1};
		int k=3,t=0;
		System.out.println(containsDuplicateOptimized(nums,k,t));
	}

	@Test
	public void test2() {
		int nums[]={1,0,1,1};
		int k=1,t=2;
		System.out.println(containsDuplicateOptimized(nums,k,t));
	}

	@Test
	public void test3() {
		int nums[]={1,5,9,1,5,9};
		int k=2,t=3;
		System.out.println(containsDuplicateOptimized(nums,k,t));
	}
	@Test
	public void test4() {
		int nums[]={-2147483648,2147483647};
		int k=1,t=1;
		System.out.println(containsDuplicateOptimized(nums,k,t));
	}
	@Test
	public void test5() {
		int nums[]={0,10,22,15,0,5,22,12,1,5};
		int k=3,t=3;
		System.out.println(containsDuplicateOptimized(nums,k,t));
	}
	private boolean containsDuplicate(int[] nums, int k, int t) {
		int left=0,right=1;long diff=0;
		while(right<nums.length){
			diff=Math.abs((long)nums[left]-(long)nums[right]);	
			if(diff<=t && right-left<=k){
				return true;
			}
			if(right-left==k){
				left++;
				right=left+1;
			}else{	
				right++;
			}
		}
		right=left+1;
		while(left<nums.length-1){
			diff=Math.abs((long)nums[left]-(long)nums[right]);	
			if(diff<=t && right-left<=k){
				return true;
			}
			left++;
			right=left+1;
		}
		return false;

	}
	private boolean containsDuplicateOptimized(int[] nums, int k, int t) {
		List<Long> list=new ArrayList<>();
		long sum=(long)nums[0]+t,diff=(long)nums[0]-t;
		int left=1,right=1;
		for (right = 1; right < nums.length; right++) {
			if(list.size()<=k){
				list.add((long)nums[right]);
			}else{
				left++;
				sum=(long)nums[left]+t;
				diff=(long)nums[left]-t;			
			}
			
			if(list.contains(sum)||list.contains(diff)){
				return true;
			}
		}
		

		return false;

	}

}


