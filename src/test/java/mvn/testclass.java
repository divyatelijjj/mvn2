package mvn;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFile.BaseClass;
import LibraryFile.utilityclass;
import module1.PBLoginPage;
import module1.finalpage;
import module1.signinmobile;
import module1.signinpass;

public class testclass extends BaseClass {
	//WebDriver driver;
	PBLoginPage login;
	signinmobile ss;
	signinpass ssp;
	finalpage ff;
	int 	TCID;
	
	
	@BeforeClass
	public void open() throws IOException
	{
		initializeBrowser();
		 
		 login=new PBLoginPage(driver);
		
		ss=new signinmobile(driver);
		ssp=new signinpass(driver);
		ff=new finalpage(driver);
	}
	@BeforeMethod
	public void logintoapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		login.clickPBLoginPageSignIn();
		ss.mobile(utilityclass.getPFData("MobNum"));
		ss.mobileclick();
		ssp.passenter(utilityclass.getPFData("PWD"));
		ssp.clicksignin();
		
	}
	@Test
	public void mainactivity()
	{	TCID=101;
	ff.finalp();
	}
	@AfterMethod
	public void logoutorscrrenshot(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			utilityclass.shot(driver,TCID);
		}
		
	}
	@AfterClass
	public void closebrouser()
	{
		driver.quit();
	}

}
