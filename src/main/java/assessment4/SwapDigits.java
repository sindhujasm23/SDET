package assessment4;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class SwapDigits {

	/*
	 * Swap any two digits to get the biggest number
 
Example 1:
Input: num = 2736. 
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:
Input: num = 9973
Output: 9973
Explanation: No swap.
1996-9916
	 */


	@Test
	public void test1(){
		int num=2736;
		Assert.assertEquals(7236,findMaxNum(num));
	}


	@Test
	public void test2(){
		int num=2176;
		Assert.assertEquals(7126,findMaxNum(num));
	}


	@Test
	public void test3(){
		int num=1996;
		Assert.assertEquals(9916,findMaxNum(num));
	}

	@Test
	public void test4(){
		int num=9973;
		Assert.assertEquals(9973,findMaxNum(num));
	}
	
	@Test
	public void test5(){
		int num=98140;
		Assert.assertEquals(98410,findMaxNum(num));
	}

	/*
	 * convert int to list
	 * Initialize left as 0 right as 1 current max as 0 index as -1
	 * Traverse the list in while loop right less than array length
	 * if list.get(L) > list.get(R) and r equals list.size-1
	 * 		Left++ and Right=left
	 * else currentMax less than list.get(R) 
	 * 		currentMax=list.get(R) 
	 * 		index=right
	 * right++
	 *
	 * if index !=-1
	 * swap the values

	 */

	private int findMaxNum(int num) {

		List<Integer> list =new ArrayList<Integer>();
		
		while(num>0){			
			int temp=num%10;
			num=num/10;
			list.add(0,temp);
		}
		int left=0,right=1,currentMax=0;
		for ( left = 1; left < list.size(); left++) {
			if(list.get(left)>list.get(left-1)){
				break;
			}			
		}
		if(left==list.size()) return num;
		
		for (int i = left; i < list.size(); i++) {
			if(list.get(i)>=currentMax){
				currentMax=list.get(i);
				right=i;
			}
			
		}
//		while(right<list.size()){
//			if(list.get(left)>=list.get(right)&& right==list.size()-1){
//				left++;
//				right=left;
//			}else if(list.get(right)>list.get(left)){
//				if(currentMax<=list.get(right)){
//					currentMax=list.get(right);
//					index=right;
//				}
//			}
//			right++;
//		}
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)<currentMax){
				int temp=list.get(i);
				list.set(i, list.get(right));
				list.set(right, temp);
				break;
			}		
		}
		
		System.out.println(list);
		return 0;
	}

}
