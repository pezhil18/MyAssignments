package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SalesforceTestcase1 extends MarthonBaseClass{
	
	@BeforeClass
	public void setData() {
		fileName = "Salesforce";
	}
	
	@Test (dataProvider = "fetchData")
	public void runSalesforceTestcase1(String Questions, String Details) throws InterruptedException {
		
//		03) Click on the App Launcher (dots)
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

//		04) Click View All
		driver.findElement(By.xpath("//button[@class='slds-button'][text()='View All']")).click();
		
//		05) Type Content on the Search box
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Content");
		
//		06) Click Content Link
		Actions builder = new Actions(driver);
		
		Thread.sleep(9000);
		
		WebElement element1 = driver.findElement(By.xpath("//p[@class='slds-truncate']/mark[text()='Content']"));
		builder.scrollToElement(element1).perform();
		element1.click();
	
//		07) Click on Chatter Tab
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click();", element2);
		Thread.sleep(3000);
				
//		08) Verify Chatter title on the page
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Chatter")) {
			System.out.println("Title is verified and displayed correctly");
		}
		else
			System.out.println("Title is incorrect");
		
//		09) Click Question tab
		WebElement element3 = driver.findElement(By.xpath("//span[@class='title'][text()='Question']"));
		driver.executeScript("arguments[0].click()", element3);
		
//		10) Type Question with data (coming from excel)
		driver.findElement(By.xpath("//div[@class='questiontitle input-field']//textarea[@role='textbox']")).sendKeys(Questions);
//		11) Type Details with data (coming from excel)
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank slds-rich-text-area__content slds-text-color_weak slds-grow'][@role='textbox']")).sendKeys(Details);
		Thread.sleep(3000);
		//		12) Click Ask
		driver.findElement(By.xpath("//button[@type='button'][text()='Ask']")).click();
		Thread.sleep(3000);
//		13) Confirm the question appears
		String text = driver.findElement(By.xpath("//div[@class='cuf-body cuf-questionTitle forceChatterFeedBodyQuestionWithoutAnswer']/span[@class='uiOutputText']")).getText();
		System.out.println(text);
		
		if(text.contains("What")) {
			System.out.println("Questions Appeared: " +text);
		}
		else
		System.out.println("Questions not Appeared");
//		14) Close the browser
		
//		driver.close();
		
		
	}
	
	}


