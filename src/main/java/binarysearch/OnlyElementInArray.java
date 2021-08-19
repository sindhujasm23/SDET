package binarysearch;

import java.util.Arrays;

import org.junit.Test;

public class OnlyElementInArray {

	/*
	 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one. You must implement a
 solution with a linear runtime complexity and use only constant extra space.


	Example 1:
	Input: nums = [2,2,1]
	Output: 1

	Example 2:
	Input: nums = [4,1,2,1,2]
	Output: 4

	 * 1. Did I understand the problem? Yes

    If no ask the person to provide with more details with examples
    If yes go to the next step

    What is the input(s)? ---> int[]
    What is the expected output? --->int 
    Do I have constraints to solve the problem? ---> O(n) and O(1)
       Do I have all the information to go to the next steps? --->yes
    How big your test data set will be? --->

	2. Test Data Set:
	 Minimum 3 dataset including positive, negative and edge
	 Validate with interviewer if the dataset is fine by his/her assumptions

	3. Do I know to solve it? 
		 Yes - great is there an alternative? 
	 No - can I break the problem into sub problems?

	4. Ask for hint (if you don't know how to solve this)

	5. Do I know alternate solutions as well? 
	  Yes - what are those?
	  No - that is still fine, proceed to solve by what you know

	6. If you know the alternate solution find out the O-notations (performance) -
	7. Then, explain either both are the best (depends on the time)
	  Approach 1:- start with the worst -> improve(optimize) -> End up with the best
	  Approach 2:- Write down the options and benefits and code the best
	8. Start always with the Pseudo code
	9. Test against different test data
	10. If it fails then debug to solve it
	 * 
	 */

	@Test
	public void test1(){
		int input[]={1,1,2,3,3,4,4,8,8};
		System.out.println(singleElementInArrayUsingBS(input));
	}

	@Test
	public void test2(){
		int input[]={3,3,7,7,10,11,11};
		System.out.println(singleElementInArrayUsingBS(input));

	}

	@Test
	public void test3(){
		int input[]={1,1,2,3,3};
		System.out.println(singleElementInArrayUsingBS(input));

	}

	@Test
	public void test4(){
		int input[]={1,1,2,2,3};
		System.out.println(singleElementInArrayUsingBS(input));

	}
	/*
	 * 1.Initialize count with first array element
	 * 2.Traverse through the array element
	 * 3.Assign count as the XOR of count and next element
	 * 4.Continue till end of the loop
	 * 5.Return the count
	 */
	private int singleElementInArray(int[] input) {

		int count=input[0];
		for (int i = 1; i < input.length; i++) {
			count=count^input[i];
		}
		return count;
	}

	private int singleElementInArrayUsingBruteForce(int[] input) {
		// TODO Auto-generated method stub
		for (int i = 0; i < input.length; i++) {
			int count=0;
			for (int j = 0; j < input.length; j++) {
				if(input[i]==input[j]){
					count++;
				}
			}
			if(count==1){
				return input[i];
			}
		}
		return -1;	
	}
	//1,2,2
	private int singleElementInArrayUsingBS(int[] input) {
		int output=0;
		
		int left=0,right=input.length-1;
		if(input.length==1) return input[0];
		while(left<=right){
			int mid=(left+right)/2;
			
			if(input[mid]!=input[mid-1]&&input[mid]!=input[mid+1]){
				output=input[mid];
				break;
			}
			if(input[mid]==input[mid+1]){
				
			}
		}
		System.out.println(output);
		return output;


	}
}
