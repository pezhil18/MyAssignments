package leafgroundassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectComponents {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
    	driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement element1 = driver.findElement(By.xpath("//div[@class='col-12']/select[@class='ui-selectonemenu']"));
		Select autotool = new Select(element1);
		autotool.selectByIndex(1);
		element1.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//div[@id='j_idt87:country']//label[text()='Select Country']")).click();
		WebElement element2 = driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//li[@id='j_idt87:country_3'][text()='India']"));
		element2.click();
		element2.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label'][text()='Select City']/parent::div")).click();
		WebElement element3 = driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//li[text()='Chennai']"));
		element3.click();
		element3.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Choose Course']")).sendKeys("Selenium WebDriver");
		WebElement element4 = driver.findElement(By.xpath("//span[@role='listbox']//li[@data-item-value='Selenium WebDriver']"));
		element4.click();
		element4.sendKeys(Keys.TAB);
		element4.sendKeys(Keys.TAB);
		element4.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		WebElement element5 = driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//li[text()='English']"));
		element5.click();
		element5.sendKeys(Keys.TAB);
		

		
		//driver.close();
		
	}

}
