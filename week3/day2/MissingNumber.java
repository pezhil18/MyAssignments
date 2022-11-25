package week3.day2;


import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] nums = {5,3,1,9,7,9,10,3,7,1};
		
		Set<Integer> uniqueset = new HashSet<Integer>();
		
		for(int i=0; i<nums.length; i++) {
			
			uniqueset.add(nums[i]);
		}
		
		System.out.println(uniqueset);
		
		for(int j=0; j<nums.length; j++) {
			
			if(!uniqueset.contains(j+1)) {
				
				System.out.println(j+1);
				
			}
			
		
		}
	}
	}


