package datastructure;

import org.junit.Test;

import junit.framework.Assert;

public class PalindromeInteger {
	
	/*1. Did I understand the problem? Yes
	   
    If no ask the person to provide with more details with examples
    If yes go to the next step
    
    What is the input(s)? ---> int
    What is the expected output? --->boolean 
    Do I have constraints to solve the problem? ---> no constraints
    Do I have all the information to go to the next steps? --->yes
    How big your test data set will be? --->

	2. Test Data Set:
	 Minimum 3 dataset including positive, negative and edge
	 Validate with interviewer if the dataset is fine by his/her assumptions
	 
	3. Do I know to solve it?  Brute Force -O(n)
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
		int input=112211;
		Assert.assertEquals(true, palindromeInteger(input));
	}

	@Test
	public void test2(){
		int input=1231;
		Assert.assertEquals(false, palindromeInteger(input));
	}

		
	@Test
	public void test3(){
		int input=11221100;
		Assert.assertEquals(false, palindromeInteger(input));
	}

	@Test
	public void test4(){
		int input=1;
		Assert.assertEquals(true, palindromeInteger(input));
	}
	
	/*
	 * 1.Store the input in a temp variable 
	 * 2.Find the remainder of the input -> input%10 and assign it to new variable
	 * 3.Divide the input by ten and assign to input
	 * 4.Repeat this until input is greater than 0 using while loop
	 * 5.Check if the element is equal to reverse.
	 * 		a.If it is equal return true
	 * 		b.If it is not equal return false
	 */

	private boolean palindromeInteger(int input) {
		int reverse = 0,temp=input;
		while(input>0)
		{
			int remainder=input%10;
			input=input/10;
			reverse=reverse*10+remainder;
		}
		//System.out.println(reverse);
		if(reverse==temp)
		{
			return true;
		}

		return false;
		// TODO Auto-generated method stub

	}

}
