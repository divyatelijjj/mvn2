package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpass {
	@FindBy(xpath="//input[@type='password']")private WebElement sp;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement ss;
public signinpass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void passenter(String p)
{
	sp.sendKeys(p);
}

public void clicksignin()
{
	ss.click();
}
}
