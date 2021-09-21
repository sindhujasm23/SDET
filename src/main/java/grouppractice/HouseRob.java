package grouppractice;

import org.junit.Test;

public class HouseRob {
	//https://leetcode.com/problems/house-robber/
	@Test
	public void test1() {
		int nums[]={1,2,3,1};
		rob(nums);
	}

	@Test
	public void test2() {
		int nums[]={2,7,9,3,1};
		rob(nums);
	}

	@Test
	public void test3() {
		int nums[]={2,1,1,2};
		rob(nums);
	}

	private int rob(int[] nums) {
	
		if(nums.length==1)
			return nums[0];
		else if(nums.length==2)
			return Math.max(nums[0], nums[1]);
		nums[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			nums[i]=Math.max(nums[i-1], nums[i]+nums[i-2]);					
		}
		System.out.println(nums[nums.length-1]);
		return nums[nums.length-1];

	}
}


