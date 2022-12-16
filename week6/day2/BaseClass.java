package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public ChromeDriver driver;
	public String fileName;
	
	@Parameters({"url", "username", "password"})
	@BeforeMethod(alwaysRun = true)
	public void precondition(String url, String username, String password)  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement (By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@AfterMethod(alwaysRun = true)
	public void postcondition() {
				
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String [] [] getData() throws IOException {
		return ReadExcel.readData(fileName);
				
	}
}

