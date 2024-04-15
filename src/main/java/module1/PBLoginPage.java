package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class 1

	//Step1: declaration
	public class PBLoginPage 
	{
		//Step1: declaration
		@FindBy(xpath="//a[text()='Sign in']") private WebElement SignIn; // private WebElement SignIn=driver.findElement(By.xpath("//a[text()='Sign in']"));
		
		@FindBy(xpath="(//div[@class='userprofile'])[1]") private WebElement userIcon;
		
		WebDriver driver1;
		
		//Step2: initialization
		public PBLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			driver1=driver;           //assign local object info into global object
		}
		
		
		//step3: 
		public void clickPBLoginPageSignIn()
		{
			SignIn.click();
		}
			
	
	
	
		
}