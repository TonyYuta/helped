package com.sqa.ao.helped;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTests {
	@DataProvider(name = "DivNumber Numbers")
	public static Object[][] dataSet2() {
		Object[][] data = new Object[][] { { 12, 2, 6 }, { 50, 10, 5 }, { 100, 1, 100 }, { 10, 10, 1 },
				{ 222, -111, -2 }, { -100, 20, -5 }, { -500, -10, 50 }, { 500, -2, -250 }, { -1000, 1, -1000 } };
		return data;
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "DivNumber Numbers")
	public void testDivNumberAO(int num1, int num2, double expResult) {
		int actResult = (int) com.sqa.ao.help.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "DivNumber Numbers")
	public void testDivNumberAP(double num1, double num2, double expResult) {
		double actResult = com.sqa.ap.help.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "DivNumber Numbers")
	public void testDivNumberLL(double num1, double num2, double expResult) {
		double actResult = com.sqa.ll.helpers.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "DivNumber Numbers")
	public void testDivNumberMS(double num1, double num2, double expResult) {
		double actResult = com.sqa.ms.help.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "DivNumber Numbers")
	public void testDivNumberPN(double num1, double num2, double expResult) {
		double actResult = com.sqa.pn.help.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "DivNumber Numbers")
	public void testDivNumberRA(double num1, double num2, double expResult) {
		double actResult = com.sqa.ra.helpers.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "DivNumber Numbers")
	public void testDivNumberTS(double num1, double num2, double expResult) {
		double actResult = com.sqa.ts.help.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

}
