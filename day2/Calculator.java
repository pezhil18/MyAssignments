package week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		int addresult = num1 + num2 + num3;
		System.out.println(addresult);
		
		return addresult;
	}
	
	public int sub(int num1, int num2) {
		int subresult = num1 - num2;
		System.out.println(subresult);
		
		return subresult;
	}
	
	public double mul(double num1, double num2) {
		double mulresult = num1 * num2;
		System.out.println(mulresult);
		
		return mulresult;
	}
	
	public float div(float num1, float num2) {
		float divresult = num1 / num2;
		System.out.println(divresult);
		
		return divresult;
	}
	
}
