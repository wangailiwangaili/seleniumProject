package two_java;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ie_search {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		InternetExplorerDriverService service=new InternetExplorerDriverService.Builder().usingAnyFreePort()
				.usingDriverExecutable(new File("C:/driver/IEDriverServer.exe")).build();
		service.start();
		WebDriver driver=new RemoteWebDriver(service.getUrl(),DesiredCapabilities.internetExplorer());
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);
		driver.quit();
		
		driver=new RemoteWebDriver(service.getUrl(),DesiredCapabilities.internetExplorer());
		driver.get("http://www.51testing.com");
		driver.quit();
		service.stop();

	}

}
