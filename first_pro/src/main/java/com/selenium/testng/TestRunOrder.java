package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestRunOrder {
  @Test(priority=1)
  public void test5() {
	  System.out.println("test5");
  }
  @Test(priority=0)
  public void test3() {
	  System.out.println("test3");
  }
  @Test(priority=3)
  public void test7() {
	  System.out.println("test7");
  }
  @Test(priority=2)
  public void test9() {
	  System.out.println("test9");
  }
}
