package grouppractice;

import java.util.Arrays;

import org.junit.Test;

public class RunningSum {
//https://leetcode.com/problems/running-sum-of-1d-array/
	@Test
	public void test1() {
		int nums[]={1,2,3,4};
		findRunningSum(nums);
	}

	@Test
	public void test2() {
		int nums[]={1,1,1,1,1};
		findRunningSum(nums);
	}

	@Test
	public void test3() {
		int nums[]={3,1,2,10,1};
		findRunningSum(nums);
	}

	private void findRunningSum(int[] nums) {
		int []output=new int[nums.length];int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
			output[i]=sum;			
		}
		System.out.println(Arrays.toString(output));
	}
}


