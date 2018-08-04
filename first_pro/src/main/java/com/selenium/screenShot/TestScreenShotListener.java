package com.selenium.screenShot;

import java.io.File;
import java.lang.reflect.Field;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.bcel.generic.NEW;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestScreenShotListener extends TestListenerAdapter {
	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		try {
			Field field=tr.getTestClass().getRealClass().getField("driver");//通过反射机制来获取driver成员变量
			WebDriver driver=(WebDriver)field.get(tr.getInstance());//获取当前测试的driver对象
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//获取截图的file
			File screenshot=new File("screenShots");//创建一个目录
			if(!screenshot.exists()&&!screenshot.isDirectory()){
				screenshot.mkdirs();
			}//目录不存在或者不是目录，则创建目录
			String classname=tr.getTestClass().getName();//获取测试类名称
			String methodName=tr.getName();//获取测试方法名称
			SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss_SSS");//获取执行的具体时间
			String time=dateformat.format(new Date());
			file.renameTo(new File(screenshot,classname+"_"+methodName+"_"+time+".png"));//将File设置图文件名称

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.onTestFailure(tr);
	}
}
