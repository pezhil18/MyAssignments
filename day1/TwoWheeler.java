package week1.day1;

public class TwoWheeler {
	
	//Global Variables
	public int noOfWheels = 4;
	public short noOfMirrors = 2;
	public long chassisNumber = 1234567890L;
	public boolean isPunctured = true;
	public String bikeName = "scooty pep";
	public double runningKM = 300.12;

	public static void main(String[] args) {
		// create object for TwoWheeler and call all the variables inside main method and print the values
	    //classname objectname = new classname()
		
		TwoWheeler myBike = new TwoWheeler();
		System.out.println(myBike.noOfWheels);
		System.out.println(myBike.noOfMirrors);
		System.out.println(myBike.chassisNumber);
		System.out.println(myBike.isPunctured);
		System.out.println(myBike.bikeName);
		System.out.println(myBike.runningKM);

	}

}
