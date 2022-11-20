package javachallenge;

public class Pallindrome {

	public static void main(String[] args) {
		// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and 
		//removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

		//Given a string s, return true if it is a palindrome, or false otherwise.

		String S1 = "A man, a plan, a canal: Panama";
		String rev = "";
		
		char[] charArray = S1.toCharArray();
		for(int i = charArray.length-1; i>=0; i--) {
			System.out.println("Reverse order: "+charArray[i]);
			if (Character.isUpperCase(charArray[i]))
		{
				Character.toLowerCase(charArray[i]);
		}
			rev =rev +charArray[i];
		}
		if (S1.equals(rev))
		{
			System.out.println("Entered String is a Palindrome");	
		}
		else
			System.out.println("Entered String is not a Palindrome");
		}

	
}
