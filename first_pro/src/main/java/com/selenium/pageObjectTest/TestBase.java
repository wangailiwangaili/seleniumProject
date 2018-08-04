package com.selenium.pageObjectTest;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import two_java.Config;
import two_java.DriverUtils;
import two_java.DriverUtils1;

import org.testng.annotations.AfterSuite;

public class TestBase {
	 public WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  driver = DriverUtils.getdriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  Config config=new Config("config.properties");
	  String browserType=config.getConfig("browserType");
	  System.setProperty("browser.type", browserType);
	  DriverUtils1.initService();
  }

  @AfterSuite
  public void afterSuite() {
	  DriverUtils.stopservice();
  }

}
