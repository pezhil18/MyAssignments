package week4.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//2. Click on stock market
		driver.findElement(By.id("navbtn_stockmarket")).click();
		
		//3. Click on NSE bulk Deals
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		//4. Get all the Security names
		List<WebElement> Secnames = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr//td[3]"));
		System.out.println("Security Names");
		
		Set<String> Testset = new LinkedHashSet<String>();
		
		for (int i=0; i<Secnames.size(); i++) {
			
			String seclist = Secnames.get(i).getText();
			System.out.println(seclist);
			Testset.add(seclist);
		}
		
		//5. Ensure whether there are duplicate Security names
			if(Secnames.size()==Testset.size()) {
				System.out.println("No Duplicate is exist");
			}
			else
				System.out.println("Duplicate exist");
		
		driver.close();
			
	}

}
