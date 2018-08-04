package element_operate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import two_java.DriverUtils;

public class Checkbox_Operate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("browser.type", "chrome");
		WebDriver driver = DriverUtils.getdriver();
		driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
		List<WebElement> check = driver.findElements(By.xpath("//input[@name='vcJsfs']"));
		for(int i=0;i<check.size();i++) {
			if(i%2==0) {
				check.get(i).click();
				Thread.sleep(2000);
			}
		}
		for(WebElement j:check) {
			if(j.getAttribute("checked")!=null) {
				System.out.println(j.getAttribute("value"));
			}
		}
		driver.quit();

	}

}
