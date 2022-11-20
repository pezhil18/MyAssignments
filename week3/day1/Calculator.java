package week3.day1;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2, 3);
		calc.add(4, 5, 6);
		calc.sub(20.15, 10.05);
		calc.sub(30, 15);
		calc.mul(5.5, 10.5);
		calc.mul(5, 20.5);
		

	}

	private void add(int number1, int number2) {
	
		System.out.println(number1 + number2);
		
	}
	
	private void add(int number3, int number4, int number5) {
		
		System.out.println(number3 + number4 + number5);
		
	}
	
	
	private void sub(double number6, double number7) {
		
		System.out.println(number6 - number7);
		
	}
	
	private void sub(int number8, int number9) {
		
		System.out.println(number8 - number9);
		
	}
	
	private void mul(int number10, double number11) {
		
		System.out.println(number10 * number11);
		
	}
	
	private void mul(double number12, double number13) {
		
		System.out.println(number12 * number13);
		
	}
	
}
