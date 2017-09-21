package com.sqa.td;

import org.testng.annotations.*;

public class LibraryCheckOut
{

	@DataProvider
	public Object[][] dp()
	{
		return new Object[][]
		{ new Object[]
				{ "Palo Alto Library", "1234 Forest Ave. Palo Alto, CA 94303", "9/1/17", "John Smith",
						"How to make money flipping house", "9/30/17" },
				new Object[]
				{ "Palo Alto Library", "1234 Forest Ave. Palo Alto, CA 94303", "9/1/17", "John Doe",
						"Progamming with Python in 30 days", "9/30/17" },
				new Object[]
				{ "Palo Alto Library", "1234 Forest Ave. Palo Alto, CA 94303", "9/1/17", "Lisa Smith",
						"50 Shades of Gray", "9/30/17" },
				new Object[]
				{ "Palo Alto Library", "1234 Forest Ave. Palo Alto, CA 94303", "9/1/17", "Marilynn Monroe",
						"Look Sexy, Feel Sexy", "9/30/17" },
				new Object[]
				{ "Mountain View Library", "6789 Hillcrest Dr. Mountain View, CA 94561", "10/1/17", "Henry Killman",
						"Battle Royale", "10/15/17" },
				new Object[]
				{ "Mountain View Library", "6789 Hillcrest Dr. Mountain View, CA 94561", "10/1/17", "Augustine Luther",
						"Baking International 101", "10/20/17" },
				new Object[]
				{ "Mountain View Library", "6789 Hillcrest Dr. Mountain View, CA 94561", "10/1/17", "George Lucas",
						"Star Wars", "10/30/17" },
				new Object[]
				{ "Mountain View Library", "6789 Hillcrest Dr. Mountain View, CA 94561", "10/15/17", "Paul George",
						"Grill the best seafood", "10/30/17" }, };
	}

	@Test(dataProvider = "dp")
	public void testLibraryPastDue(String libraryName, String libraryAddress, String dateCheckout, String customerName,
			String bookName, String returnDate)
	{
		System.out.println("Search for customer name:" + customerName);
		System.out.println(customerName + " checkout " + bookName + " on " + dateCheckout);
		System.out.println("Assert that the books has been return by" + returnDate);
	}
}
