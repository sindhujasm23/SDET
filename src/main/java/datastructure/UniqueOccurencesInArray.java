package datastructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class UniqueOccurencesInArray {
	
	
	/*
	 * input a=[1,2,2,3,3,3]
	 * Output :true
	 * 
	 * 
	 */

	@Test
	public void test1(){
		int [] input={2,5,2,5,2,1};
		Assert.assertEquals(true,uniqueOccurencesInArray(input));
		
	}
	
	@Test
	public void test2(){
		int [] input={1,2,2,3,3,3,1};
		Assert.assertEquals(false,uniqueOccurencesInArray(input));
	}
	
	@Test
	public void test3(){
		int [] input={};
		Assert.assertEquals(true,uniqueOccurencesInArray(input));
	}
	
	/*
	 * 1.Traverse through each element of any array
	 * 2.Initialize a map with key as array element and value as counter of the element
	 * 3.Check if the array element exist in map
	 * 		a.If exist -> get the value and add the value with 1 and insert in the map
	 * 		b.If does'nt exist -> add the key as array element and value as 1
	 * 4.Repeat it till end of the loop
	 * 5.Traverse through all the elements of the map using values
	 * 6.Load the map values to set
	 * 7.check if the size of map equals to size of set
	 * 		a.If equal return true
	 * 		b.if not return false
	 */
	
	private boolean uniqueOccurencesInArray(int[] input) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for (int i = 0; i < input.length; i++) { //O(n)
			if(map.containsKey(input[i])){
				int value=map.get(input[i]);
				map.put(input[i], value+1);
			}else{
				map.put(input[i], 1);
			}
			
		}
		HashSet<Integer> set=new HashSet<Integer>(map.values());
		if(set.size()==map.size()){
			return true;
		}
		return false;
	}
	
	/*
	 * Time Complexity : O(n)
	 * Space Complexity :O(n)
	 */
}
