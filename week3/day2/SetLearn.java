package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetLearn {

	public static void main(String[] args) {
		// String companyName = "google";output: gole ;	Print only unique characters...Remove Duplicates
		
		String Coy = "google";
		char[] charArray = Coy.toCharArray();
		System.out.println(charArray);
		Set <Character> uniqueSet = new HashSet<Character>();
		
		for(int i=0; i<charArray.length; i++) {
			
			uniqueSet.add(charArray[i]);
		}
		
		System.out.println(uniqueSet);
		
		
	}

}
