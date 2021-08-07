package datastructure;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindrome {

	/*
	 *
	Given a string s, return true if the s can be palindrome after deleting at most one character from it.

	Example 1:
	Input: s = "aba"
	Output: true

	Example 2:
	Input: s = "abca"
	Output: true
	Explanation: You could delete the character 'c'.

	Example 3:
	Input: s = "abc"
	Output: false


	 * 1. Did I understand the problem? Yes

    If no ask the person to provide with more details with examples
    If yes go to the next step

    What is the input(s)? ---> String
    What is the expected output? --->boolean
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
		String s = "aba";
		Assert.assertEquals(findPalindrome(s),true);
	}


	@Test
	public void test2(){
		String s = "deee";
		Assert.assertEquals(findPalindrome(s),true);
	}

	@Test
	public void test3(){
		String s = "abdc";
		Assert.assertEquals(findPalindrome(s),false);
	}
	/*
	 * 1.Traverse through the loop starting from first charcter 
	 * 2.Assign left index as 0 and right index as length of string
	 * 3.compare left and right index value
	 * 4.if it matches incremnet both index and continue
	 * 5.if it does not match increment right index and compare
	 * 		a.If it matches 
	 * 
	 * 
	 */
	//abca
	private boolean findPalindrome(String s) {
		// TODO Auto-generated method stub
		int left=0,right=s.length()-1;

		while(left<=right){
			//count=0;
			if(s.charAt(left)!=s.charAt(right)){
				break;
			}
			left++;
			right--;
		}

		while(left<=right-1){
			if(s.charAt(left)!=s.charAt(right-1)){
				break;
			}
			left++;
			right--;

		}
		while(left+1<=right-1){
			if(s.charAt(left+1)!=s.charAt(right)){
				return false;
			}
			left++;
			right--;

		}
		return true;
	}

}
