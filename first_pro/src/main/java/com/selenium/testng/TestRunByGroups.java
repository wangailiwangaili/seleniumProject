package com.selenium.testng;

import org.testng.annotations.Test;

public class TestRunByGroups {
  @Test(groups="car")
  public void car1() {
	  System.out.println("benci");
  }
  @Test(groups="color")
  public void color1() {
	  System.out.println("red");
  }
  @Test(groups="car")
  public void car2() {
	  System.out.println("aodi");
  }
  @Test(groups="color")
  public void color2() {
	  System.out.println("yellow");
  }
  @Test(groups= {"color","car"})
  public void car_color() {
	  System.out.println("my car");
  }
  
}
