package Automation.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonUtilities {
	WebDriver driver;
	
	public CommonUtilities(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void launchChromeBrowser()
	{
			String path = System.getProperty("user.dir")+"//resources//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",path );
			driver = new BaseTestClass();
			
	}
	public void getURL(String url)
	{
		driver.get(url);
	}
	
	public void closeDriver()
	{
		driver.close();
	}
	
	
	
	
	
	
}
