package week1.day1;

public class Mobile {

	//Global variables
	public String mobileBrandName = "Honor9lite";
	public char mobileLogo = 'H';
	public short noOfMobilePiece = 9;
	public int modelNumber = 123;
	public long mobileImeiNumber = 8939198732L;
	public float mobilePrice = 9500.53F;
	public boolean isDamaged = false;
	
	public static void main(String[] args) {
		// create object for Mobile and call all the variables inside main method and print the values.
		
		Mobile Phone = new Mobile();
		
		System.out.println(Phone.mobileBrandName);
		System.out.println(Phone.mobileLogo);
		System.out.println(Phone.noOfMobilePiece);
		System.out.println(Phone.modelNumber);
		System.out.println(Phone.mobileImeiNumber);
		System.out.println(Phone.mobilePrice);
		System.out.println(Phone.isDamaged);
		

	}

}
