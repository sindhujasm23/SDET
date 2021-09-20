package praticeProblems;

import java.util.HashMap;

import org.junit.Test;

public class MaxDigitSum {

	@Test
	public void test1() {
		int []nums={51,42,17,71};
		findMax(nums);
	}

	@Test
	public void test2() {
		int []nums={42,33,60};
		findMax(nums);
	}

	@Test
	public void test3() {
		int []nums={51,32,43};
		findMax(nums);
	}

	private void findMax(int[] nums) {

		HashMap<Integer,Integer> map=new HashMap<>();
		int max=-1;
		for (int i = 0; i < nums.length; i++) {
			int temp=0,num=nums[i];
			while(num>0){			
				temp+= (num%10);
				num=num/10;
			}
			if(map.containsKey(temp)){
				int val=map.get(temp);
				map.put(temp, Math.max(val, nums[i]));
				max=Math.max(max, val+nums[i]);
			}else{
				map.put(temp, nums[i]);
			}
		}
		System.out.println(max);

	}
}


