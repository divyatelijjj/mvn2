package LibraryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass {

//	public static String exel(int r,int c) throws EncryptedDocumentException, IOException
//	{
//		FileInputStream file=new FileInputStream("C:\\Users\\Teli\\eclipse-workspace\\maven1\\TestData\\Exel-sheet2.xlsx");
//		Sheet sh=WorkbookFactory.create(file).getSheet("DDF2");
//	String value=sh.getRow(r).getCell(c).getStringCellValue();
//		return value;
//	}
	
	public static void shot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Teli\\eclipse-workspace\\maven1\\Screenshot\\TestCaseID\"+TCID+");
		FileHandler.copy(src,dest);
	}
	public static String getPFData(String key) throws IOException
	{
		FileInputStream  file=new FileInputStream("C:\\Users\\Teli\\eclipse-workspace\\maven1\\Proprtyfile.properties");
	Properties p=new Properties();
	p.load(file);
	String value = p.getProperty(key);
	return value;
}
}