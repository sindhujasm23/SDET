package queue;

import org.junit.Test;

public class StonePile {

	@Test
	public void test1(){
		int piles[]={5,3,4,5};
		findStone(piles);
	}

	@Test
	public void test2(){
		int piles[]={2,3,7,5};
		findStone(piles);
	}

	@Test
	public void test3(){
		int piles[]={7};
		findStone(piles);
	}

	private boolean findStone(int[] piles) {
		int left=0,right=piles.length-1,count=1,alexCount=0,leeCount=0;
		while(count<=piles.length){
			if(count%2==0){
				if(piles[left]>piles[right]){
					leeCount+=piles[left];
					left++;
				}else{
					leeCount+=piles[right];
					right--;
				}
				count++;
			}else{
				if(piles[left]>piles[right]){
					alexCount+=piles[left];
					left++;
				}else{
					alexCount+=piles[right];
					right--;
				}
				count++;
			}
		}
		System.out.println(alexCount);
		return alexCount>leeCount ? true :false;

	}

}
