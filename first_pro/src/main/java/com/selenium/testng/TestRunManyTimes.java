package com.selenium.testng;

import org.testng.annotations.Test;

public class TestRunManyTimes {
	int i=1;
  @Test(invocationCount=5)//重复执行
  public void f() {
	  System.out.println(i);
	  i++;
  }
}
