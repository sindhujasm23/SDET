package datastructure;

import org.junit.Test;

public class PeakElement {
	/*1. Did I understand the problem? Yes
	   
    If no ask the person to provide with more details with examples
    If yes go to the next step
    
    What is the input(s)? ---> int[]
    What is the expected output? --->int 
    Do I have constraints to solve the problem? ---> should not use inbuild sort method
    Do I have all the information to go to the next steps? --->yes
    How big your test data set will be? --->

	2. Test Data Set:
	 Minimum 3 dataset including positive, negative and edge
	 Validate with interviewer if the dataset is fine by his/her assumptions
	 
	3. Do I know to solve it?  Brute Force o(n^2) and O(n)
	 Yes - great is there an alternative? 
	 No - can I break the problem into sub problems?
	 
	4. Ask for hint (if you don't know how to solve this)

	5. Do I know alternate solutions as well? No
	  Yes - what are those?
	  No - that is still fine, proceed to solve by what you know
	  
	6. If you know the alternate solution find out the O-notations (performance) - O(n*m)
	7. Then, explain either both are the best (depends on the time)
	  Approach 1:- start with the worst -> improve(optimize) -> End up with the best
	  Approach 2:- Write down the options and benefits and code the best
	8. Start always with the Pseudo code
	9. Test against different test data
	10. If it fails then debug to solve it
*/
	//@Test
	public void test1() throws Exception{
		int input[]={10,5,7,12,5,8};
		//System.out.println(peakElementUsingNestedLoops(input));
		System.out.println(peakElementUsingSinglePass(input));
	}

	//@Test
	public void test2() throws Exception{
		int input[]={-1,-5,-7,-8,-5,-8};
		//System.out.println(peakElementUsingNestedLoops(input));
		System.out.println(peakElementUsingSinglePass(input));

	}

	@Test
	public void test3() throws Exception{
		int input[]={1,2,3,6,4};
		findPeakElement(input);
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
	
	public int findPeakElement(int[] nums) {
	     int start = 0, end = nums.length-1;
	     
	     while(start < end)
	     {
	         int mid = (start + end)/2;
	         
	         if(nums[mid] < nums[mid + 1])
	             start = mid+1;
	         else
	             end = mid;
	     }
	     
	     return end;
	 }
}
