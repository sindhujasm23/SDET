package slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class ShortestDistCharacter {
	/*1. Did I understand the problem? Yes

    If no ask the person to provide with more details with examples
    If yes go to the next step

    What is the input(s)? ---> String,target char
    What is the expected output? --->int[]
    Do I have constraints to solve the problem? ---> 
    Do I have all the information to go to the next steps? --->
    How big your test data set will be? --->

	2. Test Data Set:
	 Minimum 3 dataset including positive, negative and edge
	 Validate with interviewer if the dataset is fine by his/her assumptions

	3. Do I know to solve it?  Brute Force -- O(n^2)
	 Yes - great is there an alternative? 
	 No - can I break the problem into sub problems?

	4. Ask for hint (if you don't know how to solve this)

	5. Do I know alternate solutions as well? 
	  Yes - what are those?
	  No - that is still fine, proceed to solve by what you know

	6. If you know the alternate solution find out the O-notations (performance) - 
	7. Then, explain either both are the best (depends on the time)
	  Approach 1:- start with the worst -> improve(optimize) -> End up with the best
	  Approach 2:- Write down the options and benefits and code the best
	8. Start always with the Pseudo code
	9. Test against different test data
	10. If it fails then debug to solve it
	 */

	@Test
	public void test1(){
		String s = "loveleetcode";
		char c = 'e';
		Assert.assertArrayEquals(shortDistanceUsingTwoPointer(s,c),new int[] {3,2,1,0,1,0,0,1,2,2,1,0});
	}

	//@Test
	public void test2(){
		String s = "aaab";
		char c = 'b';
		Assert.assertArrayEquals(shortDistance(s,c),new int[] {3,2,1,0});
	}

	//@Test
	public void test3(){
		String s = "abaa";
		char c = 'b';
		Assert.assertArrayEquals(shortDistance(s,c),new int[] {1,0,1,2});
	}
	/*1.Traverse through all character of given String
	 * 2.compare the characters before and after the index with target charcter
	 * 3.Increment the counter until the target character is found  
	 * 4.if its found before and after take the shortest disatnce and add it to int array
	 * 5.return the output
	 * 
	 */
	//loveleetcode"
	private int[] shortDistance(String s, char c) {
		// TODO Auto-generated method stub
		int[] output=new int[s.length()];
		boolean flag=false;
		for (int i = 0; i < s.length(); i++) {
			int min=1 ,min1=1;
			if(s.charAt(i)==c ){
				output[i]=0;
			}else{
				for (int j = i+1; j < s.length(); j++) {
					if(s.charAt(j)!=c ){
						min++;
					}else{
						output[i]=min;
						break;
					}

				}

				for (int j = i-1; j >= 0; j--) {
					if(s.charAt(j)!=c ){
						min1++;
					}else{
						output[i]=Math.min(min, min1);
						break;
					}
				}
			}

		}
		System.out.println(Arrays.toString(output));
		return output;
	}
	/*
	 * Time Complexity : O(n^2)
	 * Space complexity :O(n)
	 */
	
	//loveleetcode"
	
	
	
	private int[] shortDistanceUsingTwoPointer(String s, char c){
		
		int[] output=new int[s.length()];
		List<Integer> targetIndices=new LinkedList<Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==c){
				targetIndices.add(i);
			}
		}
		int j=0,index1=0,index2=0,dist=0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i)!=c){
				if(i<targetIndices.get(j)){
					output[i]=targetIndices.get(j)-i;
				}else {
					index1=targetIndices.get(j++);
					index2=targetIndices.get(j++);
					output[i]=Math.min(index1-j,index2-j);
					
				}
			}else{
				output[i]=0;
			}
		}
		System.out.println(Arrays.toString(output));
		return output;
		
	}
}
