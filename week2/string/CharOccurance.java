package week2.string;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
		String str = "welcome to chennai";
		char occ ='e';
		int count = 0;
		int length1 = str.length();
		System.out.println("count of the str" +length1);
		
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			System.out.println("Array is: " +charArray[i]);
			
			if(charArray[i]==occ) {
				
				count = count+1;
				
			}
		}
		
		System.out.println(count);

		
		
	}

}
