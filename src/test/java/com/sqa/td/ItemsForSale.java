package com.sqa.td;

import org.testng.annotations.*;

public class ItemsForSale
{

	@DataProvider
	public Object[][] dp()
	{
		return new Object[][]
		{ new Object[]
				{ "12345", "iPhone 8", 800, "San Jose", 'y' }, new Object[]
				{ "12346", "Galaxy S8", 900, "Santa Clara", 'n' }, new Object[]
				{ "12347", "MacBook Pro", 1500, "Cupertino", 'y' }, new Object[]
				{ "12348", "iPhone X", 1000, "Cupertino", 'n' }, new Object[]
				{ "12349", "Dining table", 200, "Sunnyvale", 'y' }, new Object[]
				{ "12350", "Whirlpool Cabrio washer", 300, "Saratoga", 'n' }, new Object[]
				{ "12351", "Whirlpool fridge", 900, "Mountain View", 'n' }, new Object[]
				{ "12352", "Whirlpool oven", 900, "Mountain View", 'n' }, };
	}

	@Test(dataProvider = "dp")
	public void testForSaleItem(String itemNum, String itemName, int price, String location, char available)
	{
		System.out.println("Search for item number: " + itemNum);
		System.out.println("Search for item name: " + itemName);
		System.out.println("The item is located: " + location);
		System.out.println("Assert the item is still available " + available);
	}
}
