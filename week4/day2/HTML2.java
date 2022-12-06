package week4.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 2. You have to print the respective values based on given Library
		List<WebElement> row = driver.findElements(By.xpath("//tbody//tr"));
		Thread.sleep(3000);
		
	
		
		for(int i=1; i<row.size(); i++ ) {

			String value = row.get(i).getText();
			
			if (value.contains("Absolute")) {
			System.out.println(value);
		}
		else
			System.out.println("No data found");
		}
		
		

	}

}
