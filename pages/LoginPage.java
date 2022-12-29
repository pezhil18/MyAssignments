package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClassM4.BaseM4;
import io.github.sukgu.Shadow;

public class LoginPage extends BaseM4{
	
	public LoginPage(RemoteWebDriver driver, Shadow shadow) {
		this.driver = driver;
		this.shadow = shadow;
	}
	
	public LoginPage enterUserName() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		return this; 
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("user_password")).sendKeys("qT=22/clVNXl");	
		return this;
	}
	
	public HomePage clickLogin() throws InterruptedException {
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(5000);
		return new HomePage(driver, shadow);
	}
	

}
