package location;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import two_java.DriverUtils;

public class TestLocateByTagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("browser.type","chrome");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
        driver.findElement(By.partialLinkText("检查情况")).click();
        for(int i=1;i<=4;i++) {
        	driver.findElement(By.id("tianjia_buttoncdqk")).click();
        }
        WebElement table1=driver.findElement(By.id("ctqk"));
        System.out.println(table1.findElements(By.tagName("tr")).size());
        System.out.println(table1.findElements(By.tagName("tr")).get(0).findElements(By.tagName("td")).size());
        
       driver.quit();
    }
}
