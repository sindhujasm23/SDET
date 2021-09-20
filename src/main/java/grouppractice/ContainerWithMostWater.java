package grouppractice;

import org.junit.Test;

public class ContainerWithMostWater {

	//https://leetcode.com/problems/container-with-most-water/
	@Test
	public void test1() {
		int []height={1,8,6,2,5,4,8,3,7};
		findMaxWater(height);
	}

	@Test
	public void test2() {
		int []height={1,1};
		findMaxWater(height);
	}

	@Test
	public void test3() {
		int []height={4,3,2,1,4};
		findMaxWater(height);
	}

	@Test
	public void test4() {
		int []height={1,2,1};
		findMaxWater(height);
	}
	
	@Test
	public void test5() {
		int []height={1,3,2,5,25,24,5};
		findMaxWater(height);
	}
	
	private void findMaxWater(int[] height) {
		int low=0,high=height.length-1,maxWater=0;
		while(low<high){
			int currentMax=Math.min(height[low],height[high])*(high-low);
			maxWater=Math.max(maxWater, currentMax);
			if(height[low]<height[high]){
				low++;
			}else if(height[low]>height[high]){
				high--;
			}else{
				low++;
				high--;
			}
			
		}
		System.out.println(maxWater);

	}
}


