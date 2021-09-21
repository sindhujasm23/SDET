package grouppractice;

import java.util.Arrays;

import org.junit.Test;

public class ClosestSum {

	@Test
	public void test1() {
		int nums[]={-1,2,1,-4};
		int target=1;
		findClosestSum(nums,target);
	}

	@Test
	public void test2() {
		int nums[]={-3,-2,-5,3,-4};
		int target=-1;
		findClosestSum(nums,target);
	}

	@Test
	public void test3() {
		int nums[]={0,1,2};
		int target=0;
		findClosestSum(nums,target);
	}

	private int findClosestSum(int[] nums, int target) {
		Arrays.sort(nums);
		int res=target+Integer.MAX_VALUE,min=1000;
		for (int i = 0; i < nums.length-2; i++) {
			int left=i+1;
			int right=nums.length-1;
			while(left<right){
				int sum=nums[i]+nums[left]+nums[right];
				int diff=Math.abs(sum-target);
				min=Math.abs(res-target);
				if(min>diff){
					res=sum;
				}
				if(sum>target){
					right--;
				}else if(sum<target){
					left++;
				}else{
					return sum;
				}
			}
			
		}
		System.out.println(res);
		return res;

	}



}


