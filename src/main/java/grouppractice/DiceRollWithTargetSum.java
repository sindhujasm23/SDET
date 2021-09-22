package grouppractice;

import org.junit.Test;

public class DiceRollWithTargetSum {
	//https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
	@Test
	public void test1() {
		int d=1,f=6,target=3;
		System.out.println(numRolls(d,f,target));
	}

	@Test
	public void test2() {
		int d=2,f=6,target=7;
		System.out.println(numRolls(d,f,target));
	}

	@Test
	public void test3() {
		int d=2,f=5,target=10;
		System.out.println(numRolls(d,f,target));
	}

	@Test
	public void test4() {
		int d=1,f=2,target=3;
		System.out.println(numRolls(d,f,target));
	}
	//@Test
	public void test5() {
		int d=30,f=30,target=500;
		System.out.println(numRolls(d,f,target));
	}

	private int numRolls(int d, int f, int target) {

		if(target>f*d) return 0;

		int modulo = (int)Math.pow(10,9)+7;

		int[][] dp = new int[d+1][target+1];
		dp[0][0] = 1;

		for(int i=1;i<=d;i++){
			for(int j=0;j<=target;j++){
				for(int k=1;k<=f;k++){
					if(j-k<0) continue; //because [j-k] needs to be within the bounds of dp, that is, it needs to be greater than or equal to 0 
					dp[i][j] = (dp[i][j] + dp[i-1][j-k])% modulo;
				}
			}
		}

		return dp[d][target];
	}

}


