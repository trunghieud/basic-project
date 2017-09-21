package com.sqa.td.core;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class BasicChromeTest extends BasicTest
{

	public BasicChromeTest(String baseUrl)
	{
		super(baseUrl);
	}

	@Override
	@BeforeClass
	public void setupDriver()
	{
		this.driver = new ChromeDriver();
	}
}
