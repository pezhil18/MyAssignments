package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrameW3school {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Ezhil");
		alert.accept();
		String text = driver.findElement(By.id("demo")).getText();
		//System.out.println(text);
		
		if(text.contains("Ezhil")) {
			System.out.println("Name is verified");
			
			}
		else {
			System.out.println("Name is not verified");
		}
		
		driver.switchTo().defaultContent();
	}

}
