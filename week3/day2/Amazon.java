package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement element1 = driver.findElement(By.id("twotabsearchtextbox"));
		element1.sendKeys("Phones");
		element1.sendKeys(Keys.ENTER);
		
		List<WebElement> allMblEles = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("Number of Lists = " +allMblEles);
		
		List<Integer> priceList = new ArrayList<Integer>();
		
		for (WebElement eachMblEle : allMblEles) {
			System.out.println(eachMblEle.getText());
			String text = eachMblEle.getText().replace(",","").replace("₹","");
			int price = Integer.parseInt(text);
			priceList.add(price);
		}
		Collections.sort(priceList);
		System.out.println("Least Price is: " +priceList.get(0));
	}

}
