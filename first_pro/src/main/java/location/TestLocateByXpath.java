package location;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

import two_java.DriverUtils;

public class TestLocateByXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("browser.type","firefox");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://bbs.51testing.com/forum.php");
        Thread.sleep(8000);
//      driver.findElement(By.xpath("//input[@name=\"dtDyjsrq\"]/following-sibling::img")).click();
        driver.findElement(By.partialLinkText("软件测试新手上路")).click();
        Thread.sleep(5000);
        List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,\"normalthread\")]/tr/th/a[3]"));
        list.get(0).click();
       Thread.sleep(8000);
       driver.findElement(By.partialLinkText("软件测试新手上路")).click();
     //重新点击此页面，相当于此页面被刷新，需要重新获取元素定位
       Thread.sleep(5000);
       list=driver.findElements(By.xpath("//tbody[contains(@id,\"normalthread\")]/tr/th/a[3]"));
       list.get(1).click();
       Thread.sleep(5000);
       driver.quit();
    }
}
