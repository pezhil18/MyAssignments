package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
	
		String input = "EZHILMATHI";
		
	  char[] charArray = input.toCharArray();
	  
	  Set<Character> uniqueset = new HashSet<Character>();
	
	  for(int i=0; i<input.length(); i++) {
		  
		if(!uniqueset.contains(charArray[i])) {
			
			uniqueset.add(charArray[i]);
							
		}
	  }
	  
		System.out.println("Print the set : " +uniqueset);
	  
	}

}
