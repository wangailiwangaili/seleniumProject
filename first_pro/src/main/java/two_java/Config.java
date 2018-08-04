package two_java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	Properties pro=new Properties();//实例化properties
	public Config(String fileName)  {
		String path=this.getClass().getClassLoader().getResource(fileName).getPath();
		try {
			pro.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//构造方法，加载properties文件
	public String getConfig(String key) {
		return pro.getProperty(key);
	}//通过properties文件左边的key值，获得右边的属性值

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Config config=new Config("config.properties");
		String firefoxDriver=config.getConfig("fireDriver");
		System.out.println(firefoxDriver);

	}

}
