package assessment4;

import org.junit.Test;

public class LongestEvenLength {

	
	/*
	 * input-String
	 * output-String
	 */
	@Test
	public void test1(){
		String str="Time to write great codee";
		findLongestEvenLength(str);
	}

	/*
	 * Split the string and store it in array
	 * initialize max and index as 0
	 * Traverse through the array
	 * if the array element is divisible by 2 and length is greater than max
	 * assign index to array element index
	 * return the string
	 */
	private String findLongestEvenLength(String str) {
		String input[]=str.split("\\s+");
		int max=0,index=0;
		for (int i = 0; i < input.length; i++) {
			if(input[i].length()%2==0 && input[i].length()>max){
				max=Math.max(input[i].length(), max);
				index=i;
			}			
		}
		System.out.println(input[index]);
		return input[index];
		
	}
}
