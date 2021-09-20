package praticeProblems;

import java.util.Arrays;

import org.junit.Test;

public class SortColor {

	@Test
	public void test1() {
		int []nums={2,0,2,1,1,0};
		colorSort(nums);
	}

	@Test
	public void test2() {
		int []nums={2,0,1};
		colorSort(nums);
	}

	@Test
	public void test3() {
		int []nums={0};
		colorSort(nums);
	}

	private void colorSort(int[] nums) {
		int low=0,mid=0,high=nums.length-1;
		
		while(mid<=high){
			if(nums[mid]==0){
				int temp=nums[low];
				nums[low]=nums[mid];
				nums[mid]=temp;
				low++;
				mid++;
			}else if(nums[mid]==1){
				mid++;
			}else{
				int temp=nums[high];
				nums[high]=nums[mid];
				nums[mid]=temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}
}


