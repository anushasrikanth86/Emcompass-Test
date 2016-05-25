package scripts;

import org.testng.annotations.Test;

import pom.EnCreateWs;

public class EnTestWs extends EnsuperTest{
	@Test
	public void testcreate()
	{
	EnCreateWs c = new EnCreateWs(driver);
	c.create("Test", "Test25May2016");
	}		

}
