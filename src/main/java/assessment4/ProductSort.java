package assessment4;

import org.junit.Assert;
import org.junit.Test;

public class ProductSort {
	/*
	 * input-int[]
	 * output-int[]
	 * 
	 */
	@Test
	public void test1(){
		int []input={4,5,6,4,4,3,5};
		Assert.assertArrayEquals(new int[]{3, 6,5,5,4,4,4},productSort(input));
	}
	@Test
	public void test2(){
		int []input={7,5,6,4};
		Assert.assertArrayEquals(new int[]{4,5,6,7},productSort(input));
	}
	@Test
	public void test3(){
		int []input={7,7,7};
		Assert.assertArrayEquals(new int[]{7,7,7},productSort(input));
	}
	@Test
	public void test4(){
		int []input={7};
		Assert.assertArrayEquals(new int[]{7},productSort(input));
	}

	/*
	 * 
	 */
	private int[] productSort(int[] input) {
		// TODO Auto-generated method stub
		return null;
	}

}
