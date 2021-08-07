package datastructure;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArray {

	/*1. Did I understand the problem? Yes

    If no ask the person to provide with more details with examples
    If yes go to the next step

    What is the input(s)? ---> int[],int[]
    What is the expected output? --->int[]
    Do I have constraints to solve the problem? ---> 
    Do I have all the information to go to the next steps? --->
    How big your test data set will be? --->

	2. Test Data Set:
	 Minimum 3 dataset including positive, negative and edge
	 Validate with interviewer if the dataset is fine by his/her assumptions

	3. Do I know to solve it?  Two pointer 
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
	 */

	@Test
	public void test1(){
		int[] num1={1,2,3,0,0,0} , num2={2,5,6};
		int m=3,n=3;
		Assert.assertArrayEquals(mergeArray(num1,num2,m,n),new int[] {1,2,2,3,5,6});
	}



	@Test
	public void test2(){
		int[] num1={0,0} , num2={1,2};
		int m=0,n=2;
		Assert.assertArrayEquals(mergeArray(num1,num2,m,n),new int[] {1,2});
	}

	@Test
	public void test3(){
		int[] num1={2,3,0,0,0,0} , num2={1,2,5,6};
		int m=2,n=4;
		Assert.assertArrayEquals(mergeArray(num1,num2,m,n),new int[] {1,2,2,3,5,6});
	}
	

	/*
	 * 1.Traverse through the loop until zeroth index
	 * 2.Compare m of first array with last element of second array
	 * 3.Assign the last index of first array with the element whichever is greater
	 * 4.Decrement the counter of the array containing greater element
	 * 5.Repeat this process until end of loop
	 */
	//{2,3,0,0,0,0} , num2={1,2,5,6};
	private int[] mergeArray(int[] num1, int[] num2, int m, int n) {
		// TODO Auto-generated method stub

		int left=m-1,right=n-1,j=m+n-1;
		
		while ( left>=0 &&right>=0 ) {
			if(num1[left]>=num2[right]){

				num1[j--]=num1[left--];
				
				//left--;
			}else{
				num1[j--]=num2[right--];
				//right--;
			}

		
		}
		while(right>=0){
			num1[j--]=num2[right--];
		}
		System.out.println(Arrays.toString(num1));
		return num1;
	}
	
	/*Time complexity :O(m+n)
	 * Space complexity :O(1)
	 * 
	 */

}
