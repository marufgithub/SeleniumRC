package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabTest 
{
	WebDriver driver;
	@Test
	public void open() throws MalformedURLException
	{
		DesiredCapabilities moga = DesiredCapabilities.firefox();
		//DesiredCapabilities is a class firefox static method
		moga.setCapability("version", "23");
		moga.setCapability("platform", Platform.UNIX);
		moga.setCapability("name", "xp23M");
		driver = new RemoteWebDriver(new URL("http://daemonp:2d3e8899-7ee6-4f82-a2a4-363b42a1caae@ondemand.saucelabs.com:80/wd/hub"),
                moga);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("mT");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.quit();
	}

}
