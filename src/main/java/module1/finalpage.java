package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class finalpage {
	
	@FindBy(xpath="//a[@class='logo']")private WebElement ff;
	
public finalpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void finalp()
{
	System.out.println(ff.isDisplayed());
}
}
