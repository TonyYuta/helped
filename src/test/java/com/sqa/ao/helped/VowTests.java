package com.sqa.ao.helped;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VowTests {
	@DataProvider(name = "Not Vowels Characters")
	public static Object[][] dataSet2() {
		Object[][] data = new Object[][] { { "test", "tst" }, { "java classes", "jv clsss" }, {}, {},
				{ "%^&**&+_-=^^*^%$$% $", "%^&**&+_-=^^*^%$$% $" }, { "1234 5 6", "1234 5 6" }, { "AaEeUuIiOoYy", "" },
				{ "a a a", "  " }, { "1     a", "1     " } };
		return data;
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testDivNumberAO(int num1, int num2, double expResult) {
		int actResult = (int) com.sqa.ao.help.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testDivNumberAP(double num1, double num2, double expResult) {
		double actResult = com.sqa.ap.help.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testDivNumberLL(double num1, double num2, double expResult) {
		double actResult = com.sqa.ll.helpers.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testDivNumberMS(double num1, double num2, double expResult) {
		double actResult = com.sqa.ms.help.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testDivNumberPN(double num1, double num2, double expResult) {
		double actResult = com.sqa.pn.help.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testDivNumberRA(double num1, double num2, double expResult) {
		double actResult = com.sqa.ra.helpers.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testDivNumberTS(double num1, double num2, double expResult) {
		double actResult = com.sqa.ts.help.math.Calculations.divideNumber(num1, num2);
		Assert.assertEquals(actResult, expResult);
	}

}
