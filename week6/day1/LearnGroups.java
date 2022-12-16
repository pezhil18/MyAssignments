package week6.day1;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups="smoke")
	public void createLead() {
		System.out.println("Create Lead");
	}

	@Test(groups="sanity")
	public void editLead() {
		System.out.println("Edit Lead");
	}

}
