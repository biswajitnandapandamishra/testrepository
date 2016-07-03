package com.tests.testingmaven;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest 
{

	@Test
	public void testseleniuminmaven()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.uk");
	}

}
