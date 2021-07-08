package datastructure;

import org.junit.Test;

import junit.framework.Assert;

public class PalindromeInteger {

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
