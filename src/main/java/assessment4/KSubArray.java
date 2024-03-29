package assessment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class KSubArray {
	@Test
	public void test1(){
		List<Integer> nums =new ArrayList<Integer>();
		nums.add(5);
		nums.add(10);
		nums.add(11);
		nums.add(9);
		nums.add(5);
		//kSub(5,nums);
		System.out.println(subarraysDivByK(new int[]{5,10,1,9,5},13));
	}

	public long kSub(int k, List<Integer> nums) {

		// Cumulative Sum of each number in the list
		int sum = 0;

		// Return output 
		long output = 0;

		// Find the frequency of remainder occurrence
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

		// Traverse 
		for(int i=1;i<=nums.size();i++) {

			// Calculate remainder and add K to it if it is negative
			int rem = sum%k < 0? sum%k + k : sum%k;

			//  If the remainder exist, update else add
			freqMap.put(rem, freqMap.getOrDefault(rem, 0)+1);

			// add the previous number to cumulative sum
			sum +=nums.get(i-1);

			// Calculate remainder and add K to it if it is negative
			rem = sum%k < 0? sum%k + k : sum%k;

			// If found, add to the output
			if(freqMap.containsKey(rem)) {
				output+=freqMap.get(rem);
			}
		}
		return output;

	}
	
	public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for(int a : A) {
            sum = (sum + a) % K;
            if(sum < 0) sum += K;  // Because -1 % 5 = -1, but we need the positive mod 4
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

}
