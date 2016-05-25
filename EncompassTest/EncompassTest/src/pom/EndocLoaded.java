package pom;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EndocLoaded {
	@FindBy(xpath="//a[contains(text(),'Documents')]")
	private WebElement document;
	@FindBy(xpath="//a[contains(text(),'Open All')]")
	private WebElement openall;
	
	
	
	public EndocLoaded(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void docperform(Actions action)
	{
		action.moveToElement(document).perform();
		
	}
	public void docloaded()
	{
		openall.click();	
		
	}

}
