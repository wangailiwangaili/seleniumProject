package location;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import two_java.DriverUtils;

public class TestBaidu_Location2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("browser.type","chrome");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
        List<WebElement> aa=driver.findElements(By.name("vcFf"));
        aa.get(1).click();
//        for(WebElement e1:aa) {
//        	e1.click();
//        	Thread.sleep(2000);
 //      }
        for(int i=0;i<aa.size();i++) {
 //       	aa.get(i).click();
        	if(aa.get(i).isSelected()) {
        		System.out.println(aa.get(i).getAttribute("value"));
        	}
 //       	Thread.sleep(2000);
        }
        //两种方法都可以
        Thread.sleep(2000);
        driver.quit();

	}

}
