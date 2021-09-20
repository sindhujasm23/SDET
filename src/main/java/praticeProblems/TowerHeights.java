package praticeProblems;

import java.util.Arrays;

import org.junit.Test;

public class TowerHeights {

	/*Given heights of n towers and a value k. We have to either increase
	 *  or decrease height of every tower by k (only once) where k > 0. 
	 * The task is to minimise the difference between the heights of the longest and
	 *  the shortest tower after modifications, and output this difference.
Examples:
Input : arr[] = {1, 15, 10}, k = 6
Output : Maximum difference is 5.
Explanation : We change 1 to 7, 15 to
9 and 10 to 4. Maximum difference is 5
(between 4 and 9). We can't get a lower
difference.
Input : arr[] = {1, 5, 15, 10}
k = 3
Output : Maximum difference is 8
arr[] = {4, 8, 12, 7}

Input : arr[] = {4, 6}
k = 10
Output : Maximum difference is 2
arr[] = {14, 16} OR {-6, -4}

Input : arr[] = {6, 10}
k = 3
Output : Maximum difference is 2
arr[] = {9, 7}

Input : arr[] = {1, 10, 14, 14, 14, 15}
k = 6
Output: Maximum difference is 5
arr[] = {7, 4, 8, 8, 8, 9}

Input : arr[] = {1, 2, 3}
k = 2
Output: Maximum difference is 2
arr[] = {3, 4, 5}
	 */
	
	
	
	@Test
	public void test1() {
		int arr[]={1, 15, 10};
		int k = 6;
		findMinDifference(arr,k);
	}

	@Test
	public void test2() {
		int arr[]={1, 5, 15, 10};
		int k = 3;
		findMinDifference(arr,k);
	}

	@Test
	public void test3() {
		int arr[]={4, 6};
		int k = 10;
		findMinDifference(arr,k);
	}

	@Test
	public void test4() {
		int arr[]={1,4,12};
		int k = 6;
		findMinDifference(arr,k);
	}

	@Test
	public void test5() {
		int arr[]={1, 10, 14, 14, 14, 15};
		int k = 6;
		findMinDifference(arr,k);
	}
	@Test
	public void test6() {
		int arr[]={1,2,3};
		int k = 2;
		findMinDifference(arr,k);
	}

	/*Sort the input array
	 * Initialize an array of input arr length
	 * sum first element with k and add it to new array
	 *Traverse through the input array from first element
	 *sum k with each element and find the difference between first new arr element and current sum
	 *subtract k from the element and find the difference between first new arr element and current sum
	 *add the min difference to new array
	 *continue till end of the loop
	 *find the difference between min and max in new arr
	 *
	 */
	// 1 5 10 15	3
	private void findMinDifference(int[] arr, int k) {

		Arrays.sort(arr);
		//int min=arr[0]+k, max=mi;
		int []output=new int[arr.length];
		output[arr.length-1]=arr[arr.length-1]-k;//4
		//output[0]=arr[0]+k;
		for (int i = 0; i < arr.length-1; i++) {
			int min1=output[arr.length-1]-(arr[i]+k);
			int min2=output[arr.length-1]-(arr[i]-k);
			
			if(min1>0&&min2>0){
				if(min1>min2 ){
					output[i]=arr[i]-k;
				}else if(min2>min1){
					output[i]=arr[i]+k;
				}
			}else{
				if(min1>0){
					output[i]=arr[i]+k;
				}
				if(min2>0){
					output[i]=arr[i]-k;
				}

			}
		//	min=Math.min(min, output[i]);
			//max=Math.max(max, output[i]);
		}
		output[arr.length-1]=arr[arr.length-1]-k;		
		System.out.println(Arrays.toString(output));
		Arrays.sort(output);
	//	System.out.println(Arrays.toString(output));
		System.out.println(output[output.length-1]-output[0]);
	}
}


