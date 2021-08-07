package datastructure;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class SmallestSubArray {

	/*
	 * Input-->int[],int
	 * output-->int
	 * Constraint-->Brute force
	 */
	@Test
	public void test1(){
		int [] nums={2,1,3};
		int k=4;
		Assert.assertEquals(3,findSubArray(nums,k));
	}


	@Test
	public void test2(){
		int [] nums={3,3,5,5};
		int k=7;
		Assert.assertEquals(10,findSubArray(nums,k));
	}
	
	@Test
	public void test3(){
		int [] nums={3,2};
		int k=4;
		Assert.assertEquals(-1,findSubArray(nums,k));
	}
	
	/*
	 * 1.Traverse through thr loop till array length
	 * 2.Initialize sum as first array element
	 * 3.Traverse through another loop starting from i
	 * 4.If first and second loop index are same add it in list
	 * 5.If not add the element to sum and add in list
	 * 6.Repeat the process till end of first loop
	 * 7.Sort the list
	 * 8.Return the kth index from list
	 */
	private int findSubArray(int[] nums, int k) {
		
		List<Integer> list=new LinkedList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int sum=nums[i];
			for (int j = i; j < nums.length; j++) {
				
				if(i==j){
					list.add(nums[i]);
				}else{
					sum+=nums[j];
					list.add(sum);
				}
				
			}
			
		}
		//System.out.println(list);
		Collections.sort(list);
		//System.out.println(list);
		//System.out.println(list.get(k-1));
		if(k>list.size()) return -1;
		return list.get(k-1);
		
		
	}
	
}
