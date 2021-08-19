package slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class DieterCalories {
	
	/*
	 * input -->int[],int,int,int
	 * output-->int
	 * Constraint -->Window Sliding
	 * 
	 * 
	 */
	
	@Test
	public void test1(){
		int[] calories={1,2,3,4,5};
		int k=1,lower=3,upper=3;
		Assert.assertEquals(findCalories(calories,k,lower,upper),0);
	}
	
	@Test
	public void test2(){
		int[] calories={3,2};
		int k=2,lower=0,upper=1;
		Assert.assertEquals(findCalories(calories,k,lower,upper),1);
	}
	
	@Test
	public void test3(){
		int[] calories={6,5,0,0};
		int k=2,lower=1,upper=5;
		Assert.assertEquals(findCalories(calories,k,lower,upper),0);
	}

	/*
	 * 1.Traverse through the loop from start index till k length
	 * 2.Add the value of each calorie to the Sum
	 * 3.if the sum is greater than upper increment the counter
	 * 4.if the sum is less than lower decrement the counter
	 * 5.TRaverse through another loop starting with k till end of the loop
	 * 6.Subtract [i-k] calories and add the next calorie value
	 * 7.again check the sum with lower and upper limit
	 * 8.Repeat till end of the loop
	 */
	
	//int[] calories={1,2,3,4,5};
	//int k=1,lower=3,upper=3;
	private int findCalories(int[] calories, int k, int lower, int upper) {
		// TODO Auto-generated method stub
		int sum=0,output=0;
		for (int i = 0; i < k; i++) {
			sum+=calories[i];	
		}
		
		if(sum>upper){
			output++;
		}else if(sum<lower){
			output--;
		}
		for (int i = k; i < calories.length; i++) {
			sum=sum-calories[i-k]+calories[i];
			if(sum>upper){
				output++;
			}else if(sum<lower){
				output--;
			}
		}
		System.out.println(output);
		return output;
	}
	
	/*
	 * Time Complexity :O(n)
	 * Space Complexity :O(1)
	 */

}
