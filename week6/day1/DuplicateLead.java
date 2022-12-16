package week6.day1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class DuplicateLead extends BaseClass{
	

	@Test
	public void runDuplicateLead() throws InterruptedException {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("pezhil.18@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		//capture
		String FirstLeadName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).getText();
		System.out.println("Name of the First Lead: " + FirstLeadName);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[text()='Ezhil']")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Print the title: " +title);
		if (title.equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("Title is correct");
		}
		else
			System.out.println("Title is incorrect");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		Thread.sleep(5000);
		String dupname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Print dupname: " +dupname);
		if(dupname.equals (FirstLeadName)) {
			System.out.println("Duplicate Name is same as the FirstLeadName");	
			}
		else
			System.out.println("Duplicate Name is Not same as the FirstLeadName");

	//	driver.close();
		
	}
	

}
