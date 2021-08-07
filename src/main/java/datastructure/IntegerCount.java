package datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

public class IntegerCount {

	/*
	 * Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr. 
	 * If there are duplicates in arr, count them separately.
	 * 
	 * Example 1:

		Input: arr = [1,2,3]
		Output: 2
		Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
		Example 2:

		Input: arr = [1,1,3,3,5,5,7,7]
		Output: 0
		Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.

	 * 1. Did I understand the problem? Yes

    If no ask the person to provide with more details with examples
    If yes go to the next step

    What is the input(s)? ---> int[]
    What is the expected output? --->int 
    Do I have constraints to solve the problem? ---> no constraints
    Do I have all the information to go to the next steps? --->yes
    How big your test data set will be? --->

	2. Test Data Set:
	 Minimum 3 dataset including positive, negative and edge
	 Validate with interviewer if the dataset is fine by his/her assumptions

	3. Do I know to solve it?  Brute Force - O(n^2),HashMap-O(n)
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
	 * 
	 */

	@Test
	public void test1(){
		int[] input={1,2,3};
		//Assert.assertEquals(2,integerCountUsingNestedLoop(input));
		Assert.assertEquals(2,integerCountUsingHashMap(input));

	}


	@Test
	public void test2(){
		int[] input={1,1,3,3,5,5,7,7};
		//Assert.assertEquals(0,integerCountUsingNestedLoop(input));
		Assert.assertEquals(0,integerCountUsingHashMap(input));
	}

	@Test
	public void test3(){
		int[] input={1,1,2,2};
		//Assert.assertEquals(2,integerCountUsingNestedLoop(input));
		Assert.assertEquals(2,integerCountUsingHashMap(input));
	}

	@Test
	public void test4(){
		int[] input={1,1,2};
		//Assert.assertEquals(2,integerCountUsingNestedLoop(input));
		Assert.assertEquals(2,integerCountUsingHashMap(input));
		
	}
	/*
	 * 1.Traverse through each element of an array 
	 * 2.Traverse through another loop and compare the other element equals to current element+1
	 * 		a.If equals increement the counter and break the inner loop
	 * 		b.If not continue the loop
	 * 3.Repeat the process till end of the loop 
	 * 4.Return the count
	 */

	private int integerCountUsingNestedLoop(int[] input) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if(input[j]==input[i]+1){
					count++;
					break;
				}

			}

		}
		return count;
	}
	/*
	 * Time complexity :O(n^2)
	 * Spcae Complexity :O(1)
	 */
	
	/*
	 * 1.Add the array elements in hash map with array element as the key and count of the element as value
	 * 2.Traverse through the map
	 * 3.compare current key with next key
	 * 4.If the next value equals to current key +1, assign the counter to first key's value and break the loop
	 * 5.If it does not match continue the loop
	 * 6.Return the count at the end of the loop
	 * 
	 */

	private int integerCountUsingHashMap(int[] input) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int i = 0; i < input.length; i++) {			//O(n)
			map.put(input[i], map.getOrDefault(input[i], 0)+1);
			
		}
		System.out.println(map);
		int count=0;
		for(Integer eachKey:map.keySet()){		//O(n)
			
			if(map.containsKey(eachKey+1)){
				count=count+map.get(eachKey);
				
			}
		}
		return count;

	}
	
	/*
	 * Time complexity :O(n)
	 * Spcae Complexity :O(n)
	 */
}
