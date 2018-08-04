package com.selenium.testng;

import org.testng.annotations.Test;

public class TestRunThread {
	static int i=1;

	@Test(invocationCount = 15, threadPoolSize = 3)//并行执行，重复15次，一次跑3个
	public void f() throws InterruptedException {
		System.out.println(i);
		i++;
		Thread.sleep(2000);
	}
}
