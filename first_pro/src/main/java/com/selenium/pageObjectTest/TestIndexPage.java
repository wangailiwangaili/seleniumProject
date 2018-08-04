package com.selenium.pageObjectTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selenium.pageObject.IndexPage;

import two_java.DriverUtils;

public class TestIndexPage extends TestBase {
	@Test
	public void test() throws InterruptedException {
		driver.get("http://localhost/ecshop");
		IndexPage indexPage=new IndexPage(driver);
		indexPage.login_click();
		Thread.sleep(2000);
	}
}
