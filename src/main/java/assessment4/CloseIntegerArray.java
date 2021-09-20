package assessment4;

import org.junit.Test;

public class CloseIntegerArray {
	/*
	 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
An integer a is closer to x than an integer b if:
|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
 
Example 1:
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]Output -> List<Integer>
	 */

	@Test
	public void test1(){
		int []arr={1,2,3,4,5};
		int k=4,x=3;
		findCloseIntArr(arr,k,x);
	}
	
	@Test
	public void test2(){
		int []arr={1,2,3,4,5};
		int k=4,x=-1;
		findCloseIntArr(arr,k,x);
	}
	
	@Test
	public void test3(){
		int []arr={8,17,24,25,28};
		int k=3,x=23;
		findCloseIntArr(arr,k,x);
	}

	private void findCloseIntArr(int[] arr, int k, int x) {
		// TODO Auto-generated method stub
		
	}
	
}
