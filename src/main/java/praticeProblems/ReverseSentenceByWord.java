package praticeProblems;

import java.util.Arrays;

import org.junit.Test;

public class ReverseSentenceByWord {
/*
 * input - today is a beautiful day
 * output- day beautiful a is today
 */
	@Test
	public void test1() {
		String str="today is a beautiful day";
		reverseSentence(str);
	}

	@Test
	public void test2() {
		String str="today ";
		reverseSentence(str);
	}

	@Test
	public void test3() {
		String str="a  b c d ";
		reverseSentence(str);
	}

	/*
	 * split the string and store it in array
	 * Initialize a string buffer 
	 * traverse from end of the loop
	 * append each word to string buffer
	 * return the String
	 */
	private String reverseSentence(String str) {
		String []arr=str.split("\\s+");
		
		StringBuffer output=new StringBuffer();
		for (int i = arr.length-1;i>=0;i--) {
			output.append(arr[i]);
			output.append(" ");
			
		}
		System.out.println(output);
		return output.toString();
		
	}
	
	/*Split the string and store it in arr
	 * Initialize left as 0 right as arr length
	 * swap the left and right 
	 */
	
	private String reverseSentenceWithConstantSpace(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			int startIndex=i;
			if(str.charAt(i)==' '){
				str.subSequence(startIndex, i);
			}
			
		}
		return str;
		
	}
}


