package datastructure;

import org.junit.Test;

public class PeakElement {

	@Test
	public void test1() throws Exception{
		int input[]={10,5,7,12,5,8};
		//System.out.println(peakElementUsingNestedLoops(input));
		System.out.println(peakElementUsingSinglePass(input));
	}

	@Test
	public void test2() throws Exception{
		int input[]={-1,-5,-7,-8,-5,-8};
		//System.out.println(peakElementUsingNestedLoops(input));
		System.out.println(peakElementUsingSinglePass(input));

	}

	//@Test
	public void test3() throws Exception{
		int input[]={};
		peakElementUsingNestedLoops(input);
	}

	/*
	 * 1.Iterate through all elements of an array starting from first element
	 * 2.Iterate through all elements of any array starting from neighbour element
	 * 3.compare first element with all other element in the array
	 * 4.If first element is greater than neighbour element and first element is greater than max
	 * 		a.assign max as first element
	 * 
	 * 
	 * 
	 * 
	 */

	private int peakElementUsingNestedLoops(int[] input) throws Exception {
		// TODO Auto-generated method stub
		int max=0;
		if(input.length>1){
			for (int i = 0; i < input.length; i++) {   
				for (int j = i+1; j < input.length; j++) { 
					if(input[i]>input[j]&&input[i]>max){  
						max=input[i];
					}

				}

			}
		}else{
			throw new Exception("Input array is empty");
		}
		return max;
	}

	/*
	 * Time Complexity - O(n^2)
	 * Space complexity - O(1)
	 */

	/*
	 * 1.Traverse through the array of elements
	 * 2.Compare first element with next element
	 * 		a.assign max variable to the greater element
	 * 3.compare the max variable with next element in array
	 * 		a.reassign the grater element to max
	 * 4.Continue the loop till end of the array.
	 * 5.Return max variable
	 */

	private int peakElementUsingSinglePass(int[] input) throws Exception {
		int max=input[0];

		for (int i = 0; i < input.length; i++) { //O(n)

			if(max<input[i]){
				max=input[i];
			}
		}

		return max; //O(1)

	}

	/*
	 * Time Complexity - O(n)
	 * Space Complexity - O(1)
	 * 
	 */
}
