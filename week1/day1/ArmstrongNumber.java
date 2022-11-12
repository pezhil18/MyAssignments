package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Declare your input
// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
	// Assign input into variable original 
// Use loop to calculate: use while loop to set condition until the number greater than 0
	// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
// Within loop: Add calculated with the cube of remainder & assign it to calculated
// Check whether calculated and original are same
//When it matches print it as Armstrong number

		
	int input = 153, calculated, remainder, original;
	calculated = input;
	
	original = 0;
	
	while(calculated > 0) {
		
		remainder = calculated % 10;
		
		original = original + (remainder*remainder*remainder);
		System.out.println(original);
		
		calculated = calculated/10;//qoutient
	   	
	}
		
		if(calculated==input) {
			System.out.println(input+ "Its an Armstrong Number");
		
			}
		else
			System.out.println(input+ "Not an Armstrong Number");
		
					
	}

}
