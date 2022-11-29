package week4.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element1 = driver.findElement(By.id("txtStationFrom"));
		element1.clear();
		element1.sendKeys("MAS");
		
		Thread.sleep(2000);
		
		element1.sendKeys(Keys.ENTER);
		element1.sendKeys(Keys.TAB);
		
		WebElement element2 = driver.findElement(By.id("txtStationTo"));
		element2.clear();
		element2.sendKeys("CBE");

		Thread.sleep(2000);
		
		element1.sendKeys(Keys.ENTER);
		element1.sendKeys(Keys.TAB);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]/a"));
		
		Thread.sleep(3000);
		
		Set<String> Train = new LinkedHashSet<String>();
		for (int i = 1; i<row.size(); i++) {
			
			String trainnm = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]/a")).getText();
			//System.out.println(trainnm);
			Train.add(trainnm);
		}
		
		if(row.size()==Train.size()) {
			System.out.println("No Duplicate is exist");
		}
		else
			System.out.println("Duplicate exist");
	}

}
