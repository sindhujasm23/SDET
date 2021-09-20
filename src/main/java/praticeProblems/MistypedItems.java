package praticeProblems;

import java.util.HashMap;

import org.junit.Test;

public class MistypedItems {
	/*
	 * You have an old grocery shop that instead of scanning their sold proudcts once sold, they type in the prices, 
which leaves room for mistyping sold prices. Given 4 lists: soldItems = ["eggs", "milk", "apple"], soldPrices = [1.00, 2.50, 2.1], 
productsAvailable = ["eggs", "lemons", "milk", "apple"],
 productPrices = [1.01, 0.5, 2.50, 2.1], Find the number of items with mistyped prices
	 */

	@Test
	public void test1() {
		String soldItems[]={"eggs", "milk", "apple"};
		double soldPrices[]={1.00, 2.50, 2.1};
		String products[]={"eggs", "lemons", "milk", "apple"};
		double prices[]={1.01, 0.5, 2.50, 2.1};
		findMistype(soldItems,soldPrices,products,prices);
	}
	
	@Test
	public void test2() {
		String soldItems[]={"eggs", "milk", "apple"};
		double soldPrices[]={1.01, 2.50, 2.1};
		String products[]={"eggs", "lemons", "milk", "apple"};
		double prices[]={1.01, 0.5, 2.50, 2.1};
		findMistype(soldItems,soldPrices,products,prices);
	}

	@Test
	public void test3() {
		String soldItems[]={"eggs", "milk", "apple"};
		double soldPrices[]={1.00, 2.30, 2.1};
		String products[]={"eggs", "lemons", "milk", "apple"};
		double prices[]={1.01, 0.5, 2.50, 2.1};
		findMistype(soldItems,soldPrices,products,prices);
	}

	private void findMistype(String[] soldItems, double[] soldPrices, String[] products, double[] prices) {
		HashMap<String,Double> map=new HashMap<>();
		int mismatch=0;
		for (int i = 0; i < products.length; i++) {
			map.put(products[i], prices[i]);			
		}
		
		for (int i = 0; i < soldItems.length; i++) {			
			if(Double.compare(soldPrices[i], map.get(soldItems[i]))!=0){
				mismatch++;
			}			
		}
		System.out.println(mismatch);	
	}

	
}


