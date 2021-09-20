package stringproblems;

import org.junit.Test;

public class ExcelSheetColNo {

	@Test
	public void test1() {
		String s="AB";
		findColNo(s);
	}

	@Test
	public void test2() {
		String s="BBB";
		findColNo(s);
	}

	@Test
	public void test3() {
		String s="FXSHRXW";
		findColNo(s);
	}

	private int findColNo(String s) {
		char []str=s.toCharArray();
		int colNo=0,length=str.length-1;
		for (int i = 0; i<str.length; i++) {
			colNo+=Math.pow(26, length--)*(str[i]-64);
		}
		System.out.println(colNo);
		return colNo;				
	}
	//O(n) O(1)
}


