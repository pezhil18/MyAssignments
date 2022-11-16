package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {

	public static void main(String[] args) {
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
		WebElement element1 = driver.findElement(By.xpath("//span[@class='slds-truncate'][text()='Accounts']"));
		driver.executeScript("arguments[0].click();",element1);
		driver.findElement(By.xpath("//div[@title='New'][text()='New']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input'][@name='Name']")).sendKeys("Ezhil");
		WebElement element2 = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'][@aria-label='Ownership, --None--']"));
		driver.executeScript("arguments[0].click();", element2);
		driver.findElement(By.xpath("//span[@class='slds-media__body']/span[@title='Public']")).click();
		driver.findElement(By.xpath("//button[@type='button'][text()='Save']")).click();
		String Acc = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText'][text()='Account']")).getText();
		System.out.println("Account Creation Message: " +Acc);
		if (Acc.contains("Ezhil")) {
			System.out.println("Account successfully created");
		}
		else
			System.out.println("Account not created");
		
		driver.close();
		
	}

}
