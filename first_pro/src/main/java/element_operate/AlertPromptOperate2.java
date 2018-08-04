package element_operate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import two_java.DriverUtils;

public class AlertPromptOperate2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("browser.type","chrome");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
        driver.findElement(By.partialLinkText("检查情况")).click();
//      driver.findElement(By.name("promptBtn")).click();//第一种定位方法
//      driver.findElement(By.xpath("//select[@name=\"vcZy1\"]/following-sibling::input")).click();//第二种定位方法
        driver.findElement(By.cssSelector("select[name=\"vcZy1\"]+input")).click();;//第三种定位方法
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("zhangsan");//prompt对话框中输入值
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        driver.quit();

	}

}
