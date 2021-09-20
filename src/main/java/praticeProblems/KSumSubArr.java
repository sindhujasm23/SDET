package praticeProblems;

import org.junit.Test;

public class KSumSubArr {

	@Test
	public void test1() {
		int[] nums={1,1,1};
		int k=2;
		findNoOfSubarr(nums,k);
	}

	@Test
	public void test2() {
		int[] nums={1,2,3};
		int k=3;
		findNoOfSubarr(nums,k);
	}

	
	@Test
	public void test3() {
		int[] nums={1,1,1};
		int k=2;
		findNoOfSubarr(nums,k);
	}
	
	private void findNoOfSubarr(int[] nums, int k) {
		int left=0,right=1,count=0;
		
		while(left<nums.length) {
			int sum=nums[left]+nums[right];
		if(sum>k){
			
		}else if(sum==k){
			count++;
			left++;
			right=left+1;
		}
			
		}
		
	}

}


