package element_operate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import two_java.DriverUtils;

public class MouseOperate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("browser.type","chrome");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
        driver.findElement(By.xpath("//input[@name=\"vcGgyy\" and @value=\"3\"]")).click();
        Thread.sleep(5000);
        Actions actions=new Actions(driver);
        actions.doubleClick(driver.findElement(By.xpath("//input[@name=\"vcGgyy\" and @value=\"3\"]"))).perform();
        Thread.sleep(5000);
        driver.quit();

	}

}
