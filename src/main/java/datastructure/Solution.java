package datastructure;

import java.util.Arrays;

import org.junit.Test;

public class Solution {


	/*
	        input= int
	        output= boolean
	 */
	@Test
	public void test1(){
		int num[]={ 1,2,1};
		System.out.println(findDuplicate(num));
		// findDuplicate(num);
	}
	@Test
	public void test2(){
		int num[]={ 1,2,3,4,4};
		System.out.println(findDuplicate(num));
		//findDuplicate(num);
	}
	@Test
	public void test3(){
		int num[]={ 1,2,4,3};
		System.out.println(findDuplicate(num));
		//findDuplicate(num);
	}

	private boolean findDuplicate(int digits[]){
		Arrays.sort(digits);
		int left=0,right=1;
		while(right<digits.length){
			if(digits[left]==digits[right]){
				return true;
			}
			left++;
			right++;
		}
		return false;
		//System.out.println(Arrays.toString(digits));
	}


}
