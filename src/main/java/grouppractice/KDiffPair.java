package grouppractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.junit.Test;

public class KDiffPair {
	//https://leetcode.com/problems/k-diff-pairs-in-an-array/
	@Test
	public void test1() {
		int []nums={3,1,4,1,5};
		int k=2;
		findUniquePair(nums,k);
	}

	@Test
	public void test2() {
		int []nums={1,2,3,4,5};
		int k=1;
		findUniquePair(nums,k);
	}

	@Test
	public void test3() {
		int []nums={1,3,1,5,4};
		int k=0;
		findUniquePair(nums,k);
	}

	private int findUniquePair(int[] nums, int k) {
		
		Set<List<Integer>> set=new HashSet<>();
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		int diff=-1;
		for (int i = 0; i < nums.length; i++) {
			int sum=nums[i]+k;
			diff=-1;
			if(nums[i]-k>=0){
				diff=nums[i]-k;
			}
			if(list.contains(sum)){
				if(i!=list.indexOf(sum)){
					List<Integer> l1=new ArrayList<Integer>();
					l1.add(Math.min(nums[i],sum));
					l1.add(Math.max(nums[i],sum));
					if(!set.contains(l1)){
						set.add(l1);
					}
				}
			}

			if(diff>=0&&list.contains(diff)){
				if(i!=list.indexOf(sum)){
					List<Integer> l1=new ArrayList<Integer>();
					l1.add(Math.min(nums[i],diff));
					l1.add(Math.max(nums[i],diff));
					if(!set.contains(l1)){
						set.add(l1);
					}
				}
			}

		}
		System.out.println(set);
		System.out.println(set.size());
		return set.size();

	}
}


