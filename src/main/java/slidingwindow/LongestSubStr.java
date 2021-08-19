package slidingwindow;

import java.util.LinkedList;
import java.util.TreeMap;

import org.junit.Test;

public class LongestSubStr {

	@Test
	public void test1(){
		String s="abcabcbb";
		findLongestSubString(s);
	}

	@Test
	public void test2(){
		String s="bbbbb";
		findLongestSubString(s);
	}
	@Test
	public void test3(){
		String s="pwwkew";
		findLongestSubString(s);
	}
	
	/*
	 * 
	 */
	private int findLongestSubString(String s) {
		int max=0,currentMax=0;
		StringBuilder subString=new StringBuilder();
		int left=0,right=0;
		while(right<s.length()){
			if(subString.toString().indexOf(s.charAt(right))==-1){
				subString.append(s.charAt(right++));	
				currentMax=subString.length();
				max=Math.max(max,currentMax);
			}else{
				subString.deleteCharAt(left);
			}
		}
		
		//abcabcbb
		System.out.println(max);
		return max;
	}
	
	private int lengthOfLongestSubstring(String s) {
	      
		//String s="abcand";
        if(s.length()>1){
		TreeMap<Integer,StringBuffer> map=new TreeMap <Integer,StringBuffer>();
		for(int i =0;i<s.length();i++){
			StringBuffer subStrg=new StringBuffer();
			subStrg.append(s.charAt(i));
			LinkedList<Character> list=new LinkedList<Character>();
			list.add(s.charAt(i));
			
			for(int j=i+1;j<s.length();j++){
				
				if(list.contains(s.charAt(j))){
					map.put(list.size(), subStrg);
					//System.out.println(subStrg);
					break;
				}else{
					
					list.add(s.charAt(j));
					subStrg.append(s.charAt(j));
				}
				
				if(j+1==s.length()){
					map.put(list.size(), subStrg);
				}
				
			}
			
		}
		//System.out.println(map.lastKey());
       
		int longSub=map.lastKey();
		return longSub;
        }else if(s.length()==1){
            return 1;
        }
            
            else
            return 0;
		
	  
        
    }

}
