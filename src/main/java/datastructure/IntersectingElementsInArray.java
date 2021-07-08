package datastructure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntersectingElementsInArray {

	/*1. Did I understand the problem? Yes
	   
    If no ask the person to provide with more details with examples
    If yes go to the next step
    
    What is the input(s)? ---> int[],int[]
    What is the expected output? --->int []
    Do I have constraints to solve the problem? ---> result should be without duplicates in any order
    Do I have all the information to go to the next steps? --->yes
    How big your test data set will be? --->

	2. Test Data Set:
	 Minimum 3 dataset including positive, negative and edge
	 Validate with interviewer if the dataset is fine by his/her assumptions
	 
	3. Do I know to solve it?  Brute Force -- O(n*m)
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

	@Test
	public void test1(){
		int[] nums1 = {1,2,2,1,3,7}, nums2 = {2,2,3,1,5,7,10};
		Assert.assertEquals(Arrays.toString(new int[] {1,2,3,7}), Arrays.toString(intersectingElementsInArray(nums1,nums2)));
	
	}

	@Test
	public void test2(){
		int[] nums1 = {1,3,3,4}, nums2 = {5,6,7,10};
		Assert.assertEquals(Arrays.toString(new int[] {}), Arrays.toString(intersectingElementsInArray(nums1,nums2)));
		
	}

	@Test
	public void test3(){
		int[] nums1 = {1,2,2,1}, nums2 = {1,2,2,1};
		Assert.assertEquals(Arrays.toString(new int[] {1,2}), Arrays.toString(intersectingElementsInArray(nums1,nums2)));
		
	}

	/*
	 * 1.Traverse through all elements of first array
	 * 2.Traverse through all elements of second array
	 * 3.compare each element of first array with every another element of second array 
	 * 4.if the element matches and not present in list then add it in the list
	 * 5.If the element matches and already present continue the loop
	 * 6.Convert the list to array and return it	
	 *  
	 * 
	 */
	private Object[] intersectingElementsInArray(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i]==nums2[j]){
					if(!list.contains(nums1[i])){
						list.add(nums1[i]);
					}
				}
			}
		}

		//System.out.println(list);
		Object[] output=list.toArray();
		return output;

	}

	/*
	 * Time complexity:O(n*m)
	 * Space Complexity:O(1)
	 */
	
	
}
