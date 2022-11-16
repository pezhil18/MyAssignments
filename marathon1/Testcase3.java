package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {

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
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Global Actions']"));
		driver.executeScript("arguments[0].click();", element1);
		driver.findElement(By.xpath("//a[@title='New Task']")).click();
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Not Started']"));
		driver.executeScript("arguments[0].click();",element2);
		driver.findElement(By.xpath("//a[@title='Waiting on someone else'][text()='Waiting on someone else']")).click();
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Save']"));
		driver.executeScript("arguments[0].click();", element3);
		String Tsk = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText'][text()='Task']")).getText();
		System.out.println("Task Created Message: " +Tsk);
		if(Tsk.contains("Bootcamp")) {
			System.out.println("Task successfully created");
		}
		else
			System.out.println("Task not created");
		
		driver.close();
	}

}
