package leafgroundassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonComponents {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
    	driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span[text()='Click']")).click();
		WebElement element1 = driver.findElement(By.xpath("//div[@class='card']/h5[text()='Confirm if the button is disabled.']"));
		if(element1.isEnabled()) {
			System.out.println("Enabled");
		}
		else
			System.out.println("Disabled");
	}

}
