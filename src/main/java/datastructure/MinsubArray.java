package datastructure;

import org.junit.Test;

public class MinsubArray {
	
	@Test
	public void test1(){
		int [] num1={1,2,3,4,5,5};
		findMinSubArray(num1);
	}

	@Test
	public void test2(){
		int [] num1={1,-2,3,-4,5};
		findMinSubArray(num1);
	}

	@Test
	public void test3(){
		int [] num1={-1,-2,-3,-4,-5};
		findMinSubArray(num1);
	}

	private int findMinSubArray(int[] num1) {
		int windowSum=num1[0],minSum=num1[0];
		if (num1.length==0) {
			throw new RuntimeException("Empty array");
		}
		for (int i = 1; i < num1.length; i++) {
			windowSum=Math.min(windowSum+num1[i], num1[i]);
			minSum=Math.min(windowSum, minSum);
			
		}
		System.out.println(minSum);
		return minSum;
		
		
	}

}
