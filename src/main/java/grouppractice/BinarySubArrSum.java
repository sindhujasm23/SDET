package grouppractice;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class BinarySubArrSum {
//https://leetcode.com/problems/binary-subarrays-with-sum/
	@Test
	public void test1() {
		int nums[]={1,0,1,0,1};
		int goal=2;
		numSubArrOptimized(nums,goal);
	}

	@Test
	public void test2() {
		int nums[]={0,0,0,0,0};
		int goal=0;
		numSubArrOptimized(nums,goal);
	}

	@Test
	public void test3() {
		int nums[]={1,0,1,0,1};
		int goal=1;
		numSubArrOptimized(nums,goal);
	}

	private void numSubArr(int[] nums, int goal) {
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			int sum=nums[i];
			if(sum==goal){
				count++;
			}
			for (int j = i+1; j < nums.length; j++) {
				sum+=nums[j];
				if(sum==goal){
					count++;
				}				
			}
		}
		System.out.println(count);	
	}
	//O(n^2)  O(1)
	
	private void numSubArrOptimized(int[] nums, int goal) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int count=0;
		int sum[]=new int[nums.length+1];
		for (int i = 0; i < nums.length; i++) {
			sum[i+1]=nums[i]+sum[i];		
		}
		for (int i = 0; i < sum.length; i++) {
			count+=map.getOrDefault(sum[i], 0);
			map.put(sum[i]+goal, map.getOrDefault(sum[i]+goal, 0)+1);
		}
	//	System.out.println(Arrays.toString(sum));
		System.out.println(count);
	}
}


