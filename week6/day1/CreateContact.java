package week6.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact extends BaseClass{

	@Test(priority=3)
	
	public void runCreateContact() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sriram");
		driver.findElement(By.id("lastNameField")).sendKeys("Arul");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sri");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Selvan");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Contact Me");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sri.arul28@gmail.com");
		WebElement element1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select cc = new Select(element1);
		cc.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement element2 = driver.findElement(By.id("updateContactForm_description"));
		element2.clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Reach the Helpdesk");
		driver.findElement(By.xpath("//input[@value='Update']"));
		
		//getTitle
		 System.out.println("Title of Resulting Page: " +driver.getTitle());
		 
//		driver.close();

		

	}

}
