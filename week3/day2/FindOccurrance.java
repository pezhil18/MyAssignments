package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrance {

	public static void main(String[] args) {

		int [] num = {1, 2, 1, 3, 2, 5};
		
		Map<Integer, Integer> occ = new HashMap<Integer, Integer>();
		
		for(int i =0; i < num.length; i++) {
			
			if(occ.containsKey(num[i])) {
				int value = occ.get(num[i]);
				occ.put(num[i], value+1);
			}
			else {
				
				occ.put(num[i], 1);
				
			}
				
		}
		System.out.println(occ);
	}

}
