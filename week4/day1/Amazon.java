package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element1 = driver.findElement(By.id("twotabsearchtextbox"));
		element1.sendKeys("oneplus 9 pro");
		element1.sendKeys(Keys.ENTER);
		String text1 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(text1);
		
		String text2 = driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style s-link-centralized-style']/span[@class='a-size-base puis-light-weight-text s-link-centralized-style']")).getText();
		System.out.println("number of customer ratings for the first displayed product: " +text2);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		//WindowHandling
		Set<String> WH = driver.getWindowHandles();
		List<String> LS = new ArrayList<String>(WH);
		driver.switchTo().window(LS.get(1));
		
		//screenshots
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/amazon.png");
		FileUtils.copyFile(source, dest);
		
		driver.findElement(By.xpath("//span[@id='submit.add-to-cart']")).click();
		Thread.sleep(3000);
		
		String text3 = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-price a-text-bold']/span[@id='attach-accessory-cart-subtotal']")).getText();		
		System.out.println(text3);
		if(text3.contains(text1)) {
			System.out.println("Price is verified and its correct");
			
		}
		else
			System.out.println("Price is incorrect");
				

	}

}
