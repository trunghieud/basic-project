package com.sqa.td.ws;

import java.sql.*;

import org.testng.annotations.*;

import com.sqa.td.core.*;
import com.sqa.td.helpers.*;
import com.sqa.td.helpers.enums.*;
import com.sqa.td.helpers.exceptions.*;

public class WSTest extends BasicChromeTest
{

	/**
	 * @param baseUrl
	 */
	public WSTest()
	{
		super("http://williams-sonoma.com");
	}

	@DataProvider()
	public Object[][] dbData() throws ClassNotFoundException, DataTypesMismatchException, SQLException,
			DataTypesCountException, DataTypesTypeException
	{
		return DataHelper.evalDatabaseTable("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/sqadb", "root",
				"root", "wsdata", 0, 0, new DataType[]
				{ DataType.INT, DataType.STRING, DataType.INT, DataType.DOUBLE });
	}

	@DataProvider
	public Object[][] excel2003Data() throws InvalidExcelExtensionException
	{
		return DataHelper.getExcelFileData("C:\\eclipse\\", "WSExcel2003.xls", false, new DataType[]
		{ DataType.INT, DataType.STRING, DataType.INT, DataType.DOUBLE });
	}

	@DataProvider
	public Object[][] excelNewData() throws InvalidExcelExtensionException
	{
		return DataHelper.getExcelFileData("C:\\eclipse\\", "WSTestData.xlsx", false, new DataType[]
		{ DataType.INT, DataType.STRING, DataType.INT, DataType.DOUBLE });
	}

	@DataProvider
	public Object[][] hardData()
	{
		return new Object[][]
		{ new Object[]
				{ 1, "Navarro Extendable Dining Table", 1, 2995.00 }, new Object[]
				{ 2, "Vitamix Professional Series 750 Heritage Blender", 1, 599.95 }, new Object[]
				{ 3, "Handpainted Iznik Tulip Bowl", 5, 649.95 }, new Object[]
				{ 4, "Paderno Spiralizer 4-Blade", 1, 49.95 }, new Object[]
				{ 5, "Halloween Skull Punch Bowl, Brushed Gold", 1, 79.95 }, new Object[]
				{ 6, "AERIN Cannes Table Lamp, Gild", 7, 5565.00 } };
	}

	@Test(dataProvider = "excel2003Data")
	public void testAddItemToCart(int id, String itemName, int quantity, double expectedPrice)
	{
		System.out.println(id + ": Search for item " + itemName);
		System.out.println("Add " + quantity + " of them to cart.");
		System.out.println("Check cart items.");
		System.out.println("Assert that the actual cost is equal to the expected price of " + expectedPrice);
	}

	@DataProvider
	public Object[][] textData()
	{
		return DataHelper.getTextFileData("C:\\eclipse\\", "WSTestData.csv", TextFormat.CSV, new DataType[]
		{ DataType.INT, DataType.STRING, DataType.INT, DataType.DOUBLE });
	}
}
