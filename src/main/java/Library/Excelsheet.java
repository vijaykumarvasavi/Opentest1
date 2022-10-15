package Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	
	
	public String getexcelsheetdata (String sheetname , int rounum , int colnum) throws Exception {
		
		FileInputStream fel = new  FileInputStream(Pathdata.exceldata);
		Workbook wb = WorkbookFactory.create(fel);
		Sheet sh = wb.getSheet(sheetname);
		Row rw = sh.getRow(rounum);
		wb.close();
		return rw.getCell(colnum).getStringCellValue();
		
		
	}

}
