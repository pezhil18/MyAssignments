package TestcasesM4;

import org.testng.annotations.Test;

import BaseClassM4.BaseM4;
import pages.LoginPage;

public class TC002_UpdateExistingCaller extends BaseM4{
	
	@Test
	public void runUpdateExistingCaller() throws InterruptedException{
		
//		LoginPage LP = new LoginPage()
//		LP.enterUserName()
		new LoginPage(driver, shadow)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickAll()
		.entercallerinfilter1()
		.searchbyName()
		.openRecord()
		.updatePhonenumber();
		
		
		
		
		
	}

}
