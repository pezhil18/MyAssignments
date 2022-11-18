package week2.string;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
		
		String A = "madam";
		String rev = "";
		
		char[] charArray = A.toCharArray();
		for(int i = charArray.length-1; i>=0; i--) {
			System.out.println("Reverse order: "+charArray[i]);
			rev =rev +charArray[i];
		}
		if (A.equals(rev))
		{
			System.out.println("Entered String is a Palindrome");	
		}
		else
			System.out.println("Entered String is not a Palindrome");
		}

	}


