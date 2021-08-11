package datastructure;

import java.util.Arrays;

import org.junit.Test;

public class ColorSort {

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
		int num[]={2,0,1,1,0};
		//System.out.println(Arrays.toString(colorSort(num)));
		System.out.println(Arrays.toString(findColorSort(num)));
	}
	@Test
	public void test2(){
		int num[]={2,0,1};
		//System.out.println(Arrays.toString(colorSort(num)));
		System.out.println(Arrays.toString(findColorSort(num)));
	}
	@Test
	public void test3(){
		int num[]={0};
		//System.out.println(Arrays.toString(colorSort(num)));
		System.out.println(Arrays.toString(findColorSort(num)));
	}
		
	

	private int[] findColorSort(int[] num) {
		// TODO Auto-generated method stub
		int low=0,high=num.length-1,mid=0,temp=0;
		while(mid<=high){
			
			if(num[mid]==0){
				temp=num[mid];
				num[mid++]=num[low];
				num[low++]=temp;				
			}else if(num[mid]==1){
				mid++;
			}else{
				temp=num[mid];
				num[mid]=num[high];
				num[high--]=temp;
			}
		}
		//	System.out.println(Arrays.toString(num));
		
		return num;
	}





}
