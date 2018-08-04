package two_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestBaidu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("browser.type","chrome");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://localhost/ecshop");
//        driver.findElement(By.linkText("请登录")).click();
        driver.findElement(By.partialLinkText("登录")).click();//partialLinkTest只需要部分匹配即可
        Thread.sleep(2000);
        driver.quit();
	}

}
