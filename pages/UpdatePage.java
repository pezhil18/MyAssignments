package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClassM4.BaseM4;
import io.github.sukgu.Shadow;

public class UpdatePage extends BaseM4{
	
	public UpdatePage(RemoteWebDriver driver, Shadow shadow) {
		this.driver = driver;
		this.shadow = shadow;
	}
	
	public UpdatePage searchbyName() throws InterruptedException {
		Thread.sleep(3000);
		WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame);

		WebElement search = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(3000);
		search.clear();
		search.sendKeys("Ezhil",Keys.RETURN);
		return this;
		
	}
	
	public UpdatePage openRecord() {
	
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-icon')])[2]")).click();
		driver.findElement(By.linkText("Open Record")).click();
		return this;
	}
	
	public UpdatePage updatePhonenumber() {
		
		WebElement updatePhoneNumber = driver.findElement(By.id("sys_user.phone"));
		updatePhoneNumber.clear();
		updatePhoneNumber.sendKeys("987654321");
		
		driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
		
		return this;
		
	}
	

}
