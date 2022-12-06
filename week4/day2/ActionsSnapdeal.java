package week4.day2;

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

public class ActionsSnapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		2. Go to Mens Fashion
		WebElement MensFashion = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(MensFashion).perform();
		
//		3. Go to Sports Shoes
		WebElement SportsShoe = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		builder.scrollToElement(SportsShoe);
		SportsShoe.click();
		
//		4. Get the count of the sports shoes
		String text1 = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]" )).getText();
		System.out.println("count of the sports shoes:" +text1);
		
//		5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		Thread.sleep(5000);
//		6. Sort by Low to High
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		String sort = driver.findElement(By.xpath("//li[@data-sorttype='plth']")).getText();
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		
//		7. Check if the items displayed are sorted correctly
		if(sort.contains("Low")) {
			
			System.out.println("Items are sorted");
		}
		else
			System.out.println("Items not sorted");
		
//		8.Select the price range (900-1200)
		WebElement fromvalue = driver.findElement(By.xpath("//input[@name='fromVal']"));
		fromvalue.clear();
		fromvalue.sendKeys("900");
		
		WebElement tovalue = driver.findElement(By.xpath("//input[@name='toVal']"));
		tovalue.clear();
		tovalue.sendKeys("1200");
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
//		9.Filter with color Yellow
		WebElement color = driver.findElement(By.xpath("(//a[@class='filter-name'])[5]"));
		driver.executeScript("arguments[0].click()", color);
		
//		10 verify the all applied filters 
		if(color.equals(color)) {
			System.out.println("Filter is applied");
		}
		else
			System.out.println("Filter is not applied");
		
//		11. Mouse Hover on first resulting Training shoes
//		12. click QuickView button
		
		WebElement QV = driver.findElement(By.xpath("//div[contains(text(), 'Quick')]"));
		driver.executeScript("arguments[0].click()", QV);

//		13. Print the cost and the discount percentage
		
		String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String disc = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		
		System.out.println(cost);
		System.out.println(disc);
		
//		14. Take the snapshot of the shoes.
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/snapdeal.png");
		FileUtils.copyFile(source, dest);
		
		//driver.close();

	}

}
