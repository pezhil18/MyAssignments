package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import BaseClassM4.BaseM4;
import io.github.sukgu.Shadow;

public class VerifyCallerPage extends BaseM4{
	
	public VerifyCallerPage(RemoteWebDriver driver, Shadow shadow) {
		this.driver = driver;
		this.shadow = shadow;
	}
	
	public VerifyCallerPage searchCaller() throws InterruptedException {
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(8000);
		search.clear();
		search.sendKeys("Ezhil",Keys.RETURN);
		return this;
	}
	
	public VerifyCallerPage verifyCaller() {
		String fName = driver.findElement(By.xpath("//table/tbody/tr/td[4]")).getText();
		if(fName.contains(fName))
		System.out.println("Verified the firstName" +fName);
		return this;
	}

}
