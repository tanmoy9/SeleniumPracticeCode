package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\PegaSampleProject\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			//chrome is used
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browserName.equals("IE"))
		{
			//IE
			System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}

}
