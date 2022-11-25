package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Original string is: " + text);
		//to split string based on single or double space
		String[] split = text.split("\\s+");
		//to print string array
		System.out.println(Arrays.toString(split));
		//convert String array to LinkedHashSet to remove duplicates
		LinkedHashSet<String> Uniquewords = new LinkedHashSet<String>(Arrays.asList(split));
		StringBuilder build = new StringBuilder();
		int index = 0;
		//to join words again by space
		for (String s : Uniquewords) {
			if (index>0) {
				build.append(" ");
			}
			build.append(s);
			index++;
		}
		
		String str = build.toString();
		System.out.println("After removing duplicate words: " +str);
        
	}

}