package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnSelect {
	
	@FindBy(xpath="//tr[@id='1464125151350']/td[1]")
	private WebElement compSelect;
	@FindBy(xpath="//button[@class='next enc-primary-button ng-binding']")
	private WebElement placeorder;
	
	public EnSelect(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void cSelect()
	{
		Assert.assertTrue(compSelect.isSelected());	
		placeorder.click();
		
	}
}