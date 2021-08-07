package datastructure;

import org.junit.Test;

public class RemoteControl {

	@Test
	public void test1(){
		String s="RLR";
		findMaxDeletion(s);
	}

	@Test
	public void test2(){
		String s="UDRRL";
		findMaxDeletion(s);
	}
	
	@Test
	public void test3(){
		String s="RRR";
		findMaxDeletion(s);
	}

	@Test
	public void test4(){
		String s="URDR";
		findMaxDeletion(s);
	}

	
	
	private void findMaxDeletion(String s) {
		int maxDel=0,countR=0,countL=0,countU=0,countD=0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='R'){
				countR++;
				maxDel++;
			}else if(s.charAt(i)=='L'){
				countL++;
				maxDel++;
			}else if(s.charAt(i)=='U'){
				countU++;
				maxDel++;
			}else{
				countD++;
				maxDel++;
			}
			
		}
		maxDel=maxDel-((countR-countL)+(countU-countD));
		System.out.println(maxDel);
		
	}
}
