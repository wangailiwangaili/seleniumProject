package element_operate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import two_java.DriverUtils;

public class MouseOperate2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("browser.type","chrome");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://localhost/ecshop/admin");
        driver.findElement(By.name("username")).sendKeys("administrator");
        driver.findElement(By.name("password")).sendKeys("asd12345678");
        driver.findElement(By.cssSelector(".btn-a")).click();
        Thread.sleep(2000);
        driver.switchTo().frame("menu-frame");
        driver.findElement(By.linkText("商品列表")).click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        driver.switchTo().frame("header-frame");
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("个人设置"))).pause(5000).perform();
        actions.moveToElement(driver.findElement(By.linkText("退出"))).click().perform();
        Thread.sleep(5000);
        driver.quit();

	}

}
