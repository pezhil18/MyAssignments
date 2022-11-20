package javachallenge;

public class LastwordinString {

	public static void main(String[] args) {
		// Given a string s consisting of words and spaces, return the length of the last word in the string. 
		//A word is a maximal substring consisting of non-space characters only.

		String S1 = "Hello World";
		String S2 = "   fly me   to   the moon  ";
		String S3 = "luffy is still joyboy";
	
		String[] split1 = S1.split(" ");
		System.out.println(split1[split1.length-1]);
		System.out.println(split1[split1.length-1].length());
		
		String[] split2 = S2.split(" ");
		System.out.println(split2[split2.length-1]);
		System.out.println(split2[split2.length-1].length());
		
		String[] split3 = S3.split(" ");
		System.out.println(split3[split3.length-1]);
		System.out.println(split3[split3.length-1].length());
		
		
	}

}
