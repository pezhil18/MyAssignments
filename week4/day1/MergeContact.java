package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement (By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		// Click on Widget of From Contact
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		
	//  Click on First Resulting Contact
		Set<String> WH = driver.getWindowHandles();
		List<String> LS = new ArrayList<String>(WH);
		driver.switchTo().window(LS.get(1));
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		driver.switchTo().window(LS.get(0));
		
		//  Click on Widget of To Contact
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		
	//	Click on Second Resulting Contact
		WH = driver.getWindowHandles();
		LS = new ArrayList<String>(WH);
		driver.switchTo().window(LS.get(1));

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		
		driver.switchTo().window(LS.get(0));
		
		//Merge Button
		driver.findElement(By.xpath("//a[@class='buttonDangerous'][text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
