package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingLeaf {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[@type='button']/span[text()='Open']")).click();
		
		Set<String> WH = driver.getWindowHandles();
		List<String> LS = new ArrayList<String>(WH);
		
		driver.switchTo().window(LS.get(1));
		System.out.println(driver.getTitle());
		//driver.close();
		driver.switchTo().window(LS.get(0));
		System.out.println(driver.getTitle());
		//driver.close();
		
		//Open Multiple
		driver.findElement(By.xpath("//button[@type='button']/span[text()='Open Multiple']")).click();
				
		WH = driver.getWindowHandles();
		LS = new ArrayList<String>(WH);
		
		driver.switchTo().window(LS.get(2));
		System.out.println(driver.getTitle());
		//driver.close();
		driver.switchTo().window(LS.get(1));
		System.out.println(driver.getTitle());
		//driver.close();
		driver.switchTo().window(LS.get(0));
		System.out.println(driver.getTitle());
		//driver.close();
		
		//Close all Windows
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		
		Set<String> WH1 = driver.getWindowHandles();
		List<String> LS1 = new ArrayList<String>(WH1);
		
		driver.switchTo().window(LS1.get(3));
		System.out.println(driver.getTitle());
		driver.switchTo().window(LS1.get(2));
		System.out.println(driver.getTitle());
		driver.switchTo().window(LS1.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(LS1.get(0));
		System.out.println(driver.getTitle());
		driver.quit();
		
		//Open with delay
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		WH1 = driver.getWindowHandles();
		LS1 = new ArrayList<String>(WH1);
		
		Thread.sleep(5000);
		driver.switchTo().window(LS1.get(2));
		System.out.println(driver.getTitle());
		driver.switchTo().window(LS1.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(LS1.get(0));
		System.out.println(driver.getTitle());		
		//driver.quit();
	}

}
