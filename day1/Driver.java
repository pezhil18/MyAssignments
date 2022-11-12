package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		//setup the browser driver
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		//Launch the browser
		 ChromeDriver driver=new ChromeDriver();
		 //EdgeDriver driver1 =new EdgeDriver();
		 //FirefoxDriver driver2 =new FirefoxDriver();
		 
		 
		 //Load the Url
		  driver.get("http://leaftaps.com/opentaps/control/main");
		 //driver1.get("http://leaftaps.com/opentaps/control/main");
		 //driver2.get("http://leaftaps.com/opentaps/control/main");
		 
		 
		 //Maximize the browser Window
		 driver.manage().window().maximize();
		 //driver1.manage().window().maximize();
		 //driver2.manage().window().maximize();
		 
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
		 driver.findElement(By.name("submitButton")).click();
		 
		 //close the browser
		 Thread.sleep(2000);
		 driver.close();
	}

}
