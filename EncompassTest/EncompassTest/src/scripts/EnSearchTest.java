package scripts;

import org.testng.annotations.Test;

import pom.EnSearch;

public class EnSearchTest extends EnsuperTest {
	
	@Test
	
	public void testsearch()
	{
		EnSearch n= new EnSearch(driver);
		n.search();
	
	}		



}
