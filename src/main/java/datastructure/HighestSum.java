package datastructure;

import org.junit.Test;

public class HighestSum {



	@Test
	public void test1(){
		int []input={1,-5,2,-3,7,1};
		int max=findHighestSum(input);
	}

	
	@Test
	public void test2(){
		int []input={1,2,4};
		int max=findHighestSum(input);
	}
	
	@Test
	public void test3(){
		int []input={-5,-3,-2};
		int max=findHighestSum(input);
	}
	@Test
	public void test4(){
		int []input={-1,-2,-3};
		int max=findHighestSum(input);
	}
	private int findHighestSum(int[] input) {

		int max=Integer.MIN_VALUE;
		//int sum=0;
		for (int i = 0; i < input.length; i++) {
			int sum=input[i];
			for (int j = i+1; j < input.length; j++) {
				sum+=input[j];
				max=Math.max(sum,max);
			}

		}
		System.out.println(max);
		return max;
	}

}
