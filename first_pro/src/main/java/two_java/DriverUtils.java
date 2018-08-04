package two_java;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

public class DriverUtils {
	
	public static String browser=null;
	public static DriverService service;
	
	static{
		browser=System.getProperty("browser.type", "firefox");
		if("firefox".equalsIgnoreCase(browser)) {
			service=new GeckoDriverService.Builder()
					.usingFirefoxBinary(new FirefoxBinary(new File("C:\\\\Program Files (x86)\\\\Mozilla Firefox\\\\firefox.exe")))
					.usingDriverExecutable(new File("C:/driver/geckodriver.exe")).usingAnyFreePort().build();	
		}else if("chrome".equalsIgnoreCase(browser)) {
			service=new ChromeDriverService.Builder().usingAnyFreePort()
					.usingDriverExecutable(new File("C:/driver/chromedriver.exe")).build();
		}else if("ie".equalsIgnoreCase(browser)) {
			service=new InternetExplorerDriverService.Builder().usingAnyFreePort()
					.usingDriverExecutable(new File("C:/driver/IEDriverServer.exe")).build();
		}else {
			throw new RuntimeException("设置浏览器有错误");
		}
		try {
			service.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public static WebDriver getdriver() {
  	   WebDriver driver=null;
  	 if("firefox".equalsIgnoreCase(browser)) {
  		 driver=new RemoteWebDriver(service.getUrl(),DesiredCapabilities.firefox());
  	 }else if("chrome".equalsIgnoreCase(browser)) {
  		driver=new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
  	 }else {
  		driver=new RemoteWebDriver(service.getUrl(),DesiredCapabilities.internetExplorer());
  	 }
  	 return driver;
     }
	public static void stopservice() {
		service.stop();
	}
}

      
