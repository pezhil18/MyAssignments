package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		 ChromeDriver driver=new ChromeDriver();
		 		 
		 //Load the Url
		  driver.get("http://leaftaps.com/opentaps/control/main");
		 		 
		 //Maximize the browser Window
		 driver.manage().window().maximize();
		 
		 //Find the elements
		 driver.findElement (By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Inc");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ezhil");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arul");
		 //find the dropdown (ctrl2 + L)
		 WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select ee = new Select(ele);
		 ee.selectByIndex(2);	
		 //WebElement element = driver.findElement(By.id("createLeadForm_currencyUomId"));
		 //Select ss = new Select(element);
		 //ss.selectByVisibleText("USD - American Dollar");
		 //ss.selectByValue("");
		 driver.findElement(By.name("submitButton")).click();
		 
		 //close the browser
		 Thread.sleep(2000);
		 driver.close();
	}

}
