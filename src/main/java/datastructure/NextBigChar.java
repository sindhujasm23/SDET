package datastructure;

import org.junit.Test;

public class NextBigChar {
	
	@Test
	public void test1(){
		char[] cha = {'b', 'd' , 'h'};
		char k = 'e';
		System.out.println(findBigCharUsingBS(cha,k));
	}

	
	@Test
	public void test2(){
		char[] cha = {'a', 'd' , 'h'};
		char k = 'z';
		System.out.println(findBigCharUsingBS(cha,k));
	}

	@Test
	public void test3(){
		char[] cha = {'b', 'd' , 'h'};
		char k = 'c';
		System.out.println(findBigCharUsingBS(cha,k));
	}
	@Test
	public void test4(){
		char[] cha = {'c', 'f' , 'j'};
		char k = 'j';
		System.out.println(findBigCharUsingBS(cha,k));
	}

	private char findBigChar(char[] cha, char k) {
		
		for (int i = 0; i < cha.length; i++) {
			//char c = cha[i];
			if(cha[i]>k){
				return cha[i];
			}
			
		}
		// TODO Auto-generated method stub
		
		return cha[0];
		
	}
	
	private char findBigCharUsingBS(char[] cha, char k) {
		int low=0,high=cha.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			//System.out.println(mid);
			
			if(mid!=0 && cha[mid]>k && cha[mid-1]<=k  ){
				return cha[mid];
			}
			if(mid==0 && cha[mid]>=k  ){
				return cha[mid];
			}
			if(cha[mid]<=k){
				low=mid+1;		
			}else if(cha[mid]>k){
				high=mid;
			}
		}
		
		return  cha[0];
		
	}

}
