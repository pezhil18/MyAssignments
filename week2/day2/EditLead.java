package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//grandparent to grandchild xpath
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name='firstName']")).sendKeys("Jaya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement element1 = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[text()='10306']"));
		element1.click();
		
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Print the title: " +title);
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title is correct");
		}
		else
			System.out.println("Title is incorrect");
		
		driver.findElement(By.linkText("Edit")).click();
		WebElement element2 = driver.findElement(By.id("updateLeadForm_companyName"));
		element2.clear();
		element2.sendKeys("Google Inc");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String coyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (coyname.equals("Google Inc (10306)")) {
			System.out.println("Company name is updated");			
			
		}
		else
			System.out.println("Company name is not updated");
		
		driver.close();
		
		
	}

}
