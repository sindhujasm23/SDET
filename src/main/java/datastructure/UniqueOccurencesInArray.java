package datastructure;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class UniqueOccurencesInArray {
	
	
	/*Given an array of integers arr, write a function that returns true if and only if
	  the number of occurrences of each value in the array is unique.
 
		Example 1:
			Input: arr = [1,2,2,1,1,3]
			Output: true

	 * 1. Did I understand the problem? Yes
	   
    If no ask the person to provide with more details with examples
    If yes go to the next step
    
    What is the input(s)? ---> int[]
    What is the expected output? --->int (missing number)
    Do I have constraints to solve the problem? ---> no constraints
    Do I have all the information to go to the next steps? --->yes
    How big your test data set will be? --->

	2. Test Data Set:
	 Minimum 3 dataset including positive, negative and edge
	 Validate with interviewer if the dataset is fine by his/her assumptions
	 
	3. Do I know to solve it?  Brute Force
	 Yes - great is there an alternative? 
	 No - can I break the problem into sub problems?
	 
	4. Ask for hint (if you don't know how to solve this)

	5. Do I know alternate solutions as well? No
	  Yes - what are those?
	  No - that is still fine, proceed to solve by what you know
	  
	6. If you know the alternate solution find out the O-notations (performance) - O(n*m)
	7. Then, explain either both are the best (depends on the time)
	  Approach 1:- start with the worst -> improve(optimize) -> End up with the best
	  Approach 2:- Write down the options and benefits and code the best
	8. Start always with the Pseudo code
	9. Test against different test data
	10. If it fails then debug to solve it
*/

	@Test
	public void test1(){
		int [] input={2,5,2,5,2,1};
		//Assert.assertEquals(true,uniqueOccurencesInArray(input));
		Assert.assertEquals(true,uniqueOccurencesInArrayUsingNestedLoop(input));
		
	}
	
	@Test
	public void test2(){
		int [] input={1,2,2,3,3,3,1};
		//Assert.assertEquals(false,uniqueOccurencesInArray(input));
		Assert.assertEquals(true,uniqueOccurencesInArrayUsingNestedLoop(input));
	}
	
	@Test
	public void test3(){
		int [] input={};
		//Assert.assertEquals(false,uniqueOccurencesInArray(input));
		Assert.assertEquals(true,uniqueOccurencesInArrayUsingNestedLoop(input));
	}
	
	
	/*
	 * 1.Sort the array using sort method
	 * 2.traverse through the sorted array
	 * 3.compare current element with every other element with another loop
	 * 		a.if it matches increement the count
	 * 		b.if not continue the loop
	 * 4.add the counter to list at the end of inner loop
	 * 5.traverse through the list
	 * 6.compare each element with other element
	 * 		a.if the counter is unique return true
	 * 		b.if not return false
	 */
	
	private boolean uniqueOccurencesInArrayUsingNestedLoop(int[] input) {
		Arrays.sort(input);
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println(Arrays.toString(input));
		outer :for (int i = 0; i < input.length; ) {
			int count=0;
			for (int j = 0; j < input.length; j++) {
				if(input[i]==input[j]){
					count++;
					
				}
				if(input[j]>input[i]){
					i=j;
					break;
				}else{
					break;
				}
				
				
			}
			list.add(count);
			
		}
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if(list.subList(i+1, list.size()).contains(i)){
				return false;
			}
			
		}
		return true;
		
	}
	
	/*
	 * 1.Traverse through each element of any array
	 * 2.Initialize a map with key as array element and value as counter of the element
	 * 3.Check if the array element exist in map
	 * 		a.If exist -> get the value and add the value with 1 and insert in the map
	 * 		b.If does'nt exist -> add the key as array element and value as 1
	 * 4.Repeat it till end of the loop
	 * 5.Load the map values to set
	 * 6.check if the size of map equals to size of set
	 * 		a.If equal return true
	 * 		b.if not return false
	 */
	
	private boolean uniqueOccurencesInArray(int[] input) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		if (input.length==0){
			throw new RuntimeException("Input array is empty");
		}
		
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
