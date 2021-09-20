package assessment4;

import java.util.Arrays;

import org.junit.Test;

public class MeetingIntervals {

	/*
	 * Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.
 
Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false
Example 2:
Input: intervals = [[7,10],[2,4]]
Output: true
	 */
	@Test
	public void test1() {
		int intervals[][]={{0,30},{5,10},{15,20}};
		System.out.println(findTimeIntervasls(intervals));
	}

	@Test
	public void test2() {
		int intervals[][]={{7,10},{2,4},{11,14}};
		System.out.println(findTimeIntervasls(intervals));
	}

	@Test
	public void test3() {
		int intervals[][]={{0,5},{5,10},{10,20}};
		System.out.println(findTimeIntervasls(intervals));
	}

	private boolean findTimeIntervasls(int[][] intervals) {
		
		Arrays.sort(intervals,(a,b)->{
			if(a[1]!=b[1]) return a[1]-b[1];
			else return a[0]-b[0];
		});
		int endTime=intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			if(intervals[i][0]<endTime){
				return false;
			}else{
				endTime=intervals[i][1];
			}
			
		}
		return true;
		
	}
}


