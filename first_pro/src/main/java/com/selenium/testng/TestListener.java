package com.selenium.testng;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter{
	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailure(tr);
		System.out.println("fail");
	}//监听失败的测试例
	@Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSuccess(tr);
		System.out.println("success");
	}//监听成功的测试例

}
