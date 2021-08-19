package assessment4;

import java.util.ArrayList;
import java.util.List;

public class CutThemAll {

	public void test1(){
		List<Long> lenghts =new ArrayList<Long>();
		lenghts.add(5L);
		lenghts.add(10L);
		lenghts.add(11L);
		lenghts.add(9L);
		
		
	}
	
	public static String cutThemAll(List<Long> lengths, long minLength) {
		long max = 0;
		for (int i = 0; i < lengths.size()-1; i++)
			max = Math.max(max,  lengths.get(i) + lengths.get(i+1));
		
		if (max >= minLength) return "Possible";
		else return "Impossible";
	}

	
}
