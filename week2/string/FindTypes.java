package week2.string;

public class FindTypes {

	public static void main(String[] args) {
		// FindTypes
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] charArray = test.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			
			if(Character.isLetter(charArray[i])) {
				System.out.println("letter: " + charArray[i]);
				letter = letter +1;
			
			}
		
			else if(Character.isDigit(charArray[i])) {
				System.out.println("Digit: " + charArray[i]);
				num = num +1;
				
			}
			else if(Character.isSpaceChar(charArray[i])) {
				System.out.println("SpaceChar: " + charArray[i]);
				space = space+1;
							
			}
			else
			{
			System.out.println("Cosider as special character "+ charArray[i]);
			specialChar = specialChar +1;
			}
		
		}
		
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
