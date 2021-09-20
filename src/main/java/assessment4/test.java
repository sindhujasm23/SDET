package assessment4;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class test {
	@Test
	public void test1(){
		List<Integer> nums =new ArrayList<Integer>();
		nums.add(6);
		nums.add(1);
		nums.add(2);
		nums.add(4);
		List<Integer> nums1 =new ArrayList<Integer>();
		nums1.add(8);
		nums1.add(9);
		nums1.add(4);
		nums1.add(7);
		maxPresentations(nums,nums1);

	}
	
	@Test
	public void test2(){
		List<Integer> nums =new ArrayList<Integer>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		
		List<Integer> nums1 =new ArrayList<Integer>();
		nums1.add(3);
		nums1.add(2);
		nums1.add(4);
		
		maxPresentations(nums,nums1);

	}
	@Test
	public void test3(){
		List<Integer> nums =new ArrayList<Integer>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		List<Integer> nums1 =new ArrayList<Integer>();
		nums1.add(2);
		nums1.add(3);
		nums1.add(3);
		nums1.add(4);
		maxPresentations(nums,nums1);

	}
	public static int maxPresentations(List<Integer> scheduleStart, List<Integer> scheduleEnd) {
		int count=0,left=0,right=1,end=scheduleEnd.get(left),currentCount=1;
		while(left<scheduleEnd.size()){

			if(scheduleStart.get(right) >=end){

				//System.out.println(end);
				//   System.out.println(scheduleStart.get(right) );
				currentCount++;
				end=scheduleEnd.get(right);
				//System.out.println(end);

			}
			if(right<scheduleEnd.size()-1){
				right++;
			}else{
				if(right==scheduleEnd.size()-1 ){

					count=Math.max(count, currentCount);
					currentCount=1;

					left++;
					right=0;
					if(left<scheduleEnd.size()-1){
						end=scheduleEnd.get(left);
					}

				

			}
		}
	}
		System.out.println(count);
	return count;
}

}

