package com.sqa.ao.helped;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OddTest {
	@DataProvider(name = "EvenOdd Numbers")
	public static Object[][] dataSet2() {
		Object[][] data = new Object[][] { { 11, true }, { -1500, false }, { 21500, false }, { 1, true },
				{ -1500, false }, { -1500, false }, { -100, false }, { -1500, false }, { -1501, true } };
		return data;
	}

	private int number = 0;

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
