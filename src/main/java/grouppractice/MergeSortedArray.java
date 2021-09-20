package grouppractice;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {
	//https://leetcode.com/problems/merge-sorted-array/
	@Test
	public void test1() {
		int nums1[]={1,2,3,0,0,0};
		int nums2[]={2,5,6};
		int m=3,n=3;
		System.out.println(Arrays.toString(mergeArr(nums1,nums2,m,n)));
	}

	@Test
	public void test2() {
		int nums1[]={1};
		int nums2[]={};
		int m=1,n=0;
		System.out.println(Arrays.toString(mergeArr(nums1,nums2,m,n)));
	}

	@Test
	public void test3() {
		int nums1[]={2,0};
		int nums2[]={1};
		int m=1,n=1;
		System.out.println(Arrays.toString(mergeArr(nums1,nums2,m,n)));	
	}

	private int[] mergeArr(int[] nums1, int[] nums2, int m, int n) {
		if(n==0) return nums1;
		if(m==0){
			for(int k=0;k<n;k++){
				nums1[k] = nums2[k];
			}
		}

		int left=m-1,right=n-1,size=nums1.length-1;;
		while(left>=0 && right>=0){
			if(nums1[left]>nums2[right]){
				nums1[size]=nums1[left];
				left--;
				size--;
			}else if(nums1[left]<nums2[right]){
				nums1[size]=nums2[right];
				right--;
				size--;
			}else{
				nums1[size--]=nums2[right--];
				nums1[size--]=nums1[left--];
			}
		}
		//System.out.println(Arrays.toString(nums1));
		while(size>=0){
			if(right>=0){
				nums1[size--]=nums2[right--];
			}
			if(left>=0){
				nums1[size--]=nums1[left--];
			}
		}
		return nums1;
	}


}


