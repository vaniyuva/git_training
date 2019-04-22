package Edureka_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Edureka_Excel {
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	public static  void setExcel(String path, int Sheetnum) throws IOException
	{
		File src=new File(path);
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		sh=wb.getSheetAt(Sheetnum);
	}
	public static String getData(int rowno,int cellno)
	{
		String Data=sh.getRow(rowno).getCell(cellno).getStringCellValue();
		return Data;
	}
	public static void passData(String path,int rowno,int cellno,String str) throws IOException
	{
		File src=new File(path);
		FileOutputStream fos=new FileOutputStream(src);	
		sh.getRow(rowno).createCell(cellno).setCellValue(str);
		wb.write(fos);
		fos.close();
	
		
	}
	


}
