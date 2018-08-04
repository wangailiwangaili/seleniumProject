package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAddByTestng {
	Calculator calculator;

	@Test
	public void test() {
		calculator.add(1);
		calculator.add(2);
		int result = calculator.getResult();
		Assert.assertEquals(result, 3);
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
		calculator=null;
	}
}
