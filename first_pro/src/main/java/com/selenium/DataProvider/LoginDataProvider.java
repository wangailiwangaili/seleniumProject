package com.selenium.DataProvider;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import two_java.Config;

public class LoginDataProvider {
	Config config=new Config("config.properties");
	@DataProvider(name = "loginData")
	public Object[][] data() throws FileNotFoundException, IOException {
		// return new Object[][] {
		// new Object[] { "zhangsan","asd12345678","登录成功" },
		// new Object[] { "lisi", "qwe","用户名或密码错误" },
		String excelName=config.getConfig("excelName");
		return ReadExcel.readDataFromExcel(excelName, 0);
	};
}
