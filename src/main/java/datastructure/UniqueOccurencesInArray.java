package datastructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class UniqueOccurencesInArray {
	
	
	/*1. Did I understand the problem? Yes
	   
    If no ask the person to provide with more details with examples
    If yes go to the next step
    
    What is the input(s)? ---> int[],int[]
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
		Assert.assertEquals(false,uniqueOccurencesInArray(input));
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
