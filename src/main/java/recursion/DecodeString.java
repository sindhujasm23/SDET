package recursion;

import org.junit.Assert;
import org.junit.Test;

public class DecodeString {
	@Test
	public void test1() {
		String data="3[a]2[bc]";
		Assert.assertEquals(decodeString(data), "accaccacc");
	}
	@Test
	public void test2() {
		String data="3[a2[c]]";
		Assert.assertEquals(decodeString(data), "accaccacc");
	}
	@Test
	public void test3() {
		String data="2[abc]3[cd]ef";
		Assert.assertEquals(decodeString(data), "accaccacc");
	}

	StringBuilder sb=new StringBuilder();
	private String decodeString(String data) {
		if(!data.contains("]")) {
			return "";
		}
		int count=1;
		int Openindex=0,closeIndex=0;
		closeIndex=data.lastIndexOf(']');
		Openindex=data.lastIndexOf('[');
		if(Character.isDigit(data.charAt(Openindex-1))) {
			count=data.charAt(Openindex-1);
		}
		while(count<=1)
			sb.append(data.substring(Openindex+1, closeIndex));
		decodeString(data.replace(data.substring(Openindex-1, closeIndex+1), sb.toString()));
		System.out.println(sb.toString());
		return sb.toString();
	}
}
