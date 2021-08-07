package datastructure;

import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicates {
	
	@Test
	public void test1(){
		int []input={1,1,1,2,2,3};
		removeDuplicate(input);
	}
	
	@Test
	public void test2(){
		int []input={0,0,1,1,1,1,2,3,3};
		removeDuplicate(input);
	}
	
	@Test
	public void test3(){
		int []input={1,1,1,2,2,3};
		removeDuplicate(input);
	}

	private void removeDuplicate(int[] input) {
		// TODO Auto-generated method stub
		int i=0;
		for (int j = 0; j < input.length-1; j++) {
			if(input[j]!=input[j+1]){
				input[i++]=input[j];
				
			}
			
			
		}
		input[i]=input[input.length-1];
		System.out.println(Arrays.toString(input));
	}

}
