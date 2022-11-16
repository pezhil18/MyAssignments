package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Chrome notifications:
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-r6")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications'][text()='View All']")).click();
		driver.findElement(By.xpath("//p[@class='slds-truncate'][text()='Sales']")).click();	
		WebElement element1 = driver.findElement(By.xpath("//span[@class='slds-truncate'][text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",element1);
		driver.findElement(By.xpath("//div[@title='New'][text()='New']")).click();
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']/input[@name='Name']")).sendKeys("Salesforce Automation by Ezhil");
		String Oppname = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']/input[@name='Name']")).getAttribute("value");
		System.out.println("Opportunity Name is: " +Oppname);
		driver.findElement(By.xpath("//input[@class='slds-input'][@name='CloseDate']")).sendKeys("11/16/2022");
		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand'][text()='Save']")).click();
		String succmsg= driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText'][text()='Opportunity']")).getText();
		System.out.println("Successuful message: " +succmsg);
		if(succmsg.contains("Ezhil")) {
			System.out.println("Opportunity name is matching");
		}
		else
			System.out.println("Opportunity not matching");
		
		driver.close();
		
		
	}

}
