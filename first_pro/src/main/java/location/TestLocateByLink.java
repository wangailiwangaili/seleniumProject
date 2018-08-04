package location;

import org.openqa.selenium.WebDriver;

import two_java.DriverUtils;

public class TestLocateByLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("browser.type","chrome");
		WebDriver driver=DriverUtils.getdriver();
        driver.get("http://www.baidu.com");
        driver.quit();
	}

}
