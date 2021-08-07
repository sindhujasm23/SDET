package datastructure;

import org.junit.Test;

public class NiceString {
	
	/*
	 * A string s is nice if, for every letter of the alphabet that s contains, 
	 * it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 
	 * 'b' appear. However, "abA" is
	 *  not because 'b' appears, but 'B' does not.

	 * 1. Did I understand the problem? Yes

    If no ask the person to provide with more details with examples
    If yes go to the next step

    What is the input(s)? ---> String
    What is the expected output? --->String 
    Do I have constraints to solve the problem? ---> Sliding window O(n) and O(1)
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
		String s="YaAay";
		int k=3;
		System.out.println(findNiceString(s,k));
	}

	
	/*1.Traverse through the characters of STring
	 * 2.Check if the character is lower 
	 * 3.convert the  character to upper case and check if next character is same
	 * 4.Check if the character is upper 
	 * 5.convert the  character to lower case and check if next character is same
	 * 6.Assign the substring to new string and append 
	 * 7.
	 * 
	 */
	
	private String findNiceString(String s,int k) {
		// TODO Auto-generated method stub
		StringBuilder output=new StringBuilder();
		s.toCharArray();
		for (int i = 0; i < k; i++) {
			Character temp=s.charAt(i);
			if(Character.isLowerCase(temp)){
				if(temp==Character.toUpperCase(s.charAt(i+1))){
					output.append(temp);
					output.append(s.charAt(i+1));
				}
			}
			
			if(Character.isUpperCase(temp)){
				if(temp==Character.toLowerCase(s.charAt(i+1))){
					output.append(temp);
					output.append(s.charAt(i+1));
				}
			}
		}
		
		
		System.out.println(output.toString());
		for (int i = 1; i < s.length()-k; i++) {
			
			
			
		}
		/*for (int i = 0; i < s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))){
				if(Character.isUpperCase(s.charAt(i+1))&& 
			}
			
		}*/
		return null;
	}

}
