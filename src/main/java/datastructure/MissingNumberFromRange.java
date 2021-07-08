package datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberFromRange {

	@Test
	public void test1(){
		int[] input={5,6,9,7};
		Assert.assertEquals(8,missingNumberInRange(input));
	}

	@Test
	public void test2(){
		int[] input={3,4,1,2};
		Assert.assertEquals(-1,missingNumberInRange(input));
	}

	@Test
	public void test3(){
		int[] input={3,0,4};
		Assert.assertEquals(1,missingNumberInRange(input));
	}

	/*
	 * 1.Traverse through all elements of an array
	 * 2.Assign min and max as first element of array 
	 * 3.compare each element with min and max
	 * 		a.If the array element is smaller than min ->assign min=array element 
	 * 		b.If the array element is greater than max ->assign max= array element
	 * 		c.If none of the condition satisfies continue the loop
	 * 4.Repeat the process until end of the loop
	 * 5.Again start an iteration by starting with i as min and increement it until max 
	 * 6.compare each value of i with all elements in the array 
	 * 		a.If the value is not present in the array return the value
	 * 7.Repeat this until max
	 * 8.If all values are present or if min and max value is same then return -1 
	 * 
	 * 
	 */

	private int missingNumberInRange(int[] input) {
		// TODO Auto-generated method stub

		int min=input[0],max=input[0];
		for (int i = 0; i < input.length; i++) { //O(n)
			if(min>input[i] ){
				min=input[i];
			}
			if(input[i]>max){
				max=input[i];
			}
		}
		for (int i = min; i < max; i++) { //O(n+1)->O(m)
			boolean isExist=false;
			for (int j = 0; j < input.length; j++) { //O(n)
				if(i==input[j]){
					isExist=true;
				}

			}
			if(!isExist){
				return i;
			}
		}
		return -1;

	}
	/*
	 * Time complexity : O(m*n)
	 * Space Complexity :O(1)
	 */

}
