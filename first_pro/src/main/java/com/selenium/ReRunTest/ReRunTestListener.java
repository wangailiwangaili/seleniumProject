package com.selenium.ReRunTest;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunTestListener implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		IRetryAnalyzer iRetry=method.getTestMethod().getRetryAnalyzer();
		if(iRetry==null) {
			method.getTestMethod().setRetryAnalyzer(new RetryAnalysis());
		}//获取重跑分析器对象，判断是否为空，如果为空，则设置重跑分析器，如果不为空，则不设置
	}

}
