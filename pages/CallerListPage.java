package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClassM4.BaseM4;
import io.github.sukgu.Shadow;

public class CallerListPage extends BaseM4{
	
	public CallerListPage(RemoteWebDriver driver, Shadow shadow) {
		this.driver = driver;
		this.shadow = shadow;
	}
	
	public CallerCreationPage clickonNew() throws InterruptedException {
		Thread.sleep(6000);
		WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		return new CallerCreationPage(driver, shadow);
	}
	

}
