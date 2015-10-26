package com.sqa.ao.helped;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcAreaStaticTests {
	@DataProvider(name = "Calc Circle Area Static")
	public static Object[][] dataSet2() {
		Object[][] data = new Object[][] { { 1, 3.14 }, { 2, 12.56 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 },
				{ 0, 0 }, { 0, 0 } };
		return data;
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Calc Circle Area Static")
	public void testCalcAreaStaticAO(double radius, double expResult) {
		double actResult = com.sqa.ao.helpers.shapes.Circle.calcArea(radius);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Calc Circle Area Static")
	public void testCalcAreaStaticAP(double radius, double expResult) {
		double actResult = com.sqa.ap.help.shapes.Circle.calcArea(radius);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Calc Circle Area Static")
	public void testCalcAreaStaticLL(double radius, double expResult) {
		double actResult = com.sqa.ll.helpers.shapes.Circle.calcArea(radius);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(enabled = false, groups = { "Phase2", "Phase3" }, dataProvider = "Calc Circle Area Static")
	public void testCalcAreaStaticMS(double radius, double expResult) {
		// double actResult = com.sqa.ms.help.shapes.Circle.calcArea(radius);
		// Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Calc Circle Area Static")
	public void testCalcAreaStaticPN(double radius, double expResult) {
		double actResult = com.sqa.pn.help.shapes.Circle.calcArea(radius);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(enabled = false, groups = { "Phase2", "Phase3" }, dataProvider = "Calc Circle Area Static")
	public void testCalcAreaStaticRA(double radius, double expResult) {
		// double actResult = com.sqa.ra.helpers.shapes.Circle.calcArea(radius);
		// Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Calc Circle Area Static")
	public void testCalcAreaStaticTS(double radius, double expResult) {
		double actResult = com.sqa.ts.help.shape.Circle.calcArea(radius);
		Assert.assertEquals(actResult, expResult);
	}

}
