package scripts;

import org.testng.annotations.Test;

import pom.EnLoginPage;

@Test
public class EnLogin extends EnsuperTest{
	public void testlogin()
	{
	EnLoginPage l = new EnLoginPage(driver);
	l.login("kylo.ren@ytrewq.moc","encompass1");
	}

}
