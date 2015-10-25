package com.sqa.ao.helped;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EvenTest {
	@DataProvider(name = "EvenOdd Numbers")
	public static Object[][] dataSet1() {
		Object[][] data = new Object[][] { { 2, true }, { 3, false }, { 0, true }, { 22, true }, { -4, true },
				{ -100234, true }, { 8009, false }, { 534, true }, { -6500, true } };
		return data;
	}

	// public static void main(String[] args) {
	// EvenTests test = new EvenTests();
	// test.connectDB();
	// }

	private int number = 0;

	@Test
	public void connectDB() {
		System.out.println("Connect to database");
		String user = "root";
		String pass = "root";
		String dbUrl = "jdbc:mysql://localhost:8889/sqausers";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection dbconn = DriverManager.getConnection(dbUrl, user, pass);
			Statement stmt = dbconn.createStatement();
			ResultSet rs = stmt.executeQuery("select name, address, age, jobtitle from person");
			while (rs.next()) {
				System.out.println("User " + rs.getString("name") + " is " + rs.getString("age") + " years old.");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "EvenOdd Numbers")
	public void testEvenOddAO(int number, boolean expResult) {
		boolean isEven = com.sqa.ao.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase2" }, dataProvider = "EvenOdd Numbers")
	public void testEvenOddAP(int number, boolean expResult) {
		boolean isEven = com.sqa.ap.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase2" }, dataProvider = "EvenOdd Numbers")
	public void testEvenOddLL(int number, boolean expResult) {
		boolean isEven = com.sqa.ll.helpers.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase2" }, dataProvider = "EvenOdd Numbers")
	public void testEvenOddMS(int number, boolean expResult) {
		boolean isEven = com.sqa.ms.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase3", "Phase4" }, dataProvider = "EvenOdd Numbers")
	public void testEvenOddPN(int number, boolean expResult) {
		boolean isEven = com.sqa.pn.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase1" }, dataProvider = "EvenOdd Numbers")
	public void testEvenOddRA(int number, boolean expResult) {
		// boolean isEven = com.sqa.ts.help.math.EvenOdd.numberIsEven(number);
		boolean isEven = com.sqa.ra.helpers.math.EvenOdd.numberIsEven(this.number, true);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase1" }, dataProvider = "EvenOdd Numbers")
	public void testEvenOddTS(int number, boolean expResult) {
		boolean isEven = com.sqa.ts.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

}
