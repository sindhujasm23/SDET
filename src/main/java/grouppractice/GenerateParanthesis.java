package grouppractice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GenerateParanthesis {
	//https://leetcode.com/problems/generate-parentheses/
	@Test
	public void test1() {
		int n=3;
		generateParanthesis(n);
	}

	@Test
	public void test2() {
		int n=1;
		generateParanthesis(n);
	}

	@Test
	public void test3() {
		int n=8;
		generateParanthesis(n);
	}

	private void generateParanthesis(int n) {
		List<String> list = new ArrayList<String>();
		backtrack(list, "", 0, 0, n);
		//return list
	}
	public void backtrack(List<String> list, String str, int open, int close, int max){

		if(str.length() == max*2){
			list.add(str);
			return;
		}

		if(open < max)
			backtrack(list, str+"(", open+1, close, max);
			if(close < open)
				backtrack(list, str+")", open, close+1, max);
	}
}


