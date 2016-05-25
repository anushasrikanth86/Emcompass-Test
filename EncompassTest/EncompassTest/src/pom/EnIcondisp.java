package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnIcondisp {
	
	@FindBy(xpath="//span[Contains(text(),'HARRODS LIMITED')]")
	private WebElement icon;
	public EnIcondisp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void iconDisp()
	{
		icon.isDisplayed();
	
		
	}
	
}
