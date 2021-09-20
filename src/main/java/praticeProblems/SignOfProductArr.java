package praticeProblems;

import org.junit.Test;

public class SignOfProductArr {

	@Test
	public void test1() {
		int []nums={-1,-2,-3,-4,3,2,1};
		System.out.println(findSign(nums));
	}

	@Test
	public void test2() {
		int []nums={41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
		System.out.println(findSign(nums));
	}

	@Test
	public void test3() {
		int []nums={-1,1,-1,1,-1};
		System.out.println(findSign(nums));
	}

	private int findSign(int[] nums) {
		int prod=1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) return 0;	
			prod*=nums[i]>0 ? 1: -1;			
		}
		System.out.println(prod);
		if(prod>0){
			return 1;
		}else{
			return -1;
		}
	}
}


