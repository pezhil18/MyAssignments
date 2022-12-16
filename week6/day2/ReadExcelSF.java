package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSF {

	public static void main(String[] args) throws IOException {
		
		//set the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/Salesforce.xlsx");

		//get the respective sheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//get the row
		XSSFRow row = ws.getRow(1);
		
		//get the column (sepecific cell)
		XSSFCell cell = row.getCell(0);
		
		//Read the data from the cell
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		//close the workbook
		wb.close();
		
		
	}

}
