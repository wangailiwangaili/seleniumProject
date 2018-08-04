package location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import two_java.DriverUtils;

public class TestBaidu_Location {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("browser.type","chrome");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
        driver.findElement(By.id("xingMin")).sendKeys("hahahah");
        Thread.sleep(2000);
        driver.findElement(By.name("vcXm")).clear();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("xingMin")).getAttribute("maxlength"));
        driver.findElement(By.id("vcYffyqk")).sendKeys("aaa\nbbb\nccc");
        Thread.sleep(2000);
        driver.quit();

	}

}
