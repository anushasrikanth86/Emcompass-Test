package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pom.EndocLoaded;
public class EnDocTest extends EnsuperTest {
	@Test
	public void doclodedTest()
	{
	
	Actions actions=new Actions(driver);
	EndocLoaded d = new EndocLoaded(driver);
	d.docperform(actions);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.docloaded();
	}

}
