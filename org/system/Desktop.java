package org.system;

public class Desktop extends Computer {
	
	//Description:create above 2 class and call all your class methods into the Desktop using single inheritance.
	
	public void desktopSize() {

		System.out.println("Print the DesktopSize : 32inches ");
	}
	
	public static void main(String[] args) {
		
		Desktop Desk = new Desktop();
		Desk.desktopSize();
		Desk.computerModel();
		
	}

}


