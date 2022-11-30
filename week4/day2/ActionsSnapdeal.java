package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSnapdeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement MensFashion = driver.findElement(By.xpath("//span[containstext()='Fashion']"));
		driver.findElement(By.xpath("//span[@class='linkTest'][text()=Shirts]")).click();		
		WebElement Overview = driver.findElement(By.xpath("//*[@class='product-image']" ));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(MensFashion)
		.click()
		.perform();
		builder.moveToElement(Overview).perform();
		
		

	}

}