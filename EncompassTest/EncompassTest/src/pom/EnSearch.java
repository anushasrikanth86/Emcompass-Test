package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnSearch {

	@FindBy(xpath="//button[@class='enc-open-startsearch ng-binding']")
	private WebElement select;
	
	@FindBy(xpath="//a[@class='enc-startsearch-item ng-binding ng-scope selected']")
	private WebElement 	compHouse;
	
	@FindBy(xpath="//section/section[3]/section/a[5]")
	private WebElement compRecord;
	

	
	public EnSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void search()
	{
		select.click();;
		compHouse.click();
		compRecord.click();
		
	}
	


}
