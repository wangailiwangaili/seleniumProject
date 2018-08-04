package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
  @DataProvider(name="test1")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 4,5 },
      new Object[] { 2, 7,9 },
      new Object[] { -1, 9,8},
    };
  }
}
