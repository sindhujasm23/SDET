package binarysearch;

import org.junit.Test;

public class SquareRoot {

	/*
	 * Check the last give number in the input
	 *     we need to consider divisible of that number
	 * 1==>9 and 1
	 * 4==>2 and 8
	 * 6 ==> 4 and 6
	 * 5 ==> 5 
	 * 9==> 3 and 7
	 * 0-->10
	 * 
	 * 256-->
	 * 56-->
	 * Take a modules of the given number and check with above condition
	 * if its less add +1 a 
	 * greater than decrement from number
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1(){
		int num=4096;
		findSquareRoot(num);
	}
	

	private void findSquareRoot(int num) {
		// TODO Auto-generated method stub
		
		int left=0,right=num,output=0;
		
		while(left<=right){
			int mid=(left+right)/2;
			if(mid*mid==num){
				output=mid;
				break;
			}else if(mid*mid<num){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		System.out.println(output);
	}
	
}
