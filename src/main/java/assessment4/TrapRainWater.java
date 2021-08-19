package assessment4;

import org.junit.Test;

public class TrapRainWater {

	@Test
	public void test1(){	
		int []height={4,2,0,3,2,5};
		System.out.println(trapRainWater(height));
		
	}
	@Test
	public void test2(){	
		int []height={5,4,1,2};
		System.out.println(trapRainWater(height));
		
	}

	private int trapRainWater(int[] height) {
		int ans=0;
		for (int i = 1; i < height.length-1; i++) {	
			int leftMax=height[i],rightMax=height[i];
			for (int j =0 ; j<i; j++) {
				leftMax=Math.max(leftMax, height[j]);				
			}
			
			for (int j =i+1 ; j< height.length; j++) {
				rightMax=Math.max(rightMax, height[j]);				
			}
			
			ans+=Math.min(leftMax, rightMax)-height[i];
			
		}
		return ans>0? ans:0;
				
		
	}
}
