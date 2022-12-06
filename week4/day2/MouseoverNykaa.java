package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseoverNykaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element = driver.findElement(By.xpath("//a[text()='brands']"));

		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
		
		WebElement element2 = driver.findElement(By.xpath("//input[@id='brandSearchBox']"));
		element2.sendKeys("L'Oreal Paris");
		element2.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class='css-ov2o3v']/a")).click();
		System.out.println(driver.getTitle());
		
//		if(driver.getTitle().contains("L'Oreal Paris")) {
//			System.out.println("Title is correctly displayed");
//		}
//		else
//			System.out.println("Title incorrectly displayed");
//		
		
	}

}
