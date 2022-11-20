package bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {

		System.out.println("Axis Deposit Account is: 50000");

	}
	
	public static void main(String[] args) {
		
		AxisBank ABank = new AxisBank();
		ABank.saving();
		ABank.fixed();
		ABank.deposit();
		
		
	}

}
