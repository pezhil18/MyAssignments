package marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelmar3 {

	public static String[][] readData(String fileName) throws IOException {
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
				
		return data;

	}

}
