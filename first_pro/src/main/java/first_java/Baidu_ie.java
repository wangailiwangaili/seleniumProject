package first_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baidu_ie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.ie.driver", "C:/driver/IEDriverServer.exe");
    WebDriver driver=new InternetExplorerDriver();
    driver.get("http://www.baidu.com");
	}

}
