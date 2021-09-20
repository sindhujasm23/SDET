package assessment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CommonTimeSlot {

	/*
	 * Given the availability time slots arrays slots1 and slots2 of two people and a meeting duration , return the earliest
	 *  time slot that works for both of them and is of duration duration.
If there is no common time slot that satisfies the requirements, return an empty array.
The format of a time slot is an array of two elements {start, end} representing an inclusive time range from start to end.
It is guaranteed that no two availability slots of the same person intersect with each other. That is, for any two time slots
 {start1, end1} and {start2, end2} of the same person, either start1 > end2 or start2 > end1.
 
Example 1:
Input: slots1 = {{10,50},{60,120},{140,210}}, slots2 = {{0,15},{60,70}}, duration = 8
Output: {60,68}
Example 2:
Input: slots1 = {{10,50},{60,120},{140,210}}, slots2 = {{0,15},{60,70}}, duration = 12
Output: {}
	 */
	
	@Test
	public void test1() {
		int slots1[][]={{10,50},{60,120},{140,210}};
		int slots2[][]={{0,15},{60,70}};
		int duration=8;
		System.out.println(findCommonSlot(slots1,slots2,duration));
	}

	@Test
	public void test2() {
		int slots1[][]={{15,50},{60,120},{140,210}};
		int slots2[][]={{10,15},{60,70}};
		int duration=10;
		System.out.println(findCommonSlot(slots1,slots2,duration));
	}

	@Test
	public void test3() {
		int slots1[][]={{10,50},{60,120},{130,210}};
		int slots2[][]={{0,15},{60,70}};
		int duration=12;
		System.out.println(findCommonSlot(slots1,slots2,duration));
	}

	private List<Integer> findCommonSlot(int[][] slots1, int[][] slots2, int duration) {
		Arrays.sort(slots1,(a,b)->a[0]-b[0]);
		Arrays.sort(slots2,(a,b)-> a[0]-b[0]);
		int left=0,right=0;
		
		while(left<slots1.length && right<slots2.length) {
			int[] curr1 = slots1[left];
            int[] curr2 = slots2[right];

            int start = Math.max(curr1[0], curr2[0]);
            int end = Math.min(curr1[1], curr2[1]);

            if (end - start >= duration) 
                return Arrays.asList(start,start+duration);
            else if (curr1[1] < curr2[1]) left++;
            else if (curr2[1] < curr1[1]) right++;
            else {
            	left++;
            	right++;
            
            }
		}
		return new ArrayList<Integer>();
		
	}
}


