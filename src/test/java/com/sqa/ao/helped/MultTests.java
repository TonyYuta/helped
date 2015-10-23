package com.sqa.ao.helped;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultTests {
	@DataProvider(name = "MultNumber Numbers")
	public static Object[][] dataSet2() {
		Object[][] data = new Object[][] { { 1, 2, 2 }, { -5, 10, -50 }, { 100, 0, 0 }, { 0, 0, 0 }, { 259, 1, 259 },
				{ -10, -20, 200 }, { -5, 0, 0 }, { 525, 2, 1050 }, { -1000, 1, -1000 } };
		return data;
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "MultNumber Numbers")
	public void testMultNumberAO(int num1, int num2, int expResult) {
		int actResult = (int) com.sqa.ao.help.math.Calculations.multNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "MultNumber Numbers")
	public void testMultNumberAP(int num1, int num2, int expResult) {
		int actResult = (int) com.sqa.ap.help.math.Calculations.multNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "MultNumber Numbers")
	public void testMultNumberLL(int num1, int num2, int expResult) {
		int actResult = (int) com.sqa.ll.helpers.math.Calculations.multNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "MultNumber Numbers")
	public void testMultNumberMS(int num1, int num2, int expResult) {
		int actResult = (int) com.sqa.ms.help.math.Calculations.multNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "MultNumber Numbers")
	public void testMultNumberPN(int num1, int num2, int expResult) {
		int actResult = (int) com.sqa.pn.help.math.Calculations.multNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "MultNumber Numbers")
	public void testMultNumberRA(int num1, int num2, int expResult) {
		int actResult = (int) com.sqa.ra.helpers.math.Calculations.multNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "MultNumber Numbers")
	public void testMultNumberTS(int num1, int num2, int expResult) {
		int actResult = (int) com.sqa.ts.help.math.Calculations.multNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

}
