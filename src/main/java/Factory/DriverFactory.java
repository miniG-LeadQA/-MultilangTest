package Factory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class DriverFactory {
	
	public WebDriver driver;
	
	public WebDriver initDriver(String browserName, Properties prop)
	{
		System.out.println("Browser name is : " + browserName);
		
		switch (browserName.toLowerCase()){
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_128");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_128");
			driver = new FirefoxDriver();
			break;
		case "safari":
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_128");
			driver = new SafariDriver();
			break;
			
		default:
			System.out.println("Please pass the right browser...." + browserName);
			break;
		}
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}
	

}
