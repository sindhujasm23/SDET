package stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class MinRemoveValidParenthesis {

	@Test
	public void test1(){
		String s="lee(t(c)o)de)";
		findMinRemove(s);
	}

	@Test
	public void test2(){
		String s="a)b(c)d";
		findMinRemove(s);
	}

	@Test
	public void test3(){
		String s="())()(((";
		findMinRemove(s);
	}

	@Test
	public void test4(){
		String s="(a(b(c)d)";
		findMinRemove(s);
	}
	
	private void findMinRemove(String s) {
		// TODO Auto-generated method stub
		int left=0,right=s.length()-1;
		Set<Integer> index=new HashSet<Integer>();
		while(left<=right){
			if(s.charAt(left)=='('){
				if(s.charAt(right)==')'){
					index.add(left);
					index.add(right);
					left++;
					right--;
				}else{
					if(Character.isAlphabetic(s.charAt(right))){
						index.add(right);
					}
					right--;
				}
			}else if(s.charAt(left)!='(' && !Character.isAlphabetic(s.charAt(left) )){
				left++;
			}else if(s.charAt(right)!=')' && !Character.isAlphabetic(s.charAt(right))){
				right--;
			}else  if(Character.isAlphabetic(s.charAt(left))){
				index.add(left);
				left++;
			}else if(Character.isAlphabetic(s.charAt(right))){
				index.add(right);
				right--;
			}
		}
		StringBuffer str=new StringBuffer();
		for(Integer each:index){
			str.append(s.charAt(each));
		}
		System.out.println(str.toString());

	}


}
