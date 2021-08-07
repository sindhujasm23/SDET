package datastructure;

import org.junit.Test;

import junit.framework.Assert;

public class MinArraySum {

	/*
	 * Input-->int[],int
	 * output-->int
	 * constraint-->brute force , two pointer or window slide
	 */
	
	@Test
	public void test1(){
		int target=7;
		int num1[]={2,3,1,2,4,3};
		Assert.assertEquals(2,findMinArray1(target,num1));
	}

	@Test
	public void test2(){
		int target=4;
		int num1[]={1,4,4};
		Assert.assertEquals(1,findMinArray1(target,num1));
	}

	@Test
	public void test3(){
		int target=11;
		int num1[]={1,1,1,1,1,1,1,1};
		Assert.assertEquals(0,findMinArray1(target,num1));
	}

	@Test
	public void test4(){
		int target=11;
		int num1[]={1,2,3,4,5};
		Assert.assertEquals(3,findMinArray1(target,num1));
	}

	@Test
	public void test5(){
		int target=6;
		int num1[]={10,2,3};
		Assert.assertEquals(1,findMinArray1(target,num1));
	}
	/*
	 * 1.Traverse through the loop from start index
	 * 2.if the current element is greater than equals to target
	 * 3.Assign min as 1 
	 * 4.If not traverse through another loop starting from next element
	 * 5.add the next value to the sum and check if its greater or equal to target
	 * 6.If condition satisfies compare and assign to min
	 * 7.If not repeat the process until end of the loop
	 */

	private int findMinArray(int target, int[] num1) {
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < num1.length; i++) {
			int sum=num1[i];
			if(sum>=target){
				min=1;
				System.out.println(min);
				break;
			}else {
				for (int j = i+1; j < num1.length; j++) {						
					sum+=num1[j];					
					if(sum>=target){
						min=Math.min(min, j-i+1);
						break;
					}
				}
			}
		}
		System.out.println(min);
		if(min==Integer.MAX_VALUE) return 0;

		return min;


	}
/*
 * Time complexity :O(n^2)
 * space Complexity :O(1)
 */
	//int target=7;
	//int num1[]={2,3,1,2,4,3};
	/*
	 * 1.Initialize left and right to start index and min to max value
	 * 2.Traverse through the length if array till right is less than length
	 * 3.add the right index value to assign and check if sum is greater than equal to target
	 * 4.if equal,assign right-left to min and subtract left index value from sum
	 * 5.Increment the left index
	 * 6.if not keep adding right index element to sum and check the condition
	 * 7.Repeat till end of the loop
	 * 8.Traverse through another loop to check sum is greaten than or equal to target 
	 * 9.if condition satisfies ,assign right-left to min and subtract left index value from sum
	 */

	private int findMinArray1(int target, int[] num1) {

		int left=0,right=0,min=Integer.MAX_VALUE;

		
		int sum=0;
		while(right<num1.length){

			if(sum>=target){
				//while(sum>=target){
					int min1=right-left;
					min=Math.min(min, min1);
					sum=sum-num1[left];
					left++;
					
				//}
				
			}else{
				sum+=num1[right++];
			}
		}
		
		while(sum>=target){
			min=Math.min(min, right-left);
			sum-=num1[left++];
		}
		System.out.println(min);
		if(min==Integer.MAX_VALUE) return 0;
		return min;

	}

	/*
	 * Time complexity :O(n)
	 * space Complexity :O(1)
	 */
}
