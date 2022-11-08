package week1.day2;

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

		
	int input = 153;
	int calc =0, remain, orginal;
	
	orginal = input;
	
	while(input > 0) {
		
		remain = input % 10;	
		
	   	input = input/10;
		
			calc = calc + remain;
			
			System.out.println("Remainder is " +remain);
			System.out.println( "Quotient is " +input);	
				
		if(calc==orginal) {
			System.out.println("Its an Armstrong Number" +calc);
		
			}
		else
			System.out.println("Not an Armstrong Number" +calc);
		
		
	  
	}
	
			
	}

}
