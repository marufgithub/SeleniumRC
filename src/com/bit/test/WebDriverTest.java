package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest 
{
	
	public WebDriver driver;
	@Before
	public void start()
	{
		driver = new FirefoxDriver();
	}
	@Test
	public void test1()
	{
		driver.get("http://docs.seleniumhq.org/");
	}
	@After
	public void end()
	{
		driver.quit();
	}

}
