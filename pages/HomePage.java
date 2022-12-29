package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClassM4.BaseM4;
import io.github.sukgu.Shadow;

public class HomePage extends BaseM4{
	
	public WebElement filter;
	
	public HomePage(RemoteWebDriver driver, Shadow shadow) {
		this.driver = driver;
		this.shadow = shadow;
	}

	public HomePage clickAll() throws InterruptedException {
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[text()='All']").click();
		Thread.sleep(8000);
		return this;
	}
	
	public CallerListPage entercallerinfilter() throws InterruptedException {
		filter = shadow.findElementByXPath("//input[@id='filter']");
		shadow.setImplicitWait(10);
		driver.executeScript("arguments[0].click();", filter);
		filter.click();
		filter.sendKeys("Callers");
		Thread.sleep(3000);
		WebElement callerElement = shadow.findElementByXPath("//span[text()='Callers']");
		driver.executeScript("arguments[0].click();", callerElement);
		return new CallerListPage(driver, shadow);
		
	}
	
	public UpdatePage entercallerinfilter1() throws InterruptedException {
		filter = shadow.findElementByXPath("//input[@id='filter']");
		shadow.setImplicitWait(10);
		driver.executeScript("arguments[0].click();", filter);
		filter.click();
		filter.sendKeys("Callers");
		Thread.sleep(3000);
		WebElement callerElement = shadow.findElementByXPath("//span[text()='Callers']");
		driver.executeScript("arguments[0].click();", callerElement);
		return new UpdatePage(driver, shadow);
		
	}
	
	public DeletePage entercallerinfilter2() throws InterruptedException {
		filter = shadow.findElementByXPath("//input[@id='filter']");
		shadow.setImplicitWait(10);
		driver.executeScript("arguments[0].click();", filter);
		filter.click();
		filter.sendKeys("Callers");
		Thread.sleep(3000);
		WebElement callerElement = shadow.findElementByXPath("//span[text()='Callers']");
		driver.executeScript("arguments[0].click();", callerElement);
		return new DeletePage(driver, shadow);
		
	}
}
