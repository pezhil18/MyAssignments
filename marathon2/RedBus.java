package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='sub-city']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='selected']/following-sibling::li[@class='sub-city']")).click();
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[3]/button")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[3]/td[4]")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		WebElement sleep = driver.findElement(By.xpath("//label[@class='custom-checkbox']/following-sibling::label[@title=\"SLEEPER\"]"));
		builder.scrollToElement(sleep).perform();
		sleep.click();
		Thread.sleep(2000);
		
		String text2 = driver.findElement(By.xpath("(//div[@class='column-two p-right-10 w-30 fl']/div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println(text2);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Ok, got it']")).click();
		
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
		
		Thread.sleep(5000);
		//screenshots
				File source = driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshot/redbus.png");
				FileUtils.copyFile(source, dest);
				
		driver.close();
	
	}

}
