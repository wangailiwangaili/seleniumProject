package element_operate;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import two_java.DriverUtils;

public class windowOperate2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("browser.type","firefox");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://bbs.51testing.com/forum.php");
        Thread.sleep(8000);
        driver.findElement(By.partialLinkText("软件测试新手上路")).click();
        String firsthandle=driver.getWindowHandle();
        Set<String> firsthandles=driver.getWindowHandles();
        Thread.sleep(5000);
        List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,\"normalthread\")]/tr/th/a[3]"));
        list.get(0).click();
        Set<String> secondhandles=driver.getWindowHandles();
        String secondhandle=getcurrenthandle(secondhandles,firsthandles);
       Thread.sleep(8000);
       driver.findElement(By.partialLinkText("软件测试新手上路")).click();
     //重新点击此页面，相当于此页面被刷新，需要重新获取元素定位
       Thread.sleep(5000);
       list=driver.findElements(By.xpath("//tbody[contains(@id,\"normalthread\")]/tr/th/a[3]"));
       list.get(1).click();
       Set<String> thirdhandles=driver.getWindowHandles();
       String thirdhandle=getcurrenthandle(thirdhandles,secondhandles);
       Thread.sleep(5000);
       driver.switchTo().window(firsthandle);//切换到第一个窗口
       driver.findElement(By.partialLinkText("测试人员面试")).click();
       Set<String> forthhandles=driver.getWindowHandles();
       String forthhandle=getcurrenthandle(forthhandles,thirdhandles);
       Thread.sleep(5000);
       JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
       jsExecutor.executeScript("window.open('http:www.baidu.com')");//以上两行代码实现打开一个新窗口
       driver.quit();
    }
	public static String getcurrenthandle(Set<String> windowhandles,Set<String> beforhandles) {
		String currenthandle="";
		for(String handle:windowhandles) {
			boolean bool=true;
			for(String handle1:beforhandles) {
				if(handle.equals(handle1)) {
					bool=false;
					break;
				}
			}
			if(bool) {
				currenthandle=handle;
				break;
			}
		}
		return currenthandle;
		
	}
}
