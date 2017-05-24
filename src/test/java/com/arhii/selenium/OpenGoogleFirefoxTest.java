package com.arhii.selenium;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleFirefoxTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/java tools/selenium/geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Ignore
	@Test
	public void test() {
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println("Tytuł: " + title);
		
		fail("Not yet implemented");
	}

}
