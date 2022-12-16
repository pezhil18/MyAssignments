package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonclass {
	
	public ChromeDriver driver;
	public String fileName;
	
	@Parameters({"url", "username", "password"})
	@BeforeMethod(alwaysRun = true)
	public void precondition(String url, String username, String password) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
//		01) Launch https://login.salesforce.com/ 
//		02) Login to Salesforce with your username and password
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}
	
	@AfterMethod(alwaysRun = true)
	public void postcondition() {
		driver.close();
		
	}
	
	@DataProvider(name = "fetchData")
	public String[][] readData(String fileName) throws IOException {
		
		//set the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");

		//get the respective sheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//get the number of rows with data
		int rowcount = ws.getLastRowNum();
		
		//get the number of columns with data
		int cellcount = ws.getRow(0).getLastCellNum();
		
		String[] [] data = new String[rowcount] [cellcount];
		//get the data
		for(int i = 1; i <= rowcount; i++) {
			for(int j = 0; j < cellcount; j++) {
			XSSFRow row = ws.getRow(i);
			XSSFCell cell = row.getCell(j);
			String cellValue = cell.getStringCellValue();
			data[i-1][j] = cellValue;
			
			}
	}
						
		//close the workbook
			wb.close();
	
		
			return readData(fileName);
			
	}

}
