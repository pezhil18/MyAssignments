package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> WH = driver.getWindowHandles();
		List<String> LS = new ArrayList<String>(WH);
		driver.switchTo().window(LS.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		//shadow
		Shadow dom =new Shadow(driver);
		Thread.sleep(5000);
		dom.findElementByXPath("//span[text()='Learning']").click();
		
		Thread.sleep(5000);
		WebElement findElementByXPath1 = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(findElementByXPath1).perform();
		
		WebElement findElementByXPath2 = dom.findElementByXPath("//a[text()='Salesforce Certification']");
		driver.executeScript("arguments[0].click()", findElementByXPath2);
		
		driver.findElement(By.xpath("//div[text()='Architect' and text()='Salesforce']")).click();
		System.out.println(driver.getCurrentUrl());
		
		String text = driver.findElement(By.xpath("//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']")).getText();
		System.out.println(text);
		
		List<WebElement> ListofArchitect = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println(" ");
		System.out.println("List of Salesforce Architects");
		
		for (int i=0; i<ListofArchitect.size(); i++) {
			
			String textSA =	ListofArchitect.get(i).getText();	
			System.out.println(textSA);
			
		}
		
		driver.findElement(By.xpath("//div[@class='credentials-card_title']/a[text()='Application Architect']")).click();
		Set<String> WH1 = driver.getWindowHandles();
		List<String> LS1 = new ArrayList<String>(WH1);
		driver.switchTo().window(LS1.get(1));
		
		List<WebElement> ListofCerti = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println(" ");
		System.out.println("List of Certifications present");
		
		for(int j = 0; j<ListofCerti.size(); j++) {
			
			String textLC = ListofCerti.get(j).getText();
			System.out.println(textLC);
			
		}
		
	}

}
