package scripts;

import org.testng.annotations.Test;

import pom.EncomName;

public class EncNameTest extends EnsuperTest{
	@Test
	public void cNameTest()
	{
		EncomName c = new EncomName(driver);
		c.compName("Harrods Limited");
	}

}
