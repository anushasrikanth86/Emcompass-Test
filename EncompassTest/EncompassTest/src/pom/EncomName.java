package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EncomName {

	@FindBy(xpath="//input[@id='purchaseFlowStepCtrl.form_input_companyName_1']")
	private WebElement compname;
	@FindBy(xpath="//button[@class='next enc-primary-button ng-binding']")
	private WebElement search;
	
	

	
	public EncomName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void compName(String cName)
	{
		compname.sendKeys(cName);
		search.click();
		
	}

}
