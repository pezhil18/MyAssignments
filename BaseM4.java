package BaseClassM4;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class BaseM4 {
	
	public RemoteWebDriver driver;
	public Shadow shadow;
	
	@BeforeMethod(alwaysRun = true)
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		driver.get("https://dev92294.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		shadow = new Shadow(driver);
		shadow.setImplicitWait(30);
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void postCondition() {
		driver.close();
	}

}
