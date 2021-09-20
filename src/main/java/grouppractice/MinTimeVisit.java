package grouppractice;

import org.junit.Test;

public class MinTimeVisit {

	//https://leetcode.com/problems/minimum-time-visiting-all-points/
	@Test
	public void test1() {
		int [][]points={{1,1},{3,4},{-1,0}};
		findMinTime(points);
	}

	@Test
	public void test2() {
		int [][]points={{3,2},{-2,2}};
		findMinTime(points);
	}

	@Test
	public void test3() {
		int [][]points={{1,1},{3,4},{-1,0}};
		findMinTime(points);
	}
/*
 * Traverse through the array
 * Initialize time as 0
 * Increment the current element first index till second element first index and increment the count in parallel
 * compare the second index of first element and second index of econd element if matches go to next element
 * else increment it 
 * 
 * 
 */
	private void findMinTime(int[][] points) {
		int time=0,startIndex=points[0][0],endIndex=points[0][1];
		boolean flag=false;
		for (int i = 1; i < points.length; ) {
			if(startIndex<points[i][0]){
				startIndex++;
				flag=true;
			}else if(startIndex>points[i][0]){
				startIndex--;
				flag=true;
			}
			if(endIndex<points[i][1]){
				endIndex++;
				flag=true;
			}else if(endIndex>points[i][1]){
				endIndex--;
				flag=true;
			}
			if(startIndex ==points[i][0] && endIndex ==points[i][1]){
				i++;
			}
			if(flag){
				time++;
			}
		}
		System.out.println(time);
		
	}
}


