package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Encostverify {
	
	@FindBy(xpath="//li[@class='cost']")
	private WebElement cost;
	@FindBy(xpath="//button[@class='next enc-primary-button ng-binding']")
	private WebElement next;
	
	public void costverify()
	{
	Assert.assertEquals("Free", cost);
	next.click();
	}
	


}
