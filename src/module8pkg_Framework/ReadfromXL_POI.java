package module8pkg_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadfromXL_POI {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\\\Vani_selenium\\\\Workspace\\\\selenium_Training\\\\src\\\\module8pkg_Framework\\\\TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheetAt(0);
		Row r = sh.getRow(1);
		Cell c = r.getCell(1);
		
		String value = c.getStringCellValue();
		System.out.println(value);
		

	}

}
