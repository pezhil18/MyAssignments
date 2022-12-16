package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass {
	
	@BeforeClass
	public void setData1() {
		fileName = "CreateLead";
	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cName, String fName, String lName) throws InterruptedException {
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ezhilmathi");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium Automation in Test Leaf");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pezhil.18@gmail.com");
		 WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select fetch = new Select (element);
		 fetch.selectByVisibleText("New York");
		 driver.findElement(By.name("submitButton")).click();
		 
//		 //close the browser
//		 Thread.sleep(2000);
//		 driver.close();
	}
	
	//@DataProvider(name ="fetchData")
	//public String[][] setData() throws IOException {
//		String[] [] data = new String[2] [3];
//		
//		data[0] [0] = "TestLeaf";
//		data[0] [1] = "Ezhil";
//		data[0] [2] = "P";
//		
//		data[1] [0] = "Google";
//		data[1] [1] = "Arul";
//		data[1] [2] = "S";
		
//		String[][] data = ReadExcel.readData();
//		
//		return data;
//				
//	}

}
