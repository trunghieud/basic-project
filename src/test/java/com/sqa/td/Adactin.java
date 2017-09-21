package com.sqa.td;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;
import java.time.*;

public class Adactin
{

	private WebDriver driver;

	private String baseUrl;

	private boolean acceptNextAlert = true;

	private StringBuffer verificationErrors = new StringBuffer();

	LocalDate localDate = LocalDate.now();

	@AfterClass
	public void afterClass()
	{
	}

	@AfterTest
	public void afterTest()
	{
	}

	@BeforeTest
	public void beforeTest()
	{
	}

	@BeforeMethod
	public void setUp() throws Exception
	{
		// Setup the variable for WebDriver object to use Firefox Driver
		// implementation instance
		this.driver = new FirefoxDriver();
		// Setup the base URL to Adacting Hotel App
		this.baseUrl = "http://www.adactin.com/HotelApp/index.php";
		// Set an implicit wait of30 seconds
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception
	{
		// Close or exit the driver instance
		this.driver.quit();
	}

	@Test
	public void test101() throws Exception
	{
		// Go to base url
		this.driver.get(this.baseUrl + "/");
		// Find the username and password element and login
		this.driver.findElement(By.id("username")).clear();
		this.driver.findElement(By.id("username")).sendKeys("trungdam");
		this.driver.findElement(By.id("password")).clear();
		this.driver.findElement(By.id("password")).sendKeys("h9e5hTxWFs8t");
		this.driver.findElement(By.id("login")).click();
		Assert.assertEquals(this.driver.getTitle(), "AdactIn.com - Search Hotel");
	}

	@Test
	public void test102() throws Exception
	{
		test101();
		new Select(this.driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		new Select(this.driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		new Select(this.driver.findElement(By.id("room_type"))).selectByVisibleText("standard");
		new Select(this.driver.findElement(By.id("room_nos"))).selectByVisibleText("1");
		this.driver.findElement(By.id("datepick_in"))).(LocalDate.now();




	}

	private String closeAlertAndGetItsText()
	{
		try
		{
			Alert alert = this.driver.switchTo().alert();
			String alertText = alert.getText();
			if (this.acceptNextAlert)
			{
				alert.accept();
			} else
			{
				alert.dismiss();
			}
			return alertText;
		} finally
		{
			this.acceptNextAlert = true;
		}
	}

	private boolean isAlertPresent()
	{
		try
		{
			this.driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e)
		{
			return false;
		}
	}

	private boolean isElementPresent(By by)
	{
		try
		{
			this.driver.findElement(by);
			return true;
		} catch (NoSuchElementException e)
		{
			return false;
		}
	}
}
