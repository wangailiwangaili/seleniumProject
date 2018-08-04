package com.selenium.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	@FindBy(partialLinkText="请登录")
	public WebElement loginLink;
	@FindBy(partialLinkText="免费注册")
	public WebElement regLink;
	public IndexPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public void login_click() {
		loginLink.click();
	}
	
	

}
