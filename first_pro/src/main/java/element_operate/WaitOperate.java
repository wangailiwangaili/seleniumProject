package element_operate;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.http.auth.NTCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import two_java.DriverUtils;

public class WaitOperate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "chrome");
		WebDriver driver = DriverUtils.getdriver();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// //隐式等待，用于driver对象的整个生命周期，对多个元素起作用，一般写在get之前
		// driver.get("http://localhost/webtest/wait1.htm");
		// driver.findElement(By.id("sid3")).click();
		// driver.findElement(By.id("sid5")).click();
		// driver.findElement(By.id("sid6")).click();
		// Thread.sleep(3000);
		// driver.quit();

		driver.get("http://localhost/webtest/wait1.htm");
		// WebElement element=new WebDriverWait(driver,
		// 25).until(ExpectedConditions.presenceOfElementLocated(By.id("sid8")));
		// 显示等待，对单个元素等待，第一种写法
		// WebElement element = new WebDriverWait(driver, 25).until(new
		// Function<WebDriver, WebElement>() { // 匿名类
		// public WebElement apply(WebDriver t) { // 实现方法快捷键 alt+/
		// // TODO Auto-generated method stub
		// return t.findElement(By.id("sid8"));
		// }
		// });// 显示等待，第二种写法
		// WebElement element=new WebDriverWait(driver, 25).until(new
		// ExpectedCondition<WebElement>() {
		// public WebElement apply(WebDriver input) {
		// // TODO Auto-generated method stub
		// return input.findElement(By.id("sid8"));
		// }
		// });//显示等待，第三种写法
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("sid8"));
			}
		});//显示等待，第四种写法，可以设置刷新时间（5秒）
		element.click();
		Thread.sleep(3000);
		driver.quit();

	}

}
