package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass{

	//invocationcount - execute for the number of times given
	@Test (invocationCount=5)
	public void runCreateLead() throws InterruptedException {
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Inc");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ezhil");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arul");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ezhilmathi");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium Automation in Test Leaf");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pezhil.18@gmail.com");
		 WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select fetch = new Select (element);
		 fetch.selectByVisibleText("New York");
		 driver.findElement(By.name("submitButton")).click();
		 
		 //close the browser
		 //Thread.sleep(2000);
		// driver.close();
	}

}
