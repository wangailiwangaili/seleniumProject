package first_java;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Baidu_fire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.setProperty("webdriver.gecko.driver", "C:/driver/geckodriver.exe");
		  //右键run as----run configurations---Arguments---VM arguments
		  //输入 -Dwebdriver.gecko.driver=C:/driver/geckodriver.exe
     //WebDriver drive=new FirefoxDriver();
     //drive.get("http://www.baidu.com");
     
	//System.setProperty("webdriver.gecko.driver", "C:/driver/geckodriver.exe");
    //FirefoxOptions firefoxoption=new FirefoxOptions();
    //firefoxoption.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
         //当浏览器未被装在C盘下，程序无法找到时，用以上两行代码，声明浏览器执行路径
    //WebDriver driver=new FirefoxDriver(firefoxoption);
    //driver.get("http://www.baidu.com");
     
     GeckoDriverService service=new GeckoDriverService.Builder()
    		 .usingFirefoxBinary(
    		     new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")))
    		 .usingDriverExecutable(new File("C:/driver/geckodriver.exe")).usingAnyFreePort().build();
     WebDriver driver=new FirefoxDriver(service);
     driver.get("http://www.baidu.com");
	}

}
