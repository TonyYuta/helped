package com.sqa.ao.helped;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SortTest {
	@DataProvider(name = "Sorting String")
	public static Object[][] dataSet2() {
		Object[][] data = new Object[][] { { "3", "2" }, { "c", "b" } };
		return data;
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Sorting String")
	public void testSortAO(String[] str, String[] expResult) {
		String[] actResult = com.sqa.ao.helpers.arrays.Sorting.sortElements(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Sorting String")
	public void testSortAP(String str, String expResult) {
		String actResult = com.sqa.ap.helpers.arrays.Sorting.sortElements(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Sorting String")
	public void testSortLL(String str, String expResult) {
		String actResult = com.sqa.ll.helpers.arrays.Sorting.sortElements(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Sorting String")
	public void testSortMS(String str, String expResult) {
		String actResult = com.sqa.ms.helpers.arrays.Sorting.sortElements(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Sorting String")
	public void testSortPN(String str, String expResult) {
		String actResult = com.sqa.pn.helpers.arrays.Sorting.sortElements(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Sorting String")
	public void testSortRA(String str, String expResult) {
		String actResult = com.sqa.ra.helpers.arrays.Sorting.sortElements(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Sorting String")
	public void testSortTS(String str, String expResult) {
		String actResult = com.sqa.ts.helpers.arrays.Sorting.sortElements(str);
		Assert.assertEquals(actResult, expResult);
	}

}
