package TestcasesM4;

import org.testng.annotations.Test;

import BaseClassM4.BaseM4;
import pages.LoginPage;

public class TC003_DeleteExistingCaller extends BaseM4{
	
	@Test
	public void runCallerCreation() throws InterruptedException{
		
//		LoginPage LP = new LoginPage()
//		LP.enterUserName()
		new LoginPage(driver, shadow)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickAll()
		.entercallerinfilter2()
		.search()
		.openrec()
		.deleterec();
		
		
		
	}

}
