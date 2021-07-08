package datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberFromRange {
	
	/*1. Did I understand the problem? Yes
			   
		     If no ask the person to provide with more details with examples
		     If yes go to the next step
		     
		     What is the input(s)? ---> int[],int[] 
		     What is the expected output? --->int (missing number)
		     Do I have constraints to solve the problem? ---> no constraints
		     Do I have all the information to go to the next steps? --->yes
		     How big your test data set will be? --->
	   
	 2. Test Data Set:
	   	 Minimum 3 dataset including positive, negative and edge
	   	 Validate with interviewer if the dataset is fine by his/her assumptions
	   	 
	 3. Do I know to solve it?  Brute Force -- O(n^2)
	 		 Yes - great is there an alternative? 
	 		 No - can I break the problem into sub problems?
	 		 
	 4. Ask for hint (if you don't know how to solve this)
	 
	 5. Do I know alternate solutions as well? No
	 		  Yes - what are those?
	 		  No - that is still fine, proceed to solve by what you know
	 		  
	 6. If you know the alternate solution find out the O-notations (performance) - O(n^2)
	 7. Then, explain either both are the best (depends on the time)
	 		  Approach 1:- start with the worst -> improve(optimize) -> End up with the best
	 		  Approach 2:- Write down the options and benefits and code the best
	 8. Start always with the Pseudo code
	 9. Test against different test data
	 10. If it fails then debug to solve it
	 */


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
		int[] input={0,0,0};
		Assert.assertEquals(-1,missingNumberInRange(input));
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
		for (int i = min; i < max; i++) { //O(n)
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
	 * Time complexity : O(n^2)
	 * Space Complexity :O(1)
	 */

}
