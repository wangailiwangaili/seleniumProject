package element_operate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import two_java.DriverUtils;

public class FileOperate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("browser.type","chrome");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
        driver.findElement(By.name("vcWjSc")).sendKeys("C://Users/HP/Desktop/a.txt");//上传文件
        Thread.sleep(5000);
        driver.quit();

	}

}
