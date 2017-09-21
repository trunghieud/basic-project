package com.sqa.td.core;

import org.apache.log4j.*;
import org.openqa.selenium.*;

import com.sqa.td.helpers.*;

public class Core
{

	private String baseUrl;

	protected WebDriver driver;

	private BasicTest curTest;

	private Logger log = Logger.getLogger(this.getClass());

	public Core(BasicTest test)
	{
		this.curTest = test;
		this.baseUrl = test.getBaseUrl();
		this.driver = test.getDriver();
	}

	public Core(String baseUrl)
	{
		this.baseUrl = baseUrl;
	}

	public Core(String baseUrl, WebDriver driver)
	{
		super();
		this.baseUrl = baseUrl;
		this.driver = driver;
	}

	public String getBaseUrl()
	{
		return this.baseUrl;
	}

	public WebDriver getDriver()
	{
		return this.driver;
	}

	public String getProp(String propName)
	{
		return AutoBasics.getProp(propName, "src/main/resources/", "config.properties", getLog());
	}

	public boolean isElementPresent(By locator)
	{
		return false;
	}

	public void setBaseUrl(String baseUrl)
	{
		this.baseUrl = baseUrl;
	}

	public void setDriver(WebDriver driver)
	{
		this.driver = driver;
	}

	private Logger getLog()
	{
		return this.log;
	}
}
