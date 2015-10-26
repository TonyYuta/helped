package com.sqa.ao.helped;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RevTests {

	@DataProvider(name = "Reverse String")
	public static Object[][] dataSet2() {
		Object[][] data = new Object[][] { { "test", "tset" }, { "java classes", "sessalc avaj" },
				{ "google", "elgoog" }, { "Og ug", "gu gO" }, { "ydysya h", "h aysydy" }, { "1234 5 6", "6 5 4321" },
				{ "1 2 3", "3 2 1" }, { "a ab a", "a ba a" }, { "1     a", "a     1" } };
		return data;
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Reverse String")
	public void testReverseStringAO(String str, String expResult) {
		String actResult = com.sqa.ao.help.string.Reversing.reverseLetters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Reverse String")
	public void testReverseStringCharactersAP(String str, String expResult) {
		String actResult = com.sqa.ap.help.strings.Reversing.reverseLetters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Reverse String")
	public void testReverseStringCharactersLL(String str, String expResult) {
		String actResult = com.sqa.ll.helpers.strings.Reversing.reverselLetters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Reverse String")
	public void testReverseStringMS(String str, String expResult) {
		String actResult = com.sqa.ms.help.string.Reversing.reverseLetters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Reverse String")
	public void testReverseStringPN(String str, String expResult) {
		String actResult = com.sqa.pn.help.strings.Reversing.reverseLetters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Reverse String")
	public void testReverseStringRA(String str, String expResult) {
		String actResult = com.sqa.ra.helpers.strings.Reversing.reverseLetters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Reverse String")
	public void testReverseStringTS(String str, String expResult) {
		String actResult = com.sqa.ts.help.strings.Reversing.reverseLetters(str);
		Assert.assertEquals(actResult, expResult);
	}

}
