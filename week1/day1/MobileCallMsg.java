package week1.day1;

public class MobileCallMsg {

	public void makeCall() {
		// print make a call
	System.out.println("Make a call to my friend");

	}
	
	public void sendMsg() {
		// print send a message
		System.out.println("Send Message to my Friend");
	}
	
	public static void main(String[] args) {
		// classname.objectname = new Classname()
		MobileCallMsg mcall = new MobileCallMsg();
		mcall.makeCall();
		mcall.sendMsg();
		

	}

}
