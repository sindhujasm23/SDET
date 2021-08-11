package slidingwindow;

import org.junit.Test;

public class HappyCustomer {

	@Test
	public void test1(){
		int []customers={1,0,1,2,1,1,7,5};
		int [] grumpy = {0,1,0,1,0,1,0,1};
		int x=3;
		findHappyCustomer(customers,grumpy,x);
	}

	private int findHappyCustomer(int[] customers, int[] grumpy, int x) {
		int initSum=0,max=0,k=0,sum=0;
		
		for(int i=0;i<customers.length;i++){
			if(grumpy[i]==0 ){
				initSum+=customers[i];
				
			}
		}

		for(int i=0;i<x;i++){
			
			if(grumpy[i]==1 ){
				sum+=customers[i];
				
			}
		}
		
		for(int i=1;i<customers.length-x;i++){
			if(grumpy[i]==1 ){
				max+=customers[i];
			}
			sum=Math.max(sum, max);
			
			
		}


		return x;
	}

}
