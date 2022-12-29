package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClassM4.BaseM4;
import io.github.sukgu.Shadow;

public class DeletePage extends BaseM4{
	
	String mobileNumber;
	
	public DeletePage(RemoteWebDriver driver, Shadow shadow) {
		this.driver = driver;
		this.shadow = shadow;
		
	}
	
	public DeletePage search() throws InterruptedException {
		Thread.sleep(3000);
		WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame);

		WebElement search = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(3000);
		search.clear();
		search.sendKeys("Ezhil",Keys.RETURN);
		return this;
	}
	
	public DeletePage openrec() {
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-icon')])[2]")).click();
		driver.findElement(By.linkText("Open Record")).click();
		mobileNumber = driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).getText();
		return this;
	}
	
	public DeletePage deleterec() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='sysverb_delete_bottom']")).click();
		driver.findElement(By.id("ok_button")).click();
		WebElement search_ = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(3000);
		search_.sendKeys(mobileNumber,Keys.RETURN);
		return this;
	}

}
