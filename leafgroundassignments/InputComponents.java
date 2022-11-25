package leafgroundassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputComponents {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
    	driver.get("https://leafground.com/input.xhtml;");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement element1 = driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']"));
		//element1.clear();
		element1.sendKeys("Ezhil");
		element1.sendKeys(Keys.TAB);
		
		WebElement element2 = driver.findElement(By.xpath("//input[@value='Chennai']"));
		element2.clear();
		element2.sendKeys("Chennai, India");
		
		//verify if text is disabled
		Thread.sleep(5000);
		WebElement element3 = driver.findElement(By.xpath("//div[@class='grid formgrid']//input[@placeholder='Disabled']"));
		if (element3.isEnabled()) {
			
			System.out.println("Enabled");
		}
		else
			System.out.println("Disabled");
				
		element2.sendKeys(Keys.TAB);
		//clear the text
		WebElement element4 = driver.findElement(By.xpath("//input[@type='text'][@value='Can you clear me, please?']"));
		element4.clear();
		element4.sendKeys(Keys.TAB);
		
		//Retrieve the typed text
		String ret = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']/ancestor::div[@class='grid formgrid']")).getText();
		System.out.println("Retrieve the typed text" + ret);
		//element5.sendKeys(Keys.TAB);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
