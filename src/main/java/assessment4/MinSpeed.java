package assessment4;

import org.junit.Test;

public class MinSpeed {
	/*
	 * https://leetcode.com/problems/minimum-speed-to-arrive-on-time/
	 * input-double,int[]
	 * output-int
	 * 
	 */
	@Test
	public void test1(){
		int []dist={1,3,2};
		double hr=6;
		System.out.println(findMinSpeed(dist,hr));
	}
	

	@Test
	public void test2(){
		int []dist={1,3,2};
		double hr=2.7;
		System.out.println(findMinSpeed(dist,hr));
	}
	
	@Test
	public void test3(){
		int []dist={1,1,100000};
		double hr=2.01;
		System.out.println(findMinSpeed(dist,hr));
	}
	
	/*
	 * 
	 */
	private int findMinSpeed(int[] dist, double hr) {
		int low=1,high=100,totalDist=0,mid=0;
		if(hr<dist.length-1) return -1;
		
		while(low<high){
			mid=(low+high)/2;
			for (int i = 0; i < dist.length; i++) {
				int j = dist[i];
				
			}
			int time=totalDist/mid;
			if(time>(int)hr){
				low=mid+1;
			}else if(time<(int)hr){
				high=mid-1;
			}else{
				return mid;
			}
		}
		return mid;
		
		
	}
}
