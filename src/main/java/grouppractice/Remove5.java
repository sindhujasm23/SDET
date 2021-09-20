package grouppractice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Remove5 {

	@Test
	public void test1() {
		long n=15958;
		findMax(n);
	}

	@Test
	public void test2() {
		long n=-5859;
		findMax(n);
	}

	@Test
	public void test3() {
		long n=-5000;
		findMax(n);
	}

	private void findMax(long nums) {
		int max=Integer.MIN_VALUE;
		String num1="";
		List<Integer> list =new ArrayList<Integer>();
		long num=Math.abs(nums);
		while(num>0){			
			int temp=(int) (num%10);
			num=num/10;
			list.add(0,temp);
		}
		int num2=Integer.MIN_VALUE;
		//System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			num1="";
			if(list.get(i)==5){
				for (int j = 0; j < list.size(); j++) {
					if(j!=i){						
						num1=num1.concat(String.valueOf(list.get(j)));
						num2=Integer.parseInt(num1);				
					}
				}
				if(nums<0){
					num2=Integer.parseInt(num1)*-1;
				//	System.out.println(num2);
				}
					max=Math.max(num2, max);
			}
		}
		System.out.println(max);
	}
}


