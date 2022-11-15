package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		 ChromeDriver driver=new ChromeDriver();
		 		 
		 //Load the Url
		  driver.get("https://en-gb.facebook.com/");
		 		 
		 //Maximize the browser Window
		 driver.manage().window().maximize();
		 
		 //Implicit Wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Click on Create New Account button
		 //driver.findElement(By.id("u_0_0_hS")).click();
		 driver.findElement(By.linkText("Create New Account")).click();
		 driver.findElement(By.name("firstname")).sendKeys("Ezhil");
		 driver.findElement(By.name("lastname")).sendKeys("Arul");
		 driver.findElement(By.name("reg_email__")).sendKeys("8939198732");
		 driver.findElement(By.id("password_step_input")).sendKeys("EzhilArul2013");
		 WebElement element1 = driver.findElement(By.id("day"));
		 Select aa = new Select(element1);
		 aa.selectByValue("10");
		 element1.sendKeys(Keys.TAB);
		 WebElement element2 = driver.findElement(By.xpath("//select[@id='month']"));
		 Select bb = new Select(element2);
		 bb.selectByIndex(7);
		 element2.sendKeys(Keys.TAB);
		 WebElement element3 = driver.findElement(By.id("year"));
		 Select cc = new Select(element3);
		 cc.selectByValue("2009");
		 element3.sendKeys(Keys.TAB);		 
		 driver.findElement(By.xpath("//input[@value='1']")).click();	
		 
		//close the browser
		 driver.close();
	}

}
