package element_operate;

import java.awt.Desktop.Action;
import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import two_java.DriverUtils;

public class KeyboardOperate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("browser.type", "chrome");
		WebDriver driver = DriverUtils.getdriver();
		driver.get("http://localhost/ecshop/admin");
		driver.findElement(By.name("username")).sendKeys("administrator");
		driver.findElement(By.name("password")).sendKeys("asd12345678");
		// Actions action=new Actions(driver);
		// action.sendKeys(Keys.ENTER).perform();//第一种方法，回车操作，常用，perform()方法是用于执行的，必须写
		driver.findElement(By.cssSelector(".btn-a")).sendKeys(Keys.ENTER);//第二种方法，确定点击哪个元素
		Thread.sleep(2000);

		driver.quit();

	}

}
