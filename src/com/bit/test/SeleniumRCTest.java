package com.bit.test;

import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumRCTest 
{
	@Test
	public void open()
	{
//		cd Downloads
		//selenium-server-standalone-2.37.0.jar
		//java -jar sel tab
		//launch the selenium server
		DefaultSelenium moga = new DefaultSelenium("localhost", 4444, "*firefox", "https://www.facebook.com");
	moga.start();
	moga.open("/");
	moga.type("email", "maruf@yahoo.com");
	moga.type("pass", "abc123");
	moga.click("u_0_f");
//	moga.type("u_0_0","maruf");
//	moga.type("u_0_1","murshed");
//	moga.close();
	//moga.open("https://www.facebook.com");
	}
	
}
