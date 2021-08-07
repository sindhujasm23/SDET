package datastructure;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class DailyTemp {
	
	/*
	 * input-int arr
	 * output-int arr
	 * 
	 */

	@Test()
	public void test1(){
		int input[]={73,74,75,71,69,72,76,73};
		Assert.assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, findWarmerTempEff(input));
	}
	
	@Test()
	public void test2(){
		int input[]={30,40,50,60};
		Assert.assertArrayEquals(new int[]{1,1,1,0}, findWarmerTempEff(input));
	}
	@Test()
	public void test3(){
		int input[]={34,80,80,34,34,80,80,80,80,34};
		Assert.assertArrayEquals(new int[]{1,0,0,2,1,0,0,0,0,0}, findWarmerTempEff(input));
	}
	@Test()
	public void test4(){
		int input[]={55,38,53,81,61,93,97,32,43,78};
		Assert.assertArrayEquals(new int[]{3,1,1,2,1,1,0,1,1,0}, findWarmerTempEff(input));
	}
	
	
	/*
	 * 1.Initialize an output array with same length as input
	 * 2.Traverse through each elemnet of array
	 * 3.Compare current with every another elmenet in another inner loop
	 * 4.If the other elemnet is greater than current increemnet the counter and break the inner loop
	 * 5.add the counter to output array
	 * 6.Repeat the process until end of the loop
	 * 
	 * Time-O(n^2)
	 * Space-O(1)
	 */
	private int[] findWarmerTemp(int[] input) {
		// TODO Auto-generated method stub
		int []output=new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			int count=0;
			for (int j = i+1; j < input.length; j++) {
				if(input[j]>input[i]){
					output[i]=++count;
					break;
				}else{
					count++;
				}
				
			}
		}
		System.out.println(Arrays.toString(output));
		return output;
	}
	
	/*
	 * 1.Initialize left point as 0 and right point as left+1
	 * 2.Traverse through the loop till array length
	 * 3.if right is greater than left -->increment counter nad add it to output array
	 * 	and increment left and right as left +1
	 * 4.if less -- >increemnet right pointer
	 * 5.Repeat until end of the loop
	 */
	private int[] findWarmerTempEff(int[] input) {
		int []output=new int[input.length];
		int left=0,right=left+1,count=0;
		while(right<input.length) {
			if(input[right]>input[left]){
				output[left]=++count;
				count=0;
				left++;
				right=left+1;
			}
			
			else if(left<input.length && right==input.length-1 ){
				output[left]=0;
				count=0;
				left++;
				right=left+1;
			}else{
				count++;
				right++;
			}
		}

		System.out.println(Arrays.toString(output));
		return output;
	}
	//35 36 37
	private int[] findWarmerTempStack(int[] input) {
		int []output=new int[input.length];
		Stack<Integer> stack= new Stack<Integer>();
		for (int i = 0; i < input.length; i++) {
			if(!stack.isEmpty()){
				int peek=stack.peek();
				if(peek<input[i]){
					
				}
				
			}else{
				stack.push(input[i]);
			}
		}
		return output;
	}
	
}
