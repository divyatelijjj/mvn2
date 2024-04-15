package LibraryFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	public  WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teli\\eclipse-workspace\\maven1\\BrouseFile\\chromedriver.exe");	
			
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(utilityclass.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}

}