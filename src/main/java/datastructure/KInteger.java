package datastructure;

import org.junit.Test;

public class KInteger {
	/*
	 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k. Find the kth positive integer that is missing from this array.

	Example 1:

	Input: arr = [2,3,4,7,11], k = 5
	Output: 9
	Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

	Example 2:

	Input: arr = [1,2,3,4], k = 2
	Output: 6
	Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.


	 */

	@Test
	public void test1(){
		int[] arr={2,3,4,7,11};
		int k=5;
		findKInteger(arr,k);
	}
	
	@Test
	public void test2(){
		int[] arr={1,2,3,4};
		int k=2;
		findKInteger(arr,k);
	}
	@Test
	public void test3(){
		int[] arr={1,3};
		int k=1;
		findKInteger(arr,k);
	}
	
	
	private int findKInteger(int[] arr, int k) {
		int low=0,high=arr.length-1;
		int count=0;
		while(low<=high){
			int mid=(low+high)/2;
			count=arr[mid]-(mid+1);
			if(count<k){
				low=mid+1;
			}else{
				high=mid-1;
			}
			
		}
		//System.out.println(k);
		if(high==-1) return k;
		System.out.println(arr[high]+(k-(arr[high]-(high+1))));
		return arr[high]+(k-(arr[high]-(high+1)));
	
	}

}
