package com.arhii.selenium;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/java tools/selenium/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void test() {
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println("Tytuł: " + title);
		
//		fail("Not yet implemented");
		Assert.assertTrue("Google".equals(title));
	}

	@Test
	public void testAction() {
		try{
		driver.get("http://www.google.com/xhtml");
		  Thread.sleep(5000);  // Let the user actually see something!
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ChromeDriver");
		  searchBox.submit();
		  Thread.sleep(5000);  // Let the user actually see something!
		
	//	fail("Not yet implemented");
		Assert.assertTrue(true);
		} catch (InterruptedException iEx) {
			iEx.printStackTrace();
		}
	}

	public void tearDown() {
		driver.close();
	}

}
