package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;

public class UniformString {


	/*
	 * input-int arr,String,int
	 * output-list of boolean
	 * 
	 */

	@Test
	public void test1(){
		String str="abbccaadf";
		int[] targetVal={4,2,5,3,7};
		int target=5;
		findTargetValue(str,targetVal,target);
	}
	@Test
	public void test2(){
		String str="abbbccaadf";
		int[] targetVal={4,2,5,3,7,6};
		int target=5;
		findTargetValue(str,targetVal,target);
	}
	@Test
	public void test3(){
		String str="abf";
		int[] targetVal={4,9,5,3,7};
		int target=5;
		findTargetValue(str,targetVal,target);
	}


	/*Initialize a hashmap with key as Integer and valu as Boolean
	 * Load all target values to hashmap with default value as false
	 * Initialize left as 0 and right as 0
	 * Traverse through the loop till right is less than string length
	 * compare if left char and right char are equal 
	 * if equal check the value and check in hashmap
	 * if not equal increment left 
	 * check string char value at right is present in hashmap
	 * if present chnage it to true
	 * REpeat till end of the loop 45min
	 */
	private List<Boolean> findTargetValue(String str, int[] targetVal, int target) {
		List<Boolean> list = new ArrayList<Boolean>();
		int left=0,right=0,temp=0;
		LinkedHashMap<Integer,Boolean> map =new LinkedHashMap<Integer,Boolean>();
		for (int i = 0; i < targetVal.length; i++) {
			map.put(targetVal[i], false);
		}
		HashMap<Character,Integer> alphabets =new HashMap<Character,Integer>();
		for (char each='a'; each <='z'; each++) {
			alphabets.put(each, ++left);

		}
		//System.out.println(alphabets);
		left=0;
		while(right<str.length()){

			if(str.charAt(left)==str.charAt(right)){
				temp+=alphabets.get(str.charAt(right));
				right++;
			}else{
				temp=0;
				left++;
			}

			if(map.containsKey(temp)){
				map.put(temp, true);
			}
		}
		list.addAll(map.values());
		System.out.println(list);
		return list;
	}

}
