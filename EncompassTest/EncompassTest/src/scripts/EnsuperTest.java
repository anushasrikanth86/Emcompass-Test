package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class EnsuperTest {
	
	public WebDriver driver;
	@BeforeClass
	public void precondition()
	{
		driver=new FirefoxDriver();
		driver.get("https://ukstaging.encompasshost.com/#/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void postcondition()
	{
	driver.close();	
	}

}
