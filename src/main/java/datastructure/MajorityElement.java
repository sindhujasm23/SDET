package datastructure;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class MajorityElement {

	@Test
	public void test1(){
		int input[]={1,4,6,1,5,1,3,1,1,1};
		Assert.assertEquals(1, majorityElement(input));
		//Assert.assertEquals(1, majorityElementUsingMap(input));
	}

	@Test
	public void test2(){
		int input[]={1,4,6,1,5,1,3,8,4,5};
		Assert.assertEquals(-1, majorityElement(input));
		//Assert.assertEquals(-1, majorityElementUsingMap(input));
	}

	@Test
	public void test3(){
		int input[]={1,5,1,5,5,1,5,1,5,1,9};
		Assert.assertEquals(-1, majorityElement(input));
		//Assert.assertEquals(-1, majorityElementUsingMap(input));

	}

	/*
	 * 1.Traverse through all elements of an array starting with first element
	 * 2.Traverse through another loop for every element of an array
	 * 3.compare first element with all other element and find the count of matching element
	 * 4.Check if the count is greater than n/2
	 * 		a.if it is greater return the max element
	 * 5.repeat it until the majority element count is n/2
	 * 6.if none of the element is greater than n/2 then return -1
	 * 
	 */

	private int majorityElement(int[] input) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < input.length; i++) {
			int count=0;
			for (int j = 0; j < input.length; j++) {
				if(input[i]==input[j]){
					count++;
				}
			}
			
			if(count>input.length/2){
				return input[i];
			}
		}
		return -1;
		
	}
	
	/*
	 * Time complexity :O(n^2)
	 * Space Complexity : O(1)
	 */

	
	/*
	 * 1.Traverse through each element of any array
	 * 2.Initialize a map with key as array element and value as counter of the element
	 * 3.Check if the array element exist in map
	 * 		a.If exist -> get the value and add the value with 1 and insert in the map
	 * 		b.If does'nt exist -> add the key as array element and value as 1
	 * 4.Repeat it till end of the loop
	 * 5.Traverse through all the elements of the map using keyset
	 * 6.get the value of each key and check if the value is more than n/2 times
	 * 		a.If the value is greater than n/2 return the key
	 * 7.If none of the values are greater than n/2 return -1
	 */
	private int majorityElementUsingMap(int[] input) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int i = 0; i < input.length; i++) { //O(n)
			if(map.containsKey(input[i])){
				int value=map.get(input[i]);
				map.put(input[i], value+1);
			}else{
				map.put(input[i], 1);
			}
			
		}
		
		//System.out.println(map);
		for (Integer each:map.keySet()) { //O(n/2)
			int max=map.get(each);
			if(max>input.length/2){
				return each;
			}
			
		}
		return -1;
		
	}
	/*
	 * Time Complexity:O(n)
	 * Space Complexity :O(n)
	 */
}
