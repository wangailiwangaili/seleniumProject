package location;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

import two_java.DriverUtils;

public class TestLocateByJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("browser.type", "chrome");
		WebDriver driver = DriverUtils.getdriver();
		driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		jsExecutor.executeScript("document.getElementsByName('dtDyjsrq')[0].parentNode.childNodes[2].click()");
		Thread.sleep(2000);
		driver.quit();
		
	}
}
