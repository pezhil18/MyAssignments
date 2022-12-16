package marathon3;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;


	public class MarthonBaseClass {
	
	public ChromeDriver driver;
	public String fileName;
	
	@Parameters({"url", "username", "password"})
	@BeforeMethod(alwaysRun = true)
	public void precondition(String url, String username, String password) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
//		01) Launch https://login.salesforce.com/ 
//		02) Login to Salesforce with your username and password
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}
		@AfterMethod(alwaysRun = true)
		public void postcondition() {
		driver.close();
		}
		
		@DataProvider(name = "fetchData")
		public String [] [] getData() throws IOException{
			return ReadExcelmar3.readData(fileName);
		}
		
		
		
	
}