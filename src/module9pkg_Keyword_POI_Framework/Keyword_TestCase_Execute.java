package module9pkg_Keyword_POI_Framework;

import java.io.IOException;

public class Keyword_TestCase_Execute {


	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		String path="D:\\Vani_selenium\\Workspace\\selenium_Training\\src\\module9pkg_Keyword_POI_Framework\\Keyword__data.xlsx";
		Keyword_ExcelUtilities.setExcel(path,0);
		
		for(int i=1;i<=3;i++)
		{
			String str="pass";
			String word=Keyword_ExcelUtilities.getData(i,1);
			if(word.equals("openBrowser"))
			{
				Keyword_Actions.openBrowser();
				Keyword_ExcelUtilities.passData(path,i, 2,str);
				
				
			}
			else if(word.equals("openURL"))
			{
				Keyword_Actions.openURL();
				Keyword_ExcelUtilities.passData(path,i, 2,str);
			}
			else if(word.equals("clickGmail"))
			{
				Keyword_Actions.clickGmail();
				Keyword_ExcelUtilities.passData(path,i, 2,str);
			}
		}
		
		Keyword_Actions.closeBrowser();
		

	}

}
