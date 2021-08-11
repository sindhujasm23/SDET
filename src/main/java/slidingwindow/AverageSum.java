package slidingwindow;

import org.junit.Test;

import junit.framework.Assert;

public class AverageSum {

	
	/*1. Did I understand the problem? Yes

    If no ask the person to provide with more details with examples
    If yes go to the next step

    What is the input(s)? ---> int[],int[]
    What is the expected output? --->double
    Do I have constraints to solve the problem? ---> result should be without duplicates in any order
    Do I have all the information to go to the next steps? --->yes
    How big your test data set will be? --->

	2. Test Data Set:
	 Minimum 3 dataset including positive, negative and edge
	 Validate with interviewer if the dataset is fine by his/her assumptions

	3. Do I know to solve it?  Brute Force -- O(n*m)
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
		int[] avg={1,12,-5,-6,50,3};
		int k=4;
		Assert.assertEquals(12.75,findAverage(avg,k));
	}

	@Test
	public void test2(){
		int[] avg={5};
		int k=1;
		Assert.assertEquals(1.00,findAverage(avg,k));
	}

	@Test
	public void test3(){
		int[] avg={-1,-11};
		int k=2;
		Assert.assertEquals(-6.00,findAverage(avg,k));
	}

	private double findAverage(int[] avg,int k) {
		// TODO Auto-generated method stub
		if(avg.length==1 && k==1) return avg[1];
		double initAvg=0;
		for (int i = 0; i < k; i++) {
			initAvg+=avg[i];		
		}
		double maxAvg=Integer.MIN_VALUE;
		for (int i = 1; i < avg.length-k; i++) {
			initAvg=initAvg-(avg[i-1])+(avg[i+k-1]);
			maxAvg=Math.max(initAvg,maxAvg);
			maxAvg=maxAvg/k;
			System.out.println(maxAvg);
		}
		return maxAvg;
	}
	
}
