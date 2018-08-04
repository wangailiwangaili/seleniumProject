package element_operate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import two_java.DriverUtils;

public class Radio_Operate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("browser.type", "chrome");
		WebDriver driver = DriverUtils.getdriver();
		driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='vcGgyy' and @value<=4]"));
		// for(int i=0;i<radio.size();i++) {
		// radio.get(i).click();
		// Thread.sleep(2000);
		// }//第一种for循环
		for (WebElement i : radio) {
			i.click();
			Thread.sleep(2000);
		} // 第二种for循环
		driver.findElement(By.xpath("//input[@name='vcGgyy'][3]")).click();
		Thread.sleep(2000);
		for (WebElement j : radio) {
			if (j.isSelected()) {
				System.out.println(j.getAttribute("value"));
			}
		}//第一种判断被选中的方法isSelected
		for (WebElement j : radio) {
			if (j.getAttribute("checked")!=null) {
				System.out.println(j.getAttribute("value"));
			}
		}//第二种判断被选中的方法 j.getAttribute("checked")!=null
		driver.quit();
	}

}
