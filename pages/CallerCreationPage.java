package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClassM4.BaseM4;
import io.github.sukgu.Shadow;

public class CallerCreationPage extends BaseM4{
	
	public CallerCreationPage(RemoteWebDriver driver, Shadow shadow) {
		this.driver = driver;
		this.shadow = shadow;
	}
	
	public CallerCreationPage enterfirstName() {		
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Ezhil");
		return this;
	}
	
	public CallerCreationPage enterlastName() {
		driver.findElement(By.id("sys_user.last_name")).sendKeys("A");	
		return this;
	}
	
	public CallerCreationPage enterEmail() {
		driver.findElement(By.id("sys_user.email")).sendKeys("xyz@gmail.com");
		return this;
	}
	
	public CallerCreationPage enterTitle() {
		driver.findElement(By.id("sys_user.title")).sendKeys("Tester");
		return this;
	}
	
	public CallerCreationPage enterPhone() {
		driver.findElement(By.id("sys_user.phone")).sendKeys("123456789");
		return this;
	}
	
	public CallerCreationPage enterMobile() {
		driver.findElement(By.id("sys_user.mobile_phone")).sendKeys("123456789");
		return this;
	}
	
	public VerifyCallerPage clickonSubmit() {
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		return new VerifyCallerPage(driver, shadow);
	}
	
		
}
