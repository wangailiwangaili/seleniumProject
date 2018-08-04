package element_operate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import two_java.DriverUtils;

public class AlertOperate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("browser.type","chrome");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://localhost/ecshop/admin/privilege.php?act=login");
        driver.findElement(By.cssSelector(".btn-a")).click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);
        driver.quit();

	}

}
