package scripts;
import org.testng.annotations.Test;

import pom.EnSelect;

public class EnselectTest extends EnsuperTest{
	@Test
	public void EnSelectTest()
	{
		EnSelect s = new EnSelect(driver);
		s.cSelect();
	}
}

