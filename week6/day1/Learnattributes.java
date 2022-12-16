package week6.day1;

import org.testng.annotations.Test;

public class Learnattributes {
	
	@Test(invocationCount=5)
	public void createLead() {
		System.out.println("Create Lead");
	}

	@Test(priority=1, alwaysRun = true)
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test(priority=-1, enabled = false)
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
	
	@Test(priority=2)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
}
