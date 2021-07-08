package datastructure;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveInteger {
	
	@Test
	public void test1(){
		int input[]={2,4,5,4,1};
		int target=4;
		System.out.println(Arrays.toString(removeIntegerUsingSinglePass(input,target)));
		//Assert.assertEquals(Arrays.toString(new int[] {2,5,1}), Arrays.toString(removeIntegerUsingTwoPass(input,target)));
		
	}
	
	@Test
	public void test2(){
		int input[]={2,4,5,4,1};
		int target=8;
		//removeIntegerUsingTwoPass(input,target);
		Assert.assertEquals(Arrays.toString(new int[] {2,4,5,4,1}), Arrays.toString(removeIntegerUsingTwoPass(input,target)));
		
	}
	
	@Test
	public void test3(){
		int input[]={3,3,3,3,3};
		int target=3;
		//removeIntegerUsingTwoPass(input,target);
		Assert.assertEquals(Arrays.toString(new int[] {}), Arrays.toString(removeIntegerUsingTwoPass(input,target)));
		
	}
	

	/*
	 * 1.Traverse through all the element of an array
	 * 2.initialize a count variable outside array to count the matching element in array
	 * 3.Compare the target with each array element
	 * 4.If the target and array element matches then increase the count
	 * 5.End the loop
	 * 6.Initialize the output array with size as (length of input array - count)
	 * 7.Reinitialize the count to 0
	 * 8.Iterate through all elements of an array
	 * 9.if the target and array element does not match 
	 * 		a.add the element to output array
	 * 		b.assign the index of output array as count++
	 * 		c.compare the value with other index and swap it 
	 * 10.return the output array
	 * 11.do the steps 6-10 only when count is greater than 0 else return the sorted input array
	 * 12.if count is equal to input array length then return empty array
	 * 
	 * 
	 */
	
	private int[] removeIntegerUsingTwoPass(int[] input, int target) {
		// TODO Auto-generated method stub
		int count=0;                                    //O(1)
		for (int i = 0; i < input.length; i++) {  
			if(input[i]==target){                       //O(n)
				count++;
			}
		}
		if( count==0) return input;						
		int output[]=new int[input.length-count];		//O(1)
		count=0;
		for (int i = 0; i < input.length; i++) {
			if(input[i]!=target){						//O(n)
				output[count++]=input[i];
			}
			
		}
		return output;
		
		/*
		 * Time complexity : O(2n)-->O(n)
		 * Space complexity : O(1)
		 */
	}
	
	
	/*input
	 * 
	 * input=[2,3,2,3,4]  target=2
	 * 1.compare target with array element
	 * 2.if matches swap it
	 * 		a.intialize a temp variable with current element in array a=2
	 * 		b.chnage the current index with next index b=3;
	 * 		c.chnage the next index with temp c=2 -->[3,2,2,3,4]
	 * 
	 * 
	 */
	
	private int[] removeIntegerUsingSinglePass(int[] input, int target) {
		int temp=0,startIndex=0,targetIndex=1;
		for (int i = 0; i < input.length; i++) {
			if(input[i]!=target&& i!=0){
				temp=input[i];		//4
				input[targetIndex]=input[i-1]; //2
				input[i-1]=temp;   //4
				targetIndex++;	//2
			}
		}
		
		
		return input;
		
	}
}
