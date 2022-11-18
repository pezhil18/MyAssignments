package week2.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//
		String text1 = "stops";
		String text2 = "potss"; 
		boolean status = true;
		
		int length1 = text1.length();
		System.out.println(length1);
		int length2 = text2.length();
		System.out.println(length2);
		if(length1 == length2) {
			System.out.println("Both the lengths are same");
		}
		else
			System.out.println("Both the lengths are not same");
		
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		status = Arrays.equals(charArray1, charArray2);
		
		if(status) {
			System.out.println("Both the array has same value");
		}
		else
			System.out.println("BOth the array has different value");
	}

}
