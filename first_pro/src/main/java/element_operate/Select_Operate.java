package element_operate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import two_java.DriverUtils;

public class Select_Operate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("browser.type", "chrome");
		WebDriver driver = DriverUtils.getdriver();
		driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
//		Select select = new Select(driver.findElement(By.name("vcZy")));
//		select.selectByVisibleText("学生");
//		Thread.sleep(2000);
//		select.selectByIndex(9);//index是从0开始数的
//		Thread.sleep(2000);
//		select.selectByValue("08");
//		Thread.sleep(2000);
//		for(int i=0;i<select.getOptions().size();i++) {
//			if(select.getOptions().get(i).getAttribute("selected")!=null){
//				System.out.println(select.getOptions().get(i).getAttribute("value"));
//				System.out.println(select.getOptions().get(i).getText());
//				break;
//			}
//		}
//		for(int i=0;i<select.getOptions().size();i++) {
//			select.selectByIndex(i);
//			Thread.sleep(500);
//		}
//		driver.quit();
		
		driver.findElement(By.partialLinkText("检查情况")).click();
		Select select1 = new Select(driver.findElement(By.name("vcZy1")));
		select1.selectByVisibleText("学生");
		Thread.sleep(2000);
		select1.selectByIndex(4);//index是从0开始数的
		Thread.sleep(2000);
		select1.selectByValue("05");
		Thread.sleep(2000);
		System.out.println(select1.getFirstSelectedOption().getText());//getFirstSelectedOption方法可以获得第一个选项
		select1.deselectByIndex(4);
		driver.quit();
	}

}
