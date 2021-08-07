package queue;

import java.util.Arrays;

import org.junit.Test;

public class FirstMissingPositive {

	@Test
	public void test1(){
		int nums[]={3,4,-1,1};
		findMissingPositiveWithoutSort(nums);
	}
	@Test
	public void test2(){
		int nums[]={3,4,5,1};
		findMissingPositiveWithoutSort(nums);
	}
	@Test
	public void test3(){
		int nums[]={1,0};
		findMissingPositiveWithoutSort(nums);
	}

	@Test
	public void test4(){
		int nums[]={0,0,1,1,2,2,3,3,3,4};
		findMissingPositiveWithoutSort(nums);
	}

	private int findMissingPositiveWithoutSort(int[] nums) {
		int left=0,right=0,count=1;
		while(right<nums.length){
			if(nums[right]==count){
				int temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
				right=left;
				count++;
				if(count==0){
					count++;
				}
			}else{
				right++;
			}
		}
		System.out.println(count);
		return count;
		
	}
	
	
	private int findMissingPositive(int[] nums) {
		// TODO Auto-generated method stub

		Arrays.sort(nums);
		int count=1,i=0;
		boolean flag=false;
		if(nums[nums.length-1]>0){
			while(count<nums[nums.length-1]) {
				if(nums[i]>0){
					if(nums[i]==count){
						count++;
					}else if(nums[i]<count){
						i++;
						continue;
					}else{
						System.out.println(count);
						flag=true;
						return count;
					}
				}
				i++;
			}
			if(!flag){
				count++;
				System.out.println(count);
				return count;
			}
		}
		return 1;
		//System.out.println(count );
	}
}
