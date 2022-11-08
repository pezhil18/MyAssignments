package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum, i;
		
		System.out.println("FibonacciSeries: ");
		
		System.out.println( +firstNum);
		
		System.out.println( + secNum);	
		
		for(i=0;i<range;i++) {
			
			sum = firstNum + secNum;
			
			System.out.println(+ sum);
			
			firstNum=secNum;
			secNum=sum;
					
					
		}
		


	}

}
