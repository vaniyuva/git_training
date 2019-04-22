package module8pkg_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadingFromExcel {
	
	static Workbook WB;
	static Sheet sh;

	public static void main(String[] args) throws JXLException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis =new FileInputStream("D:\\Vani_selenium\\Workspace\\selenium_Training\\src\\module8pkg_Framework\\TestData.xlsx");
		WB=Workbook.getWorkbook(fis);
		sh=WB.getSheet(1);
		for(int i=0;i<sh.getRows();i++)
		{
			for(int j=0;j<sh.getColumns();j++)
			{
				System.out.println(sh.getCell(j,i).getContents());
			}
			
		}
		

	}

}
