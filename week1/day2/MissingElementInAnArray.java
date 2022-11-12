package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
								
		int[] arr = {1,2,3,4,7,6,8};
		
		int i, j;
		
		int noofdata = arr.length;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(i=0; i<noofdata-1; i++) {
			
			if(arr[i]==arr[i]+1) {
				
				continue;
				
			}
			else
				
				for(j=arr[i]+1;j<arr[i+1];j++) {
				System.out.println(j);
			
			}
		}
		

	}

}
