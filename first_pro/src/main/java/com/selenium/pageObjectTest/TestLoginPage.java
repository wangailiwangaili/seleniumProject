package com.selenium.pageObjectTest;

import org.testng.annotations.Test;

import com.selenium.DataProvider.LoginDataProvider;
import com.selenium.pageObject.IndexPage;
import com.selenium.pageObject.LoginPage;

public class TestLoginPage extends TestBase {
	@Test(dataProvider="loginData",dataProviderClass=LoginDataProvider.class)
	public void test(String username,String passward,String expectedResult) throws InterruptedException {
		driver.get("http://localhost/ecshop");
		IndexPage indexPage=new IndexPage(driver);
		indexPage.login_click();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.input_username(username);
		loginPage.input_psd(passward);
		loginPage.submit_click();
//		System.out.println(driver.getPageSource());//获取最后一个网页的源代码
		loginPage.login_result_test(expectedResult);
		Thread.sleep(2000);
	}
}
