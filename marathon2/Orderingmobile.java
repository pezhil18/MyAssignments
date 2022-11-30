package marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Orderingmobile {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://dev138589.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("mc/-vASs9V1E");
		driver.findElement(By.id("sysverb_login")).click();
		
		Thread.sleep(12000);
		//shadow
		Shadow dom =new Shadow(driver);
		dom.findElementByXPath("//div[@id='all']").click();
		
		Actions builder = new Actions(driver);
		
		Thread.sleep(9000);
		WebElement findElementByXPath2 = dom.findElementByXPath("//span[text()='Service Catalog']");
		builder.scrollToElement(findElementByXPath2).perform();
		findElementByXPath2.click();
		
		Shadow dom1 = new Shadow(driver);
		WebElement findElementByXPath3 = dom1.findElementByXPath("//iframe[@id='gsft_main']");
		
		driver.switchTo().frame(findElementByXPath3);
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[text()='iPhone 6s']/parent::a")).click();
		
		WebElement element1 = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select SS = new Select(element1);
		SS.selectByIndex(3);
		
		WebElement element2 = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
		Select ST = new Select(element2);
		ST.selectByValue("onehudred_twentyeight");
		
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		
		String text = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		
		if(text.contains("REQ")) {
			
			System.out.println("Order is placed and the request number : " +text);
		}
		else
			System.out.println("Order is not placed");
		
	}

}
