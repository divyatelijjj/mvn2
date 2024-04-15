package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinmobile {
@FindBy(xpath="(//input[@type='number'])[2]")private WebElement m;
@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")	private WebElement mp;
	
	public signinmobile(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void mobile(String s)
	{
		m.sendKeys(s);
	}
	
	public void mobileclick()
	{
		mp.click();
	}
	
	
}
