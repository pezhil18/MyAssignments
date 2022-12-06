package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragLeafground {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml;");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement source1 = driver.findElement(By.xpath("//span[text()='Drag and Drop']/following::span[text()='Drag me around']"));
			
		//Actions_drag and drop
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(source1, 100, 90).perform();
		
		WebElement source2 = driver.findElement(By.xpath("//div[@id='form:drag_content']/p[text()='Drag to target']"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='form:drop_content']/p[text()='Drop here']"));
		
		builder.dragAndDrop(source2, target2).perform();
		
		//column drag
		WebElement source3 = driver.findElement(By.xpath("//span[text()='Quantity']"));
		WebElement target3 = driver.findElement(By.xpath("//span[text()='Category']"));
		
		builder.dragAndDrop(source3, target3).perform();
		Thread.sleep(3000);
		
		//row drag
		WebElement source4 = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[@data-ri='1']"));
		WebElement target4 = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[@data-ri=3]"));
		
		builder.dragAndDrop(source4, target4).perform();
		
	}

}
