package datastructure;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class LongestConseqSequence {

	
	@Test
	public void test1(){
		int []nums={100,4,200,1,3,2};
		findLongSequence(nums);
	}
	
	@Test
	public void test2(){
		int []nums={0,3,7,2,5,8,4,6,0,1};
		findLongSequence(nums);
	}
	
	@Test
	public void test3(){
		int []nums={100};
		findLongSequence(nums);
	}
	
	/*
	 * 1.add all elemnets of arrray to set
	 * 2.Traverse through each elements of set
	 * 3.check if current element +1 is present in set through another loop
	 * 4.Traverse through inner loop till the condition satisfies and increemnt the counter
	 * 5.compare current counter and max and assign the greater count to max
	 * 
	 */
	private void findLongSequence(int[] nums) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);		
		}
		int count=1,max=0;
		for(Integer each:set){
			int num=each+1;;
			count=1;
			while(set.contains(num)){
				num=num+1;
				count++;
			}
			max=Math.max(count, max);
		}
		System.out.println(max);
	}
}
