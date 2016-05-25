package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnCreateWs {
	

	
	@FindBy(xpath="//input[@id='matternew-workspace-form-']")
	private WebElement MatterRef;
	
	@FindBy(xpath="//input[@id='new-workspace-form-name']")
	private WebElement WsName;
	
	@FindBy(xpath="//button[@id='new-workspace-form-create-button']")
	private WebElement createnew;
	

	
	public EnCreateWs(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void create(String ref,String name)
	{
		MatterRef.sendKeys(ref);
		WsName.sendKeys(name);
		createnew.click();
		
	}


}
