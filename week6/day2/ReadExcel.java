package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readData(String fileName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		XSSFSheet ws = wb.getSheetAt(0);
		
		//get the rowcount exclude the header
		int rowCount = ws.getLastRowNum();
		
		//get the number of column exclude the header
		int cellCount = ws.getRow(0).getLastCellNum();
		
		String[] [] data = new String[rowCount] [cellCount];
		for(int i=1; i<=rowCount; i++) {
		for(int j=0; j<cellCount; j++)	{
			XSSFRow row = ws.getRow(i);
			XSSFCell cell = row.getCell(j);
			String cellValue = cell.getStringCellValue();
			data[i-1][j] = cellValue;
			//System.out.println(data);
		}

	}
		
	//close the workbook
		wb.close();
		
	
	return data;

}
}
