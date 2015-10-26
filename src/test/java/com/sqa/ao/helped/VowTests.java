package com.sqa.ao.helped;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VowTests {
	@DataProvider(name = "Not Vowels Characters")
	public static Object[][] dataSet2() {
		Object[][] data = new Object[][] { { "test", "tst" }, { "java classes", "jv clsss" }, { "google", "ggl" },
				{ "Og ug", "g g" }, { "ydysya h", "ds h" }, { "1234 5 6", "1234 5 6" }, { "AaEeUuIiO oYy", " " },
				{ "a ab a", " b " }, { "1     a", "1     " } };
		return data;
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testRemoveVowelsCharactersAO(String str, String expResult) {
		String actResult = com.sqa.ao.help.string.Removing.removeVowelsCharacters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testRemoveVowelsCharactersAP(String str, String expResult) {
		String actResult = com.sqa.ap.help.strings.Removing.removeVowelsCharacters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testRemoveVowelsCharactersLL(String str, String expResult) {
		String actResult = com.sqa.ll.helpers.strings.Removing.removeVowelsCharacters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testRemoveVowelsCharactersMS(String str, String expResult) {
		String actResult = com.sqa.ms.help.string.Removing.removeVowelsCharacters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testRemoveVowelsCharactersPN(String str, String expResult) {
		String actResult = com.sqa.pn.help.strings.Removing.removeVowelCharacters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testRemoveVowelsCharactersRA(String str, String expResult) {
		String actResult = com.sqa.ra.helpers.strings.Removing.removeVowelsCharacters(str);
		Assert.assertEquals(actResult, expResult);
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Not Vowels Characters")
	public void testRemoveVowelsCharactersTS(String str, String expResult) {
		String actResult = com.sqa.ts.help.strings.Removing.removeVowelCharacters(str);
		Assert.assertEquals(actResult, expResult);
	}

}
