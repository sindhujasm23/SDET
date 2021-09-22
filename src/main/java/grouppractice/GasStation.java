package grouppractice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GasStation {
	//https://leetcode.com/problems/gas-station/
	@Test
	public void test1() {
		int gas[]={1,2,3,4,5};
		int cost[]={3,4,5,1,2};
		System.out.println(completeCircuit(gas,cost));
	}

	@Test
	public void test2() {
		int gas[]={2,3,4};
		int cost[]={3,4,3};
		System.out.println(completeCircuit(gas,cost));
	}

	//@Test
	public void test3() {
		int gas[]={3,3,4};
		int cost[]={3,4,4};
		completeCircuit(gas,cost);
	}
	@Test
	public void test4() {
		int gas[]={5,1,2,3,4};
		int cost[]={4,4,1,5,1};
		System.out.println(completeCircuit(gas,cost));
	}

	private int completeCircuit(int[] gas, int[] cost) {
		int start=-1,index=-1;
		List<Integer> list=new ArrayList<Integer>();
		if(gas.length==1){
			if(gas[0]>=cost[0]){
				return 0;
			}else{
				return -1;
			}
		}
		for (int i = 0; i < cost.length; i++) {
			int k=i+1;
			if(i==cost.length-1){
				k=0;
			}
			start=gas[i];
			start= start-cost[i]+gas[k];
			if(start>gas[k]){
				start=i;
				index=i;
				list.add(i);
				//break;
			}

		}
		if(index==-1) return -1;
		//System.out.println(gas[start]);
		for(Integer each:list){
			int val=gas[each];
			boolean exist=true;
			for (int i = each; i < cost.length; i++) {
				int k=i+1;
				if(i==cost.length-1){
					k=0;
				}
				val= val-cost[i]+gas[k];
				if(val<gas[k]){
					exist=false;
					break;			
				}
			}
			if(each!=0){
				for (int i = 0; i <each; i++) {
					val= val-cost[i]+gas[i+1];
					if(val<gas[i+1]){
						exist=false;
						break;				
					}

				}
			}
			if(exist){
				return each;
			}
		}
		//System.out.println(start);
		return -1;

	}

}


