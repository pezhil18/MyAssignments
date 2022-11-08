package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
								
		int[] arr = {1,2,3,4,7,6,8};
		
		int i;
		
		int noofdata = arr.length;
		
		Arrays.sort(arr);
		
		for(i=0; i<noofdata; i++) {
			
			if(i!=arr[i]) {
				System.out.println("Not equal to the array value is :" +arr[i]);
			break;
				
			}
		}
		

	}

}
