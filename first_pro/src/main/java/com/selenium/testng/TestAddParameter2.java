package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestAddParameter2 {
	Calculator calculator;

	@Test(dataProvider = "test1",dataProviderClass=TestDataProvider.class)
	public void testAdd(int num1,int num2,int num3) {
		calculator.add(num1);
		calculator.add(num2);
		int result = calculator.getResult();
		Assert.assertEquals(result, num3);
	}

	@BeforeMethod
	public void beforeMethod() {
		calculator.clear();
	}

	@BeforeClass
	public void beforeClass() {
		calculator = new Calculator();
	}

	@AfterClass
	public void afterClass() {
		calculator = null;
	}

}
