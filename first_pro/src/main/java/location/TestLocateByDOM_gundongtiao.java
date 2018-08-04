package location;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import two_java.DriverUtils;

public class TestLocateByDOM_gundongtiao {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("browser.type", "chrome");
		WebDriver driver = DriverUtils.getdriver();
		driver.get("http://www.taobao.com");
		Thread.sleep(5000);
		// JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		// jsExecutor.executeScript("window.scrollTo(0,2500)");//滚动条滚动位置
		scrollToFullPage(driver);
		WebElement element = driver.findElement(By.cssSelector("div.fashion-inner>h3>em"));
		// jsExecutor.executeScript("window.scrollTo(arguments[0],arguments[1])",element.getLocation().x,element.getLocation().y-100);
		// 此行代码是为了将定位的元素所在页面显示出来，没有此行代码也可完成定位操作
		Thread.sleep(3000);
		System.out.println(element.getText());
		Thread.sleep(2000);
		driver.quit();
	}
	public static void scrollToFullPage(WebDriver driver) throws InterruptedException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		Long totalHeight = (Long) jsExecutor.executeScript("return(document.body.scrollHeight)");// 获得整个网页的高度
		int height = driver.manage().window().getSize().getHeight();// 获得单个窗口的高度
		for (int i = 1; i <= totalHeight / height; i++) {
			jsExecutor.executeScript("window.scrollTo(arguments[0],arguments[1])", 0, i * height);
			Thread.sleep(2000);
		}
	}
}
