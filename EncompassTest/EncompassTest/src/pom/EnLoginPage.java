package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnLoginPage {
	
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnLogin;
	

	
	public EnLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login(String un,String pw)
	{
		txtUsername.sendKeys(un);
		txtpassword.sendKeys(pw);
		btnLogin.click();
		
	}

}
