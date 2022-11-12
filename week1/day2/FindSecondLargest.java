package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};  //2,3,4,6,7,11
 
		int noofData = data.length;//6
		
		Arrays.sort(data); //2,3,4,6,7,11
		
		System.out.println("Total Number of Data : "+noofData);
		
		for(int i=noofData - 1; i >= 0;i--) {
			
			if (i==4) {
			
			System.out.println("Second Largest Number : " +data[i]);
		}

	}

} }
