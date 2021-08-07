package datastructure;

import java.util.Arrays;

import org.junit.Test;

public class OdNumbers {

	/*
	 * Given an integer array,move all odd numbers to right
	 * 
	 * Input: int[]
	 * output : int[]
	 * constraints :
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1(){
		int input[]={3,4,2,5,10,8,7};
		findOdd1(input);
	}
	
	@Test
	public void test2(){
		int input[]={2,4,6,8};
		findOdd1(input);
	}
	
	@Test
	public void test3(){
		int input[]={3,5,7,9,0};
		findOdd1(input);
	}

	/*Brute force - O(n)
	 * Space Complexity - O(n)
	 * 
	 */
	
	/*
	 * 1.Traverse through all elements of an array
	 * 2.Do the mod of each number 2%2 
	 * 3.if it is 0 add the number in output array from start index and increment the counter
	 * 4.If it is 1 add the number from last index of array
	 * 5.REpeat the process until end of the loop
	 */
	private int[] findOdd(int[] input) {
		
		int output[]=new int[input.length];
		int j=output.length-1;
		for (int i = 0; i < output.length; i++) {
			if(input[i]%2!=0){
				output[j--]=input[i];
			}
			
		}
		 j=0;
		for (int i = 0; i < output.length; i++) {
			if(input[i]%2==0){
				output[j++]=input[i];
			}
			
		}
		System.out.println(Arrays.toString(output));
		return output;
		
		
	}
	
	/*
	 * 1.Sort the given array
	 * 2.Assign left with start index, right with last index
	 * 3.take the left index val and right index value and do mod 
	 * 4.if mod of left index is 1 and right index is 0 -->swap the values
	 * 5.if mod of right index is 1 decrement right
	 * 6.if mod of left index is 0 increment left
	 * 7.repeat until end of the loop
	 */
	//int input[]={3,5,7,9,0};--0,1,2,3,5,7,9
//	/3,4,2,5,10,8,7--
	//8,4,2,5,10,3,7
	private int[] findOdd1(int[] input) {
		int left=0,right=input.length-1;
		
		//Arrays.sort(input);
		
		while(left<=right){
			
			if(input[left]%2!=0&&input[right]%2==0){
				int temp=input[left];
				input[left++]=input[right];
				input[right--]=temp;
			}else if(input[right]%2!=0){
				right--;
			}else if(input[left]%2==0){
				left++;
			}
			
			
		}
		
		System.out.println(Arrays.toString(input));
		return input;
		
	}
}
