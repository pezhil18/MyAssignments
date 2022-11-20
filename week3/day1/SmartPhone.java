package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsApp() {

		System.out.println("Connect to WhatsApp");

	}
	
	public void takeVideo() {
		
		System.out.println("Take video");

	}

	
	public static void main(String[] args) {
		SmartPhone Phone = new SmartPhone();
		Phone.makecall();
		Phone.savecontact();
		Phone.sendMsg();
		Phone.connectWhatsApp();
		Phone.takeVideo();
		
	}
}
