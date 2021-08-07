package datastructure;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SpotProb {
	
	@Test
	public void test1(){
		int []arr={-2,3,4,-9};
		movePositiveNumRight(arr);
		Assert.assertArrayEquals(new int []{-2, -9,3,4},movePositiveNumRight(arr));
	}
	
	

	@Test
	public void test2(){
		int []arr={-8,-3,-4,-5};
		movePositiveNumRight(arr);
	}
	
	@Test
	public void test3(){
		int arr[]={3};
		movePositiveNumRight(arr);
	}
	//-2,3,4,-9};
	private int[] movePositiveNumRight(int[] arr) {
		int output[]=new int[arr.length];
		int right=arr.length-1,left=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0){
				output[right--]=arr[i];
			}
			
			if(arr[i]<0){
				output[left++]=arr[i];
			}
			
		}
		System.out.println(Arrays.toString(output));
		return output;
		
		
		
	}

}
