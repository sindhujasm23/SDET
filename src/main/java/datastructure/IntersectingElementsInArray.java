package datastructure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntersectingElementsInArray {

	/*
	 * Example 1:
		Input: nums1 = [1,2,2,1], nums2 = [2,2]
		Output: [2]

		Output requires no order
		
		
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
