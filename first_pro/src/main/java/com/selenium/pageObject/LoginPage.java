package com.selenium.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	@FindBy(name="username")
	WebElement user;
	@FindBy(name="password")
	WebElement psd;
	@FindBy(name="submit")
	WebElement submit;
	@FindBy(css="div.boxCenterList.RelaArticle p:nth-of-type(1)")
	WebElement login_result;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void input_username(String username) {
		user.sendKeys(username);
	}
	public void input_psd(String passward) {
		psd.sendKeys(passward);
	}
	public void submit_click() {
		submit.click();
	}	
	public void login_result_test(String expectedResult) {
		Assert.assertEquals(login_result.getText(), expectedResult);//判断实际结果与预期结果是否相等
	}
}
