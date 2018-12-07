package Base;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver webDriver;
	public static Properties properties;

	public TestBase() {
           
		try {
			properties=new Properties();
			FileInputStream inputReader=new FileInputStream("C:\\Users\\pissu_hadei\\eclipse-workspace\\Steps\\src\\main\\java\\Config\\config.Properties");
					properties.load(inputReader);
		} 
		catch (Exception e) {
			
		}
		
	}
	public static void Initialization() {
		
		WebDriverManager.chromedriver().setup();
		webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webDriver.get(properties.getProperty("urlForDragAndDrop"));
			
	}
	
	
}
