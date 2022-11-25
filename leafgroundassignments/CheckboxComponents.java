package leafgroundassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxComponents {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
    	driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Basic']/parent::div")).click();

	}

}
