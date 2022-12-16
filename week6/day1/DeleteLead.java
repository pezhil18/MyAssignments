package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class DeleteLead extends BaseClass{

	@Test(priority=5)
	
	public void runDeleteLead() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Phone']")).click();
		WebElement element1 = driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneCountryCode']"));
		element1.clear();
		element1.sendKeys("91");
		element1.sendKeys(Keys.TAB);
		WebElement element2 = driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneAreaCode']"));
		element2.clear();
		element2.sendKeys("00");
		element2.sendKeys(Keys.TAB);
		WebElement element3 = driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneNumber']"));
		element3.clear();
		element3.sendKeys("8939198732");
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		//Capture lead ID of First Resulting lead
		String Leadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[text()='10399']")).getText();
		System.out.println("First Lead id: " +Leadid);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[text()='10657']")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(Leadid);
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		String Norecords = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div[text()='No records to display']")).getText();
		if (Norecords.equals("No records to display")) {
			System.out.println("Lead is successfully deleted");
		}
		else
			System.out.println("Lead not successfully deleted");
		
		//driver.close();
		
	}

}
