package com.sqa.td;

import com.sqa.td.core.*;

public class LoginTest extends BasicTest
{

	private String username;

	private String password;

	public LoginTest(String baseUrl)
	{
		super(baseUrl);
	}

	public void loggingIn(String username, String password)
	{
		System.out.println("Welcome! Today is a beautiful day.");
	}

	public void logginOut(String username, String password)
	{
		System.out.println("You have been logged out.");
	}

	public void resetPassword(String email)
	{
	}
}
