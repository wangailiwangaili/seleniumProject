package two_java;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chrome_search {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriverService service=new ChromeDriverService.Builder().usingAnyFreePort()
				.usingDriverExecutable(new File("C:/driver/chromedriver.exe")).build();
		service.start();
		WebDriver driver=new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);
		driver.quit();
		
		driver=new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
		driver.get("http://www.51testing.com");
		driver.quit();
		service.stop();

	}

}
