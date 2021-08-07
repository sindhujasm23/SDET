package datastructure;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HappyNumber {

	/*
	 * Write an algorithm to determine if a number n is happy. A happy number is a number defined by the following process:

	Starting with any positive integer, replace the number by the sum of the squares of its digits.
	Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
	Those numbers for which this process ends in 1 are happy.
	Return true if n is a happy number, and false if not.

	Example 1:

	Input: n = 19
	Output: true
	Explanation:
	12 + 92 = 82
	82 + 22 = 68
	62 + 82 = 100
	12 + 02 + 02 = 1

	Example 2:
	Input: n = 2
	Output: false

	 * 1. Did I understand the problem? Yes

    If no ask the person to provide with more details with examples
    If yes go to the next step

    What is the input(s)? ---> int
    What is the expected output? --->boolean 
    Do I have constraints to solve the problem? ---> 
       Do I have all the information to go to the next steps? --->yes
    How big your test data set will be? --->

	2. Test Data Set:
	 Minimum 3 dataset including positive, negative and edge
	 Validate with interviewer if the dataset is fine by his/her assumptions

	3. Do I know to solve it? 
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
	 * 
	 */

	@Test
	public void test1(){
		int num=19;
		System.out.println(findHappyNumber(num));
	}


	@Test
	public void test2(){
		int num=2;
		System.out.println(findHappyNumber(num));

	}

	@Test
	public void test3(){
		int num=10;
		System.out.println(findHappyNumber(num));

	}
	
	/*1.Add the num in set in While condition
	 *2.Traverse through the loop till num is greater than 0
	 *2.Initialize a temp variable and assign the mod of num
	 *3.Assign num with num/10
	 *4.Add the sum variable with temp^2
	 *5.check if the sum equals to 1
	 *		a.If equals return true
	 *		b.if not assign num=sum
	 *6.Loop continues until the sum becomes 1 or until num equals to same num
	 *
	 * 
	 */
	private boolean findHappyNumber(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		Set<Integer> set=new HashSet<Integer>();
		while(set.add(num)){
			sum=0;
			while(num>0){
				int lastDigit=num%10;
				num=num/10;
				sum+=lastDigit*lastDigit;

			}
			if(sum==1){
				//System.out.println(true);
				return true;
			}else{
				num=sum;
			}
		}
		return false;
	}
	/*
	 * 1.
	 */

}
